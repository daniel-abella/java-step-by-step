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
//		Set<String> headSet = listaNomes.headSet("Nanda"); // Por defaul é EXCLUSIVE o elemento passado como parâmetro
//		Set<String> tailSet = listaNomes.tailSet("Vicente"); // Por defaul é INCLUSIVE o elemento passado como parâmetro
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
		setStrings.add("José da Silva José da Silva José da Silva");
		setStrings.add("José Pereira José Pereira");
		setStrings.add("José");
		setStrings.add("Zzzzzzzz");

		// Novos métodos de navegação do java 6, por conta da Interface NavigableSet 
		String retorno = setStrings.floor("José"); // Retorna o maior elemento neste conjunto inferior ou igual ao elemento de dado, ou nula, se não existe nenhum elemento tal.
		String retorno02 = setStrings.higher("José"); // Retorna o menor elemento neste conjunto estritamente maior do que o determinado elemento, ou null se não houver nenhum elemento tal.

		System.out.println(retorno);
		System.out.println(retorno02);

		
	}
}
