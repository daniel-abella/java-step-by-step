/*
 * RESPOSTA
 * D
 *
 *

A	a
B	b
C	a b
D	b a
E	Compilation fails.
F	The exact output cannot be determined.
 */
class Stuff {
	public static void main(String[] args) {
		Stuff s = new Stuff();
	}

	{
		System.out.print("a ");
	}
	static {
		System.out.print("b ");
	}
}