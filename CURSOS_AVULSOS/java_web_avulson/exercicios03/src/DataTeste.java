import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DataTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SimpleDateFormat format =
				new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		File file = new File("C:\\Users\\gallindo\\Downloads\\PRINT.PNG");


		System.out.println(file.getName());
		System.out.println(file.length()/1024);
		Date date = new Date(file.lastModified());
		System.out.println(format.format(date));
	}

}
