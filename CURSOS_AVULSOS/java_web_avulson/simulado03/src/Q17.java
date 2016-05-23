class B implements A1 {
	public void x() {
	}

	public void y() {
	}
}

class C extends B {
	public void x() {
	}
}

class T {
	public static void main(String[] args) {
		java.util.List<C> list = new java.util.ArrayList<C>();
		list.add(new B());
		list.add(new C());
		for (A1 a : list) {
			a.x();
			a.y();
		}
	}
}
