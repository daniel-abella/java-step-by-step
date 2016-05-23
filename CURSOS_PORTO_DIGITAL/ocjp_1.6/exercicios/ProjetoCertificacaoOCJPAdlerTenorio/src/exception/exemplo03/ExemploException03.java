package exception.exemplo03;

public class ExemploException03 {

	public static void main(String[] args) {

		try {

			System.out.println("Hello world");
			lancarRuntime();
			System.out.println("Done witch try blocker");
			
		}

		finally {
			System.out.println("finally");
		}
	}

	static void lancarRuntime() {
		throw new RuntimeException();
	}
}
