public class Test {

	public static void main(String[] args) {

		Byte b1 = 12;
		Byte b2 = 12;

		System.out.println(b1 == b2);
		System.out.println("INTEGER");
		Integer i1 = 128;
		Integer i2 = 128;

		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));

		System.out.println("LONG");
		Long l1 = null;
		Long l2 = 128L;

		System.out.println(l1 == l2);
		//System.out.println(l1.equals(l2));
		System.out.println(l2.equals(l1));

	}

}
