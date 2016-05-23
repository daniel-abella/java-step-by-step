package anonimo.argumento;

public class Externa {

	abstract class Usuario{

		private String login;

		public String getLogin() {
			return "pai - "+login;
		}

		public void setLogin(String login) {
			this.login = login;
		}
	}

	public long fazAlgo(){

		long codigo = realizaAuditoria(

			new Auditavel() {
				public long getCodigoAuditoria() {
					return System.currentTimeMillis();
				}

				class MaisInternaAinda{
					class MaisMaisInternaAinda{

					}
				}
			},

			new Usuario() {
				public String getLogin() {
					return "filho - "+super.getLogin();
				}
			}

		);

		return codigo;
	}

	private long realizaAuditoria(Auditavel auditavel,
			                      Usuario usuario){

		System.out.println(usuario.getLogin());

		return auditavel.getCodigoAuditoria();
	}
}
