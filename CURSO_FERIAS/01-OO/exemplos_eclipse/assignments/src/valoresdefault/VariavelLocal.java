package valoresdefault;

import java.util.Arrays;

public class VariavelLocal {

	public static void main(String[] args) {

		byte   b;
		short  s;
		int    i;
		long   l;
		float  f;
		double d;
		char   c;// = '\u0000';
		String st;
		int[] arraySemInicializacao;
		int[] arrayComInicializacao = new int[5];
		boolean boo;

		System.out.println("ValorDefault [b=" + b + ", s=" + s + ", i=" + i + ", l=" + l
				+ ", f=" + f + ", d=" + d + ", c=-" + c +  "-, st=" + st
				+  ", arraySemInicializacao=" + arraySemInicializacao
				+  ", arrayComInicializacao=" + Arrays.toString(arrayComInicializacao)
				+  ", boo=" + boo
				+ "]");


	}

}
