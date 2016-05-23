package sobrecarga;

public class ClasseFilha extends Classe {


	public void println(Integer doubl) throws Exception{

		if(doubl == null){
			println("null");
		}else{
			println(doubl.toString());
		}
	}

	public void println(Double doubl) throws Exception{

		if(doubl == null){
			println("null");
		}else{
			println(doubl.toString());
		}
	}
}
