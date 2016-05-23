package SCJP6.navigableset;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample1 {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
//		list.add(1);
//		list.add(3);
//		list.add(4);
//		list.add(7);
//		list.add(8);
//		list.add(10);
		list.add(0);
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(10);
		list.add(12);
		list.add(14);
		list.add(16);
		list.add(18);
		list.add(20);
		// 1
		// 3
		// 4
		// 7
		// 8
		// 10
		switch (new Integer(10)) {
		case 10:
			
			break;

		default:
			break;
		}

		NavigableSet<Integer> ns = new TreeSet<Integer>(list);
		System.out.println(ns.lower(1));
		System.out.println(ns.floor(1));
		System.out.println(ns.ceiling(10));
		System.out.println(ns.higher(10));
		System.out.println(ns.higher(7));

		System.out.println("Natural Order - ASCENDING");
		Iterator<Integer> t = ns.iterator();
		while (t.hasNext()) {
			System.out.println(t.next());
		}
		System.out.println("Natural Order - DESCENDING");
		Iterator<Integer> t2 = ns.descendingIterator();
		while (t2.hasNext()) {
			System.out.println(t2.next());
		}

		NavigableSet<Integer> ns2 = ns.descendingSet();

		System.out.println("Reverse Order - ASCENDING");
		Iterator<Integer> t3 = ns2.iterator();
		while (t3.hasNext()) {
			System.out.println(t3.next());
		}
		System.out.println("Reverse Order - DESCENDING");
		Iterator<Integer> t4 = ns2.descendingIterator();
		while (t4.hasNext()) {
			System.out.println(t4.next());
		}

		/*
		 * while(!ns.isEmpty()){ System.out.println(ns.pollFirst()); }
		 * System.out.println(ns.pollFirst());
		 */
	/*	while (!ns.isEmpty()) {
			System.out.println(ns.pollLast());
		}
		System.out.println(ns.pollFirst());*/
		
		NavigableSet<Integer> ns3 = ns.subSet(10, false, 20, false);
		System.out.println(ns3);
		Collection c;
		Collections d;
		
		NavigableSet<Integer> ns4 = ns2.subSet(20, false, 10, true);
		System.out.println(ns4);		
TreeSet t;

		System.out.println(ns4);
		System.out.println(ns2);		
		System.out.println(ns4.pollFirst());
		System.out.println(ns4);
		System.out.println(ns2);
		
		
		NavigableSet<Integer> ns5 = ns.headSet(10, true);
		System.out.println(ns5);
		
		NavigableSet<Integer> ns6 = ns.tailSet(10, true);
		System.out.println(ns6);	

	}
}
