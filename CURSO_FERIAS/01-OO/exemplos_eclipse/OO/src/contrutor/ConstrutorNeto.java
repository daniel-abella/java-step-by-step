package contrutor;

public class ConstrutorNeto extends ConstrutorFilho {

	private ConstrutorNeto(){
		this("sem parametros");
		System.out.println("ConstrutorNeto.ConstrutorNeto()");
	}

	public ConstrutorNeto(String nome){
		System.out.println("ConstrutorNeto.ConstrutorNeto() - "+nome);
	}
}
