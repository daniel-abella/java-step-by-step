package classesabstratas;

public class GestaoPage  extends AbstractTestePage{

	public GestaoPage(String wid, String descricao) {
		super(wid, descricao);
	}

	@Override
	public void criaComponentes(String wid, String descricao) {
		System.out.println("criarCaput("+descricao +")");
		System.out.println("criarPainelListagem("+descricao +")");
		System.out.println("criarBotoes("+descricao +")");
	}

	@Override
	void metodoTeste() {
		
	}
}
