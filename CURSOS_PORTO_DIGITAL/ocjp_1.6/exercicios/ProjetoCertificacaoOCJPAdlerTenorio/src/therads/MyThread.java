package therads;

public class MyThread extends Thread{

	@Override
	public void run() {
		System.out.print("running");
	}
	
	public static void main(String[] args) {
		Thread t = new Thread(new MyThread());
//		t.run();
//		t.run();  // Pode-se chamar o m�todo run() diretamente quantas vezes quizer, por�m com isso vc n�o inicia a thread

		t.start();
		t.start(); // Se startarmos a thread mais de uma vez, � lan�ado  java.lang.IllegalThreadStateException em tempo de execu��o.
		
//		MyThread myThread = new MyThread();
//		myThread.start();
	}
}
