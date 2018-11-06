package sessions.s03;

public class SwitchTema {
	public static void main(String[] args) {
		// ian, martie, mai, iul, aug, oct, dec 31
		// feb 28
		// apr, iun, sep, nov 30

		for (int luna = 1; luna <= 12; luna++) {
//			System.out.print(luna);
//			System.out.print(" - ");
//			afiseazaLuna(luna);
			System.out.println(luna + " - " + getDaysOfMonth(luna));
		}

		for (int luna = 1; luna <= 12; luna++) {

		}
	}

	// 1 - 31
	// 2 - 28
	// 3 - 31
	// 4 - 30
	// ...

	private static int getDaysOfMonth(int luna) {
		switch (luna) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			return 28;
		}
		return -1;
	}
}
