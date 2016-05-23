
23. Given:
class Mineral { }
class Gem extends Mineral { }
class Miner {
static int x = 7;
static String s = null;
public static void getWeight(Mineral m) {
int y = 0 / x;
System.out.print(s + " ");
}
public static void main(String[] args) {
Mineral[] ma = {new Mineral(), new Gem()};
for(Object o : ma)
getWeight((Mineral) o);
}
}
And the command-line invocation:
java Miner.java
What is the result?
A. null
B. null null
C. A ClassCastException is thrown.
D. A NullPointerException is thrown.
E. A NoClassDefFoundError is thrown.
F. An ArithmeticException is thrown.
G. An IllegalArgumentException is thrown.
H. An ArrayIndexOutOfBoundsException is thrown.
Answer:
-> E is correct. The invocation should be java Miner, in which case null null would be produced.
-> A, B, C, D, F, G, and H are incorrect based on the above.


























