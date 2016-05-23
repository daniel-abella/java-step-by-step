package boxing.sobrecarga;

public class Sobrecarga {

	public static void main(String[] args) {

		imprimeAlgo(1);
		imprimeAlgo(new Integer(1));
		imprimeAlgo(2);
		//imprimeAlgo(new Integer(1), new Integer(2));
	}

	public static void imprimeAlgo(int i){
		System.out.println("Sobrecarga.imprimeAlgo(int i)");
	}

	public static void imprimeAlgo(Integer i){
		System.out.println("Sobrecarga.imprimeAlgo(Integer i)");
	}

	public static void imprimeAlgo(int... i){
		System.out.println("Sobrecarga.imprimeAlgo(int... i)");
	}

	public static void imprimeAlgo(Integer... i){
		System.out.println("Sobrecarga.imprimeAlgo(Integer... i)");
	}
}
