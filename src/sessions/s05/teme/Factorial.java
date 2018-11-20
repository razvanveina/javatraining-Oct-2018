package sessions.s05.teme;

public class Factorial {
	public static void main(String[] args) {
		// 5! + 6!
		System.out.println(factorial(5));
		factorial(6);
	}

	private static int factorial(int n) {
		int produs = 1;
		for (int i = 2; i <= n; i++) {
			produs *= i;
		}
		return produs;
	}
}
