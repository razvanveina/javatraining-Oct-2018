package sessions.s06.teme;

import java.util.Arrays;

public class SortThing {
	public static void main(String[] args) {
		int[] arr1 = { 2, 4, 7, 8, 9 };
		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7 };

		int[] result = sort(arr1, arr2);
		System.out.println(Arrays.toString(result));
	}

	private static int[] sort(int[] arr1, int[] arr2) {
		int pos1 = 0;
		int pos2 = 0;
		int posResult = 0;
		int[] result = new int[arr1.length + arr2.length];

		while (true) {
			if (pos1 >= arr1.length) {
				result[posResult] = arr2[pos2];
				pos2++;
			} else if (pos2 >= arr2.length) {
				result[posResult] = arr1[pos1];
				pos1++;
			} else if (arr1[pos1] <= arr2[pos2]) {
				result[posResult] = arr1[pos1];
				pos1++;
			} else {
				result[posResult] = arr2[pos2];
				pos2++;
			}
			posResult++;
			if (posResult >= result.length) {
				break;
			}
		}

		return result;
	}
}
