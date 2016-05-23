package caracteres;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderExemplo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File arquivo = new File("filereaderwriter-text.txt");

		try {
			Reader reader = new FileReader(arquivo);

			int data = reader.read();
			StringBuilder textoLido = new StringBuilder();
			while (data != -1) {

				textoLido.append((char)data);

				data = reader.read();
			}
			reader.close();

			System.out.println(textoLido);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}