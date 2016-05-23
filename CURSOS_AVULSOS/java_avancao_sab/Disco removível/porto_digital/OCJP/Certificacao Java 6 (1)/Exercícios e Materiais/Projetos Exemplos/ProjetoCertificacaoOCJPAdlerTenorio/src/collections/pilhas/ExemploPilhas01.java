package collections.pilhas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

import collections.ClasseNaoComparable;

public class ExemploPilhas01 {

	public static void main(String... args) {

		PriorityQueue<String> pq = new PriorityQueue<String>(); // Lista ordena pela ordem natural dos elementos
		
		pq.add("banana");
		pq.add("pear");
		pq.add("orange");
		pq.add("apple");
		
//		System.out.println(pq);
//		System.out.println(pq.poll() + " " + pq.peek());
		
		// Explicação
		// pq.poll() - Retorna o objeto de maior "prioridade" (o primeiro após ordenação) na coleção e depois o exclui.
		// pq.peek() -Exclui objeto de maior "prioridade" (o primeiro após ordenação) na coleção.
		
		System.out.println("//////////////////////////////////////////////////////////");
		
		Comparator<Integer> comp = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				//return o1.compareTo(o2); // Menor para o maior
				return o2.compareTo(o1); // Maior para o menos
			}
		};
		
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(100, comp); 
		pq2.addAll(Arrays.asList(16,8,42,15,4,23));
		
//		System.out.println(pq2.poll());
//		System.out.println(pq2.size());
		
		System.out.println("//////////////////////////////////////////////////////////");
		
		PriorityQueue<ClasseNaoComparable> pq3 = new PriorityQueue<ClasseNaoComparable>();  //  java.lang.ClassCastException: collections.pilhas.ClasseComparacao cannot be cast to java.lang.Comparable
		pq3.add(new ClasseNaoComparable());
		pq3.add(new ClasseNaoComparable());
	}
}
