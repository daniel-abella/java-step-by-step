package caracteres;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.UnknownHostException;

public class OutrasFontesExemplo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		lerUrl();
	}

	private static void lerUrl() {
		try {

			URL url = new URL("http://www.google.com");
			InputStreamReader isr = new InputStreamReader(url.openStream());

			BufferedReader reader = new BufferedReader (isr);

			String linhaLida = reader.readLine();
			StringBuilder textoLido = new StringBuilder();
			while (linhaLida != null) {

				textoLido.append(linhaLida);
				textoLido.append("\n");

				linhaLida = reader.readLine();
			}
			reader.close();

			System.out.println(textoLido);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
