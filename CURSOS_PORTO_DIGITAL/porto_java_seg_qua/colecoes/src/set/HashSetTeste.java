package set;

import java.util.HashSet;

public class HashSetTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<String>();

		System.out.println(hashSet.add("a"));
		System.out.println(hashSet.add("m"));
		System.out.println(hashSet.add("t"));
		System.out.println(hashSet.add("i"));
		System.out.println(hashSet.add("p"));
		System.out.println(hashSet.add("q"));
		System.out.println(hashSet.add("q"));

		for (String string : hashSet) {
			System.out.println(string);
		}

	}

}
