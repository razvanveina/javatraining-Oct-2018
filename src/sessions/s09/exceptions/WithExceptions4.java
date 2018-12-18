package sessions.s09.exceptions;

public class WithExceptions4 {
	public static void main(String[] args) {
		int[] arr = { 5, 3, -2, 6, 7, 8, 4 };

		try {
			int result;
			result = next(arr, 14);
			System.out.println(result);
		} catch (LastPositionException e) {
			System.out.println(e.getMessage());
		} catch (NumberNotFoundException e) {
			System.out.println(e.getStackTrace()[0]);
			System.out.println(e.getStackTrace()[1]);
			System.out.println(e.getMessage());
		}

	}

	private static int next(int[] arr, int n) throws LastPositionException {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				if (i < arr.length - 1) {
					return arr[i + 1];
				} else {
					throw new LastPositionException();
				}
			}
		}

		throw new NumberNotFoundException();
	}
}
