package therads;

public class ExemploQuestao {

	public static void main(String[] args) {
		
		testeWait(); // Ao executar o m�todo � lan�ado uma  java.lang.IllegalMonitorStateException pois o objeto que est� chamando o wait n�o est� BLOQUEADO, ou seja, synchronized (obj);
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
