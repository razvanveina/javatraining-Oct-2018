package sessions.s09.exceptions;

public class WithExceptions {
	public static void main(String[] args) {
		int[] arr = { 5, 3, -2, 6, 7, 8, 4 };

		try {
			int result = next(arr, 4);
			System.out.println(result);
		} catch (RuntimeException ex) {
			System.out.println("Numar inexistent sau pe ultima pozitie");
		}

	}

	private static int next(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				if (i < arr.length - 1) {
					return arr[i + 1];
				} else {
					throw new RuntimeException();
				}

			}
		}
		throw new RuntimeException();
	}
}
