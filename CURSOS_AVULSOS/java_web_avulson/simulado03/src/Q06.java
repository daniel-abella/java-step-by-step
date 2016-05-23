/*
A. String regex = “”;
B. String regex = “(\w{4})\\.?\\s* “;
C. String regex = “.Test*\\.?\\s*“.
D. String regex = “(Test)?\\.?\\s*”
E. String regex = “\\.?\\s*”;
F. String regex = “\\w[ \.] +“;
 */
public class Q06 {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String test = "Test A. Test B. Test C.";
		String regex = ".Test*\\.?\\s*";
		String[] result = test.split(regex);



	}
}
