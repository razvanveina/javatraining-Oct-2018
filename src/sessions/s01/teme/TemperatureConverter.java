package sessions.s01.teme;

import java.util.Scanner;

public class TemperatureConverter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Temperatura in Fahrenheit: ");
		int temperaturaF = in.nextInt();
		System.out.println("Temperatura in Celsius: " + (temperaturaF - 32) * 5 / 9);
		in.close();
	}
}
