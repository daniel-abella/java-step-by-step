package classesabstratas;

public abstract class AbstractTestePage {

	public AbstractTestePage(String wid, String descricao) {
		criaComponentes(wid, descricao);
	}

	public abstract void criaComponentes(String wid, String descricao);

	abstract void metodoTeste(); // Esse método pode ser sobrescrito aumentando
									// o nível de acesso dele nas classes
									// filhas, ou seja: public, protected ou
									// permanecendo a nível de pacote.

}
