import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Food {
	Food() {
		System.out.print("1");
	}
}

class Fruit extends Food implements Serializable {
	Fruit() {
		System.out.print("2");
	}
}

public class Banana extends Fruit {
	int size = 42;

	public static void main(String[] args) {

		Banana b = new Banana();

		b.serializeBanana2(b); // assume correct serialization

		b = b.deserializeBanana2(b); // assume correct

		System.out.println(" restored " + b.size + " ");
	}
	// more Banana2 methods

	private Banana deserializeBanana2(Banana b) {

		Object objeto = null;
		try {
			FileInputStream fileInputStream =
					new FileInputStream(Banana.class.getSimpleName()+".estatico.ser");

			ObjectInputStream objectInputStream =
					new ObjectInputStream(fileInputStream);

			objeto = objectInputStream.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return (Banana)objeto;
	}

	private void serializeBanana2(Banana objeto) {

		try {
			FileOutputStream fileOutputStream =
					new FileOutputStream(
							objeto.getClass().getSimpleName()+".estatico.ser");

			ObjectOutputStream objectOutputStream =
					new ObjectOutputStream(fileOutputStream);

			objectOutputStream.writeObject(objeto);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}