package caracteres;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExemplo {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		File arquivo = new File("bufferedwriter.txt");
		FileReader fileReader = new FileReader(arquivo);
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		StringBuilder conteudo = new StringBuilder();
		String lido = bufferedReader.readLine();
		conteudo.append(lido);
		conteudo.append("\n");

		while(bufferedReader.ready()){

			conteudo.append(lido);
			conteudo.append("\n");
			lido = bufferedReader.readLine();
		}

		System.out.println(conteudo);
		bufferedReader.close();

	}

}
