package stringbufferandbuilder;

public class TesteStringBufferAndBuilder {

	public static void main(String[] args) {
		
//		System.out.println("************StringBuffer***************"); // � TRADE-SAFT
//		StringBuffer sb = new StringBuffer("ABC");
//		StringBuffer sb02 = new StringBuffer("ABC");
//		StringBuffer sb03 = new StringBuffer();
//		sb03 = sb;
//		
//		System.out.println("SB 01: " + sb.equals(sb02)); // O m�todo equals de StringBuffer n�o � sobrescrito, com isso ele N�O compara valores e sim refer�ncia.
//		System.out.println("SB 02: " + sb.toString().equals(sb.toString())); 
//		System.out.println("SB 03: " + sb.equals(sb)); 
//		System.out.println("SB 04: " + sb03.equals(sb));
//		sb.append("D");
//		System.out.println("SB 05: " + sb03.equals(sb)); // A refer�ncia n�o muda
		
		System.out.println();
		System.out.println("************StringBuilder***************");
		
		StringBuilder sbuilder = new StringBuilder("ABC");
		StringBuilder sbuilder02 = new StringBuilder("ABC");
		
		System.out.println("SBuilder 01: "+ sbuilder.equals(sbuilder02)); // O m�todo equals de StringBuilder n�o � sobrescrito, com isso ele N�O compara valores e sim refer�ncia.
		System.out.println("SBuilder 02: "+ sbuilder.equals(sbuilder)); 
		

	}
}
