package sessions.s06;

import java.util.Arrays;

public class EnumDemoWithEnum {
	public static void main(String[] args) {
		showDirection(Direction.UP);
		System.out.println(Arrays.toString(Direction.values()));
		System.out.println(Direction.valueOf("UP"));
		// System.out.println(Direction.valueOf("up"));
		System.out.println(Direction.UP.ordinal());
		System.out.println(Direction.LEFT.ordinal());
		System.out.println(Direction.RIGHT.ordinal());
		System.out.println(Direction.DOWN.ordinal());
		System.out.println(Direction.UP.name());

		for (int i = 0; i < 5; i++) {
			double random = Math.random();
			int nr = (int) (random * 4);
			Direction dir = Direction.values()[nr];
			showDirection(dir);
//			if (random < 0.25) {
//				nr = 0;
//			} else if (random < 0.5) {
//				nr = 1;
//			} // ...
		}
		System.out.println();
	}

	private static void showDirection(Direction dir) {
		System.out.println(dir.getMsg());
	}
}
