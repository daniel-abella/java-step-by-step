package heranca.sobrescritasobrecarga.metodosestaticos;

public class A {
	
	int getRaning() {
		return 42;
	}
	
	static int getRaning02() {
		return 43;
	}
	
	static void m1(){
		System.out.println("m1 A");
	}
	
	 void m2(){
		System.out.println("m2 A");
	}
}
