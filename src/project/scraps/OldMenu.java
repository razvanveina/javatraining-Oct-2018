package project.scraps;

import java.util.Scanner;

public class OldMenu {
	Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		OldMenu menu = new OldMenu();
		menu.run();
	}

	private void run() {
		while (true) {
			showMenu();
			String option = keyboard.nextLine();
			switch (option) {
			case "1":
				apeleazaMeniuCitiri();
				break;
			case "2":
				apeleazaMeniuCitiri();
				break;
			case "3":
				apeleazaMeniuCitiri();
				break;
			case "0":
				return;
			}
		}
	}

	private void apeleazaMeniuCitiri() {
		while (true) {
			showMenuCitiri();
			String option = keyboard.nextLine();
			switch (option) {
			case "1":
				// apeleazaMeniuCitiri();
				break;
			case "2":
				// apeleazaMeniuCitiri();
				break;
			case "3":
				// apeleazaMeniuCitiri();
				break;
			case "0":
				return;
			}
		}
	}

	private void showMenuCitiri() {
		System.out.println("1. Adaugare");
		System.out.println("2. Editare");
		System.out.println("3. Stergere");
		System.out.println("0. Inapoi");
		System.out.print("Introduceti optiunea: ");
	}

	private void showMenu() {
		System.out.println("1. Citiri");
		System.out.println("2. Statistici");
		System.out.println("3. Export");
		System.out.println("0. Iesire");
		System.out.print("Introduceti optiunea: ");
	}
}
