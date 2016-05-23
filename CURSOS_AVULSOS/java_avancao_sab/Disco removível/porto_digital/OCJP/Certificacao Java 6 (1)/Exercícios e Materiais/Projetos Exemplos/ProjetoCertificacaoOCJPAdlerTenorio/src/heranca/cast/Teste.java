package heranca.cast;

public class Teste {

	public static void main(String[] args) {

		ClasseA a = new ClasseA();
		ClasseB b = new ClasseB();
		ClasseC c = new ClasseC();
		ClasseA p3 = new ClasseB();
		ClasseA p4 = new ClasseC();

		// c = (ClasseC)b; // N�o posso colocar B dentro de C
		// a = b; // Ok, todo B � um A
		// c = p4; // Necessita de Cast
		// c = (ClasseC)p4; ok
		// b = (ClasseB)p3; OK
		// b = c; // N�o posso apontar pra instancias que nao tem nada a ver
		
		
		 //b = (ClasseB) a; Lembrando que se eu fizer isso n�o d� erro de compila��o,
		 // por�m d� ClassCast em tempo de execu��o.

		//ClasseB baa = (ClasseB) a;

		////////////////////////
		
		imprimeShort((short)7);
		imprimeInt((int)11111);

	}

	static void imprimeShort(short s) {
		System.out.println("short");
	}
	
	static void imprimeInt(int s) {
		System.out.println("int");
	}

	static void imprimeShort(short... s) {
		System.out.println("varargs");

	}
}
