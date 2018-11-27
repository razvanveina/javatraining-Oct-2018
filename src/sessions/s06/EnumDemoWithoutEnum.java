package sessions.s06;

public class EnumDemoWithoutEnum {
	public static void main(String[] args) {
		showDirection(7);
		for (int i = 0; i < 5; i++) {
			double random = Math.random();
			// System.out.println(random * 4);
			int nr = (int) (random * 4);
			// System.out.println(nr);

			showDirection(nr);
//			if (random < 0.25) {
//				nr = 0;
//			} else if (random < 0.5) {
//				nr = 1;
//			} // ...
		}
		System.out.println();
	}

	private static void showDirection(int nr) {
		switch (nr) {
		case 0:
			System.out.println("UP");
			break;
		case 1:
			System.out.println("DOWN");
			break;
		case 2:
			System.out.println("LEFT");
			break;
		case 3:
			System.out.println("RIGHT");
			break;
		}
	}
}
