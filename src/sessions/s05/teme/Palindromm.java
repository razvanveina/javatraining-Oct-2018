package sessions.s05.teme;

public class Palindromm {
	public static void main(String[] args) {
		// System.out.println(getReverse(123));
		System.out.println(isPalindrome(121));

	}

	private static boolean isPalindrome(final int number) {
		int reverse = getReverse(number);
		return number == reverse;
//		if (number == reverse) {
//			return true;
//		} else {
//			return false;
//		}
	}

	private static int getReverse(int number) {
		int reverse = 0;

		while (number > 0) {
			int digit = number % 10;
			reverse = reverse * 10 + digit;
			number /= 10;
		}

		return reverse;
	}

}