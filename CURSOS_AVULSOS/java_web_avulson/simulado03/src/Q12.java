/*
 * RESPOSTA
 * B
 *
 *

A. 300-100-100-100-100
B. 300-300-100-100-100
C. 300-300-300-100-100
D. 300-300-300-300-100
 */
class Foo {
	private int x;

	public Foo(int x) {
		this.x = x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return x;
	}
}

class Gamma {
	static Foo fooBar(Foo foo) {
		foo = new Foo(100);
		return foo;
	}

	public static void main(String[] args) {
		Foo foo = new Foo(300);
		System.out.println(foo.getX() + "-");
		Foo fooFoo = fooBar(foo);
		System.out.println(foo.getX() + "-");
		System.out.println(fooFoo.getX() + "-");
		foo = fooBar(fooFoo);
		System.out.println(foo.getX() + "-");
		System.out.println(fooFoo.getX());
	}
}