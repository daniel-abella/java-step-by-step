package boxing.poolnumerico;

public class Numeros {

	public static void main(String[] args) {

		Integer um = 1;
		Integer dois = 1;

		System.out.println(um.equals(dois));
		System.out.println(um == dois);

		um = 128;
		dois = 128;

		System.out.println(um.equals(dois));
		System.out.println(um == dois);
	}
}
