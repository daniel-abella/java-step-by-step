package therads;

public class TestandoMetodosSleepJoinYield {

	public static void main(String... args) {

		MyThreadInterface m = new MyThreadInterface();
		MyThread t = new MyThread(); // TODO IMPOTANTE Executa o run de MyThread, lembrando
		// que eu s� posso passar "m" como par�metro para MyThread pq eu criei
		// um construtor para isso

		Thread t2 = new Thread(m); // Executa o run de MyThreadInterface

		t.start();
		t2.start();
		// t.start(); // Se startarmos a Thread 2x acontoecer� uma exce��o em
		// tempo de execu��o java.lang.IllegalThreadStateException mas as outras
		// Threas n�o s�o afetadas

		/**
		 * M�todo sleep(100) - -Est�tico, LAN�A InterruptedException, mant�m o
		 * look e n�o garante o tempo de "dormencia.
		 */
		// try {
		// Thread.sleep(1000); // Atrasa a thread atual, no caso a main
		// Thread.sleep(1000, 1);// Sobrecarga
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }

		/**
		 * M�todo Join(): -De instancia, LAN�A InterruptedException e mant�m o
		 * look, faz com que a Thread atual  (no caso a main) ESPERE a execu��o da
		 * thread que deu o joing para s� depois a mesma continuar
		 */
		 try {
		 t.join();
		 t.join(1000); //Sobrecarga
		 t.join(1000, 2);// Sobrecarga
		 } catch (InterruptedException e) {
		 e.printStackTrace();
		 }

		/**
		 * M�todo yield() - -Est�tico e mant�m o look: Coloca a thread atual
		 * para o estado de "execut�vel" e influencia o scheldler a colocar uma
		 * thread qualquer DE MESMA PRIORIDADE pra executar, mas n h� garantias
		 * que isso ser� feito :P
		 */
		//Thread.yield();
	}
}
