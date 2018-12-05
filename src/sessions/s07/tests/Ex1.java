package sessions.s07.tests;

public class Ex1 implements Division {
	public static void main(String[] args) {
		Ex1 e = new Ex1();
		System.out.println(e.divide(8, 5));

	}

	@Override
	public int divide(int a, int b) {

		if (b == 0) {
			return -1;
		}

		return a / b;

	}

	@Override
	public String getAuthor() {
		return "Andrea";
	}

}