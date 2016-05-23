package arrays;

public class ArraysMain {

	// Inicializações válidas

	int x = 150;

	// 01
	int[] a = { 100, x, 200 }; // Válido

	// 02
	static final int[] b;
	static final int[] z;

	static { // A classe pode ter mais de um bloco estático
		b = new int[2];
		b[0] = 100;
		b[1] = 200;
		
		System.out.println("Bloco estático B");
	}
	
	static  {  // A classe pode ter mais de um bloco estático
		z = new int[2];
		z[0] = 100;
		z[1] = 200;
		
		System.out.println("Bloco estático Z");
	}

	int[] c = new int[] { 100, 200 }; // Válido
	int[] d = new int[3]; // Válido
	//int[] e = new int[3] { 100, 200, 300 }; // Inválido

	public static void main(String... args) {

		// É permitido fazer isso em Arrays, já em collecitons NÃO !!
		Parent[] family = new Child[3];

		// Exemplo cast array
		Object obj = new int[] { 1, 2, 3 };
		int[] someArray = (int[]) obj;
		for (int i : someArray)
			System.out.print(i + " ");

				
		////////////////////////////////////////////////////////////////////////////////////////		
				
		// int[] a1 = new int[]; // Não compila pois falta especificar o tamanho
		// do array
		int a2[] = new int[5];
		int[] a3 = new int[] { 1, 2 };
		// int[] a5 = new int[5] { 1, 2, 3, 4, 5 }; //Não é possível definir
		// dimensão quando um inicializador de array é fornecido

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
