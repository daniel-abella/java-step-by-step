package loops.exemploforech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploForech {

	public static void main(String[] args) {
		
		List lista = new ArrayList();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		
		for (Object object : reverseI(lista)) { // O foreach não aceita Iterator
			System.out.println(object  +", ");
		}
		
	}
	
	public static Iterator reverseI(List list) {
		Collections.reverse(list);
		return list.iterator();	
	}

}
