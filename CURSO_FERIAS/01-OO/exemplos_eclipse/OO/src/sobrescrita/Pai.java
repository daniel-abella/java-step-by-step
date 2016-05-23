package sobrescrita;

import java.io.IOException;

public class Pai {

	protected Number getNumber()
			throws IOException, CloneNotSupportedException{
		return null;
	}

	public int getInt()
		throws
		NullPointerException{
		return 0;
	}

	public long getLong(){
		return 0;
	}
}
