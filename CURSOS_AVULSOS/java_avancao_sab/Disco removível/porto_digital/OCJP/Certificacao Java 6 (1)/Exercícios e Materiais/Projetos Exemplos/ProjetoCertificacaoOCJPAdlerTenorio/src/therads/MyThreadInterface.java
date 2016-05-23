package therads;

public class MyThreadInterface implements Runnable {

    @Override
    public void run() {
        System.out.println("Interface");
    }
    
    public static void main(String[] args) {
		new MyThread().start(); // Start é um método de Thread
		//new MyThreadInterface().start(); // Não compila pois start() é um método de Thread
	}
}
