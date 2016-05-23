package enums;



public class TesteEnum {

	public int x = 1;
	
	public enum MyColor {

		RED(0xff0000), GREEN(0x00ff00), BLUE(0x0000ff);
	
		private final int rgb;

		MyColor(int rgb) {
			this.rgb = rgb;
		}

		public int getRGB() {
			return rgb;
		}
	};
	
	public static void main(String[] args) {
		//MyColor enumColor = new MyColor(1); // Não é possível instanciar um enum
		
	
	}
}
