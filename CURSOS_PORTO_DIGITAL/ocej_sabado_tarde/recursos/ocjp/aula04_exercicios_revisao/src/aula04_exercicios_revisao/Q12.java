package aula04_exercicios_revisao;

class Base {
	public static final String FOO = "foo";

	public static void main(String[] args) {
		Base b = new Base();
		Sub1 s = new Sub1();
		System.out.print(Base.FOO);
		System.out.print(Sub1.FOO);
		System.out.print(s.FOO);
		System.out.print(((Base) s).FOO);
	}
}

class Sub1 extends Base {
	public static final String FOO = "bar";
}