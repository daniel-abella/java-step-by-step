/*
 * RESPOSTA
 * C
 *
 *
 A) Compilation fails.
 B) An exception is thrown at runtime.
 C) d e h
 D) d f i
 E) c f i
 F) c e h

 */
public class Q19 {


    private static void doStuff(String str) {
        int var = 4;
        if (var == str.length()) {
            System.out.print(str.charAt(--var) + " ");
        }
        else {
            System.out.print(str.charAt(0) + " ");
        }
    }
    public static void main(String args[]) {
        doStuff("abcd");
        doStuff("efg");
        doStuff("hi");
    }
}
