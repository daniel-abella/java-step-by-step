package therads;

public class MyThreadComContrutorRunnable extends Thread {

	public MyThreadComContrutorRunnable() {

	}

	public MyThreadComContrutorRunnable(Runnable r) {
		super(r);
	}

	@Override
	public void run() {

		System.out.println("MyThreadComContrutorRunnable ");
	}

	public static void main(String[] args) {
		MyThreadInterface m = new MyThreadInterface();
		MyThreadComContrutorRunnable t = 
				new MyThreadComContrutorRunnable(m); // TODO IMPOTANTE Executa o run() de MyThreadComContrutorRunnable, lembrando
		// que eu só posso passar "m" como parâmetro para MyThread pq eu criei um construtor para isso

		t.start();
	}
}
