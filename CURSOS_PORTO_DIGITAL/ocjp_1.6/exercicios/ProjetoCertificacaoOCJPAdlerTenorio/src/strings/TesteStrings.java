package strings;

public class TesteStrings {

	public static void main(String[] args) {
		String test = "This is a test";
		//String[] tokens = test.split("\s"); // N�o aceita esse tipo de par�metro \
		//System.out.println(tokens.length);
		
		
		  System.out.println("*******************************");
		
		StringBuilder sb1 = new StringBuilder("123");
        String s1 = "123";
        
        sb1.append("abc");
        s1 = s1.concat("abc"); // Aten��o pois o concat() retorna uma String, com isso temos q apontar a referencia para a mesma.
        
       System.out.println(sb1 + " " + s1);
       
       
       System.out.println("*******************************");
       
       String d = "abcdefghij";
       d.substring(1, 7);
       d = "w" + d;
       d.insert(3,"zz"); // Erro de compila��o pois a classe String n�o possui o m�todo insert.
       
       System.out.println(d);
		
	}
}
