package SCJP6.navigablemap;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;
import java.util.concurrent.ConcurrentSkipListMap;

public class NavigableMapExample1 {
	public static void main(String args[]) {
		
		class teste {}
		NavigableMap<Integer, String> navigableMap = new ConcurrentSkipListMap<Integer, String>();
		navigableMap.put(0, "1");
		navigableMap.put(2, "2");
		navigableMap.put(4, "3");
		navigableMap.put(6, "4");
		navigableMap.put(8, "5");
		navigableMap.put(10, "6");
		navigableMap.put(12, "7");
		navigableMap.put(14, "8");
		navigableMap.put(16, "9");
		navigableMap.put(18, "10");
		navigableMap.put(20, "11");
		System.out.println(navigableMap.floorKey(20));
		List<?> l1 = new Vector<String>();
		Set<String> l2 = new LinkedHashSet<String>();
		Map<? extends Number,? extends Number> m1 = new Hashtable<Integer,Float>();
		System.out.println(navigableMap.higherEntry(2));
		System.out.println(navigableMap.higherEntry(2));
		NavigableMap<Integer, String> nm2 = new TreeMap<Integer, String>();
		NavigableMap<Integer, String> nm3 = new TreeMap<Integer, String>();
		NavigableMap<Integer, String> nm4 = new TreeMap<Integer, String>();
		NavigableMap<Integer, String> nm5 = new TreeMap<Integer, String>();
		NavigableMap<Integer, String> nm6 = new TreeMap<Integer, String>();
		NavigableMap<Integer, String> nm7 = new TreeMap<Integer, String>();
		NavigableMap<Integer, String> nm8 = new TreeMap<Integer, String>();
		NavigableMap<Integer, String> nm9 = new TreeMap<Integer, String>();
		NavigableMap<Integer, String> nm10 = new TreeMap<Integer, String>();
		
		nm2 = navigableMap.descendingMap();
		System.out.println(navigableMap);
		System.out.println(nm2);
		nm3 = navigableMap.subMap(10, true, 14, true);
		nm3.put(11, "aa");
		System.out.println(nm3);
		System.out.println(nm2);
		System.out.println(navigableMap);
		System.out.println("--");
		Set<Map.Entry<Integer,String>> ss = navigableMap.entrySet();
		System.out.println(ss);
		for(Iterator<Map.Entry<Integer,String>> t =ss.iterator() ; t.hasNext();  ){
			Map.Entry<Integer,String> x = t.next();
			System.out.println("x"+x.getKey());
			System.out.println("z"+x.getValue());			
		}
	}
}
