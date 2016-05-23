package queue;

import java.util.PriorityQueue;

import set.Pessoa;

public class QueueTeste {

	public static void main(String[] args) {

		PriorityQueue<Pessoa> fila =
				new PriorityQueue<Pessoa>();

		fila.add(new Pessoa("a"));
		fila.add(new Pessoa("m"));
		fila.add(new Pessoa("t"));
		fila.add(new Pessoa("i"));
		fila.add(new Pessoa("p"));
		fila.add(new Pessoa("q"));
		fila.add(new Pessoa("q"));

	}

}
