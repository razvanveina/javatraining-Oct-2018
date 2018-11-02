package sessions.s02;

public class Primitive {

	public static void main(String[] args) {

		byte variabilaPe8Biti = 1_0_0;
		short variabilaPe16Biti = 100;
		int variabilaPe32Biti = 100;
		long variabilaPe64Biti = 100;

		int x = variabilaPe32Biti - variabilaPe16Biti;

		char caracter = 'A';
		char caracter2 = (char) (caracter + 1);
		System.out.println(caracter2);
		char caracter3 = 65;
		System.out.println(caracter3);

		byte b = (byte) variabilaPe64Biti;

		float f = 20.5f;
		double d = 20.5;

		boolean bool = true;
		boolean bool2 = false;

		String s = "abc\u0108";
		s = s + "d";
		System.out.println(s);

		byte b1 = 0b01010101;
		System.out.println(b1);

		String s2 = "\"  \n  \'\\";
		System.out.println(s2);

		String s3 = null;
	}
}
