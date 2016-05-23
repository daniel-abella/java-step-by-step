Question: 15
Click the Exhibit button.
Class TestException
1. public class TestException extends Exception {
2. }
Class A:
1. public class A {
2.
3. public String sayHello(String name) throws TestException {
4.
5. if(name == null) {
6. throw new TestException();
7. }
8.
9. return “Hello “+ name;
10. }
11.
12. }
A programmer wants to use this code in an application:
45. A a=new A();
46. System.out.println(a.sayHello(”John”));
Which two are true? (Choose two.)
A. Class A will not compile.
B. Line 46 can throw the unchecked exception TestException.
C. Line 45 can throw the unchecked exception TestException.
D. Line 46 will compile if the enclosing method throws a TestException.
E. Line 46 will compile if enclosed in a try block, where TestException
is caught.
Answer: DE
























