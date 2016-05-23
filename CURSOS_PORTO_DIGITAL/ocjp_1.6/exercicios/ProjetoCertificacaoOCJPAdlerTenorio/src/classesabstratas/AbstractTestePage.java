package classesabstratas;

public abstract class AbstractTestePage {

	public AbstractTestePage(String wid, String descricao) {
		criaComponentes(wid, descricao);
	}

	public abstract void criaComponentes(String wid, String descricao);

	abstract void metodoTeste(); // Esse m�todo pode ser sobrescrito aumentando
									// o n�vel de acesso dele nas classes
									// filhas, ou seja: public, protected ou
									// permanecendo a n�vel de pacote.

}
