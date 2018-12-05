package sessions.s07.tests;

public class Test2 {
	public static void main(String[] args) {
		int[] x = { 1 };

		Division[] implementations = { new Divide(), new Ex1(), new Returneaza() };

		for (Division classUndertest : implementations) {
			classUndertest.myMethod();
			System.out.println(classUndertest.getAuthor());
			if (classUndertest.divide(10, 5) == 2) {
				System.out.println("SUCCESS");
			} else {
				System.out.println("FAIL");
			}

			if (classUndertest.divide(10, 0) == -1) {
				System.out.println("SUCCESS");
			} else {
				System.out.println("FAIL");
			}
		}
	}
}
