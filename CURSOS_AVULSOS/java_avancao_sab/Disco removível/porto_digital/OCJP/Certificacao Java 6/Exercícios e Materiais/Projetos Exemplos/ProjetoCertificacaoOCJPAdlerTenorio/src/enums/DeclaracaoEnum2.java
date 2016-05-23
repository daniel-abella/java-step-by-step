package enums;

public enum DeclaracaoEnum2 {

	
	MR("Mr."), MRS("Mrs."), MS("Ms.");
	
	private final String title;
	
	private DeclaracaoEnum2(String t) { title = t; }
	
	public String format(String last, String first) {
		return title + " " + first + " " + last;
	}
}
