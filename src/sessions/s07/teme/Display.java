package sessions.s07.teme;

public class Display {
	String[][] data = { { //
			" __ ", //
			"|  |", //
			"|__|" },
			{ //
					"    ", //
					"   |", //
					"   |" }, //
			{ //
					" __ ", //
					" __|", //
					"|__ " }, //
	};

	public static void main(String[] args) {
//		char ch = '0';
//		System.out.println((byte) ch);
//		ch++;
//		ch = (char) (ch + 1);
//		System.out.println((byte) ch);

		Display display = new Display();
		display.showNumber(1212012);
	}

	// 120
	private void showNumber(int n) {
		String s = "" + n;

		for (int slice = 0; slice < 3; slice++) {
			for (char ch : s.toCharArray()) {
				int digit = ch - 48;
				System.out.print(data[digit][slice]);
			}
			System.out.println();
		}
	}

}
