package sessions.s03.teme;

public class ParImpar {
	public static void main(String[] args) {
		System.out.println(isOdd(5));
		System.out.println(isOdd(2));
	}

	private static boolean isOdd(int nr) {
//		if (nr % 2 == 1) {
//			return true;
//		} else {
//			return false;
//		}
		return nr % 2 == 1;
	}
}
