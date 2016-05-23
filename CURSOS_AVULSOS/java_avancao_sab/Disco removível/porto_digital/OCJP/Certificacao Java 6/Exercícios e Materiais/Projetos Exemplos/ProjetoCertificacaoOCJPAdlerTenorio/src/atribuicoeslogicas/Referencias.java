package atribuicoeslogicas;

public class Referencias {

	public static void main(String[] args) {

		// EXEMPLO 01
		// int x = 5;
		// Integer x1 = x;
		// Integer x2 = x;
		// int x3 = new Integer(5);
		//
		// System.out.print(x1.equals(x));
		// System.out.print(x1 == x);
		// System.out.print(x2.equals(x1));
		// System.out.print(x2 == x1);
		// System.out.print(x2 == x3);
		// System.out.print(x2.equals(x3));
		
		

		// EXEMPLO 02
//		int x = 5;
//		Integer x1 = x;
//		Integer x2 = x;
//		int x3 = new Integer(5);
//		x = 6;
//
//		System.out.print(x1.equals(x));
//		System.out.print(x1 == x);
//		System.out.print(x2.equals(x1));
//		System.out.print(x2.equals(x3));
//		System.out.print(x2 == x3);
		
//		
//		// STRINGS
//		String x= "abc";
//		String y= "abc";
//	
//		StringBuilder sb = new StringBuilder("z");
//		StringBuilder sb2 = new StringBuilder("z");
//		
//		System.out.println(x == y); // true
//		System.out.println(x.equals(y));  // true
//		
//		//////////////////////////////
//		
//		System.out.println(sb == sb2); // false
//		System.out.println(sb.equals(sb2));  // true
		

		
		// EXEMPLO 03
		Integer x = 400;
		Integer y = x;
		x++;
		StringBuilder sb1 = new StringBuilder("123");
		StringBuilder sb2 = sb1;
		sb1.append("5");
		
		String s = "AA";
		String v = s;
		s += "G";
		
		System.out.println((x == y) + " " + (sb1 == sb2));
		System.out.println((x.equals(y)) + " " + (sb1.equals(sb2)));
		System.out.println((s == v) + " " + (s.equals(v)));
		

		// EXEMPLO 04
		int a = 100000;
		
		Integer i1 = new Integer('l');
		Integer i2 = new Integer(a);
		System.out.println(i1 == i2);
	}
	
}
