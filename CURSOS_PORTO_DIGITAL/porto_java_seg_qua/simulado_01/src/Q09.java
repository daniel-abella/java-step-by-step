/*
 * RESPOSTA
 * A
 *
 * A. short
B. int
C. shortint
D.   Compilation fails.
E.   An exception is thrown at runtime.
 *
 */
class Test2 {

		public int sum (short a, short b){
			System.out.println("short");
			return a + b;
		}

		public int sum (int a, int b){
			System.out.println("int");
			return a + b;
		}

		public static void main(String[] args) {
			Test2 teste = new Test2 ();
			byte a = 2;
			byte b = 2;
			teste.sum(a, b);
		}

}