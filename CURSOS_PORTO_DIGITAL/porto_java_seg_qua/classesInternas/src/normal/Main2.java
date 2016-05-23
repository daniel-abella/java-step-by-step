package normal;

import normal.Externa.Interna;
import normal.Externa.Interna.SubInterna;

public class Main2 {

	public static void main(String[] args) {

		Externa externa = new Externa();
		Externa.Interna interna = externa.new Interna();

		Externa.Interna interna2 = new Externa().new Interna();


		Externa.Interna.SubInterna subinterna =
				new Externa().
				new Interna().
				new SubInterna();
	}
}
