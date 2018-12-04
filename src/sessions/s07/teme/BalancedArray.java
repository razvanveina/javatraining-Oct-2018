package sessions.s07.teme;

public class BalancedArray {
	public static void main(String[] args) {
		int[] arr = { 5, 18, 4, 7, 7, 4 };
		Side side = computeBalance(arr);
		System.out.println(side);
	}

	private static Side computeBalance(int[] arr) {
		int leftSum = sum(arr, 0, arr.length / 2);
		int rightSum = sum(arr, arr.length / 2, arr.length);

		if (leftSum == rightSum) {
			return Side.MIDDLE;
		} else if (leftSum < rightSum) {
			return Side.RIGHT;
		} else {
			return Side.LEFT;
		}
	}

	private static int sum(int[] arr, int left, int right) {
		int sum = 0;
		for (int i = left; i < right; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
