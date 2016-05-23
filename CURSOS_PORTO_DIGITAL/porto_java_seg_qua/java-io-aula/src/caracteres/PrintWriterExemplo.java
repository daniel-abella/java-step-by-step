package caracteres;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExemplo {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		File arquivo = new File("printwriter.txt");
		arquivo.createNewFile();

		FileWriter fileWriter = new FileWriter(arquivo);

		PrintWriter printWriter =
				new PrintWriter(fileWriter);


		printWriter.println("Teste2");
		printWriter.println("Teste2");
		printWriter.println("Teste2");
		printWriter.println("Teste2");

		printWriter.close();

	}

}
