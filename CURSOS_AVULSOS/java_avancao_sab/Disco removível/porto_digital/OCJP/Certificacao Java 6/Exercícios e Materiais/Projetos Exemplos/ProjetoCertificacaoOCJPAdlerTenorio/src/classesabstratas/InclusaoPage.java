package classesabstratas;

public class InclusaoPage extends AbstractTestePage {

	public InclusaoPage(String wid, String descricao) {
		super(wid, descricao);
	}

	@Override
	public void criaComponentes(String wid, String descricao) {
		System.out.println("criarCaput("+descricao+")");
		System.out.println("criarPainelEdicaoVisualizacao("+descricao+")");
		System.out.println("criarBotoes("+descricao+")");
	}

	@Override
	void metodoTeste() {
		
	}

}
