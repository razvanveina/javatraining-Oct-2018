package sessions.s03;

public class For {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		for (int i = 0, j = 0; i < 10; i++, j++) {
			System.out.println(i);
		}

		int array[] = { 10, 5, 7, 0, 2, 1 };
		System.out.println(array[0]);
		System.out.println(array[1]);
		int x = array[0];

		System.out.println();
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				break;
			}
			System.out.println(i + "->" + array[i]);
		}

		// for each
		for (int element : array) {
			if (element == 0) {
				break;
			}
			System.out.println(element);
		}

	}
}
