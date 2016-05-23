/*
 * RESPOSTA
 * D
 *
 *

A. null
B. zero
C. some
D. Compilation fails.
E. An exception is thrown at runtime.
 */
public class Q16 {
	public static void main(String[] args) {
		String str = "null";
		if (str == null) {
		System.out.println("null");
		} else (str.length() == 0) {
		System.out.println("zero");
		} else {
		System.out.println("some");
		}
		}
}
