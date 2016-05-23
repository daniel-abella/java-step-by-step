
public class TestaSalarios {

	/**
	 * @param args
	 * @throws NumeroInvalidoException
	 */
	public static void main(String[] args){

		/*
		 * TRATAR
		 */
		try {
			validarSalario(2000);
		} catch (NumeroInvalidoException e) {
			e.printStackTrace();
		}

		try {
			validarSalario(2000);
		}
//		catch (NumeroInvalidoException e) {
//			e.printStackTrace();
//		}
		finally{
			System.out.println("Sempre serei executado");
		}

		try {
			validarSalario(2000);
		}
		catch (NumeroInvalidoException e) {
			throw e;
		}
		finally{
			System.out.println("Sempre serei executado");
		}

		System.out.println("Fim");
	}

	/**
	 * DECLARAR
	 *
	 * @param salario
	 * @throws NumeroInvalidoException
	 */
	public static void validarSalario(double salario) throws NumeroInvalidoException{

		if(salario > 1200){

			String geraNullPointer = null;
			System.out.println(geraNullPointer.charAt(0));

			/*
			 * Lança
			 */
			throw new NumeroInvalidoException("Não dá! Você precisa se qualificar mais.");
		}
	}

}
