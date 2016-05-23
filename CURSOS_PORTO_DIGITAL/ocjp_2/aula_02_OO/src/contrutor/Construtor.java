package contrutor;

public class Construtor {

	//Caso nao exista, a vm fornece uma default e sem parametros

	//Caso exista, o default deixa de existir

	public /*SEM TIPO DE RETORNO*/ Construtor(String nome){
		//sempre chama o super, mesmo que implicitamente
		//caso explicito ele DEVE OBRIGATORIAMENTE, ser a primeira instrucao
		super();
		System.out.println("Construtor.Construtor()");
	}
}
