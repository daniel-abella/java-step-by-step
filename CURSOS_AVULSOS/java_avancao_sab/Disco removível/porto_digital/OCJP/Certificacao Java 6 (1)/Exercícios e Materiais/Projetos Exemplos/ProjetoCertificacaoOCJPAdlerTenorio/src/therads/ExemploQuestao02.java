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
		t.start(); // Ok, irá executar o método run() da interface.
		
		
		ExemploQuestao02 myThread = new ExemploQuestao02(r); // Não compila pois a classe não possui um construtor que receba um Runnable
		myThread.start(); 
		
	}
}
