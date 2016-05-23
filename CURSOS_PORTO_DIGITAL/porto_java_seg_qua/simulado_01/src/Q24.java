/*
 * RESPOSTA
 * C
 *
 *

A
B 	equals
C 	equals ==
D 	No output is produced.
E 	An exception is thrown at runtime.
 */
class Sock2 {
    String color;
}

class TestSocks {
    public static void main(String[] args) {
   	 Sock2 s1 = new Sock2();
   	 s1.color = "blue";
   	 Sock2 s2 = new Sock2();
   	 s2.color = "blue";
   	 if (s1.color.equals(s2.color)) System.out.print("equals ");
   	 if (s1.color == s2.color) System.out.print("== ");
    }
}