package sessions.s03;

public class If2 {
	public static void main(String[] args) {
		int nota = 5;

		if (nota <= 10 || notaMaiMareCa5(nota)) {
			System.out.println("Nota e OK");
		}
	}

	private static boolean notaMaiMareCa5(int nota) {
		System.out.println("Mesaj");
		return nota >= 5;
	}
}
