package caracteres;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterExemplo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File arquivo = new File("filereaderwriter-text.txt");
		try {
			arquivo.createNewFile();

			Writer writer = new FileWriter(arquivo);

			String data = "Teste\nTeste2";
			writer.write(data);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
