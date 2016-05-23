package exercicios;

import java.util.*;

public class LetterASort {
	public static void main(String[] args) {
		LinkedList<String> strings = new LinkedList<String>();
		strings.add("a");
		strings.add("b");
		strings.add("c");
		strings.add("d");

		strings.add(0, "m");

		System.out.println(strings.get(0));
	}
}