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

		//FONTE DOS DADOS
		File file = new File("bufferedwriter.txt");
		file.createNewFile();

		//LEITOR DOS DADOS
		FileReader fileReader = new FileReader(file);

		//CAMADA DE ABSTRA��O
		//(ADICIONA FUNCIONALIDADES DE ALTO N�VEL
		int bufferBytes = 100 * 1024;
		BufferedReader bufferedReader =
				new BufferedReader(fileReader,bufferBytes);

		//LEITURA
		StringBuilder conteudo = new StringBuilder();

		String lido = null;

		while(bufferedReader.ready()){
			lido = bufferedReader.readLine();
			conteudo.append(lido);
			conteudo.append("\n");
		}

		System.out.println(conteudo);

		bufferedReader.close();
	}

}
