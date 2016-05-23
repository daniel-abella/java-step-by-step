package strings;

public class TesteStrings {

	public static void main(String[] args) {
		String test = "This is a test";
		//String[] tokens = test.split("\s"); // Não aceita esse tipo de parâmetro \
		//System.out.println(tokens.length);
		
		
		  System.out.println("*******************************");
		
		StringBuilder sb1 = new StringBuilder("123");
        String s1 = "123";
        
        sb1.append("abc");
        s1 = s1.concat("abc"); // Atenção pois o concat() retorna uma String, com isso temos q apontar a referencia para a mesma.
        
       System.out.println(sb1 + " " + s1);
       
       
       System.out.println("*******************************");
       
       String d = "abcdefghij";
       d.substring(1, 7);
       d = "w" + d;
       d.insert(3,"zz"); // Erro de compilação pois a classe String não possui o método insert.
       
       System.out.println(d);
		
	}
}
