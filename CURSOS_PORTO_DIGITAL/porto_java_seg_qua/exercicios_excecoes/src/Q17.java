
17. Given:
import java.io.*;
class Master {
String doFileStuff() throws FileNotFoundException { return "a"; }
}
class Slave extends Master {
public static void main(String[] args) {
String s = null;
try { s = new Slave().doFileStuff();
} catch ( Exception x) {
s = "b"; }
System.out.println(s);
}
// insert code here
}
Which, inserted independently at // insert code here, will compile, and produce the output
b? (Choose all that apply.)
A. String doFileStuff() { return "b"; }
B. String doFileStuff() throws IOException { return "b"; }
C. String doFileStuff(int x) throws IOException { return "b"; }
D. String doFileStuff() throws FileNotFoundException { return "b"; }
E. String doFileStuff() throws NumberFormatException { return "b"; }
F. String doFileStuff() throws NumberFormatException,
FileNotFoundException { return "b"; }
Answer:
->  A , D, E, and F are correct. It’s okay for an overriding method to throw the same
exceptions, narrower exceptions, or no exceptions. And it’s okay for the overriding
method to throw any runtime exceptions.
->   B is incorrect, because the overriding method is trying to throw a broader exception.
  	C is incorrect. This method doesn’t override, so the output is a.


















