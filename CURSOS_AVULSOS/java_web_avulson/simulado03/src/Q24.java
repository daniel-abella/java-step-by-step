class Test2 {
	public <T extends Number> T findLarger(T x, D y) {
		if (x.compareTo(y) > 0) {
			return x;
		} else {
			return y;
		}
	}

	public static void main(String[] args) {
		Test2 t = new Test2();

		/*A.*/ Object x = t.findLarger(123, "456");
		/*B.*/ int x1 = t.findLarger(123, new Double(456));
		/*C.*/ int x2 = t.findLarger(123, new Integer(456));
		/*D.*/ int x3 =
				(int) t.findLarger(new Double(123), new Double(456));
	}
}
