package heranca.sobrescritasobrecarga.metodosestaticos;

public class Pai {

	protected static int multiply(int a, int b) {
		return a * b;
	}

	public Pai foo() {
		return this;
	}
	
	private static void fazNada() {
		System.out.println("N�o d� erro de compila��o se criarmos um m�todo static private");
	}
	
	public static void fazAlgumaCoisa() {
		System.out.println("Faz alguma cois");
	}
	
	@Override
	public String toString() {
		return "toString class Pai";
	}
}
