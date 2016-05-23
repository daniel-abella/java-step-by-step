
public class UsuarioWrapper implements Usuario {

	private UsuarioImpl usuarioImpl;

	@Override
	public String getNome() {

		//LOGAR A CHAMADA
		return usuarioImpl.getNome();
	}

	@Override
	public int getIdade() {

		//LOGAR A CHAMADA
		return usuarioImpl.getIdade();
	}

}
