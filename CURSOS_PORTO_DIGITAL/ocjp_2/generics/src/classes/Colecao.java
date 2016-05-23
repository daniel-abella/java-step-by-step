package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Colecao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> nomes = new ArrayList<String>();
		nomes.add("miguel");
		nomes.add("angelo");

		Collections.sort(nomes, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});

		ComparatorString cString = new ComparatorString<Long, String>() {

			@Override
			public void comparar(Long arg1, String arg2) {
				// TODO Auto-generated method stub

			}


		};


	}

}
