package classesespeciais;

import java.io.Console;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class CalendarDateFormatLocaleConsole {

	public static void main(String[] args) {

		/**
		 * Classes ABSTRATAS
		 */

		// Calendar
		Calendar calendar = Calendar.getInstance();
		Calendar calendar02 = Calendar.getInstance(new Locale("pt","BR")); // Construtor v�lido, recebendo um locale.

		// DateFormat
		DateFormat df = DateFormat.getInstance();
		DateFormat df02 = DateFormat.getDateInstance(); // V�lido tamb�m
		DateFormat df03 = DateFormat.getDateInstance(DateFormat.SHORT); // V�lido tamb�m
	
		DateFormat df04 = DateFormat.getDateInstance(1, new Locale("it")); // Construtor v�lido, recebendo um locale.

		String dataString = df.format(new Date()); // N�o levanta exception

		try {
			Date dataAtual = df.parse(dataString); // Levanta exception
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		// NumberFormat
		NumberFormat nf = NumberFormat.getInstance();		
		NumberFormat nf02 = NumberFormat.getInstance(new Locale("pt","BR"));	
		NumberFormat nf03 = NumberFormat.getNumberInstance();		
		NumberFormat nf04 = NumberFormat.getNumberInstance(new Locale("pt","BR"));		
		NumberFormat nf05 = NumberFormat.getCurrencyInstance();	
		NumberFormat nf06 = NumberFormat.getCurrencyInstance(new Locale("pt","BR"));	
		
		nf.setMaximumFractionDigits(4);
		nf.setMinimumFractionDigits(2);
		String a = nf.format(3.1415926); // N�o lan�a exce��o
		String b = nf.format(2);
		
		try {
			nf.parse("aa");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		
		// Console
		Console console = System.console();

		/**
		 * Classes Concretas
		 */

		// Date
		Date date02 = new Date();
		
		// Locale
		Locale locale = new Locale("it"); // Italiano
		
		//calendar.setLocale(); // N�o existe setLocale e nem getLocale "ERRO DE COMPILA��O"
		//df.setLocale();  // N�o existe setLocale e nem getLocale "ERRO DE COMPILA��O"
		
		System.out.println(locale.getDefault()); // Na classe locale, n�o existe um getLocale e sim um getDefault.
		
		
		// Scanner
		Scanner scanner = new Scanner(System.in);
		
	}
}
