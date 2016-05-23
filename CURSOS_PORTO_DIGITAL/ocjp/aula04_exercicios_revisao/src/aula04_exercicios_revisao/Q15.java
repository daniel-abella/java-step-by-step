package aula04_exercicios_revisao;

class Wow {
	public static void go(short n) {
		System.out.println("short");
	}

	public static void go(Short n) {
		System.out.println("SHORT");
	}

	public static void go(Long n) {
		System.out.println(" LONG");
	}

	public static void main(String[] args) {
		Short y = 6;
		int z = 7;
		go(y);
		go(z);
	}
}
