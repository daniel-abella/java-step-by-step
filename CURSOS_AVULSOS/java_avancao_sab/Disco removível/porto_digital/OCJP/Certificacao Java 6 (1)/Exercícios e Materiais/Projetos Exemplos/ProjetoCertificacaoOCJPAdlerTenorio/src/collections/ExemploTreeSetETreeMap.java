package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExemploTreeSetETreeMap {

	enum Example {
		ONE, TWO, THREE, TZ
	}

	// // Questão 4 Capítulo 7 Livro SCJP

	public static void main(String... a) {

		/** Início exemplo 01 . */
		// A classe que for inserida COMO CHAVE de em TreeSet ou TreeMap tem que implementar Compareble
		// ou Comparator pois se não da erro de execução ao tentar inseir no
		// TreeSet: java.lang.ClassCastException: collections.Dog cannot be cast
		// to java.lang.Comparable

		// TreeSet<Dog> treeSetDogs = new TreeSet<Dog>();
		// TreeSet<Integer> treeSetInteger = new TreeSet<Integer>();
		//
		// treeSetDogs.add(new Dog(1));
		// treeSetDogs.add(new Dog(2));
		// treeSetDogs.add(new Dog(1));
		//
		// treeSetInteger.add(1);
		// treeSetInteger.add(2);
		// treeSetInteger.add(1);
		//
		// System.out.println(treeSetDogs.size() + " " + treeSetInteger.size());
		/** Fim exempplo 01 . */

		/** Início exemplo 02 . */
		// Dog tem que implementar Comparable para ser inserido COMO CHAVE dentro de um
		// TreeSet ou TreeMap
		
//		 TreeMap<Dog, String> map = new TreeMap<Dog, String>();
//		 map.put(new Dog(1), "Dog 01");
//		 map.put(new Dog(2), "Dog 02");
//		 map.put(new Dog(3), "Dog 03");
		 
		 TreeMap<String, Dog> map02 = new TreeMap<String, Dog>();
		 map02.put("Dog 01",new Dog(1)); // Quem tem que implementar Comparable ou Comparator é só a chave, com isso ao executar esse código não da ClassCastException em tempo de execução.
		 map02.put("Dog 02",new Dog(2));
		 map02.put("Dog 03",new Dog(3));
		 
		 System.out.println(map02);

		/** Fim exemplo 02. */

		////////////////////////////////////////////////////////////////////////////////////////////////////////

		/** Início exemplo 03 . */
//		String[] arrayStrings = { "zzz", "ffff", "aaaa", "eee" };
//		Arrays.sort(arrayStrings, new Ordenacao());
//
//		for (String string : arrayStrings) {
//			System.out.print(string + " ");
//		}

		// System.out.println(Arrays.binarySearch(arrayStrings, "pen"));

		/** Início exemplo 04 . */
//		Collection coll = new ArrayList();
//		coll.add(Example.THREE);
//		coll.add(Example.THREE);
//		coll.add(Example.TZ);
//		coll.add(Example.TWO);
//		coll.add(Example.TWO);
//		coll.add(Example.ONE);
//
//		HashSet hashSet = new HashSet(coll);
//		TreeSet treeSet = new TreeSet(coll);
//
//		// HashSet
//		System.out.println("hashSet quant: " + hashSet.size());
//		System.out.println("hashSet quant: " + hashSet); // O hashset não garante a ordem de inserção e nem ordena
//	
//		// TreeSet
//		System.out.println("treeSet quant: " + treeSet.size());
//		System.out.println("treeSet ordenado: " + treeSet);
		
		/** Fim exemplo 04 . */
	}
}

class Ordenacao implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2); // CUIDADO NA PROVA PRA ELE NÃO INVERTER !!
									// o2.compareTo(o1);
	}

}

class Dog {

	Integer numero;

	Dog(Integer numero) {
		this.numero = numero;
	}
}
