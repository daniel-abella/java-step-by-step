/*
 * RESPOSTA
 * D
 *
 *

A. 42
B. 420
C. 462
D. 42042
E. Compilation fails.
 */
class TestString1 {
	public static void main(String[] args) {
		String str = "420";
		str += 42;
		System.out.print(str);
	}
}