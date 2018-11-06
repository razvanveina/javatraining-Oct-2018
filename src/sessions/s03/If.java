package sessions.s03;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Nota: ");
		int nota = in.nextInt();
		evaluareStudent(nota);
		System.out.print("Nota a doua: ");
		int nota2 = in.nextInt();
		evaluareStudent(nota2);

		in.close();
	}

	private static void evaluareStudent(int nota) {
		if (nota > 10) {
			System.out.println("Nota invalida!");
		} else {
			if (nota == 10) {
				System.out.println("Excelent");
			} else if (nota == 9 || nota == 8) {
				System.out.println("Bine");
			} else if (nota >= 6) {
				System.out.println("Mediu");
			} else if (nota == 5) {
				System.out.println("Nesatisfacator");
			} else {
				System.out.println("Varza, frate");
			}
		}
	}
}
