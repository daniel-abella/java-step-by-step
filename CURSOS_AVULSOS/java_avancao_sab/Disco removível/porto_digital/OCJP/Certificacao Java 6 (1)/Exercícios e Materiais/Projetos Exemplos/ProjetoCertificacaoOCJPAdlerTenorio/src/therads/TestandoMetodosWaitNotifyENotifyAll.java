package therads;

public class TestandoMetodosWaitNotifyENotifyAll {

	public static void main(String... args) {

		Thread t = new Thread(new MyThreadInterface());
		t.start();

		/**
		 * wait()- Coloca a thread em espera até que alguém notifique essa
		 * therad através do notify() ou notityAll() -Tira o look do objeto,
		 * LANÇA InterruptedException e requequer que o objeto o qual chame o
		 * wait() esteja bloqueado(synchronized(t)), pois se isso nao acontecer
		 * é lançado uma IllegalMonitorStateException em tempo de execução MESMO
		 * QUE O MÉTODO QUE CHAMOU O Wait() esteja com synchronized, nesse caso
		 * o método main-
		 */

		synchronized (t) {
			try {
				t.wait();
				// t.wait(1000); Sobrecarga válida
				// t.wait(2000, 1); Sobrecarga válida
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			t.notify(); // Não há sobrecarga válida
			t.notifyAll(); // Não há sobrecarga válida
		}

		t.notify(); // Lança uma exceção em tempo de execução em tempo de
		// execução (IllegalMonitorStateException) poiso método está fora dee
		// um CONTEXTO SINCRONIZADO.
		
		t.notifyAll(); 	// Lança uma exceção em tempo de execução em tempo de
		// execução (IllegalMonitorStateException) poiso método está fora dee
		// um CONTEXTO SINCRONIZADO.

		/**
		 * notify() - É usado para notificar "uma única thread" de toda as
		 * thraeds que estão no pool de espera (por conta do wait()). Do mesmo
		 * jeito que o wait e o notifyAll ele lança uma exceção em tempo de
		 * execução (IllegalMonitorStateException) se o método estiver fora de
		 * um CONTEXTO SINCRONIZADO.
		 */

		/**
		 * notifyAll() - Igual ao notify() só que o mesmo notifica todas as
		 * thrads do pool de espera.
		 */

	}
}
