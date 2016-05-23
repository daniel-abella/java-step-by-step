package anonimo.subclasse;

public class Externa {

	public Pessoa fazAlgo(){

		Pessoa pessoaAnonima = new Pessoa(){

			@Override
			public String getNome(){
				return super.getNome().toUpperCase();
			}

			public String getNomeCompleto(){
				return getNome()+" "+getSobrenome();
			}
		};

		return pessoaAnonima;

	}
}
