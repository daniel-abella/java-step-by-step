package heranca;


public class Teste {

	static void test() throws RuntimeException {
		try {
			System.out.print("test ");
			throw new RuntimeException();
		} catch (Exception ex) {
			System.out.print("exception ");
		}
	}

	public static void main(String[] args) {
		try {
			test();
		} catch (RuntimeException ex) {
			System.out.print("runtime ");
		}
		System.out.print("end ");
	}
	
	void waitForSignal() {
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
