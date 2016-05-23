package normal;

public class Externa {

	private String privado;

	public void instancia(){
		Interna interna = new Interna();
	}


	public class Interna{

		String atributo = "";

		Interna(){
			privado = "aaaaaaaaaaaaaaa";
			Externa.this.privado = "aaaaaaaaaaaaaaaa";


		}

		class SubInterna{

			SubInterna(){
				Externa.Interna.this.atributo = "aaaaaa";
			}
		}
	}
}
