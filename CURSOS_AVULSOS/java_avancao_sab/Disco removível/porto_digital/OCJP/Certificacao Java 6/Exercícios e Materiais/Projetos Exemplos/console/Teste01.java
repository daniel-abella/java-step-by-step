package SCJP6.console;

import java.io.Console;

public class Teste01 {
	
	enum Ola{ a,b,c }
	
	static void doX(Number n, Number m){
		System.out.println("Number");
	}
	
	static void doX(long... x){
		System.out.println("long");
	}
	
	public static void main(String[] args) {
		doX(7,7);
		Console c = System.console();
		char[] c4 = c.readPassword("","");
		System.out.println();
		Thread t;
		
	

	}

}
class Xx {
	
	public static void main(String[] args) {
		Teste01 c;
	}
}