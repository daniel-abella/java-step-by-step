package set;

public class Pessoa implements Comparable<Pessoa>{

	private String nome;

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int compareTo(Pessoa o) {

		if(o.getNome() == null){
			return -1;
		}

		return nome.compareTo(o.nome);
	}

//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}


}
