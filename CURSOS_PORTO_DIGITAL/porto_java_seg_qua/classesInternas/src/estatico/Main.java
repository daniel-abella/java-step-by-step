package estatico;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Externa.Interna interna = new Externa.Interna();
		System.out.println(interna.toString());

		Externa.Interna interna2 = new Externa.Interna();
		System.out.println(interna2.toString());

	}

}
