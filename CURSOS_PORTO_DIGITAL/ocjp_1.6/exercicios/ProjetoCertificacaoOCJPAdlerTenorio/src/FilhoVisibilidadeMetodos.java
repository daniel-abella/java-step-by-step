import java.util.ArrayList;
import java.util.List;


public class FilhoVisibilidadeMetodos extends PaiVisibilidadeMetodos{

	
	@Override
	public void imprimirPai() {
		System.out.println("imprimir pai no filho");
	}
	
	public void imprimirFilho() {
		System.out.println("imprimir filho");
	}
	
	public static void main(String[] args) {
		PaiVisibilidadeMetodos p = new PaiVisibilidadeMetodos();
		FilhoVisibilidadeMetodos f = new FilhoVisibilidadeMetodos();
		
		PaiVisibilidadeMetodos pf = new FilhoVisibilidadeMetodos();
		
	}
}
