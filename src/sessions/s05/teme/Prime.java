package sessions.s05.teme;

public class Prime {
	public static void main(String[] args) {
		System.out.printf("Numarul %d este prim? %b ", 7, isPrime(7));
	}

	private static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
