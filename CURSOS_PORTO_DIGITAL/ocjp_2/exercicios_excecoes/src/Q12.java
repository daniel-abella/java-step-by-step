class Q12 {

	static void test() {
		try {
			String x = null;
			System.out.print(x.toString() + " ");
		} finally {
			System.out.print("finally ");
		}
	}

	public static void main(String[] args) {
		try {
			test();
		} catch (Exception ex) {
			System.out.print("exception ");
		}
	}
	/*
	 * What is the result? A. null B. finally C. null finally D. Compilation
	 * fails. E. finally exception Answer: E
	 */
}
