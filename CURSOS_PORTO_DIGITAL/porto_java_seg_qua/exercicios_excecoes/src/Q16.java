
Question:16
Given:
11.classA {
12. public void process() { System.out.print(”A “); } }
13. class B extends A {
14. public void process() throws RuntimeException {
15. super.process();
16. if (true) throw new RuntimeException();
17. System.out.print(“B”); }}
18. public static void main(String[] args) {
19. try { ((A)new B()).process(); }
20. catch (Exception e) { System.out.print(”Exception “); }
21. }
What is the result?
A. Exception
B. A Exception
C. A Exception B
D. A B Exception
E. Compilation fails because of an error in line 14.
F. Compilation fails because of an error in line 19.
Answer: B
























