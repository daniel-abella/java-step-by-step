package heranca.sobrescritasobrecarga.metodosestaticos;


public class B extends A {

	public static void main(String[] args) {
		//new B().go();
		// System.out.println(super.getRaning02()); // Não se pode chamar o
		// super dentro de um método estático
		//System.out.println(getRaning02()); // Assim está ok.
		
		System.out.println("///////////////////////////////////////////////");
		
		A a = new B();
		a.m1(); // Se o método for estático ou uma variável o compilador chama o da classe pai
		a.m2();
		
	}

	void go() {
		System.out.println(super.getRaning());
	}

	// sobrescrita válida
	final int getRaning() {
		return 4;
	}
	
	
	static void m1(){
		System.out.println("m1 B");
	}
	
	 void m2(){
		System.out.println("m2 B");
	}
}
