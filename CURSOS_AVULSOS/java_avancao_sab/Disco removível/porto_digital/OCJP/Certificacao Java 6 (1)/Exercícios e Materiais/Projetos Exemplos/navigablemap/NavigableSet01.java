package SCJP6.navigablemap;

import java.util.TreeSet;

public class NavigableSet01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		for (int a = 60; a < 100; a++)
			if (a % 2 == 0)
				ts.add(a);

		TreeSet tss = (TreeSet) ts.subSet(60, true, 70, true);
		tss.add(10000);

		System.out.println(ts);
		System.out.println(tss);
	}

}
