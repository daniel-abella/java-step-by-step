import excecao.MinhaExcecao;
import modelo.Modelo;


public class Principal {

	public static void main(String[] args) throws MinhaExcecao {

		Modelo modelo = new Modelo();

		try {
			modelo.fazAlgo();
			System.out.println("SUCESSO");
		} catch (MinhaExcecao e) {
			System.out.println("ERRO");
			e.printStackTrace();
		}finally{
			System.out.println("TERMINOU");
		}

		System.out.println("FORA DO TRY");



	}

}
