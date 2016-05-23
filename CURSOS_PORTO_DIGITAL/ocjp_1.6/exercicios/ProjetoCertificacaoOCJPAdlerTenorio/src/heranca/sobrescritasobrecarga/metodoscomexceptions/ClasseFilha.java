package heranca.sobrescritasobrecarga.metodoscomexceptions;

public class ClasseFilha extends ClassePai {

	@Override
	protected int retornarZero() { // S� posso retornar uma exce��o de Runtime:
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
															// a excess�o, s�
															// n�o pode
															// aumenta-la
		return 20;
	}

	@Override
	public int retornarTrinta() throws Exception { // N�o posso "aumentar" a
													// excess�o da classe pai
		return 30;
	}

	@Override
	public int retornarQuarenta() throws RuntimeException {
		return 40;
	}

	@Override
	public int retornarCinquenta() throws Exception { // N�o posso sobrescrever
														// levantando uma
														// exception que o pai
														// n�o levanta
		return 50;
	}

	@Override
	public int retornarSesssenta() { // Pode-se n�o levantar na sobrecarga
		return 60;
	}

	public static void main(String[] args) {

		ClassePai cp = new ClassePai();
		ClasseFilha cf = new ClasseFilha();
		ClassePai indigente = new ClasseFilha();

		try {
			cp.retornarSesssenta(); // Try/Cach pq o m�todo na classe pai lan�a
									// exception
		} catch (Exception e) {
			e.printStackTrace();
		}

		cf.retornarSesssenta(); // O compilador sabe q o m�todo n�o retorna
								// exception

		try {
			indigente.retornarSesssenta();
		} catch (Exception e) {
			e.printStackTrace();
		} // Apesar do m�todo chamado ser o da "ClasseFilha" e o mesmo n�o
			// lan�ar
			// excecao, o compilador "pensar�" que
			// vc est� chamando o m�todo da classe
			// pai (que lan�a excecao) por isso o tem que colocar o
			// Try/Cach para n�o d� ero de compila��o
	}
}
