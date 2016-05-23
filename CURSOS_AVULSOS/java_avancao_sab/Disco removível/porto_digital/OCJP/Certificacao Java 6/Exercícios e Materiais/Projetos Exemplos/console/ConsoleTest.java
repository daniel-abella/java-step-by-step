package SCJP6.console;

import java.io.Console;
import java.io.PrintWriter;
import java.util.Scanner;

public class ConsoleTest {

	public static void main(String[] args) {
		Console console = System.console();
		if (console != null) {
			String formatString = "%1$4s %2$10s %3$10s%n";
			Console c2 = console.printf(formatString, "Idx", "A", "B");
			console.printf(formatString, "1", "10", "100");
			console.printf(formatString, "2", "20", "200");
			console.printf(formatString, "3", "30", "300");
			console.printf(formatString, "4", "40", "400");

			// System.out.print("Digite algo: ");
			// String input1 = console.readLine();
			// String input2 = console.readLine("%1$s %3$s %2$s","Digite",
			// "Coisa: ", "Alguma");
			// System.out.println("1 - Você digitou: " + input1);
			// System.out.println("2 - Você digitou: " + input2);

			/*
			 * System.out.print("Digite Seu password: "); char[] input1 =
			 * console.readPassword(); char[] input2 =
			 * console.readPassword("%1$s %3$s %2$s", "Digite", "password: ",
			 * "seu"); System.out.print("Password digitado 1: "); if(input1 !=
			 * null) { for(int i=0; i<input1.length; i++) {
			 * System.out.print(new Character(input1[i])); }
			 * }System.out.println("");
			 * 
			 * System.out.print("Password digitado 2: "); if(input2 != null) {
			 * for(int i=0; i<input2.length; i++) { System.out.print(new
			 * Character(input2[i])); } }System.out.println("");
			 * Arrays.fill(input1,' '); Arrays.fill(input2,' ');
			 */

			Scanner scanner = new Scanner(console.reader());
			
			PrintWriter out = console.writer();
			out.println("aeeee");
			

			int value = 0;
			while (value != 99) {
				console.printf("Please input a value between 0 and 100.");
				value = scanner.nextInt();
			}
		}
	}
}
