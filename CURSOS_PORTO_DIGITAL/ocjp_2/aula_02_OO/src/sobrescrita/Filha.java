package sobrescrita;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Filha extends Pai {

	//------------IGUAL
//	@Override
//	protected Number getNumber() throws IOException {
//
//		return null;
//	}

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
//	protected Number getNumber() throws FileNotFoundException {
//
//		return null;
//	}

	//-------------- A EXCEÇÃO É UMA SUBCLASSE
//	@Override
//	protected Number getNumber() throws IOException, FileNotFoundException {
//
//		return null;
//	}

	//-------------- FILHA DE RUNTIMEEXCEPTION - NAO CHECADA
//	@Override
//	protected Number getNumber() throws IOException, RuntimeException {
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
	protected Number getNumber() {

		return null;
	}

//	@Override
//	public long getInt() {
//		// TODO Auto-generated method stub
//		return super.getInt();
//	}
//
//	@Override
//	public int getLong() {
//		// TODO Auto-generated method stub
//		return 0;
//	}


}
