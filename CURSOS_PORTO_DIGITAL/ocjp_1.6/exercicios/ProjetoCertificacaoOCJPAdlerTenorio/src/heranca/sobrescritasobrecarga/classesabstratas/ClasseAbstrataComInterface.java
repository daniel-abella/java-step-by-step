package heranca.sobrescritasobrecarga.classesabstratas;

public class ClasseAbstrataComInterface {

	interface DoStuff2 {
		float getRange(int low, int high);
	}

	interface DoMore {
		float getAvg(int a, int b, int c);
	}
	
	interface DoAll extends DoMore {
		float getAvg(int a, int b, int c, int d);
	}


	abstract class DoAbstract implements DoStuff2, DoMore {
		
//		public float getRange(int x, int y) {
//			return 3.14f;
//		}
//		
//		public float getAvg(int a, int b, int c) {
//			return 111.1f;
//		}
		
		public abstract	float getRange(int low, int high);
		public abstract	float getAvg(int a, int b, int c);
	}
	

	class AAAA extends DoAbstract {

		@Override
		public float getRange(int low, int high) {
			return 0;
		}

		@Override
		public float getAvg(int a, int b, int c) {
			return 0;
		}
		
	}

	class DoStuff implements DoStuff2 {
		
		public float getRange(int x, int y) {
			return 3.14f;
		}
	}

}
