package heranca.sobrescritasobrecarga.metodoscomexceptions;

public class ClassePai {
	
	
	static void imprimir() { // Não se pode sobrescrever métodos estáticos
		System.out.println("Imprimir classa A");
	}
	
	
	protected int retornarZero() {
		return 0;
	}
	
	protected int retornarDez() throws Exception {
		return 10;
	}
	
	public int retornarVinte()  throws Exception {
		return 20;
	}
	
	public int retornarTrinta()  throws SobrecargaException {
		return 30;
	}
	
	public int retornarQuarenta()  {
		return 40;
	}
	
	public int retornarCinquenta() {
		return 50;
	}
	
	public int retornarSesssenta()  throws Exception {
		return 60;
	}
}
