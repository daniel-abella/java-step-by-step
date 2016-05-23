package exception.herancaexception;

public class MainTestC {

	public static void main(String[] args) {

		C c = new C();
		C2 c2 = new C2();
		C5 c5 = new C5();

		try {
			c.doStuff();
		} catch (SubException e) {
			e.printStackTrace();
		}
		
		try {
			c2.doStuff();
		} catch (SubSubException e) {
			e.printStackTrace();
		}
		
		
		c5.doStuff(); // Não levanta exception
	}
}
