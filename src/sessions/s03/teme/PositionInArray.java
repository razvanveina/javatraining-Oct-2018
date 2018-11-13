package sessions.s03.teme;

public class PositionInArray {
	public static void main(String[] args) {
		int[] array = { 6, 8, 4 };
		System.out.println(positionInArray(array, 9));
	}

	private static int positionInArray(int[] paramArray, int nr) {
		// for (int element : array) {
		for (int position = 0; position < paramArray.length; position++) {
			if (paramArray[position] == nr) {
				return position;
			}
		}
		return -1;
	}
}
