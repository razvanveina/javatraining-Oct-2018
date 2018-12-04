package sessions.s07.teme;

import java.util.Scanner;

public class CalculatorUI {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner in = new Scanner(System.in);

		while (true) {
			calc.display();
			String line = in.nextLine();
			// +10
			// -5
			// *100
			char operator = line.charAt(0);
			if (operator == 'x') {
				break;
			}

			int operand = Integer.parseInt(line.substring(1));

			switch (operator) {
			case '+':
				calc.add(operand);
				break;
			case '-':
				calc.substract(operand);
				break;
			case '*':
				calc.multiply(operand);
				break;
			default:
				System.out.println("Invalid input");
			}
		}

	}
}
