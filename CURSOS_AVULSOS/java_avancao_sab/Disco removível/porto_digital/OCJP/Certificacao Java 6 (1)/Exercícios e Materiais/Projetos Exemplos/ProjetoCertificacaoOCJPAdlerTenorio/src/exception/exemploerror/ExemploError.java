package exception.exemploerror;

public class ExemploError {

	public static void main(String[] args) {
		try {
			test();
			System.out.print("DDDDDDDDDDDD");
		} catch (Exception ex) {
			System.out.print("AAAAAAAAA");
		}
		System.out.print("BBBBBBBB "); // Só executará essa linha se cair no cach. 
	}

	static void test() throws Error {
		if (true)
			throw new AssertionError();
		System.out.print("CCCCCCCCCC");
	}
}
