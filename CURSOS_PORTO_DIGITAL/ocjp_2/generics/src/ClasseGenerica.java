import java.awt.CardLayout;
import java.util.Comparator;


public class ClasseGenerica<T extends ClasseGenerica<T>>
								implements Comparator<T> {

	public T getValor(){

		return null;
	}

	public static void main(String[] args) {

		ClasseGenerica<String> cs = new ClasseGenerica<String>();
		System.out.println(cs.getValor());

		ClasseGenerica<Integer> ci = new ClasseGenerica<Integer>();
		System.out.println(ci.getValor());

		ClasseGenerica<new ClassePai<Integer>()> ci =
				new ClasseGenerica<new ClassePai<Integer>()>();
		System.out.println(ci.getValor());

	}

	@Override
	public int compare(T o1, T o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
