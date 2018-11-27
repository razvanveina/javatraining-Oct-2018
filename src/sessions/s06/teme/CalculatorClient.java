package sessions.s06.teme;

public class CalculatorClient {
	public static void main(String[] args) {
		CalculatorClient client = new CalculatorClient();
		client.run();
	}

	@SuppressWarnings("unused")
	private void run() {
		Calculator c1 = new Calculator();
		Calculator c2 = new Calculator(5);
		Calculator c3 = new Calculator();
		// Calculator.doSomething();
		// c1.doSomething();
		System.out.println(Calculator.instances);
	}
}
// vlad 06
// george 10
// emil 05
// clau 15
// alexandra 05 
// andrea 00