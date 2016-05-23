import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Q21 {

	public static void main(String[] args) {

		List<String> strings = new ArrayList<String>();

		String[] stringArray = strings.toArray();

		stringArray = strings.toArray(new String[strings.size()]);

		Iterator<String> i2 = strings.iterator();

		//Collections.
	}


	private static void add(List<? extends Number> lista){
		lista.add(1);
	}

	private static void add2(List<? super Number> lista){
		lista.add(1);
	}
}
