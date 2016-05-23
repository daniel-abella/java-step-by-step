package collections.colecoeshashs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TesteHashCodeClasseString {

	private String s;

	public TesteHashCodeClasseString(String s) {
		this.s = s;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		boolean retorno = false;
//		
//		if (obj instanceof TesteHashCodeClasseString) {
//			TesteHashCodeClasseString classe = (TesteHashCodeClasseString)  obj;
//			
//			if (classe.s.equals(s)) {
//				retorno = true;
//			}
//		}
//		
//		return retorno;
//	}
//	@Override
//	public int hashCode() {
//		return 1;
//	}

	public static void main(String[] args) {
		
		HashSet<Object> hs = new HashSet<Object>();
		
		TesteHashCodeClasseString ws1 = new TesteHashCodeClasseString("aardvark");
		TesteHashCodeClasseString ws2 = new TesteHashCodeClasseString("aardvark");
		
		String s1 = new String("aardvark"); 
		String s2 = new String("aardvark"); // O equals da classe string já vem implementado, por isso o  HashSet só adiciona 1 obj String!!
		

//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
		
		
		hs.add(ws1);
		hs.add(ws2);
		hs.add(s1);
		hs.add(s2); // Como o hashCode de String já vem implementado a coleção só add 1 objeto.
		

		System.out.println("Tamanho HashSet: " + hs.size());
		
		
		System.out.println("****************************************************");

		Map<TesteHashCodeClasseString, Integer> map = new HashMap<TesteHashCodeClasseString, Integer>();
		map.put(new TesteHashCodeClasseString("B"), 1);
		map.put(new TesteHashCodeClasseString("B"), 2);
		map.put(new TesteHashCodeClasseString("B"), 3);
		
		System.out.println("Tamanho mapa: " + map.size()); // Imprime 3 pois o equals da classe não foi implementado
		System.out.println("Valores mapa" + map.values()); 
	}

}
