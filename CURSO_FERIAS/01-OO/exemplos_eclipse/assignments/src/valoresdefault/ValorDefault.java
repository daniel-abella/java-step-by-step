package valoresdefault;

import java.util.Arrays;

public class ValorDefault {

	private byte   b;
	private short  s;
	private int    i;
	private long   l;
	private float  f;
	private double d;
	private char   c;// = '\u0000';
	private boolean boo;
	private String st;
	private int[] arraySemInicializacao;
	private int[] arrayComInicializacao = new int[5];



	static class Anonima{

	}

	static{

	}

	{
		arraySemInicializacao = new int[5];
	}


	@Override
	public String toString() {

		return "ValorDefault [b=" + b + ", s=" + s + ", i=" + i + ", l=" + l
				+ ", f=" + f + ", d=" + d + ", c=-" + c +  "-, st=" + st
				+  ", arraySemInicializacao=" + arraySemInicializacao
				+  ", arrayComInicializacao=" + Arrays.toString(arrayComInicializacao)
				+  ", boo=" + boo
				+ "]";
	}

	public static void main(String[] args) {
		System.out.println(new ValorDefault());
	}


}
