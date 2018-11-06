package sessions.s03;

public class While {
	public static void main(String[] args) {
		int x = 1;
		while (x <= 10) {
			x++;
			if (x % 2 == 0) { // daca x e par
				continue; // trece la urmatoarea iteratie
			}

			if (x % 3 == 0) {
				break; // incheie bucla
			}
			System.out.println(x);
		}

		x = 1;
		do {
			System.out.println(x);
			x++;
		} while (x <= 10);
	}
}
