package sessions.s03;

import java.util.Scanner;

public class Blocuri {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Numar: ");
		int nr = in.nextInt();

		if (nr % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}

		in.close();
	}
}
