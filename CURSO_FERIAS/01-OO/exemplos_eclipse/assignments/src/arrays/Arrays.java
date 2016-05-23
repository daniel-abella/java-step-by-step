package arrays;

public class Arrays {

	
	
	public static void main(String[] args) {

		int[] i = new int[]{1,2,3};

		for (int j = 0; j < i.length; j++) {
			int j2 = i[j];
			System.out.println(j2);
		}

		int[] a  = new int[3];

		for (int j = 0; j < a.length; j++) {
			a[j] = j+1;
		}


	}

}
