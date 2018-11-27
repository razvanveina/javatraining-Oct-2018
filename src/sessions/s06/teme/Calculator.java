package sessions.s06.teme;

public class Calculator {
	public static final int INITIAL_VALUE = 0;
	public static final int ZILE_LUCRATOARE = 5;
	public static final double PI = 3.1415;

	private int currentValue;
	public static int instances = 0;

	static {
		System.out.println("Am apelat un bloc static");
	}

	{
		System.out.println("Am apelat un bloc nestatic");
	}

	public Calculator(int currentValue) {
		instances++;
		this.currentValue = currentValue;
	}

	public Calculator() {
		this(INITIAL_VALUE);
	}

	public void add(int enteredValue) {
		currentValue += enteredValue;

	}

	public void substract(int enteredValue) {
		currentValue -= enteredValue;
	}

	public void multiply(int enteredValue) {
		currentValue *= enteredValue;
	}

	public void display() {
		System.out.println(currentValue);
	}

	@Deprecated
	public static void doSomething() {
		// System.out.println(currentValue);
	}

	static {
		System.out.println("Am apelat un bloc static 2");
		int x = 0;
		x = --x + --x;
		System.out.println(x);
	}
}