package sessions.s01;

import java.util.Scanner;

public class SumNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Primul numar: ");
		int a = in.nextInt();
		System.out.print("Al doilea numar: ");
		int b = in.nextInt();
		System.out.println("Suma numerelor este: " + (a + b));
		in.close();
	}

}
