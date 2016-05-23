package therads;

public class ExemploQuestao {

	public static void main(String[] args) {
		
		testeWait(); // Ao executar o método é lançado uma  java.lang.IllegalMonitorStateException pois o objeto que está chamando o wait não está BLOQUEADO, ou seja, synchronized (obj);
	}
	
	static void  testeWait() {

		Object obj = new Object();
		
		synchronized (Thread.currentThread()) {
			
			try {
				obj.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			obj.notify();
			
		}
	}
}
