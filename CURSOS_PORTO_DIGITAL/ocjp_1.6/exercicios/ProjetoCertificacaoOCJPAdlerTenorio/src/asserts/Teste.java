package asserts;

public class Teste {

	public static void main(String[] args) {

        Teste.testeAsset(-1);
        
        
     boolean assert = true; // N�o compila pois assert � uma palavra reservada
   	 if(assert) {
   		 System.out.println("assert is true");
   	 }
	}

	private static void testeAsset(int x) {
		assert (x < 0) : x + " � Negativo";
		if (x >= 0) {
			System.out.println("Numero maior");
		}
	}
}
