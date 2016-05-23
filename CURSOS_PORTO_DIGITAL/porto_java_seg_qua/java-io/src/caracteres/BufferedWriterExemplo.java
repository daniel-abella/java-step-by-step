package caracteres;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterExemplo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int tamanhoBufferKB = 8 * 1024;
		File arquivo = new File("bufferedfilereaderwriter-text.txt");
		try {
			arquivo.createNewFile();
			FileWriter fileWriter = new FileWriter(arquivo);
			BufferedWriter writer = new BufferedWriter(fileWriter,tamanhoBufferKB);
			writer.write("Teste3");
			writer.newLine();
			writer.write("Teste4");
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
