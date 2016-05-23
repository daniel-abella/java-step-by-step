package therads;

public class ExemploQuestao02 extends Thread{
	

	@Override
	public void run() {
		System.out.println("Classe Extends Thread");
	}


	public static void main(String[] args) {

		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("Interface");
			}
		};
		
		Thread t = new Thread(r);
		t.start(); // Ok, ir� executar o m�todo run() da interface.
		
		
		ExemploQuestao02 myThread = new ExemploQuestao02(r); // N�o compila pois a classe n�o possui um construtor que receba um Runnable
		myThread.start(); 
		
	}
}
