package real;

import java.io.Serializable;
import java.util.Date;

public class Exemplo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Exemplo main = new Exemplo();
		Processo<Date,Serializable> processo =
				new Processo<Date,Serializable>();

		Usuario usuario = new Usuario();

		 processo = main.salvar(processo, usuario);

	}


	public <Y extends Date,
	        Z extends Serializable,
	        T extends Auditavel<Y,Z>,
	        D extends Usuario> T salvar(T entidade,
			                             D usuario){



		return entidade;
	}





}
