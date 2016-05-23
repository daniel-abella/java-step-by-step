package referencia;

public class Referecia {

	public static void main(String[] args) {

		Usuario usuarioOriginal = new Usuario("miguel.angelo");

		System.out.println("1 - "+usuarioOriginal);

		mudaReferenciaUsuario(usuarioOriginal);

		System.out.println("2 - "+usuarioOriginal);
	}

	private static void mudaReferenciaUsuario(Usuario usuarioParametro) {

		usuarioParametro = new Usuario("victor.hugo");

		System.out.println(usuarioParametro);

	}
}
