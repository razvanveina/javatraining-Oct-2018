package sessions.s08;

public class SubClasa extends SuperClasa {

	public SubClasa() {
		super(0);
	}

	@Override
	public void test() {
		System.out.println(var);
		super.test();
	}

	public void doSomethingSpecial() {

	}
}