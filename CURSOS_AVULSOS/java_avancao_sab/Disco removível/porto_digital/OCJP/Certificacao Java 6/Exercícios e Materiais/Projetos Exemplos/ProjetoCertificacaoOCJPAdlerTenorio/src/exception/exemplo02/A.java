package exception.exemplo02;

public class A {

	public static void method1() {
	
		try {
			B b = new B();
			b.method2();
			// more code here

		} catch (TestException te) {
			throw new RuntimeException(te);
		}
	}

	public static void main(String[] args) {
		method1();
	}
}
