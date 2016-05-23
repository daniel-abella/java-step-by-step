package list;

import java.util.LinkedList;

public class LinkedListTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LinkedList<String> linkedList = new LinkedList<String>();

		linkedList.add("a");
		linkedList.add("m");
		linkedList.add("t");
		linkedList.add("i");
		linkedList.add("p");
		linkedList.add("q");

		linkedList.addFirst("1");
		linkedList.addLast("2");

		for (int i = 0; i < linkedList.size(); i++) {
			String string = linkedList.get(i);
			System.out.println(string);
		}

	}

}
