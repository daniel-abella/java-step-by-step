public class Q24 {
	public <T extends Comparable> T findLarger(T x, T y) {
		if (x.compareTo(y) > 0) {
			return x;
		} else {
			return y;
		}
	}

	public static void main(String[] args) {
		Q24 t = new Q24();

		Long numeroL = t.findLarger(1L, 2L);
		Integer numeroI = t.findLarger(1, 2);
		String numeroS = t.findLarger("1", "2");
		Number numeroN = t.findLarger(1L, 2);
		Object numeroO = t.findLarger("1", 2);

		System.out.println(numeroL);
		System.out.println(numeroI);
		System.out.println(numeroS);
	}
}
