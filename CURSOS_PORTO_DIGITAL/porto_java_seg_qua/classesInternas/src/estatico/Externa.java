package estatico;

public class Externa {

	private static String nome2;
	private String nome;
	private String telefone;

	public String getDados(){
		return nome+" "+telefone;
	}

	static class Interna{

		Interna(){
			System.out.println(nome2);
			//String dados = getDados();
		}
	}
}
