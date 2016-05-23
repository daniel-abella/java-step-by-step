package SCJP6.console;

public class Interact {

	public static void main(String args[]) {
		Thread x = new Thread() {
			
			public void run() {
				this.setName("Outra thread");
				for (int i = 0; i < 50; i++) {
					try {
						Thread.currentThread().sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+" - "+i);
				}
			}

		};
		
		x.start();
		try {
			x.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for (int i = 0; i < 50; i++) {
			try {
				Thread.currentThread().sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
				
			}
			System.out.println(Thread.currentThread().getName()+" - "+i);
		}
	}
}
