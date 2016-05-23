package therads;

public class MyThread extends Thread{

	@Override
	public void run() {
		System.out.print("running");
	}
	
	public static void main(String[] args) {
		Thread t = new Thread(new MyThread());
//		t.run();
//		t.run();  // Pode-se chamar o método run() diretamente quantas vezes quizer, porém com isso vc não inicia a thread

		t.start();
		t.start(); // Se startarmos a thread mais de uma vez, é lançado  java.lang.IllegalThreadStateException em tempo de execução.
		
//		MyThread myThread = new MyThread();
//		myThread.start();
	}
}
