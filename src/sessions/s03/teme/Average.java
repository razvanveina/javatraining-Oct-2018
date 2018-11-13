package sessions.s03.teme;

public class Average {
	public static void main(String[] args) {
		int[] numbers = { 7, 4, 9, 6, 23, 1, 0 };
		System.out.println(avg(numbers));
	}

	private static double avg(int[] numbers) {
		double sum = 0;

//		for (int i = 0; i < numbers.length; i++) {
//			sum += numbers[i];
//		}

		for (int nr : numbers) {
			sum += nr;
		}

		return sum / numbers.length;
	}
}
