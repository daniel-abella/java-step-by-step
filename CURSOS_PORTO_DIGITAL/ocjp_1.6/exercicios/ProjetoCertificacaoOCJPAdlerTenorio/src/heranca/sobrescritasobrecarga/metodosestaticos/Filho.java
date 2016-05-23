package heranca.sobrescritasobrecarga.metodosestaticos;


public class Filho extends Pai {

	public static int multiply(int a, int b) {
		//int c = super.multiply(a, b); // Erro de compilação, pois n se pode chemar super dentro de um método estático.
		int c = Pai.multiply(a, b); 
		return c;
	}

	public static void main(String[] args) {
		Filho f = new Filho();
		Pai filho2 = new Filho();

		System.out.println(f.multiply(1, 10)); // 10
		System.out.println(Filho.multiply(1, 20)); // 20
		
		System.out.println(f.foo()); // "toString class Filho"
		System.out.println(filho2.foo());  // "toString class Filho"
	}

	public Pai foo() {
		return this;
	}

	@Override
	public String toString() {
		return "toString class Filho";
	}
	
}
