/*
 * RESPOSTA
 * B
 *
 * A.
Is an Car
Is an Car
Is an Car

B.
Is an Car
Is a Ferrari
Is an Car

C.
Is an Car
Is a Ferrari
Is a Ferrari

D.   Compilation fails.

E.   An exception is thrown at runtime.
 *
 */
class Car {}

class Ferrari extends Car {}

class Test {

	public void doStuff(Car a) {
		System.out.println("Is an Car");
	}

	public void doStuff(Ferrari a) {
		System.out.println("Is a Ferrari");
	}

	public static void main(String[] args) {
		Test test = new Test();
		Car c = new Car();
		Ferrari f = new Ferrari();
		test.doStuff(c);
		test.doStuff(f);
		Car c2 = new Ferrari();
		test.doStuff(c2);
	}
}