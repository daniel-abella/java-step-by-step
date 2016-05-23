import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


public class ExtendsSuper {

	public static void main(String[] args) {

		List<Long> listaInts = new ArrayList<Long>();

		somaExtends(listaInts);

		List<Object> litasDatas = new ArrayList<Object>();

		somaSuper(litasDatas);

	}


	public static void somaExtends(List<? extends Number> valor){

		valor.add(1);

	}

	public static void somaSuper(List<? super Date> valor){

		valor.add(new java.sql.Date(1L));


}
