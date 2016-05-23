package serializacao.estaticos;

import java.io.Serializable;

public class Cachorro implements Serializable{

	public static String RACA = "Fox Paulistinha";

	private String nome;
	private double altura;
	private double peso;

	public Cachorro(String nome, double altura, double peso, String racaNova) {
		super();
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
		RACA = racaNova;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
}
