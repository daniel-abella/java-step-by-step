package caracteres;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExemplo {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		File arquivo = new File("filewriter.txt");

		FileReader fileReader = new FileReader(arquivo);

		int lido = fileReader.read();

		StringBuilder conteudo = new StringBuilder();

		while(lido != -1){

			//conteudo.append(Character.toChars(lido));
			conteudo.append((char)lido);
			lido = fileReader.read();
		}

		System.out.println(conteudo);
		fileReader.close();
	}
}
