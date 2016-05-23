package therads;

public class TestandoMetodosSleepJoinYield {

	public static void main(String... args) {

		MyThreadInterface m = new MyThreadInterface();
		MyThread t = new MyThread(); // TODO IMPOTANTE Executa o run de MyThread, lembrando
		// que eu só posso passar "m" como parâmetro para MyThread pq eu criei
		// um construtor para isso

		Thread t2 = new Thread(m); // Executa o run de MyThreadInterface

		t.start();
		t2.start();
		// t.start(); // Se startarmos a Thread 2x acontoecerá uma exceção em
		// tempo de execução java.lang.IllegalThreadStateException mas as outras
		// Threas não são afetadas

		/**
		 * Método sleep(100) - -Estático, LANÇA InterruptedException, mantém o
		 * look e não garante o tempo de "dormencia.
		 */
		// try {
		// Thread.sleep(1000); // Atrasa a thread atual, no caso a main
		// Thread.sleep(1000, 1);// Sobrecarga
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }

		/**
		 * Método Join(): -De instancia, LANÇA InterruptedException e mantém o
		 * look, faz com que a Thread atual  (no caso a main) ESPERE a execução da
		 * thread que deu o joing para só depois a mesma continuar
		 */
		 try {
		 t.join();
		 t.join(1000); //Sobrecarga
		 t.join(1000, 2);// Sobrecarga
		 } catch (InterruptedException e) {
		 e.printStackTrace();
		 }

		/**
		 * Método yield() - -Estático e mantém o look: Coloca a thread atual
		 * para o estado de "executável" e influencia o scheldler a colocar uma
		 * thread qualquer DE MESMA PRIORIDADE pra executar, mas n há garantias
		 * que isso será feito :P
		 */
		//Thread.yield();
	}
}
