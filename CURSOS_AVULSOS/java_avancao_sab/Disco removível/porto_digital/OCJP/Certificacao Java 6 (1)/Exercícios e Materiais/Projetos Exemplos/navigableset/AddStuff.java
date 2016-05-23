package SCJP6.navigableset;

import java.util.*;

class AddStuff {
	public static void main(String[] args) {
		TreeSet<String> s = new TreeSet<String>();
		s.add("one");
		s.add("two");

//		SortedSet sorted = s.tailSet(s.first());
		SortedSet<String> sorted = s.tailSet(s.first());
//		SortedSet sorted = (SortedSet) s.tailSet(s.first());
//		SortedSet sorted = (SortedSet<String>) s.tailSet(s.first());

		for (String s2 : sorted)
			System.out.print(s2 + " ");
	}
}
