
18. Given:
class Input {
public static void main(String[] args) {
String s = "-";
try {
doMath(args[0]);
s += "t "; // line 6
}
finally { System.out.println(s += "f "); }
}
public static void doMath(String a) {
int y = 7 / Integer.parseInt(a);
} }
And the command-line invocations:
java Input
java Input 0
Which are true? (Choose all that apply.)
A. Line 6 is executed exactly 0 times.
B. Line 6 is executed exactly 1 time.
C. Line 6 is executed exactly 2 times.
D. The finally block is executed exactly 0 times.
E. The finally block is executed exactly 1 time.
F. The finally block is executed exactly 2 times.
G. Both invocations produce the same exceptions.
H. Each invocation produces a different exception.
Answer:
-> A , F, and H are correct. Since both invocations throw exceptions, line 6 is never reached. Since both exceptions occurred within a try block, the finally block will always execute. The first invocation throws an   ArrayIndexOutOfBoundsException, and the second invocation throws an ArithmeticException for the attempt to divide by zero.
-> B, C, D, E, and G are incorrect based on the above.





























