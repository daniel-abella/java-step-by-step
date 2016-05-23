package sobrecarga;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ClasseFilha classeFilha = new ClasseFilha();
		classeFilha.println(8.4);


		Classe classeFilhaDisfarcada = new ClasseFilha();
		classeFilhaDisfarcada.println(8.4);
	}

}
