package sessions.s03.teme;

public class Product {
	public static void main(String[] args) {
		int[] numbers = { 7, 4, 9, 6, 23, 1, 0 };
		System.out.println(product(numbers));
	}

	private static int product(int[] numbers) {
		int product = 1;
		for (int nr : numbers) {
			if (nr != 0) {
				product *= nr;
			}
		}
		return product;
	}
}
