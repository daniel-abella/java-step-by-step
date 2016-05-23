package heranca.sobrescritasobrecarga;

public class HerancaNullPointer {
	
	
	public static void main(String[] args) {
		HerancaNullPointer classeA = new HerancaNullPointer();
		classeA.metodoA();
		
	}
	
	public void metodoA() {
		ClasseB classeB = new ClasseB();
		classeB.getValue();
	}

	public class ClasseB {
		
		private ClasseC classeC;
		
		String	getValue() { 
			return classeC.getValue();
		}
	}
	
	
	public class ClasseC {
		
		String	getValue() {
			String valor = "valor";
			return valor;
		}
	}
}

