package br.com.qualiti;

import static br.com.qualiti.util.Utils.formatarData;
import java.util.Date;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String dataFormatada = formatarData(new Date(), "dd/MM/yyyy HH:mm:ss.S");

		System.out.println(dataFormatada);

	}

}
