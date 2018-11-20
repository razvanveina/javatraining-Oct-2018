package sessions.s05.teme;

import java.util.Arrays;

public class Tema6S4 {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };

		int[] result = reverseArray2(arr);
		System.out.println(Arrays.toString(result));

	}

	private static int[] reverseArray(int[] arr) {
		int backArray[] = new int[arr.length];

		for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
//			int num = arr[i];
//			backArray[j] = num;
			backArray[j] = arr[i];
		}

		return backArray;
	}

	private static int[] reverseArray2(int[] arr) {
		int backArray[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int j = arr.length - (i + 1);
			backArray[j] = arr[i];
		}

		return backArray;
	}
}