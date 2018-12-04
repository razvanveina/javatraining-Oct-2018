package sessions.s07.tests;

public class Ex1 {
	public static void main(String[] args) {
		Ex1 e = new Ex1();
		System.out.println(e.division(8, 5));

	}

	public int division(int a, int b) {

		if (b == 0) {
			return -1;
		}

		return a / b;

	}
}