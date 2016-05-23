/*
 * RESPOSTA
 * B D
 */
class Bar {
	static void foo(int... x) {


//A.
		foreach(x) System.out.println(z);
//B.
		for(int z : x) System.out.println(z);
//C.
		while( x.hasNext()) System.out.println( x.next());
//D.
		for( int i=0; i< x.length; i++ ) System.out.println(x[i]);
	}
}