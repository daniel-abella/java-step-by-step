package exception.herancaexception;

public class CatchsException {

	public static void main(String[] args) {

		try {
			int valorConvertido = Integer.parseInt("dasdsa");

		} catch (NumberFormatException e) {
			System.out.println("Lan�ou NumberFormatException");

		} catch (IllegalArgumentException e) {
			System.out.println("Lan�ou IllegalArgumentException");

		} catch (Exception e) {
			System.out.println("Lan�ou Exception");
		}

		// System.out.println(valorConvertido); // Erro de compila��o pois a vari�vel n�o � "exergada"

	}
}
