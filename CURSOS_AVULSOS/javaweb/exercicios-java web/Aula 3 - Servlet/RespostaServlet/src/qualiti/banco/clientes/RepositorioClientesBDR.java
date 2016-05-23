package qualiti.banco.clientes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import qualiti.banco.geral.ErroAcessoRepositorioException;
/**
 * Implementa��o da interface que define os m�todos de acesso aos dados de cliente
 * em um mecanismo de armazenamento de dados. Esta implementa��o � realizada atrav�s
 * do armazenamento de objetos do tipo cliente em uma tabela de um banco de dados
 * relacional. Neste exemplo, est� sendo utilizado o banco de dados Access. O driver
 * de acesso a este banco � a bridge da Sun. � importante notar que esta classe tem
 * diversos atributos referentes ao driver e a conex�o com o banco a serem utilizados.
 * Estes atributos s�o inicializados no construtor da classe e podem ser lidos de um
 * arquivo de par�metros por quem instancia esta classe. Assim, � poss�vel parametrizar
 * o tipo de banco de dados a ser utilizado sem alterar a implementa��o deste reposit�rio,
 * desde que o banco suporte a sintaxe dos comandos SQL utilizados nesta implementa��o.
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
	 * O nome do driver JDBC a ser usado na conex�o.
	 */
	private String nomeDriver;

	/**
	 * A url de conex�o.
	 */
	private String urlConexao;

	/**
	 * O usu�rio da conex�o.
	 */
	private String usuarioConexao;

	/**
	 * A senha do usu�rio da conex�o.
	 */
	private String senhaConexao;

	/**
	 * Flag que indica se o driver foi ou n�o carregado.
	 */
	private boolean indDriverCarregado;

	/**
	 * Mensagem que indica falha na carga do driver.
	 */
	private static final String MSG_FALHA_CARGA_DRIVER =
		"Nome do driver JDBC usado n�o corresponde a uma classe v�lida";

	/**
	 * Mensagem que indica erro de obten��o da conex�o com o banco de dados.
	 */
	private static final String MSG_ERRO_CONEXAO =
		"Erro ao obter conex�o com o banco de dados";

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
	 * O construtor da classe. Inicializa os par�metros de conex�o com o banco de dados.
	 *
	 * @param pNomeDriver o nome do driver.
	 * @param pUrlConexao a url de conex�o com o banco.
	 * @param pUsuarioConexao o usu�rio da conex�o.
	 * @param pSenhaConexao a senha da conex�o.
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
	 * @exception ClienteInexistenteException lan�ada quando o cliente a ter seus dados
	 *            atualizados n�o existe no banco de dados relacional.
	 *
	 * @exception ErroAcessoRepositorioException lan�ada quando ocorrer erro de acesso
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
	 * @param cpf o CPF do cliente cuja exist�ncia no banco de dados relacional
	 *        ser� verificada.
	 *
	 * @return boolean true se o cliente existir no banco de dados relacional e
	 *         false caso contr�rio.
	 *
	 * @exception ErroAcessoRepositorioException lan�ada quando ocorrer erro de acesso
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
	 * Inicializa o driver do banco, caso este n�o esteja inicializado e
	 * retorna uma conex�o do banco de dados, obtida a partir do driver manager.
	 *
	 * @return Connection a conex�o do banco de dados
	 *
	 * @exception ErroAcessoRepositorioException se o nome do driver n�o representar uma
	 *            classe v�lida e existente no sistema ou se ocorreu erro na obten��o da
	 *            conex�o a partir do driver manager.
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
	 * @exception ErroAcessoRepositorioException lan�ada quando ocorrer erro de acesso
	 *            ao banco de dados relacional.
	 *
	 * @see Q1 Por que este m�todo n�o lan�a a exce��o de cliente j� existente ??
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
	 * @param cpf o CPF do cliente que ser� procurado no banco de dados relacional.
	 *
	 * @return Cliente o cliente com seus dados lidos a partir no banco de dados relacional.
	 *
	 * @exception ClienteInexistenteException lan�ada quando o cliente a ter seus dados
	 *            lidos n�o existe no no banco de dados relacional.
	 *
	 * @exception ErroAcessoRepositorioException lan�ada quando ocorrer erro de acesso
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
	 * @param cpf o CPF do cliente que ser� exclu�do no banco de dados relacional.
	 *
	 * @exception ClienteInexistenteException lan�ada quando o cliente a ser exclu�do
	 *            n�o existe no no banco de dados relacional.
	 *
	 * @exception ErroAcessoRepositorioException lan�ada quando ocorrer erro de acesso
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
	 * Fecha os recursos passados como par�metros.
	 *
	 * @param con a conex�o a ser fechada.
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
