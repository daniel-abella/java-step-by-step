package collections.pilhas;

import java.util.PriorityQueue;
import java.util.Queue;

public class ExemploPilhas02 {

	public static void main(String[] args) {

		Queue<String> pq = new PriorityQueue<String>();

		pq.offer("Z");
		pq.offer("A");
		pq.offer("E");
		pq.offer("B");
		pq.offer("C");
		pq.offer("D");

		for (String string : pq) {
			System.out.println(string);
		}

		System.out.println(pq.peek()); // Recupera o primeiro elemento da pilha
		pq.poll(); // Remove o primeiro elemento da pilha
		System.out.println(pq.peek());

		System.out.println(pq.size());
	}

}
