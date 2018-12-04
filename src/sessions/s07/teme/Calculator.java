package sessions.s07.teme;

public class Calculator {
	public static final int INITIAL_VALUE = 0;

	private int currentValue;

	public Calculator(int currentValue) {
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

}