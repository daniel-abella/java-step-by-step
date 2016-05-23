package sobrescrita;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.rmi.server.ServerCloneException;

public class Filha extends Pai {

	//------------IGUAL
	@Override
	protected Number getNumber()
			throws IOException,
			FileNotFoundException,
			ServerCloneException
	{

		return null;
	}

	//----------- MODIFICADOR MAIS ABRANGENTE
//	@Override
//	public Number getNumber() throws IOException {
//
//		return null;
//	}

	//------------- RETORNA UMA SUBCLASSE
//	@Override
//	protected Integer getNumber() throws IOException {
//
//		return null;
//	}

	//-------------- A EXCEÇÃO É UMA SUBCLASSE
//	@Override
//	protected Number getNumber()
//			throws FileNotFoundException {
//
//		return null;
//	}

	//-------------- A EXCEÇÃO É UMA SUBCLASSE
//	@Override
//	protected Number getNumber()
//		throws IOException,
//		       FileNotFoundException,
//		       FileSystemException {
//
//		return null;
//	}

	//-------------- FILHA DE RUNTIMEEXCEPTION - NAO CHECADA
//	@Override
//	protected Number getNumber()
//			throws IOException,
//				RuntimeException {
//
//		return null;
//	}

	//-------------- FILHA DE ERROR - NAO CHECADA
//	@Override
//	protected Number getNumber() throws IOException, Error {
//
//		return null;
//	}

	//-------------- PODE LANÇAR MENOS EXCEÇÕES
//	@Override
//	protected Number getNumber() {
//
//		return null;
//	}

	@Override
	public int getInt()
		throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return super.getInt();
	}
//
//	@Override
//	public int getLong() {
//		// TODO Auto-generated method stub
//		return 0;
//	}


}
