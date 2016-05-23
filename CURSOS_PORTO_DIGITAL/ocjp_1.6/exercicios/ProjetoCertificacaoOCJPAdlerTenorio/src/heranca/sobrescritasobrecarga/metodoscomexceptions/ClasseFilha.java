package heranca.sobrescritasobrecarga.metodoscomexceptions;

public class ClasseFilha extends ClassePai {

	@Override
	protected int retornarZero() { // Só posso retornar uma exceção de Runtime:
									// nullPoint...
		return super.retornarZero();
	}

	@Override
	protected int retornarDez() throws Exception {
		int a = 2;
		a += super.retornarDez(); // Pode-se usufruir da sobrescrita dessa forma
		a += 10;
		return a;
	}

	@Override
	public int retornarVinte() throws SobrecargaException { // Pode-se diminuir
															// a excessão, só
															// não pode
															// aumenta-la
		return 20;
	}

	@Override
	public int retornarTrinta() throws Exception { // Não posso "aumentar" a
													// excessão da classe pai
		return 30;
	}

	@Override
	public int retornarQuarenta() throws RuntimeException {
		return 40;
	}

	@Override
	public int retornarCinquenta() throws Exception { // Não posso sobrescrever
														// levantando uma
														// exception que o pai
														// não levanta
		return 50;
	}

	@Override
	public int retornarSesssenta() { // Pode-se não levantar na sobrecarga
		return 60;
	}

	public static void main(String[] args) {

		ClassePai cp = new ClassePai();
		ClasseFilha cf = new ClasseFilha();
		ClassePai indigente = new ClasseFilha();

		try {
			cp.retornarSesssenta(); // Try/Cach pq o método na classe pai lança
									// exception
		} catch (Exception e) {
			e.printStackTrace();
		}

		cf.retornarSesssenta(); // O compilador sabe q o método não retorna
								// exception

		try {
			indigente.retornarSesssenta();
		} catch (Exception e) {
			e.printStackTrace();
		} // Apesar do método chamado ser o da "ClasseFilha" e o mesmo não
			// lançar
			// excecao, o compilador "pensará" que
			// vc está chamando o método da classe
			// pai (que lança excecao) por isso o tem que colocar o
			// Try/Cach para não dá ero de compilação
	}
}
