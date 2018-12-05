package sessions.s07.tests;

public class Divide implements Division {
	public static void main(String[] args) {
		int a = 0;
		int b = 3;
		Divide divide = new Divide();
		System.out.println(divide.divide(a, b));

	}

	@Override
	public String getAuthor() {

		return "Vlad";
	}

	@Override
	public int divide(int a, int b) {
		if (b == 0) {
			return -1;
		} else {
			return a / b;
		}
	}
}