package rotulos;

public class ExemploRotulos {

	static String o = "";

	public static void main(String[] args) {

		/** Exemplo Rotulo 01*/

//		z: 
//		o = o + 2;
//		for (int x = 3; x < 8; x++) {
//			if (x == 4)
//				break;
//			if (x == 6)
//				break z; // Erro de compila��o pois h� uma express�o ap�s o
//							// r�tulo
//			o = o + x;
//		}
//		System.out.println(o);

		/////////////////////////////////////////////////////////////////////////////////////////

		/** Exemplo Rotulo 01 - Exemplo Rotulo com Break */
		// Obs: Se s� tiver UM �NICO for na express�o o break ou continue
		// s�o do r�tulo, ou seja, o break normal � a mesma coisa de colocar
		// break z
		z: for (int x = 2; x < 7; x++) {
			if (x == 3)
				continue;
			if (x == 5)
				break;
			o = o + x;
		}
		System.out.println(o);
	}

}
