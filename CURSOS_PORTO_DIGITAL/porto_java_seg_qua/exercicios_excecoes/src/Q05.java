Q: 05 Given:
11. static void test() throws Error {
12. if (true) throw new AssertionError();
13. System.out.print("test ");
14. }
15. public static void main(String[] args) {
16. try { test(); }
17. catch (Exception ex) { System.out.print("exception "); }
18. System.out.print("end ");
19. }
What is the result?
A. end
B. Compilation fails.
C. exception end
D. exception test end
E. A Throwable is thrown by main.
F. An Exception is thrown by main.
Answer: E

































