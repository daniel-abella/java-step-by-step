package heranca.sobrescritasobrecarga.retornocovariante;

public class RetornoCovariante {

	public static void main(String[] args) {

		Plant p = new Flower();
		Flower f = new Flower();
		Plant p2 = new Plant();
		
		System.out.println(p.getType());
		System.out.println(f.getType());
		
		System.out.println(p2.getType());
		
		
		

	}
}
	class Plant {

		String getName() {
			return "Plant";
		}

		Plant getType() {
			return this;
		}

		@Override
		public String toString() {
			return "Classe Plant";
		}

	}

	 class Flower extends Plant {

		// Obs.: Se inserirmos os códigos independentemente NÃO dará erro de
		// compilação.
		// correta.

//		Flower getType() {
//			return this;
//		}

		 Plant getType() {
		 return this;
		 }
		//
		// Tulip getType() {
		// return new Tulip();
		// }

		@Override
		public String toString() {
			return "Classe Flower";
		}
	}

	class Tulip extends Plant {

		@Override
		public String toString() {
			return "Classe Tulip";
		}
	}
