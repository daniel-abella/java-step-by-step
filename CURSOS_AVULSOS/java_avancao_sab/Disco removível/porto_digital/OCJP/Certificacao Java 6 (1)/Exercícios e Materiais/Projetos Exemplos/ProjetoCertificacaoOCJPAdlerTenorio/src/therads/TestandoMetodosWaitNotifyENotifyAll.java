package therads;

public class TestandoMetodosWaitNotifyENotifyAll {

	public static void main(String... args) {

		Thread t = new Thread(new MyThreadInterface());
		t.start();

		/**
		 * wait()- Coloca a thread em espera at� que algu�m notifique essa
		 * therad atrav�s do notify() ou notityAll() -Tira o look do objeto,
		 * LAN�A InterruptedException e requequer que o objeto o qual chame o
		 * wait() esteja bloqueado(synchronized(t)), pois se isso nao acontecer
		 * � lan�ado uma IllegalMonitorStateException em tempo de execu��o MESMO
		 * QUE O M�TODO QUE CHAMOU O Wait() esteja com synchronized, nesse caso
		 * o m�todo main-
		 */

		synchronized (t) {
			try {
				t.wait();
				// t.wait(1000); Sobrecarga v�lida
				// t.wait(2000, 1); Sobrecarga v�lida
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			t.notify(); // N�o h� sobrecarga v�lida
			t.notifyAll(); // N�o h� sobrecarga v�lida
		}

		t.notify(); // Lan�a uma exce��o em tempo de execu��o em tempo de
		// execu��o (IllegalMonitorStateException) poiso m�todo est� fora dee
		// um CONTEXTO SINCRONIZADO.
		
		t.notifyAll(); 	// Lan�a uma exce��o em tempo de execu��o em tempo de
		// execu��o (IllegalMonitorStateException) poiso m�todo est� fora dee
		// um CONTEXTO SINCRONIZADO.

		/**
		 * notify() - � usado para notificar "uma �nica thread" de toda as
		 * thraeds que est�o no pool de espera (por conta do wait()). Do mesmo
		 * jeito que o wait e o notifyAll ele lan�a uma exce��o em tempo de
		 * execu��o (IllegalMonitorStateException) se o m�todo estiver fora de
		 * um CONTEXTO SINCRONIZADO.
		 */

		/**
		 * notifyAll() - Igual ao notify() s� que o mesmo notifica todas as
		 * thrads do pool de espera.
		 */

	}
}
