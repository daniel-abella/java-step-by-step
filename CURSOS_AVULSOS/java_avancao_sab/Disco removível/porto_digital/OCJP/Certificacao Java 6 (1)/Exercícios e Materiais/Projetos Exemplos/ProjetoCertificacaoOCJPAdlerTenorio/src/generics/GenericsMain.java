package generics;

import java.util.List;

public class GenericsMain<T> {


	public static void main(String... args) {

		// N�o d� erro de compila��o
//		List<Integer> listaNumeros = new ArrayList();
//		listaNumeros.add(new Integer(4));
//
//		System.out.println(listaNumeros);

		// � permitido fazer isso em Arrays, j� em collecitons N�O !!
		//Parent[] family = new Child[3];
		
		//List<Parent> familia = new ArrayList<Child>(); // Erro de compila��o
		
		GenericsMain g = new GenericsMain();
		g.teste("Aaa");

	}
	
	public <T> void teste(T t) {
			System.out.println(t);
	}
	

	private class Parent {
		
		public  void fazer(List<? extends Number> lista) {
			
		}

	}

	private class Child extends Parent {

	}
}
