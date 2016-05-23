import java.util.Comparator;


public class MainTestesAleatorios implements Comparable{

	public static void main(String[] args) {

		// Lanca exception
		// String csv = "Sue,5,true,3";
		// Scanner scanner = new Scanner(csv);
		// scanner.useDelimiter(",");
		//
		// System.out.println(scanner.nextInt());

		// StackOverFlow
		// new MainTestesAleatorios().counter(1);

		// System.out.println("restore " +4 + 5 + 3);

		// Fazer
		// Console c = System.console();
		//
		// NumberFormat nf = NumberFormat.getInstance();
		// nf.setMaximumFractionDigits(4);
		// nf.setMinimumFractionDigits(2);
		// String a = nf.format(3.1415926);
		// String b = nf.format(2);
		//
		// System.out.println(a);
		// System.out.println(b);
		
		Object o = new Object();
		MainTestesAleatorios m = new MainTestesAleatorios();
		
		if (o instanceof Comparable) {
			System.out.println("Object implementa Comparable");
		}
		
		if (m instanceof Comparable) {
			System.out.println("MainTestesAleatorios implementa Comparable");
		}
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
