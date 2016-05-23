package qualiti.banco.contas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import qualiti.banco.clientes.Cliente;
import qualiti.banco.geral.ErroAcessoRepositorioException;
/**
 * Implementação da interface que define os métodos de acesso aos dados de contas
 * em um mecanismo de armazenamento de dados. Esta implementação é realizada através
 * do armazenamento de objetos do tipo conta abstrata em uma tabela de um banco de dados
 * relacional. Neste exemplo, está sendo utilizado o banco de dados Access. O driver
 * de acesso a este banco é a bridge da Sun. É importante notar que esta classe tem
 * diversos atributos referentes ao driver e a conexão com o banco a serem utilizados.
 * Estes atributos são inicializados no construtor da classe e podem ser lidos de um
 * arquivo de parâmetros por quem instancia esta classe. Assim, é possível parametrizar
 * o tipo de banco de dados a ser utilizado sem alterar a implementação deste repositório,
 * desde que o banco suporte a sintaxe dos comandos SQL utilizados nesta implementação.
 *
 * @author Qualiti <a href="mailto:qualiti@qualiti.com.br">qualiti@qualiti.com.br</a>
 *
 * @version 1.0
 *
 * @see qualiti.banco.cliente.ContaAbstrata
 * @see qualiti.banco.cliente.RepositorioContas
 * @see java.sql.PreparedStatement
 * @see java.sql.ResultSet
 */
public class RepositorioContasBDR implements RepositorioContas {

	/**
	 * O nome do driver JDBC a ser usado na conexão.
	 */
	private String nomeDriver;

	/**
	 * A url de conexão.
	 */
	private String urlConexao;

	/**
	 * O usuário da conexão.
	 */
	private String usuarioConexao;

	/**
	 * A senha do usuário da conexão.
	 */
	private String senhaConexao;

	/**
	 * Flag que indica se o driver foi ou não carregado.
	 */
	private boolean indDriverCarregado;

	/**
	 * Mensagem que indica falha na carga do driver.
	 */
	private static final String MSG_FALHA_CARGA_DRIVER =
		"Nome do driver JDBC usado não corresponde a uma classe válida";

	/**
	 * Mensagem que indica erro de obtenção da conexão com o banco de dados.
	 */
	private static final String MSG_ERRO_CONEXAO =
		"Erro ao obter conexão com o banco de dados";

	/**
	 * O construtor da classe. Inicializa os parâmetros de conexão com o banco de dados.
	 *
	 * @param pNomeDriver o nome do driver.
	 * @param pUrlConexao a url de conexão com o banco.
	 * @param pUsuarioConexao o usuário da conexão.
	 * @param pSenhaConexao a senha da conexão.
	 */
	public RepositorioContasBDR(
		String pNomeDriver,
		String pUrlConexao,
		String pUsuarioConexao,
		String pSenhaConexao) {
		super();
		nomeDriver = pNomeDriver;
		urlConexao = pUrlConexao;
		usuarioConexao = pUsuarioConexao;
		senhaConexao = pSenhaConexao;
		indDriverCarregado = false;
	}

	/**
	 * Verifica se uma conta existe armazenada no banco de dados relacional.
	 *
	 * @param numero o número da conta cuja existência no banco de dados relacional
	 *        será verificada.
	 *
	 * @return boolean true se a conta existir no banco de dados relacional e
	 *         false caso contrário.
	 *
	 * @exception ErroAcessoRepositorioException lançada quando ocorrer erro de acesso
	 *            ao banco de dados relacional.
	 */
	public boolean existe(String numero)
		throws ErroAcessoRepositorioException {

		if (numero != null) {
			Connection con = getConexao();
			PreparedStatement ps = null;
			ResultSet rs = null;
			try {
				ps = con.prepareStatement(CONSULTA_CONTA);
				ps.setString(1, numero);
				rs = ps.executeQuery();
				if (rs.next()) {
					int qtdLinhas = rs.getInt(1);
					return (qtdLinhas > 0);
				} else {
					return false;
				}
			} catch (SQLException e) {
				throw new ErroAcessoRepositorioException(
					MSG_ERRO_ACESSO_BD,
					e,
					e.getErrorCode());
			} finally {
				fechaRecursos(con, ps, rs);
			}
		} else {
			return false;
		}
	}
	/**
	 * Inicializa o driver do banco, caso este não esteja inicializado e
	 * retorna uma conexão do banco de dados, obtida a partir do driver manager.
	 *
	 * @return Connection a conexão do banco de dados
	 *
	 * @exception ErroAcessoRepositorioException se o nome do driver não representar uma
	 *            classe válida e existente no sistema ou se ocorreu erro na obtenção da
	 *            conexão a partir do driver manager.
	 */
	private Connection getConexao() throws ErroAcessoRepositorioException {

		if (!indDriverCarregado) {
			try {
				Class.forName(nomeDriver);
				indDriverCarregado = true;
			} catch (ClassNotFoundException e) {
				throw new ErroAcessoRepositorioException(
					MSG_FALHA_CARGA_DRIVER,
					e,
					0);
			}
		}
		try {
			return DriverManager.getConnection(
				urlConexao,
				usuarioConexao,
				senhaConexao);
		} catch (SQLException e) {
			throw new ErroAcessoRepositorioException(
				MSG_ERRO_CONEXAO,
				e,
				e.getErrorCode());
		}
	}

	/**
	 * Exclui uma conta armazenada no banco de dados relacional.
	 *
	 * @param numero o número da conta que será excluída no banco de dados relacional.
	 *
	 * @exception ContaInexistenteException lançada quando a conta a ser excluída
	 *            não existe no no banco de dados relacional.
	 *
	 * @exception ErroAcessoRepositorioException lançada quando ocorrer erro de acesso
	 *            ao banco de dados relacional.
	 */
	public void remover(String numero)
		throws ContaInexistenteException, ErroAcessoRepositorioException {

		if (numero != null) {
			Connection con = getConexao();
			PreparedStatement ps = null;
			try {
				ps = con.prepareStatement(DELETE_CONTA);
				ps.setString(1, numero);
				int rows = ps.executeUpdate();
				if (rows <= 0) {
					throw new ContaInexistenteException(numero);
				}
			} catch (SQLException e) {
				throw new ErroAcessoRepositorioException(
					MSG_ERRO_ACESSO_BD,
					e,
					e.getErrorCode());
			} finally {
				fechaRecursos(con, ps, null);
			}
		} else {
			throw new ContaInexistenteException("");
		}
	}
	/**
	 * Template de comando SQL para consulta de conta.
	 */
	private static final String CONSULTA_CONTA =
		"SELECT COUNT(*) FROM conta WHERE numero = ?";
	/**
	 * Template de comando SQL para delete de conta.
	 */
	private static final String DELETE_CONTA =
		"DELETE FROM conta WHERE numero = ?";
	/**
	 * Indica registro de conta comum no banco.
	 */
	private static final int IND_CONTA = 1;
	/**
	 * Indica registro de conta bonificada no banco.
	 */
	private static final int IND_CONTA_BONIFICADA = 2;
	/**
	 * Indica registro de conta imposto no banco.
	 */
	private static final int IND_CONTA_IMPOSTO = 4;
	/**
	 * Indica registro de conta poupança no banco.
	 */
	private static final int IND_CONTA_POUPANCA = 3;
	/**
	 * Template de comando SQL para insert de conta.
	 */
	private static final String INSERT_CONTA =
		"INSERT INTO conta (numero,tipo_conta,cpf_cliente,"
			+ "saldo,bonus) VALUES (?,?,?,?,?)";
	/**
	 * Mensagem que indica erro de acesso ao banco de dados.
	 */
	private static final String MSG_ERRO_ACESSO_BD =
		"Erro de acesso ao banco de dados";
	/**
	 * Template de comando SQL para procura de conta.
	 */
	private static final String PROCURA_CONTA =
		"SELECT conta.numero,conta.tipo_conta,conta.cpf_cliente,"
			+ "conta.saldo,conta.bonus,cliente.nome FROM conta,cliente WHERE conta.numero = ? AND "
			+ "conta.cpf_cliente = cliente.cpf";
	/**
	 * Template de comando SQL para update de conta.
	 */
	private static final String UPDATE_CONTA =
		"UPDATE conta SET cpf_cliente = ?,saldo = ?,bonus = ?"
			+ " WHERE numero = ?";
	/**
	 * Atualiza os dados de uma conta no banco de dados relacional.
	 *
	 * @param c a conta com os dados a serem atualizados.
	 *
	 * @exception ContaInexistenteException lançada quando a conta a ter seus dados
	 *            atualizados não existe no banco de dados relacional.
	 * @exception ErroAcessoRepositorioException lançada quando ocorrer erro de acesso
	 *            ao banco de dados relacional.
	 */
	public void atualizar(ContaAbstrata c)
		throws ContaInexistenteException, ErroAcessoRepositorioException {

		if (c != null) {
			Connection con = getConexao();
			PreparedStatement ps = null;
			try {
				ps = con.prepareStatement(UPDATE_CONTA);
				ps.setString(1, c.getCliente().getCpf());
				ps.setDouble(2, c.getSaldo());
				double bonus = 0;
				if (c instanceof ContaBonificada) {
					ContaBonificada cb = (ContaBonificada) c;
					bonus = cb.getBonus();
				}
				ps.setDouble(3, bonus);
				ps.setString(4, c.getNumero());
				int rows = ps.executeUpdate();
				if (rows <= 0) {
					throw new ContaInexistenteException(c.getNumero());
				}
			} catch (SQLException e) {
				throw new ErroAcessoRepositorioException(
					MSG_ERRO_ACESSO_BD,
					e,
					e.getErrorCode());
			} finally {
				fechaRecursos(con, ps, null);
			}
		} else {
			throw new ContaInexistenteException("");
		}
	} /**
			 * Fecha os recursos passados como parâmetros.
			 *
			 * @param con a conexão a ser fechada.
			 * @param ps o prepared statement a ser fechado.
			 * @param rs o result set a ser fechado.
			 */
	private void fechaRecursos(
		Connection con,
		PreparedStatement ps,
		ResultSet rs) {

		try {
			if (rs != null)
				rs.close();
		} catch (Exception e) {
		}
		try {
			if (ps != null)
				ps.close();
		} catch (Exception e) {
		}
		try {
			if (con != null)
				con.close();
		} catch (Exception e) {
		}
	} /**
			 * Cadastra os dados de uma conta no banco de dados relacional.
			 *
			 * @param c a conta com os dados a serem cadastrados.
			 *
			 * @exception ErroAcessoRepositorioException lançada quando ocorrer erro de acesso
			 *            ao banco de dados relacional.
			 *
			 * @see Q1 Por que este método não lança a exceção de conta já existente ??
			 */
	public void inserir(ContaAbstrata c)
		throws ErroAcessoRepositorioException {

		if (c != null) {
			Connection con = getConexao();
			PreparedStatement ps = null;
			try {
				ps = con.prepareStatement(INSERT_CONTA);
				ps.setString(1, c.getNumero());
				int tipoConta = 0;
				if (c instanceof ContaBonificada) {
					tipoConta = IND_CONTA_BONIFICADA;
				} else if (c instanceof Poupanca) {
					tipoConta = IND_CONTA_POUPANCA;
				} else if (c instanceof Conta) {
					tipoConta = IND_CONTA;
				} else if (c instanceof ContaImposto) {
					tipoConta = IND_CONTA_IMPOSTO;
				}
				ps.setInt(2, tipoConta);
				ps.setString(3, c.getCliente().getCpf());
				ps.setDouble(4, c.getSaldo());
				double bonus = 0;
				if (c instanceof ContaBonificada) {
					ContaBonificada cb = (ContaBonificada) c;
					bonus = cb.getBonus();
				}
				ps.setDouble(5, bonus);
				ps.executeUpdate();
			} catch (SQLException e) {
				throw new ErroAcessoRepositorioException(
					MSG_ERRO_ACESSO_BD,
					e,
					e.getErrorCode());
			} finally {
				fechaRecursos(con, ps, null);
			}
		}
	} /**
			 * Retorna uma conta armazenada no banco de dados relacional.
			 *
			 * @param numero o número da conta que será procurada no banco de dados relacional.
			 *
			 * @return ContaAbstrata a conta com seus dados lidos a partir no banco de dados relacional.
			 *
			 * @exception ContaInexistenteException lançada quando a conta a ter seus dados
			 *            lidos não existe no no banco de dados relacional.
			 *
			 * @exception ErroAcessoRepositorioException lançada quando ocorrer erro de acesso
			 *            ao banco de dados relacional.
			 */
	public ContaAbstrata procurar(String numero)
		throws ContaInexistenteException, ErroAcessoRepositorioException {

		if (numero != null) {
			Connection con = getConexao();
			PreparedStatement ps = null;
			ResultSet rs = null;
			try {
				ps = con.prepareStatement(PROCURA_CONTA);
				ps.setString(1, numero);
				rs = ps.executeQuery();
				if (rs.next()) {
					String bdNumero = rs.getString(1);
					int tipoConta = rs.getInt(2);
					String cpfCli = rs.getString(3);
					double saldo = rs.getDouble(4);
					double bonus = rs.getDouble(5);
					String nomeCliente = rs.getString(6);
					Cliente cli = new Cliente(cpfCli, nomeCliente);
					ContaAbstrata contaRet = null;
					if (tipoConta == IND_CONTA_BONIFICADA) {
						contaRet =
							new ContaBonificada(numero, saldo, cli, bonus);
					} else if (tipoConta == IND_CONTA_POUPANCA) {
						contaRet = new Poupanca(numero, saldo, cli);
					} else if (tipoConta == IND_CONTA_IMPOSTO) {
						contaRet = new ContaImposto(numero, saldo, cli);
					} else if (tipoConta == IND_CONTA) {
						contaRet = new Conta(numero, saldo, cli);
					}
					return contaRet;
				} else {
					throw new ContaInexistenteException(numero);
				}
			} catch (SQLException e) {
				throw new ErroAcessoRepositorioException(
					MSG_ERRO_ACESSO_BD,
					e,
					e.getErrorCode());
			} finally {
				fechaRecursos(con, ps, rs);
			}
		} else {
			throw new ContaInexistenteException("");
		}
	}

	/** Atualiza os dados de uma conta no banco de dados relacional.
	 *
	 * @param c a conta com os dados a serem atualizados.
	 *
	 * @exception ContaInexistenteException lançada quando a conta a ter seus dados
	 *            atualizados não existe no banco de dados relacional.
	 * @exception ErroAcessoRepositorioException lançada quando ocorrer erro de acesso
	 *            ao banco de dados relacional.
	 */
	public void atualizar(ContaAbstrata c1, ContaAbstrata c2)
		throws ContaInexistenteException, ErroAcessoRepositorioException {

		if (c1 != null && c2 != null) {
			Connection con = getConexao();
			PreparedStatement ps = null;
			PreparedStatement ps2 = null;
			try {
				con.setAutoCommit(false);
				ps = con.prepareStatement(UPDATE_CONTA);
				ps.setString(1, c1.getCliente().getCpf());
				ps.setDouble(2, c1.getSaldo());
				double bonus = 0;
				if (c1 instanceof ContaBonificada) {
					ContaBonificada cb = (ContaBonificada) c1;
					bonus = cb.getBonus();
				}
				ps.setDouble(3, bonus);
				ps.setString(4, c1.getNumero());
				int rows = ps.executeUpdate();
				if (rows <= 0) {
					con.rollback();
					throw new ContaInexistenteException(c1.getNumero());
				}

				ps2 = con.prepareStatement(UPDATE_CONTA);
				ps2.setString(1, c2.getCliente().getCpf());
				ps2.setDouble(2, c2.getSaldo());
				bonus = 0;
				if (c2 instanceof ContaBonificada) {
					ContaBonificada cb = (ContaBonificada) c2;
					bonus = cb.getBonus();
				}
				ps2.setDouble(3, bonus);
				ps2.setString(4, c2.getNumero());

				rows = ps2.executeUpdate();
				if (rows <= 0) {
					con.rollback();
					throw new ContaInexistenteException(c2.getNumero());
				}
				con.commit();
			} catch (SQLException e) {
				try {
					con.rollback();
				} catch (SQLException ex) {
					throw new ErroAcessoRepositorioException(
						MSG_ERRO_ACESSO_BD,
						ex,
						ex.getErrorCode());
				}

				throw new ErroAcessoRepositorioException(
					MSG_ERRO_ACESSO_BD,
					e,
					e.getErrorCode());
			} finally {
				try {
					con.setAutoCommit(true);
				} catch (SQLException ex1) {
					throw new ErroAcessoRepositorioException(
						MSG_ERRO_ACESSO_BD,
						ex1,
						ex1.getErrorCode());
				}
				fechaRecursos(con, ps, null);
				fechaRecursos(null, ps2, null);
			}
		} else {
			throw new ContaInexistenteException("");
		}
	}

	public Collection pesquisarTodasContas() throws ContaInexistenteException,
												  ErroAcessoRepositorioException {
		Collection contas = new ArrayList();
		Connection con = getConexao();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
				  String sql = "SELECT conta.numero,conta.tipo_conta,conta.cpf_cliente," +
				"conta.saldo,conta.bonus,cliente.nome FROM conta,cliente WHERE " +
				"conta.cpf_cliente = cliente.cpf";

			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				String bdNumero = rs.getString(1);
				int tipoConta = rs.getInt(2);
				String cpfCli = rs.getString(3);
				double saldo = rs.getDouble(4);
				double bonus = rs.getDouble(5);
				String nomeCliente = rs.getString(6);
				Cliente cli = new Cliente(cpfCli,nomeCliente);
								ContaAbstrata contaRet = null;
				if(tipoConta == IND_CONTA_BONIFICADA) {
					contaRet = new ContaBonificada(bdNumero,saldo,cli,bonus);
				} else if (tipoConta == IND_CONTA_POUPANCA) {
					contaRet = new Poupanca(bdNumero,saldo,cli);
				} else if (tipoConta == IND_CONTA_IMPOSTO) {
					contaRet = new ContaImposto(bdNumero,saldo,cli);
				} else if (tipoConta == IND_CONTA) {
					contaRet = new Conta(bdNumero,saldo,cli);
				}
				contas.add(contaRet);
			}
		} catch (SQLException e) {
			throw new ErroAcessoRepositorioException(MSG_ERRO_ACESSO_BD,e,e.getErrorCode());
		} finally {
			fechaRecursos(con,ps,rs);
		}
		return contas;
	}



}