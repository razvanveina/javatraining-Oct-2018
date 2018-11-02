package sessions.s02;

public class Operatori {
	public static void main(String[] args) {
		int x = 0;
		int y = 10;
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(x);
		System.out.println(~x);

		boolean b = true;
		System.out.println(!b);

		System.out.println(x + y);
		System.out.println(x / y);
		System.out.println(x % y);
		System.out.println(5 % 2);

		System.out.println(x > y);
		System.out.println(x >= y);
		System.out.println(x == y);
		System.out.println(x != y);

		System.out.println(0b1010 & 0b1111); // 1010
		System.out.println(0b1010 | 0b1111); // 1111
		System.out.println(0b1010 ^ 0b1111); // 0101

		boolean b1 = true;
		boolean b2 = false;

		// de revenit la astea cand discutam de if
		// (operatori de scurtcircuitare)
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);

		x = 0;
		x += 5; // echivalent cu x = x + 5, dar preferata

		System.out.println(x);

		System.out.println(x > 10 ? "x mai mare ca 10" : "x mai mic ca 10");
	}
}
