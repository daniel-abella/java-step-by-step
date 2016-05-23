package enums;

public class DeclaracaoEnum {

	enum Towns1 {
		NY, LA, SF
	} // O ponto e virgula aqui é OPCIONAL

	enum Towns2 {
		NY, LA, SF
	};

	public static void main(String [] args) {
	     enum Towns3{NY, LA, SF}; // Não se pode declarar um enum dentro de um método.
	    }
}
