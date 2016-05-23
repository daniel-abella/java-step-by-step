package collections.interfacenavigable;

import java.util.TreeSet;

public class ExemploInterfaceNavigableSet {

	public static void main(String[] args) {

//		TreeSet<String> listaNomes = new TreeSet<String>(); // Implementa NagibableSet
//		listaNomes.add("Adler");
//		listaNomes.add("Zito");
//		listaNomes.add("Mauro");
//		listaNomes.add("Nanda");
//		listaNomes.add("Vicente");
//		listaNomes.add("Barbara");
//		
//		Set<String> subSet = listaNomes.subSet("Barbara", true ,"Nanda", true);
//		Set<String> headSet = listaNomes.headSet("Nanda"); // Por defaul � EXCLUSIVE o elemento passado como par�metro
//		Set<String> tailSet = listaNomes.tailSet("Vicente"); // Por defaul � INCLUSIVE o elemento passado como par�metro
//		
//		System.out.println("TreeSet: " + listaNomes);
//		System.out.println("SubSet: " +  subSet);
//		System.out.println("HeadSet: " + headSet);
//		System.out.println("TailSet: " + tailSet);
		
		
//		System.out.println("#######################################");
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		for (int x = 100; x <= 120; x++) {
			if (x%2 == 0) {
				set.add(x);
			}
		}
		//set.add(199);
		
		TreeSet<Integer> subSet = (TreeSet<Integer>) set.subSet(100, true, 110, true);
		//subSet.add(101);
		subSet.add(199);
		
		System.out.println(set);
		System.out.println(subSet);
		
		
		
		TreeSet<String> setStrings = new TreeSet<String>();
		setStrings.add("Adler");
		setStrings.add("Joarez");
		setStrings.add("Jos� da Silva Jos� da Silva Jos� da Silva");
		setStrings.add("Jos� Pereira Jos� Pereira");
		setStrings.add("Jos�");
		setStrings.add("Zzzzzzzz");

		// Novos m�todos de navega��o do java 6, por conta da Interface NavigableSet 
		String retorno = setStrings.floor("Jos�"); // Retorna o maior elemento neste conjunto inferior ou igual ao elemento de dado, ou nula, se n�o existe nenhum elemento tal.
		String retorno02 = setStrings.higher("Jos�"); // Retorna o menor elemento neste conjunto estritamente maior do que o determinado elemento, ou null se n�o houver nenhum elemento tal.

		System.out.println(retorno);
		System.out.println(retorno02);

		
	}
}
