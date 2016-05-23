package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		HashMap<String, Object> hashMap = new HashMap<String, Object>();

		hashMap.put("a","a");
		hashMap.put("m","m");
		hashMap.put("t","t");
		hashMap.put("i","i");
		hashMap.put("p","p");
		hashMap.put("q","q");
		hashMap.put("q","789");
		hashMap.put("q",null);
		hashMap.put(null,"3333333");
		hashMap.put(null,"4444444");

		System.out.println("*******************");
		System.out.println(hashMap.get(null));
		System.out.println("*******************");
		//CHAVES
		Set<String> chaves = hashMap.keySet();

		for (String chave : chaves) {
			System.out.println(chave+" - "+hashMap.get(chave));
		}

		System.out.println("\n\n\n\n");
		//VALORES
		Collection<Object> valores = hashMap.values();

		for (Object object : valores) {
			System.out.println(object);
		}
		System.out.println("\n\n\n\n");

		//CHAVE E VALOR
		Set<Entry<String, Object>> chavesValores
		= hashMap.entrySet();

		for (Entry<String, Object> entry : chavesValores) {
			System.out.println(entry.getKey() +
					" - "+entry.getValue());
		}

		System.out.println("\n\n\n\n");
		//TO STRING
		System.out.println(hashMap);
	}

}
