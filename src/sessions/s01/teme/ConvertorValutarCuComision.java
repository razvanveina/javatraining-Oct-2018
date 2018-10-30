package sessions.s01.teme;

import java.util.Scanner;

public class ConvertorValutarCuComision {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Cursul EUR: ");
		double curs = in.nextDouble();
		System.out.print("Suma EUR: ");
		double suma = in.nextDouble();
		System.out.print("Comision: ");
		double comision = in.nextDouble();
		double sumaRon = curs * suma;
		double valoareComision = sumaRon * (comision / 100);
		double sumaMinusComision = (sumaRon - valoareComision);
		System.out.println("Suma in RON: " + sumaMinusComision);
		System.out.println("Comision: " + valoareComision);
		in.close();
	}
}
