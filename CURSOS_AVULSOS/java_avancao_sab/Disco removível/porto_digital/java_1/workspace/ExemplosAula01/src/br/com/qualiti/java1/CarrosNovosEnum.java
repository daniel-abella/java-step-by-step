package br.com.qualiti.java1;

public enum CarrosNovosEnum {
	
	FUSCA(2),
	CHEVETE(4){
		public int getQuantidadePortas(){
			return 5;
		}
	},
	VELOSTER(3);
	
	private int quantidadePortas;
	
	CarrosNovosEnum(int quantidadePortas){
		this.quantidadePortas = quantidadePortas;
	}
	
	public int getQuantidadePortas(){
		return quantidadePortas;
	}
}
