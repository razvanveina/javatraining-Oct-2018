package sessions.s07.tests;

public class Returneaza implements Division {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		Returneaza division = new Returneaza();
		System.out.println(division.metoda(a, b));
	}

	private int metoda(int a, int b) {

		if (b == 0) {
			return -1;
		} else {
		}
		return a / b;
	}

	@Override
	public String getAuthor() {
		return "Claudiu";
	}

	@Override
	public int divide(int a, int b) {
		if (b == 0) {
			return -1;
		} else {
		}
		return a / b;

	}
}