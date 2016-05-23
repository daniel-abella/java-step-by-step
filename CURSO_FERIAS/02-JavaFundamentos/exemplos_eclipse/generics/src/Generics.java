import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Generics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		Motivos mais simples:

		1 - Parametrizar o tipo contido dentro de uma
		    cole��o
		2 - Eliminar o uso de cast
		3 - Impedir que sejam adicionados elementos que
		    n�o passam no instaceof do tipo parametrizado

		Generics e c�digos antigos

		1 - Pode ser usado com c�digo sem gen�rics
		    sem problemas
		2 - Permite algumas aberra��es no c�digo

		Generics e polimorfismo

		1 - Atribui��es
		2 - Passagem de par�metros simples
		3 - Especificando heran�a

		Classes e m�todos

		1 - � poss�vel declarar classes gen�ricas
		    e m�todos tamb�m
		*/

		//Tipagem

		List lista = new ArrayList();
		lista.add("aaaa");
		lista.add(1);
		String elemento = null;//(String) lista.get(1);

		List<String> listaTipada = new ArrayList<String>();
		listaTipada.add("");
		listaTipada.add(1);

		elemento = listaTipada.get(0);

		List<Number> numeros = new ArrayList<Number>();
		numeros.add(1);
		numeros.add("");

		List<Integer> numerosInteiros =
				new ArrayList<Integer>();

		Number[] numerosArray = new Integer[23];

		//No caso de declaraçao tem que ser o mesmo tipo
		//de ambos os lados
		//List<Number> numeros2 = new ArrayList<Integer>();

		fazAlgo(new Integer(1));
		imprimeNumeros(numeros);
		//Na chamada de método não pode ser de um tipo genérico filho
		//Exp: Number e passar um Integer
		imprimeNumeros(numerosInteiros);

		List<? extends Number> numeros3 = new ArrayList<Integer>();
		numeros3.add();

		imprimeNumeros(numeros3);

		//Posso passar uma lista genérica para uma método
		//não genérico
		imprimeNumerosSemTipo(numeros);

		List<? extends Number> numeros2 = numeros;

		numeros3 = new ArrayList<Long>();
		numeros3 = new ArrayList<Integer>();

		//??????????????????????????????????
		numeros3.add(new Integer(1));

		List<? super java.sql.Date> numeros4 = new ArrayList<java.util.Date>();

		numeros4.add(new java.util.Date());

		numeros4.add(new java.sql.Date(1L));

//		Number[] numerosArray = new Integer[5];
//
//		List<Number> numeros2 = new ArrayList<Integer>();

		imprimeNumerosExtends(numerosInteiros);

		imprimeNumerosSuper(numerosInteiros);

		List<Integer> a = null;

	}


	public static void  fazAlgoDate(){

		List<Number> numbers = new ArrayList<Number>();
		List<Number> numbers2 = new ArrayList<Integer>();

		numbers.add(1);
		numbers.add(1L);

		List<java.util.Date> datas = new ArrayList<java.util.Date>();

		datas.add(new java.util.Date());
		datas.add(new java.sql.Date(1L));

		List<? super java.util.Date> datas2 = new ArrayList<java.util.Date>();

		datas2.add(new java.util.Date());
		datas2.add(new java.sql.Date(1L));
	}

	private static void fazAlgo(Number number){

	}

	private static void sum(List<Integer> intList){
		for (int i : intList) {

		}
	}

	private static void imprimeNumeros(List<? extends Number> numeros){

		for (Number number : numeros) {
			System.out.println(number);
		}
	}

	private static void imprimeNumerosExtends(
			List<? extends Number> numeros){

		numeros.add(Integer.valueOf(1));

		for (Number number : numeros) {
			System.out.println(number);
		}
	}

	private static void imprimeNumerosSuper(
			List<? super Integer> numeros){

		numeros.add(1);
		numeros.add(1L);
	}

	private static void imprimeSerializaveis(
			List<? extends Serializable> serializaveis){

	}

	private static void imprimeNumerosSemTipo(List numeros){

		numeros.add("aaaaaaaaaaaaaaa");

		System.out.println(numeros.get(1));
	}

}
