Q:09 Given:
11. static void test() throws RuntimeException {
12. try {
13. System.out.print("test ");
14. throw new RuntimeException();
15. }
16. catch (Exception ex) { System.out.print("exception "); }
17. }
18. public static void main(String[] args) {
19. try { test(); }
20. catch (RuntimeException ex) { System.out.print("runtime "); }
21. System.out.print("end ");
22. }
What is the result?
A. test end
B. Compilation fails.
C. test runtime end
D. test exception end
E. A Throwable is thrown by main at runtime.
Answer: D































