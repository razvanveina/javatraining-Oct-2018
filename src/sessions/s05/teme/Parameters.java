package sessions.s05.teme;

public class Parameters {
	public static void main(String[] args) {
		Square s1 = new Square();

		int nr = 9;

		s1.doSomething(nr);

		System.out.println(nr);

		Value value = new Value(9);

		s1.doSomething(value);

		System.out.println(value.getNr());
	}
}
