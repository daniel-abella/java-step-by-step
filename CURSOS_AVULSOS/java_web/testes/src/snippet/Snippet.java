package snippet;

public class Snippet {
public static void main(String[] args) {
	String test = "This is a test";
	String[] tokens = test.split("[AEIOU]");
	System.out.println(tokens[0]);
	System.out.println(tokens.length);
}
}

