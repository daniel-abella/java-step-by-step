
21. Given:
1. class Ping extends Utils {
2. public static void main(String [] args) {
3. Utils u = new Ping();
4. System.out.print(u.getInt(args[0]));
5. }
6. int getInt(String arg) {
7. return Integer.parseInt(arg);
8. }
9. }
10. class Utils {
11. int getInt(String x) throws Exception { return 7; }
12. }
And the following three possible changes:
C1. Declare that main() throws an Exception.
C2. Declare that Ping.getInt() throws an Exception.
C3. Wrap the invocation of getInt() in a try / catch block.
Which change(s) allow the code to compile? (Choose all that apply.)
A. Just C1 is sufficient.
B. Just C2 is sufficient.
C. Just C3 is sufficient.
D. Both C1 and C2 are required.
E. Both C1 and C3 are required.
F. Both C2 and C3 are required.
G. All three changes are required.
Answer:
-> A and C are correct. Remember that line 4 is making a polymorphic call so the compiler knows that an exception might be thrown. If C1 is implemented the exception has been sufficiently declared, and if C3 is implemented the exception has been sufficiently handled. C2 is not necessary in either case.
-> B, D, E, F, and G are incorrect based on the above.

















