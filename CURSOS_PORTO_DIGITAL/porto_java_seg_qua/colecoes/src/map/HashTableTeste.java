package map;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Hashtable<String, Object> hashtable = new Hashtable<String, Object>();

		hashtable.put("a","a");
		hashtable.put("m","m");
		hashtable.put("t","t");
		hashtable.put("i","i");
		hashtable.put("p","p");
		hashtable.put("q","q");
		hashtable.put("q","789");
		//hashtable.put("q",null);
		hashtable.put(null,"3333333");

		System.out.println(hashtable.get(null));

		Set<String> chaves = hashtable.keySet();
		Collection<Object> valores = hashtable.values();

		Set<Entry<String, Object>> chavesValores
		= hashtable.entrySet();

		for (Entry<String, Object> entry : chavesValores) {
			System.out.println(entry.getKey() +" - "+entry.getValue());
		}
	}
}
