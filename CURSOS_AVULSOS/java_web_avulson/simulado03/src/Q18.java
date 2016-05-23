/*
 * RESPOSTA
 * A
 *
 *

A. true 2
B. false 2
C. false 3
D. true 3
E. Compilation fails.
 */
public class Q18 {
	public static void main(String[] args) {
		Integer i1;
		Integer i2 = 2;
		Integer i3 = i2;
		if (i2.equals(2) || (i3++==4)) {
			System.out.println("true " + i3);
		} else {
			System.out.println("false " + i3.intValue());
		}

		//System.out.println(new Integer(1).intValue() == new Integer(1));

		//System.out.println(new Integer(1) == new Integer(1));

	}
}
