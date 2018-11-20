package sessions.s05.teme;

public class Square {
	private int length;

	public Square(int length) {
		this.length = length;
	}

	public Square() {
		this.length = 10;
	}

	public int getArea() {
		return length * length;
	}

	public int getLength() {
		return length;
	}

	public void doSomething(int nr) {
		nr = 20;
	}

	public void doSomething(Value value) {
		value = new Value(20);
		value.setNr(20);
	}

}