/*
 * RESPOSTA
 * B
 *
 *
 A) "1" is printed
 B) "2" is printed
 C) Compilation fails
 D) An exception is thrown at runtime



 */
class SomeClass {
    private int value = 1;

    public void printVal(int value) {
        System.out.print(value);
    }

    public static void main(String args[]) {
        int a = 2;
        SomeClass c = new SomeClass();
        c.printVal(a);
    }
}