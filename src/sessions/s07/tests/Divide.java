package sessions.s07.tests;

public class Divide {
	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		Divide divide = new Divide();
		System.out.println(divide.divide(a, b));

	}

	public int divide(int a, int b) {
		if (a == 0) {
			return -1;
		} else {
			return a / b;
		}

	}
}