package heranca.construtores;

public class ExemploContrutor01 {

	public class Person {
		String name = "No name";

		public Person(String nm) {
			name = nm;
		}
		
	}

	public class Employee extends Person {
		
		String empID = "0000";

		public Employee(String id) { // Não compila pois a classe pai tem um construtor com argumentos
			empID = id;
		}
	}
}
