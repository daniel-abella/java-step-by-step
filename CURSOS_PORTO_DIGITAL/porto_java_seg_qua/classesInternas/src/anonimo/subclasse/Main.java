package anonimo.subclasse;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Externa externa = new Externa();

		Pessoa pessoaAnonima = externa.fazAlgo();

		pessoaAnonima.setNome("aroldo");

		System.out.println(pessoaAnonima.getNome());

	}

}