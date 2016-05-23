Q: 04 Given:
11. class A {
12. public void process() { System.out.print("A,"); }
13. class B extends A {
14. public void process() throws IOException {
15. super.process();
16. System.out.print("B,");
17. throw new IOException();
18. }
19. public static void main(String[] args) {
20. try { new B().process(); }
21. catch (IOException e) { System.out.println("Exception"); }}
What is the result?
A. Exception
B. A,B,Exception
C. Compilation fails because of an error in line 20.
D. Compilation fails because of an error in line 14.
E. A NullPointerException is thrown at runtime.
Answer: D





















