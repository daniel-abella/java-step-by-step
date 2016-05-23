package cap01;

public class InstanceofTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(null instanceof String);

		Integer numero = 1;

		System.out.println(numero instanceof Exception);

		Pai pai = new Pai();

		System.out.println(pai instanceof Filho);

	}

}
