package list;

import java.util.ArrayList;

public class ArrayListTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("a");
		arrayList.add("m");
		arrayList.add("t");
		arrayList.add("i");
		arrayList.add("p");
		arrayList.add("q");

		for (int i = 0; i < arrayList.size(); i++) {
			String string = arrayList.get(i);
			System.out.println(string);
		}

	}

}
