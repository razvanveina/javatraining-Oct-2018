package sessions.s01.teme;

import java.util.Scanner;

public class ConvertorValutar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Cursul EUR: ");
		double curs = in.nextDouble();
		System.out.print("Suma EUR: ");
		double suma = in.nextDouble();
		double sumaInRon = curs * suma;
		System.out.println("Suma in RON: " + sumaInRon);
		in.close();
	}
}
