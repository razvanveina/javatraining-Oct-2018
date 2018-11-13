package sessions.s03.teme;

public class Negatives {
	public static void main(String[] args) {
		int[] array = new int[] { 5, -7, 3, -5, 8 };
		System.out.println(countNegatives(array));
	}

	private static int countNegatives(int[] param) {
		int counter = 0;

		for (int nr : param) {
			if (nr < 0) {
				counter++;
			}
		}

		return counter;
	}
}
