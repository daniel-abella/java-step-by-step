/*
 * RESPOSTA
 * A
 *
A. 23
B. 234
C. 235
D. 2345
E. 2357
F. 23457
G. Compilation fails.
 */
class Breaker {
	static String o = "";

	public static void main(String[] args) {
		o = o + 2;

		z:

		for (int x = 3; x < 8; x++) {
			if (x == 4)
				break;
			if (x == 6)
				break z;
			o = o + x;
		}
		System.out.println(o);
	}
}