package set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//imprimeLetras();

		TreeSet<Pessoa> treeSet =
				new TreeSet<Pessoa>(new Comparator<Pessoa>(){

					@Override
					public int compare(Pessoa p1, Pessoa p2) {
						// TODO Auto-generated method stub
						return p1.compareTo(p2) * -1;
					}
				});

		System.out.println(treeSet.add(new Pessoa("a")));
		System.out.println(treeSet.add(new Pessoa("m")));
		System.out.println(treeSet.add(new Pessoa("t")));
		System.out.println(treeSet.add(new Pessoa("i")));
		System.out.println(treeSet.add(new Pessoa("p")));
		System.out.println(treeSet.add(new Pessoa("q")));
		System.out.println(treeSet.add(new Pessoa("q")));

		for (Pessoa pessoa : treeSet) {
			System.out.println(pessoa.getNome());
		}


	}

	private static void imprimeLetras() {
		TreeSet<String> treeSet = new TreeSet<String>();

		System.out.println(treeSet.add("a"));
		System.out.println(treeSet.add("m"));
		System.out.println(treeSet.add("t"));
		System.out.println(treeSet.add("i"));
		System.out.println(treeSet.add("p"));
		System.out.println(treeSet.add("q"));
		System.out.println(treeSet.add("q"));

		for (String string : treeSet) {
			System.out.println(string);
		}
	}

}
