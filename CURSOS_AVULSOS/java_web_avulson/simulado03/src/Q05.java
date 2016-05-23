public class Q05 {
	public static void main(String[] args) {

		String test = "a1b2c3";
		String[] tokens = test.split("\\w");
		for (String s : tokens)
			System.out.print(s + " ");
	}
}
