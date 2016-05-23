package exercicios;

import java.util.*;

public class WrappedString {

	private String s;

	public WrappedString(String s) {
		this.s = s;
	}

//	@Override
//	public boolean equals(Object obj) {
//		WrappedString outro = (WrappedString)obj;
//		return s.equals(outro.s);
//	}
//
//	@Override
//	public int hashCode() {
//		return s.hashCode();
//	}

	public static void main(String[] args) {
		HashSet<Object> hs = new HashSet<Object>();

		WrappedString ws1 = new WrappedString("aardvark");
		WrappedString ws2 = new WrappedString("aardvark");

		String s1 = new String("aardvark");
		String s2 = new String("aardvark");

		hs.add(ws1);
		hs.add(ws2);
		hs.add(s1);
		hs.add(s2);

		System.out.println(hs.size());

		for (Object object : hs) {
			System.out.println(object.getClass().getSimpleName());
		}
	}
}