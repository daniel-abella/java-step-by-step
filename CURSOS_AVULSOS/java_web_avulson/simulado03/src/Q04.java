import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q04 {

	public static void main(String... args) {

		Pattern p = Pattern.compile("a{1,3}b?c*");
		Matcher m = p.matcher("aac");
		boolean b = m.matches();
		System.out.println(b);

	}

}
