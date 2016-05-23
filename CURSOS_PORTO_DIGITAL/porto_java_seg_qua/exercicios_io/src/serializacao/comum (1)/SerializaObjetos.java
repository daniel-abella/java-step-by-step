package serializacao.comum;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializaObjetos {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		serializar(new Cachorro(7.5f, 30.5f, "Rex"));

	}

	private static void serializar(Object objeto) throws IOException {

		FileOutputStream fileOutputStream =
				new FileOutputStream(
						objeto.getClass().getSimpleName()+".ser");

		ObjectOutputStream objectOutputStream =
				new ObjectOutputStream(fileOutputStream);

		objectOutputStream.writeObject(objeto);

	}

}
