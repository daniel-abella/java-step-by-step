package caracteres;

import java.io.Console;

public class ConsoleExemplo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Console console = System.console();
		String username = console.readLine("User Name? ");
		char[] password = console.readPassword("Password:");
		console.printf("seja bem vindo  %1$s", username);

	}

}
