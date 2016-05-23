package heranca.sobrescritasobrecarga.classesabstratas;

public class TestesInterfaceComClasseAbstrata {

	interface Data {
		public void load();
	}

	abstract class Info {
		public abstract void load();
	}

	public class Employee extends Info implements Data {

		@Override
		public void load() {
		}
	}
}