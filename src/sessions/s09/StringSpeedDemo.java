package sessions.s09;

public class StringSpeedDemo {
	public static void main(String[] args) {
		stringDemo();
		stringBuilderDemo();
	}

	private static void stringBuilderDemo() {
		long startTime = System.currentTimeMillis();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100000; i++) {
			sb.append(i);
		}

		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}

	private static void stringDemo() {
		long startTime = System.currentTimeMillis();

		String s = "";
		for (int i = 0; i < 100000; i++) {
			s += i;
		}

		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
}
