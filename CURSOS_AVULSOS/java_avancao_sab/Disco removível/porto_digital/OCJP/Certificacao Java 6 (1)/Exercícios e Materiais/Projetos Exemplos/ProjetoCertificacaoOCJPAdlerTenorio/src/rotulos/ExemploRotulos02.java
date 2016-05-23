package rotulos;

public class ExemploRotulos02 {

	public static void main(String[] args) {

		/** Exemplo Rotulo 01 - Exemplo Rotulo com Break */
		// boolean isTrue = true;
		// rotulo: //
		// for (int x = 0; x < 5; x++) {
		// while (isTrue) {
		// System.out.println("While");
		// break rotulo;
		// }
		// System.out.println("For"); // Não será executado pois o break PARA o
		// // todo o rótulo
		// }
		// System.out.println("Fim execução");

		/** Exemplo Rotulo 02 - Exemplo Rotulo com Continue */
		// rotulo: //
		// for (int i = 0; i < 5; i++) {
		// for (int j = 0; j < 5; j++) { // Esse for não está sendo iterado
		// System.out.println("For Interno " + j);
		// continue rotulo;
		// }
		// System.out.println("For Externo");
		// }
		// System.out.println("Fim execução");

		/** Exemplo Rotulo 02 - Livro SCJP */
		rotulo: //
		for (int j = 0; j < 5; j++) {
			for (int k = 0; k < 3; k++) {
				System.out.print(" " + j);

				if (j == 3 && k == 1) {
					break rotulo;
				}

				if (j == 0 || j == 2) {
					break;
				}
			}
		}
	}
}
