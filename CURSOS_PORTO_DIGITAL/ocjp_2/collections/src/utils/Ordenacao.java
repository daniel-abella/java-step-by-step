package utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ordenacao {

	public static void main(String[] args) {

		List<String> numeros =
			Arrays.asList("1","3","2","5","4","7","6","8");

//		Collections.sort(numeros, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//
//				return o2.compareTo(o1);
//			}
//		});

		Comparator<String> comparator = Collections.reverseOrder();
		Collections.sort(numeros, comparator);

		for (String string : numeros) {
			System.out.println(string);
		}
	}
}
