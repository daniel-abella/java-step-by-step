package heranca.sobrescritasobrecarga.metodosestaticos;

public class Pai {

	protected static int multiply(int a, int b) {
		return a * b;
	}

	public Pai foo() {
		return this;
	}
	
	private static void fazNada() {
		System.out.println("Não dá erro de compilação se criarmos um método static private");
	}
	
	public static void fazAlgumaCoisa() {
		System.out.println("Faz alguma cois");
	}
	
	@Override
	public String toString() {
		return "toString class Pai";
	}
}
