package caracteres;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExemplo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int tamanhoBufferKB = 8 * 1024;
		File arquivo = new File("bufferedfilereaderwriter-text.txt");
		try {

			FileReader fileReader = new FileReader(arquivo);
			BufferedReader reader = new BufferedReader(fileReader,tamanhoBufferKB);

			String linhaLida = reader.readLine();
			StringBuilder textoLido = new StringBuilder();
			while (linhaLida != null) {

				textoLido.append(linhaLida);
				textoLido.append("\n");

				linhaLida = reader.readLine();
			}
			reader.close();

			System.out.println(textoLido);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
