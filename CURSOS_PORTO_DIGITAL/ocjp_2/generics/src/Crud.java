import java.util.ArrayList;


public class Crud {

	public static void main(String[] args) {

		ExtendsSuper.somaExtends(new ArrayList<Integer>());
		ExtendsSuper.somaExtends(new ArrayList<Long>());
		ExtendsSuper.somaExtends(new ArrayList<Short>());

		ExtendsSuper.somaSuper(new ArrayList<java.util.Date>());
		ExtendsSuper.somaSuper(new ArrayList<Object>());
	}
}
