package heranca.exemplosinstanceof;


public class TesteInstanceof {

	public static void main(String[] args) {
		
		//  interface Fish
		//  class Perch implements Fish
		//  class Walleye extends Perch
		//  class Bluegill
	
		Fish fish = new Walleye();
		Walleye walleye = new Walleye();
		Bluegill bluegill = new Bluegill();
		
		if (fish instanceof Perch)
			System.out.println("f-p");
		
		if (walleye instanceof Fish)
			System.out.println("w-f");
		
		if (bluegill instanceof Fish)
			System.out.println("b-f");

	}

}
