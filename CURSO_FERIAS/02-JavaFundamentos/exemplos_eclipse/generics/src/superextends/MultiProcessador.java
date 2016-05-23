package superextends;

import java.util.ArrayList;
import java.util.List;

public class MultiProcessador {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Maca> macas = new ArrayList<Maca>();
		fazerSucoExtends(macas);

		fazerSuco(macas);

		List<Fruta> frutas = new ArrayList<Fruta>();
		fazerSucoSuper(frutas);

	}


	private static void fazerSuco(List<Fruta> frutas){
		frutas.add(new Uva());
		frutas.add(new Maca());
		frutas.add(new Fruta());
	}

	private static void fazerSucoExtends(List<? extends Fruta> frutas){
		frutas.add(new Uva());
		frutas.add(new Maca());
		frutas.add(new Fruta());
	}

	private static void fazerSucoSuper(List<? super Maca> macas){
		//TIPO E SUBTIPOS
		macas.add(new MacaVerde());
		macas.add(new Maca());
		//IRMÃ
		macas.add(new Uva());
		//SUPERTIPOS
		macas.add(new Fruta());
		macas.add(new Object());
	}

}
