package sessions.s03.teme;

public class Minim {
	public static void main(String[] args) {
		int[] numbers = { 7, 4, 9, 6, -23, 1, 0 };
		int[] arrayGol = {};
		System.out.println(min(numbers));
		System.out.println(min(arrayGol));
	}

	private static int min(int[] paramNumbers) {
		int min = paramNumbers[0];

		for (int element : paramNumbers) {
			if (min > element) {
				min = element;
			}
		}

		return min;
	}
}
