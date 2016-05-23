package exercicios;

import java.util.Collections;
import java.util.TreeSet;

public class Drink implements Comparable {
	public String name;

	public int compareTo(Object o) {
		return 0;
		//Drink outro = (Drink)o;
		//return name.compareTo(outro.name);
	}

	public static void main(String[] args) {
		Drink one = new Drink();
		Drink two = new Drink();
		one.name= "Coffee";
		two.name= "Tea";
		TreeSet set = new TreeSet();
		set.add(two);
		set.add(one);

		Collections.re

		for (Object object : set) {
			System.out.println(((Drink)object).name);
		}
	}
}