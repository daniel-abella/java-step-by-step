package referencia;

public class PassagemCopiaValor {

	public static void main(String[] args) {

		int x = 5;

		somaX(x);
		System.out.println("Original - "+x);

	}

	private static void somaX(int x) {

		x += 10;

		System.out.println(x);
	}

}
