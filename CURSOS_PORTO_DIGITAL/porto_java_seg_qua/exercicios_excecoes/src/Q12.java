
Q: 12 Given:
11. static void test() {
12. try {
13. String x = null;
14. System.out.print(x.toString() + " ");
15. }
16. finally { System.out.print("finally "); }
17. }
18. public static void main(String[] args) {
19. try { test(); }
20. catch (Exception ex) { System.out.print("exception "); }
21. }
What is the result?
A. null
B. finally
C. null finally
D. Compilation fails.
E. finally exception
Answer: E











































