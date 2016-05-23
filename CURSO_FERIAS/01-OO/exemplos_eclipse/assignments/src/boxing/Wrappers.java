package boxing;

public class Wrappers {

	private static byte   b;
	private static short  s;
	private static int    i;
	private static long   l;
	private static float  f;
	private static double d;
	private static char   c;// = '\u0000';
	private static boolean boo;

	public static void main(String[] args) {

		b  = 1;
		Byte bWrapper = 1;

		Integer somaWrapper = b + bWrapper;
		int soma = b + bWrapper;

		somaByte(bWrapper);
		somaByteWrapper(b);

		System.out.println(Byte     .MIN_VALUE);
		System.out.println(Short    .MIN_VALUE);
		System.out.println(Integer  .MIN_VALUE);
		System.out.println(Long     .MIN_VALUE);
		System.out.println(Float    .MIN_VALUE);
		System.out.println(Double   .MIN_VALUE);
		System.out.println(Character.MIN_VALUE);
	}

	private static void somaByte(byte b){

	}

	private static void somaByteWrapper(Byte b){

	}

}
