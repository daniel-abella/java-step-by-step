package exception.herancaexception;

public class CatchsException {

	public static void main(String[] args) {

		try {
			int valorConvertido = Integer.parseInt("dasdsa");

		} catch (NumberFormatException e) {
			System.out.println("Lançou NumberFormatException");

		} catch (IllegalArgumentException e) {
			System.out.println("Lançou IllegalArgumentException");

		} catch (Exception e) {
			System.out.println("Lançou Exception");
		}

		// System.out.println(valorConvertido); // Erro de compilação pois a variável não é "exergada"

	}
}
