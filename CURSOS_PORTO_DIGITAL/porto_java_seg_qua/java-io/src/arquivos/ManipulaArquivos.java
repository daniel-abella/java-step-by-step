package arquivos;

import java.io.File;
import java.io.IOException;

public class ManipulaArquivos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


	}

	public static boolean criar(String path) throws IOException{

		File file = new File(path);

		return file.createNewFile();
	}

	public static boolean deletar(String path) {

		File file = new File(path);

		return file.delete();
	}

	public static boolean existe(String path) {

		File file = new File(path);

		return file.exists();
	}

	public static boolean ehDiretorio(String path) {

		File file = new File(path);

		return file.isDirectory();
	}

	public static boolean ehArquivo(String path) {

		File file = new File(path);

		return file.isFile();
	}

	public static boolean criarDiretorio(String path) {

		File file = new File(path);

		return file.mkdir();
	}


	public static boolean renomearPara(String path, String pathDestino) {

		File arquivoOriginal = new File(path);

		File arquivoDestino = new File(pathDestino);

		return arquivoOriginal.renameTo(arquivoDestino);
	}

	public String[] listar(String path) {

		File file = new File(path);

		return file.list();
	}
}
