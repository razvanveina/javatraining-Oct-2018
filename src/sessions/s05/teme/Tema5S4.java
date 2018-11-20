package sessions.s05.teme;

public class Tema5S4 {
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 6, 5 };
		int num = 5;
		System.out.println(findNumber(array, num));
	}

	private static int findNumber(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				if (i == array.length - 1) {
					return -2;
				} else {
					return array[i + 1];
				}
			}
		}
		return -1;
	}
}