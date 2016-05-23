public class Toast extends Boast {
	Integer eye = 1;

	public static void main(String... args) {
		Toast eye = new Toast();
		new Devil(eye).honey(eye);
		new Boast(eye).honey(eye);
		new Toast().honey(eye);
	}

	public void honey(Toast eye) {
		eye.eye = new Integer(-2);
	}

}

class Boast extends Devil {
	public Boast() {
		System.out.print("boast ");
	}

	public Boast(Toast eye) {
		eye.eye = new Integer(5);
	}

	public void honey(Toast eye) {
		eye.eye = new Integer(2);
	}
}

class Devil {
	public Devil() {
		System.out.print("devil ");
	}

	public Devil(Toast eye) {
		eye.eye = new Integer(1);
	}

	public void honey(Toast eye) {
		eye.eye = new Integer(9);
	}
}
