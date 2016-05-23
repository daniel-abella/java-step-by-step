package sobrescrita;

public class ChecadaNaoChecada {

	public static void fazAlgo() throws Exception{

	}

	public static void fazAlgumaCoisa() throws RuntimeException{

	}

	public static void fazOutraCoisa() throws Error{

	}

	public static void main(String[] args) {

		try {
			fazAlgo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		fazAlgumaCoisa();

		fazOutraCoisa();
	}
}
