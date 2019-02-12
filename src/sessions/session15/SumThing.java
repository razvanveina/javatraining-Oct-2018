package sessions.session15;

import java.util.ArrayList;
import java.util.List;

public class SumThing {
	public static void main(String[] args) {
		countSums(new int[] { 1, 2, 3, 4, 5, 6, 8, 9 }, 10);
	}

	static List<Integer> solution = new ArrayList<>();

	private static void countSums(int[] arr, int n) {
		if (n == 0) {
			System.out.println(solution);
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			solution.add(arr[i]);

			countSums(extractPosition(arr, i), n - arr[i]);

			solution.remove(solution.size() - 1);
		}
	}

	private static int[] extractPosition(int[] arr, int pos) {
		int[] result = new int[arr.length - 1 - pos];
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i > pos) {
				result[counter] = arr[i];
				counter++;
			}
		}
		return result;
	}
}
