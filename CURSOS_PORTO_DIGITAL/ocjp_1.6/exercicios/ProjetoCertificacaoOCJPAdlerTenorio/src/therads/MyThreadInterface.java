package therads;

public class MyThreadInterface implements Runnable {

    @Override
    public void run() {
        System.out.println("Interface");
    }
    
    public static void main(String[] args) {
		new MyThread().start(); // Start � um m�todo de Thread
		//new MyThreadInterface().start(); // N�o compila pois start() � um m�todo de Thread
	}
}
