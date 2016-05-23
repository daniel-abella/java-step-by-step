package cast;

public class CastImplicito {

	public static void main(String[] args) {

		byte  b = 1;//8 bits
		short s = 1;//16
		int   i = 1;//32
		long  l = (long)Math.pow(2, 63) - 1;//64s

		System.out.println(l);

//		l = i;
//		i = s;
//		s = b;

		float  f = 1.0f;
		double d = 1.0;

		d = f;

		//=================================

		d = l;
		f = l;

		System.out.println(f);

		//rever a questao da potencia no float
		//número de euler
		//=================================

		//O RESULTADO MINIMO DE QUALQUER SOMA DE LITERAIS INTEIROS
		// É UM INT

		int representacaoInteira = (int)Math.pow(2, 16)-1;
		System.out.println(representacaoInteira);
		char c = (char)representacaoInteira;

		System.out.println(c);

	}

}
