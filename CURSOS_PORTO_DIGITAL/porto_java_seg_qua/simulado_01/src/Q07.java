/*
 * RESPOSTA
 * D
 *
 * A. 100
B. 0
C. 50
D.   Compilation fails.
E.   An exception is thrown at runtime.
 */
public class Q07 {
	public static void main(String[] args) {
		  final int a, b = 100;
		  a = 50;
		  switch(b){
		     case a:
		          System.out.println("50");break;
		     case 0:
	              	System.out.println("0");
		     case 100:
		          System.out.println("100");break;

		}
	}
}
