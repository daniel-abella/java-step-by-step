package heranca.interfaces2;

public class TesteDeclare implements IDeclareStuff{

	public static void main(String[] args) {
		int x = 5;
		new TesteDeclare().doStuff(++x);
	}

	@Override
	public void doStuff(int s) {
		s += EASY + ++s;
		System.out.println("s " + s);
	}
}
