/*
 * RESPOSTA
 * C
 *
 *

A. 1
B. 2
C. 3
D. 4
E. 5
 */
public class Q05 {
	public static void main(String[] args) {
		int i = 0;
		String s1 = "text";
		String s2 = "text";
		String s3 = new String("text");
		if(s1==s2){
			i++;
		}
		if(s1==s3){
			i++;
		}
		if(s1.equals(s2)){
			i++;
		}
		if(s1.equals(s3)){
			i++;
		}
		System.out.println(i);
	}
}
