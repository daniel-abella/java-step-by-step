package arrays;

public class ArraysMain {

	// Inicializa��es v�lidas

	int x = 150;

	// 01
	int[] a = { 100, x, 200 }; // V�lido

	// 02
	static final int[] b;
	static final int[] z;

	static { // A classe pode ter mais de um bloco est�tico
		b = new int[2];
		b[0] = 100;
		b[1] = 200;
		
		System.out.println("Bloco est�tico B");
	}
	
	static  {  // A classe pode ter mais de um bloco est�tico
		z = new int[2];
		z[0] = 100;
		z[1] = 200;
		
		System.out.println("Bloco est�tico Z");
	}

	int[] c = new int[] { 100, 200 }; // V�lido
	int[] d = new int[3]; // V�lido
	//int[] e = new int[3] { 100, 200, 300 }; // Inv�lido

	public static void main(String... args) {

		// � permitido fazer isso em Arrays, j� em collecitons N�O !!
		Parent[] family = new Child[3];

		// Exemplo cast array
		Object obj = new int[] { 1, 2, 3 };
		int[] someArray = (int[]) obj;
		for (int i : someArray)
			System.out.print(i + " ");

				
		////////////////////////////////////////////////////////////////////////////////////////		
				
		// int[] a1 = new int[]; // N�o compila pois falta especificar o tamanho
		// do array
		int a2[] = new int[5];
		int[] a3 = new int[] { 1, 2 };
		// int[] a5 = new int[5] { 1, 2, 3, 4, 5 }; //N�o � poss�vel definir
		// dimens�o quando um inicializador de array � fornecido

		int[][] a1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9, 10 } };
		// System.out.print(a1[0][2] + "," + a1[1][0] + "," + a1[2][1]);
		
		
		
		String []elements = {"for", "tea", "too"};
		String first = (elements.length > 0) ? elements[0] : null;
		System.out.println(first);
	}

	private class Parent {

	}

	private class Child extends Parent {

	}

}
