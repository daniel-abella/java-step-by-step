package caracteres;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

public class PrintWriterExemplo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int tamanhoBufferKB = 8 * 1024;
		File arquivo = new File("printwriter-text.txt");
		try {
			arquivo.createNewFile();
			FileWriter fileWriter = new FileWriter(arquivo);
			PrintWriter writer = new PrintWriter(fileWriter);
			writer.print("Teste5");
			writer.print(true);
			writer.print(12L);
			writer.println("Teste6");
			writer.printf(Locale.FRANCE, "Texto formatado %f", 678.90);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
