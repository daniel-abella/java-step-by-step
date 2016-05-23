import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

/*
 ----------------------------------------
 CORINGA
 . - Qualquer caracter

 QUANTIFICADORES

 * - # O ou mais vezes
     # .* qualquer caracter 0 ou mais vezes
     # Opcional

 + - # 1 ou mai vezes
     # a+ - a ou aa ou aaaaaaaaaa
     # Obrigatório

 ? - # 0 ou 1 vez
     # cavalos? - cavalo ou cavalos
     # Opcional

 {} nao cai

 METACARACTERES

 \d - # Qualquer número inteiro
      # [0-9]

 \w - # Alfanumérico
      # [0-9A-Za-z_]

 \s - # Espaços, quebras de linha tabs/ nao imprimível
      #  , \n, \t, \r

 LISTAS

 [a-zA-Z] - # Um ou mais intervalos de caracteres
              da tabela ascii

 [0-9]

 [!-ÿ] quase toda a tabela ascii

 GRUPOS ou palavra

 (palavra)

 (Felix)?
 (Felix )+

 ----------------------------------------
 [0-9]{2}/[0-9]{2}/2013
 */
//		String texto = " dasdadada 01/12/2013 dasdadasda";
//
//		int indice = 0;
//		List<String> datas = new ArrayList<String>();
//
//		while( indice >= 0){
//			indice = texto.indexOf("2013");
//
//			if(indice > 0){
//				String data  = texto.substring(indice-6, indice+1);
//				datas.add(data);
//			}
//		}

		Pattern pattern = null;
		Matcher matcher = null;

		//. PONTO
		pattern = Pattern.compile("(brasil)?\\s+\\d+");//ER compilada
		matcher = pattern.matcher(" brasil 1234 américa do sul 5678");
		System.out.println(matcher.matches());


		while(matcher.find()){
			System.out.println(matcher.group());
		}
//
//
//
//		//* ASTERISCO (0 ou mais vezes)
//
//		pattern = Pattern.compile(".*");
//		matcher = pattern.matcher("brasil 1234");
//		System.out.println(matcher.matches());
//
//		if(matcher.matches()){
//			System.out.println("brasil 1234");
//		}else{
//			while(matcher.find()){
//				System.out.println(matcher.group());
//			}
//		}
//
//		//+ MAIS (1 ou mais vezes)
//
//		System.out.println("********************************");
//		System.out.println("+");
//
//
//		pattern = Pattern.compile("(brasil\\s)+([0-9])+");
//		matcher = pattern.matcher("brasil brasil 1234");
//		System.out.println(matcher.matches());
//
//		if(matcher.matches()){
//			System.out.println("brasil 1234");
//		}else{
//			while(matcher.find()){
//				System.out.println(matcher.group());
//			}
//		}
//
//		//? INTERROGA��O (0 ou 1 vez)
//
//		System.out.println("********************************");
//		System.out.println("?");
//
//
//		pattern = Pattern.compile("(brasil\\s)?([0-9])+");
//		matcher = pattern.matcher("1234");
//		System.out.println(matcher.matches());
//
//		if(matcher.matches()){
//			System.out.println("brasil 1234");
//		}else{
//			while(matcher.find()){
//				System.out.println(matcher.group());
//			}
//		}
//
//		//\d N�MERO
//		System.out.println("********************************");
//		System.out.println("\\d");
//
//
//		pattern = Pattern.compile("(brasil\\s)?(\\d)+");
//		matcher = pattern.matcher("1234");
//		System.out.println(matcher.matches());
//
//		if(matcher.matches()){
//			System.out.println("brasil 1234");
//		}else{
//			while(matcher.find()){
//				System.out.println(matcher.group());
//			}
//		}
//
//		//\s ESPA�OS EM BRANCO, QUEBRA DE LINHA
//		System.out.println("********************************");
//		System.out.println("\\s");
//
//
//		pattern = Pattern.compile("(brasil\\s)?(\\d)+");
//		matcher = pattern.matcher("1234");
//		System.out.println(matcher.matches());
//
//		if(matcher.matches()){
//			System.out.println("brasil 1234");
//		}else{
//			while(matcher.find()){
//				System.out.println(matcher.group());
//			}
//		}
//
//
//		//[] LISTA
//		//[a-zA-z0-9!-)]
//		System.out.println("********************************");
//		System.out.println("[]");
//
//
//		pattern = Pattern.compile("[a-zA-Z�-�]+");
//		Matcher matcher2 = pattern.matcher("Miguel �ngelo");
//		System.out.println(matcher2.matches());
//
//		if(matcher2.matches()){
//			System.out.println("Miguel �ngelo");
//		}else{
//			while(matcher2.find()){
//				System.out.println(matcher2.group());
//			}
//		}
//
//		//\w LETRAS E N�MEROS
//		System.out.println("********************************");
//		System.out.println("\\w");
//
//
//		pattern = Pattern.compile("\\w+");
//		matcher2 = pattern.matcher("Miguel �ngelo");
//		System.out.println(matcher2.matches());
//
//		if(matcher2.matches()){
//			System.out.println("Miguel �ngelo");
//		}else{
//			while(matcher2.find()){
//				System.out.println(matcher2.group());
//			}
//		}
//
//
//		//() GRUPO
//
//
//		//ESCAPANDO STRINGS
//
//
//		System.out.println("********************************");
//		System.out.println("\\w");
//
//
//		String regex = "(\\w+\\s)(�ngelo)(\\s\\w+)";
//		regex = "\\.";
//		String string = "Miguel �ngelo Caldas";
//		System.out.println(string.replaceAll(regex, "$2"));

	}

}
