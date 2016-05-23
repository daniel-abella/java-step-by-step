/*
 * RESPOSTA
 * C
 *
 *
A. 4
B. Text4
C. Compilation fails.
D. An exception is thrown at runtime.
 */
class A {

		public String doit(int x, int y){
		  return "Text" + x;
		}

		public int doit(int x, int y){
		  return x;
		}

		public static void main (String[] values){
		  A a = new A();
		  System.out.println(a.doit(4, 5));
		}
}