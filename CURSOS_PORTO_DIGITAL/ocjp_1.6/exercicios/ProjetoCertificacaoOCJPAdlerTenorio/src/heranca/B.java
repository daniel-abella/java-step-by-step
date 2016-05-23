package heranca;


public class B implements IInterface {

	@Override
	public void x() {

	}

	public void y() {

	}

	public static void main(String[] args) {

		int x = 5;
		B p = new B();
		p.doStuff(x);
		
		System.out.print("x main" + p.doStuff(x));
	}

	int doStuff(int x) {
		System.out.println("x dostuff" + x++);
		return x++;
	}
}
