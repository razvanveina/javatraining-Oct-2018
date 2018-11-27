package sessions.s06;

import sessions.s06.teme.Calculator;

public class ReturnThing {
	public static void main(String[] args) {
		m1();
		Calculator c = m2();
		c.display(); // NPE
		// c.currentValue = 0;
	}

	@SuppressWarnings("unused")
	private static Calculator m2() {
		Calculator calc = new Calculator(0);
		// return calc;
		return null;
	}

	private static int m1() {
		if (true) {
			return 0;
		}

		System.out.println();
		return 1;
	}
}
