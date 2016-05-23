/*
 * RESPOSTA
 * C
 *
 *

A 	z = 42
B 	z = 43
C 	z = 44
D 	z = 45
E 	Compilation fails.
F 	An exception is thrown at runtime.
 */
class Test3 {
	public static void main(String[] args) {
		boolean x = true;
		boolean y = false;
		short z = 42;

		if ((x == true) && (y = true))
			z++;
		if ((y == true) || (++z == 44))
			z++;

		System.out.println("z = " + z);
	}
}