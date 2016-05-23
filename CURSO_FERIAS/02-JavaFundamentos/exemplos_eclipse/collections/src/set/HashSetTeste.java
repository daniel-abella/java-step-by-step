package set;

import java.util.HashSet;

public class HashSetTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<String>();

		hashSet.add("a");
		hashSet.add("m");
		hashSet.add("t");
		hashSet.add("i");
		hashSet.add("p");
		hashSet.add("q");
		hashSet.add("q");

		for (String string : hashSet) {
			System.out.println(string);
		}

	}

}
