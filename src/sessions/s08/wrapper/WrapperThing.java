package sessions.s08.wrapper;

public class WrapperThing {
	public static void main(String[] args) {
		int x = 5;
		Integer x1 = new Integer(7);

		int a = 7;
		int x2 = x1; // unboxing

		Integer x3 = x; // autoboxing
		System.out.println(x1.equals(x3));
		System.out.println(x1);

		x3 = null;
		// x = null;

		int conversion = Integer.parseInt("1231");
		System.out.println(conversion);
//		conversion = Integer.parseInt("1231z");
//		System.out.println(conversion);

		String s = Integer.toString(123);
		s = "" + 123;
		System.out.println(Integer.toHexString(1995));
		System.out.println(Integer.reverse(123456));
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);

		Double d;
		Character ch;
		Boolean b;

	}
}
