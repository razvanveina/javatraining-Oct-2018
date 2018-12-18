package sessions.s09.exceptions;

public class NoExceptions2 {
	public static int errorCode = 0;

	public static void main(String[] args) {
		int[] arr = { 5, 3, -2, 6, 7, 8, 4 };
		int result = next(arr, 3);

		if (errorCode == -2) {
			System.out.println("Numar inexistent");
		} else if (errorCode == -1) {
			System.out.println("Numar pe ultima pozitie");
		} else {
			System.out.println(result);
		}
	}

	private static int next(int[] arr, int n) {
		errorCode = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				if (i < arr.length - 1) {
					return arr[i + 1];
				} else {
					errorCode = -1;
					return 0;
				}

			}
		}
		errorCode = -2;
		return 0;
	}
}
