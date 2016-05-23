package serializacao.naoserializaveis.composicao;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Cachorro implements Serializable{

	private float peso;
	private float altura;
	private String nome;
	private transient Raca raca;



	public Cachorro(float peso,
					float altura,
					String nome,
					Raca raca) {
		super();
		this.peso = peso;
		this.altura = altura;
		this.nome = nome;
		this.raca = raca;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Raca getRaca() {
		return raca;
	}

	public void setRaca(Raca raca) {
		this.raca = raca;
	}

	private void writeObject(ObjectOutputStream oo){
		try {
			oo.defaultWriteObject();
			oo.writeUTF(getRaca().getNome());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void readObject(ObjectInputStream oi){
		try {
			oi.defaultReadObject();
			String nomeRaca = oi.readUTF();
			this.raca = new Raca(nomeRaca);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
