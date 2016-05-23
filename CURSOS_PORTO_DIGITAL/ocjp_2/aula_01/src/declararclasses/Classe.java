package declararclasses;

class Classe0 {

	public static void main(String... args){

		fazAlgo();
		fazAlgo("aaaaaaaaaaaaaa");
		fazAlgo("aaaaaaaaaaaaaa","bbbbbbbbbbbbbbbbbbbbbbbb");
	}

	private static void fazAlgo(final String... args) {


		int um = 1;
		int[] varios = {1, 2,3,4,5,6,7,8,9};
		args[0] = "1";


		for (int i = 0; i < args.length; i++) {
			String string = args[i];

			if(string == null){
				continue;
			}

			System.out.println(string);
		}

		System.out.println(i);
	}

}
