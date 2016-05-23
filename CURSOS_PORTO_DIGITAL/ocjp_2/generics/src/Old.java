import java.util.LinkedList;
import java.util.List;

public class Old {
	public static Object get0(List list) {
		return list.get(0);
	}

	public static void main(String[] args) {
		Object o = Old.get0(new LinkedList());
		Object o1 = Old.get0(new LinkedList<?>());
		String s = Old.get0(new LinkedList<String>());
		Object o2 = Old.get0(new LinkedList<Object>());
		String s2 = (String)Old.get0(new LinkedList<String>());
	}
}