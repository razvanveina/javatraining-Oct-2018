package sessions.s05.teme;

public class ValueClient {
	public static void main(String[] args) {
		for (int i = 0; i < 10000000; i++) {
			new Value(i);
		}
	}
}
