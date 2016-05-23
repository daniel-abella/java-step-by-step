package mytags;

import java.util.Collection;
import java.util.ArrayList;

public class Bean1 {

	private String nome;

	public Bean1() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome1) {
		this.nome = nome1;
	}

	public Collection getColecao() {
		ArrayList a = new ArrayList();
		a.add("valor1");
		a.add("valor2");
		a.add("valor3");
		return a;
	}

}
