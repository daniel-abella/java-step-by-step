
public class Duvida<E extends Comparable<E>> {

	<E> E min = null;
	<E> E max = null;

	public <E> void fazer(E e){

	}

	public void fazer2(E e){

	}

	public static void main(String[] args) {

		Duvida<String> duvida = new Duvida<String>();

		//duvida.fazer
		//duvida.fazer2("a");
	}
}
