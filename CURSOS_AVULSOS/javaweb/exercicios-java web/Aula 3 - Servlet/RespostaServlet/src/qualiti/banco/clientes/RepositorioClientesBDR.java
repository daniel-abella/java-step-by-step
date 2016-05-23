package qualiti.banco.clientes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import qualiti.banco.geral.ErroAcessoRepositorioException;
/**
 * Implementação da interface que define os métodos de acesso aos dados de cliente
 * em um mecanismo de armazenamento de dados. Esta implementação é realizada através
 * do armazenamento de objetos do tipo cliente em uma tabela de um banco de dados
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
 * @see qualiti.banco.cliente.Cliente
 * @see qualiti.banco.cliente.RepositorioClientes
 * @see java.sql.PreparedStatement
 * @see java.sql.ResultSet
 */
public class RepositorioClientesBDR implements RepositorioClientes {

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
	 * Template de comando SQL para insert de cliente.
	 */
	private static final String INSERT_CLI =
		"INSERT INTO cliente (cpf,nome) VALUES (?,?)";

	/**
	 * Template de comando SQL para update de cliente.
	 */
	private static final String UPDATE_CLI =
		"UPDATE cliente SET nome = ? WHERE cpf = ?";

	/**
	 * Template de comando SQL para delete de cliente.
	 */
	private static final String DELETE_CLI =
		"DELETE FROM cliente WHERE cpf = ?";

	/**
	 * Template de comando SQL para consulta de cliente.
	 */
	private static final String CONSULTA_CLI =
		"SELECT COUNT(*) FROM cliente WHERE cpf = ?";

	/**
	 * Template de comando SQL para procura de cliente.
	 */
	private static final String PROCURA_CLI =
		"SELECT cpf,nome FROM cliente WHERE cpf = ?";

	/**
	 * Mensagem que indica erro de acesso ao banco de dados.
	 */
	private static final String MSG_ERRO_ACESSO_BD =
		"Erro de acesso ao banco de dados";


	/**
	 * O construtor da classe. Inicializa os parâmetros de conexão com o banco de dados.
	 *
	 * @param pNomeDriver o nome do driver.
	 * @param pUrlConexao a url de conexão com o banco.
	 * @param pUsuarioConexao o usuário da conexão.
	 * @param pSenhaConexao a senha da conexão.
	 */
	public RepositorioClientesBDR(
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
	 * Atualiza os dados de um cliente no banco de dados relacional.
	 *
	 * @param c o cliente com os dados a serem atualizados.
	 *
	 * @exception ClienteInexistenteException lançada quando o cliente a ter seus dados
	 *            atualizados não existe no banco de dados relacional.
	 *
	 * @exception ErroAcessoRepositorioException lançada quando ocorrer erro de acesso
	 *            ao banco de dados relacional.
	 */
	public void atualizar(Cliente c)
		throws ClienteInexistenteException, ErroAcessoRepositorioException {

		if (c != null) {
			Connection con = getConexao();
			PreparedStatement ps = null;
			try {
				ps = con.prepareStatement(UPDATE_CLI);
				ps.setString(1, c.getNome());
				ps.setString(2, c.getCpf());
				int rows = ps.executeUpdate();
				if (rows <= 0) {
					throw new ClienteInexistenteException(c.getCpf());
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
			throw new ClienteInexistenteException("");
		}
	}
	/**
	 * Verifica se um cliente existe armazenado no banco de dados relacional.
	 *
	 * @param cpf o CPF do cliente cuja existência no banco de dados relacional
	 *        será verificada.
	 *
	 * @return boolean true se o cliente existir no banco de dados relacional e
	 *         false caso contrário.
	 *
	 * @exception ErroAcessoRepositorioException lançada quando ocorrer erro de acesso
	 *            ao banco de dados relacional.
	 */
	public boolean existe(String cpf) throws ErroAcessoRepositorioException {

		if (cpf != null) {
			Connection con = getConexao();
			PreparedStatement ps = null;
			ResultSet rs = null;
			try {
				ps = con.prepareStatement(CONSULTA_CLI);
				ps.setString(1, cpf);
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
	 * Cadastra os dados de um cliente no banco de dados relacional.
	 *
	 * @param c o cliente com os dados a serem cadastrados.
	 *
	 * @exception ErroAcessoRepositorioException lançada quando ocorrer erro de acesso
	 *            ao banco de dados relacional.
	 *
	 * @see Q1 Por que este método não lança a exceção de cliente já existente ??
	 */
	public void inserir(Cliente c) throws ErroAcessoRepositorioException {

		if (c != null) {
			Connection con = getConexao();
			PreparedStatement ps = null;
			try {
				ps = con.prepareStatement(INSERT_CLI);
				ps.setString(1, c.getCpf());
				ps.setString(2, c.getNome());
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
	}
	/**
	 * Retorna um cliente armazenado no banco de dados relacional.
	 *
	 * @param cpf o CPF do cliente que será procurado no banco de dados relacional.
	 *
	 * @return Cliente o cliente com seus dados lidos a partir no banco de dados relacional.
	 *
	 * @exception ClienteInexistenteException lançada quando o cliente a ter seus dados
	 *            lidos não existe no no banco de dados relacional.
	 *
	 * @exception ErroAcessoRepositorioException lançada quando ocorrer erro de acesso
	 *            ao banco de dados relacional.
	 */
	public Cliente procurar(String cpf)
		throws ClienteInexistenteException, ErroAcessoRepositorioException {

		if (cpf != null) {
			Connection con = getConexao();
			PreparedStatement ps = null;
			ResultSet rs = null;
			try {
				ps = con.prepareStatement(PROCURA_CLI);
				ps.setString(1, cpf);
				rs = ps.executeQuery();
				if (rs.next()) {
					String bdCpf = rs.getString(1);
					String bdNome = rs.getString(2);
					Cliente cli = new Cliente(bdCpf, bdNome);
					return cli;
				} else {
					throw new ClienteInexistenteException(cpf);
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
			throw new ClienteInexistenteException("");
		}
	}
	/**
	 * Exclui um cliente armazenado no banco de dados relacional.
	 *
	 * @param cpf o CPF do cliente que será excluído no banco de dados relacional.
	 *
	 * @exception ClienteInexistenteException lançada quando o cliente a ser excluído
	 *            não existe no no banco de dados relacional.
	 *
	 * @exception ErroAcessoRepositorioException lançada quando ocorrer erro de acesso
	 *            ao banco de dados relacional.
	 */
	public void remover(String cpf)
		throws ClienteInexistenteException, ErroAcessoRepositorioException {
		if (cpf != null) {
			Connection con = getConexao();
			PreparedStatement ps = null;
			try {
				ps = con.prepareStatement(DELETE_CLI);
				ps.setString(1, cpf);
				int rows = ps.executeUpdate();
				if (rows <= 0) {
					throw new ClienteInexistenteException(cpf);
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
			throw new ClienteInexistenteException("");
		}
	}
	/**
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
	}
}
