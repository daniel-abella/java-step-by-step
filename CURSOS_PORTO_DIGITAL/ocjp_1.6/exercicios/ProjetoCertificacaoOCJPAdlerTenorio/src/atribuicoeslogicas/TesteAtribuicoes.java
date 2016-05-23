package atribuicoeslogicas;

public class TesteAtribuicoes {

	public static void main(String[] args) {

		// Integer x = 400;
		// Integer y = x;
		// x++;
		//
		// StringBuilder sb1 = new StringBuilder("123");
		// StringBuilder sb2 = sb1;
		// sb1.append("5");
		//
		// System.out.println("x é: " + x);
		// System.out.println("y é: " + y);
		// System.out.println("sb1 é: " + sb1);
		// System.out.println("sb2 é: " + sb2);
		//
		// System.out.println((x == y) + " " + (sb1 == sb2));
		//
		//
		//
		// int x = 0;
		// int y = 10;
		// do {
		// y--;
		// ++x;
		// } while (x < 5);
		// System.out.print(x + "," + y);
		//

		// int x = 0;
		// int y = 0;
		//
		// String o = "";
		// o = o + x + y;
		// System.out.println(o);
		//
		// DateFormat dt = DateFormat.getDateInstance();
		//
		// Boolean.valueOf("");
		//
		// Date d = new Date(0);
		//
		// String[] colors = { "blue", "red", "green", "yellow", "orange" };
		// Arrays.sort(colors);

		int x = 5;
		// TesteAtribuicoes p = new TesteAtribuicoes();
		// p.doStuff(x);
		// System.out.print(" main x = " + x);

//		boolean b1 = true;
//		boolean b2 = false;
//
//		if ((x == 4) && !b2)
//			System.out.print(" l ");
//		System.out.print(" 2 ");
//		if ((b2 = true) && b1)
//			System.out.print(" 3 ");

		// /////////////////////////////////////////

		boolean t1 = true;
		boolean t2 = false;

		if ((x == 5) ^ t1) { // true true - Não vai imprimir pois os 2 retornam TRUE
			System.out.print(" 7 "); 
		}
		
		if ((x == 4) ^ t1) { // false true
			System.out.print(" 8 "); // Para imprimir o 7, SOMENTE uma operação tem q ser TRUE
		}
		
		if ((t2 = false) && t2) {  // false false
			System.out.print(" 9 ");
		}
	}

	void doStuff(int x) {
		System.out.print(" doStuff x = " + x++);
	}
}
