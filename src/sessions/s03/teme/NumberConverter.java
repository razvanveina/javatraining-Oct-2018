package sessions.s03.teme;

public class NumberConverter {
	// 1693 = 1 * 1000 + 6 * 100 + 9 * 10 + 3 * 1

	// 1
	// 10
	// 100
	// 1000
	// 10000
	public static void main(String[] args) {
		show10();
		int[] number = { 1, 6, 9, 3 };
		reverse(number);

		System.out.println(convert(number));
	}

	private static void reverse(int[] number) {

	}

	private static void show10() {
		int n = 1;
		for (int i = 1; i <= 5; i++) {
			System.out.println(n);
			n = n * 10;
		}
	}

	// 1693 = 1 * 1000 + 6 * 100 + 9 * 10 + 3 * 1
	private static int convert(int[] number) {
		int sum = 0;
		int valoareCifra = 1;
		for (int i = number.length - 1; i >= 0; i--) {
			int ceva = number[i] * valoareCifra;
			sum += ceva;
			valoareCifra *= 10;
		}
		return sum;
	}
}
