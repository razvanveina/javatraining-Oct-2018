package sessions.s07.tests;

public interface Division {
	public String getAuthor();

	public int divide(int a, int b);

	default void myMethod() {
		System.out.println("werwer");
	}

	static void method() {
		System.out.println();
	}
}
