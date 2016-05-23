package serializacao.naoserializaveis.composicao;

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
		Cachorro cachorro = new Cachorro(7.5f,
								30.5f,
								"Rex",
								new Raca("Fox Paulistinha"));
		System.out.println("Cachorro 01 - "+cachorro.getRaca().getNome());
		serializar(cachorro);

		/*
		 * DESERIALIZAR
		 */
		String path =
				cachorro.getClass().getSimpleName()+".estatico.ser";
		Cachorro cachorro2 = (Cachorro) deserializar(path);

		System.out.println("Cachorro 02 - "+cachorro2.getRaca().getNome());
	}

	private static void serializar(Object objeto) throws IOException {

		FileOutputStream fileOutputStream =
				new FileOutputStream(
						objeto.getClass().getSimpleName()+".estatico.ser");

		ObjectOutputStream objectOutputStream =
				new ObjectOutputStream(fileOutputStream);

		objectOutputStream.writeObject(objeto);

	}

	private static Object deserializar(String path)
			throws IOException, ClassNotFoundException {

		FileInputStream fileInputStream =
				new FileInputStream(path);

		ObjectInputStream objectInputStream =
				new ObjectInputStream(fileInputStream);

		Object objeto = objectInputStream.readObject();

		return objeto;
	}

}
