package anonimo.interfaces;

import java.util.Comparator;

public class Externa {

	public void fazAlgo(){

		RetornaDadosJSON retornaDadosJSON = new RetornaDadosJSON() {

			@Override
			public String converterParaJSON() {

				return "{nome: eu}";
			}
		};

		Comparator<String> comparator = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}
}
