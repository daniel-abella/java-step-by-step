package qualiti.banco.contas;

import qualiti.banco.geral.ErroAcessoRepositorioException;
import java.util.*;
/**
 * Interface que define os métodos de acesso aos dados de conta em um
 * mecanismo de armazenamento de dados.
 *
 * @author Qualiti <a href="mailto:qualiti@qualiti.com.br">qualiti@qualiti.com.br</a>
 *
 * @version 1.0
 *
 * @see qualiti.banco.conta.ContaAbstrata
 */
public interface RepositorioContas {
	/**
	 * Cadastra os dados de uma conta EM UM MECANISMO DE ARMAZENAMENTO DE DADOS.
	 *
	 * @param c a conta com os dados a serem cadastrados.
	 *
	 * @exception ErroAcessoRepositorioException lançada quando ocorrer erro de acesso
	 *            EM UM MECANISMO DE ARMAZENAMENTO DE DADOS.
	 *
	 * @see Q1 Por que este método não lança a exceção de conta já existente ??
	 */
	public void inserir(ContaAbstrata c) throws ErroAcessoRepositorioException;
	/**
	 * Verifica se uma conta existe armazenada EM UM MECANISMO DE ARMAZENAMENTO DE DADOS.
	 *
	 * @param num o número da conta cuja existência EM UM MECANISMO DE ARMAZENAMENTO DE DADOS
	 *        será verificada.
	 *
	 * @return boolean true se a conta existir EM UM MECANISMO DE ARMAZENAMENTO DE DADOS e
	 *         false caso contrário.
	 *
	 * @exception ErroAcessoRepositorioException lançada quando ocorrer erro de acesso
	 *            EM UM MECANISMO DE ARMAZENAMENTO DE DADOS.
	 */
	public boolean existe(String num) throws ErroAcessoRepositorioException;
	/**
	 * Atualiza os dados de uma conta EM UM MECANISMO DE ARMAZENAMENTO DE DADOS.
	 *
	 * @param c a conta com os dados a serem atualizados.
	 *
	 * @exception ContaInexistenteException lançada quando a conta a ter seus dados
	 *            atualizados não existe no MECANISMO DE ARMAZENAMENTO DE DADOS.
	 * @exception ErroAcessoRepositorioException lançada quando ocorrer erro de acesso
	 *            EM UM MECANISMO DE ARMAZENAMENTO DE DADOS.
	 */
	public void atualizar(ContaAbstrata c)
		throws ContaInexistenteException, ErroAcessoRepositorioException;
	/**
	 * Retorna uma conta armazenada EM UM MECANISMO DE ARMAZENAMENTO DE DADOS.
	 *
	 * @param num o número da conta que será procurado EM UM MECANISMO DE ARMAZENAMENTO
	 *        DE DADOS.
	 *
	 * @return ContaAbstrata a conta com seus dados lidos a partir DE UM MECANISMO DE
	 *         ARMAZENAMENTO DE DADOS.
	 *
	 * @exception ContaInexistenteException lançada quando a conta a ter seus dados
	 *            lidos não existe no MECANISMO DE ARMAZENAMENTO DE DADOS.
	 * @exception ErroAcessoRepositorioException lançada quando ocorrer erro de acesso
	 *            EM UM MECANISMO DE ARMAZENAMENTO DE DADOS.
	 */
	public ContaAbstrata procurar(String num)
		throws ContaInexistenteException, ErroAcessoRepositorioException;
	/**
	 * Exclui uma conta armazenada EM UM MECANISMO DE ARMAZENAMENTO DE DADOS.
	 *
	 * @param num o número da conta que será excluída EM UM MECANISMO DE ARMAZENAMENTO
	 *        DE DADOS.
	 *
	 * @exception ContaInexistenteException lançada quando a conta a ser excluída
	 *            não existe no MECANISMO DE ARMAZENAMENTO DE DADOS.
	 * @exception ErroAcessoRepositorioException lançada quando ocorrer erro de acesso
	 *            EM UM MECANISMO DE ARMAZENAMENTO DE DADOS.
	 */
	public void remover(String num)
		throws ContaInexistenteException, ErroAcessoRepositorioException;

	public void atualizar(ContaAbstrata c1, ContaAbstrata c2)
		throws ContaInexistenteException, ErroAcessoRepositorioException;

	public Collection pesquisarTodasContas() throws ContaInexistenteException,
												  ErroAcessoRepositorioException ;

}