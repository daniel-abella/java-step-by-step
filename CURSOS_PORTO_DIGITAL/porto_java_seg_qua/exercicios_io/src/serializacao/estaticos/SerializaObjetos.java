package serializacao.estaticos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializaObjetos {

	/**
	 * @param args
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args)
			throws IOException, ClassNotFoundException {

		/*
		 * SERIALIZAR
		 */
		Cachorro cachorro = new Cachorro(7.5f, 30.5f, "Rex");
		Cachorro.raca = "Fox Paulistinha";
		System.out.println("Cachorro 01 - "+cachorro.raca);
		serializar(cachorro);
	}

	private static void serializar(Object objeto) throws IOException {

		FileOutputStream fileOutputStream =
				new FileOutputStream(
						objeto.getClass().getSimpleName()+".estatico.ser");

		ObjectOutputStream objectOutputStream =
				new ObjectOutputStream(fileOutputStream);

		objectOutputStream.writeObject(objeto);

	}
}
