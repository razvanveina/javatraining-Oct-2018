package sessions.s07.tests;

public class CMMDC {
	public static void main(String[] args) {
		System.out.println(cmmdc(10, 54));
		System.out.println(cmmdc2(10, 54));
		System.out.println(cmmdc3(10, 54));
	}

	private static int cmmdc(int a, int b) {
		if (a % b == 0) {
			return b;
		} else {
			return cmmdc(b, b % a);

		}
	}

	private static int cmmdc2(int a, int b) {
		while (a != 0 && b != 0) {
			if (a >= b)
				a = a - b;
			else
				b = b - a;
		}
		return a;
	}

	private static int cmmdc3(int a, int b) {
		while (a != b) {
			if (a > b)
				a = a - b;
			if (a < b)
				b = b - a;
		}
		return a;
	}

}
