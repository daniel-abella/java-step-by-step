package heranca.cast;

public class ClasseB extends ClasseA {

	public void start() {
		System.out.println("B");
	}
	
	
	public static void main(String[] args) {
		
		((ClasseA) new ClasseB()).start();
	}

}
