package collections.colecoeshashs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

import collections.Pessoa;

public class ExemplosHashMapEHashtable {

	public static void main(String[] args) {

		
		 /** Início exempplo 01 .*/
		 Pessoa pedro = new Pessoa("Pedro", 2);
		 Pessoa ana = new Pessoa("Ana", 99);
		
		 HashMap<Integer, Pessoa> mapa = new HashMap<Integer, Pessoa>();
		
		 mapa.put(pedro.getCpf(), pedro);
		 mapa.put(null, new Pessoa("kkkkkk", 199)); 
		 mapa.put(null, new Pessoa("Bia", 4)); // Só permite a inclusão de UMA única chave nula, nesse caso ele incluiu a pessoa kkkkk e depois, removeu e incluiu Bia. 
		 mapa.put(3, null); 	// Permite a inclusão de vários valores nulos
		 mapa.put(4, null); 	// Permite a inclusão de vários valores nulos
		 mapa.put(5, null); 	// Permite a inclusão de vários valores nulos
		 
		 mapa.put(1, new Pessoa("dddddddd", 777)); // Não se pode adicionar chaves iguais no mapa, ele vai adicionar a primeira e se houver outra igual ele "substituir", ou seja, ele vai remover a primeira e adicionar a segunda.
		 mapa.put(1, new Pessoa("aaaaaaaa", 456));
		 mapa.put(1, new Pessoa("bbbbbbbb", 888));
		 mapa.put(1, new Pessoa("cccccccc", 999));

		 System.out.println("O mapa contém: " + mapa.size());
		 System.out.println("####################");
		 for (Entry<Integer, Pessoa> pessoa : mapa.entrySet()) {
			 System.out.println(pessoa.getValue());
		 }
		 /** Fim exempplo 01.*/
		
		 /** Início exempplo 02 .*/
//		 Hashtable<Integer, Pessoa> mapaNotNull = new Hashtable<Integer,Pessoa>();
//		 mapaNotNull.put(null, ana); // NullPointerException em tempo de execução, ao contrário do HashMap, o Hashtable não aceita chaves ou valores nulos.
//		
//		 for (Entry<Integer, Pessoa> pessoa : mapaNotNull.entrySet()) {
//		 System.out.println(pessoa.getValue());
//		 }
		 /** Fim exempplo 02 .*/
		 
		 
		 /** Início exempplo 01 .*/
		 Map<Chave, String> map = new HashMap<Chave, String>();
			
		 Chave c1 = new Chave("Igual");
		 Chave c2 = new Chave("Igual");
		 Chave c3 = new Chave("Diferente");
		
		 map.put(c1, "Ana");
		 map.put(c2, "Pedro");
		 map.put(c3, "ZZ");
		 System.out.println(map.size());
		

	}
}

class Chave {

	private String descricao;

	Chave(String d) {
		this.descricao = d;
	}

	@Override
	public boolean equals(Object obj) {
		return ((Chave) obj).descricao == this.descricao;
	}

	@Override
	public int hashCode() {
		return 9;
	}
}
