/*
 * RESPOSTA
 * C
 *
 *

A 1
B 2
C 3
D 5
E Compilation fails.
 */
class Banana {
	int x = 1;

	public static void main(String[] args) {
		int x = 2;
		Banana b = new Banana();
		b.go();
	}

	{
		x += x;
	}

	void go() {
		++x;
		System.out.println(x);
	}
}
