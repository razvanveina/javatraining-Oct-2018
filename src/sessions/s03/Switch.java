package sessions.s03;

public class Switch {
	public static void main(String[] args) {
		int nota = 5;

		switch (nota) {
		case 10:
			System.out.println("Excelent");
			break;
		case 9:
		case 8:
			System.out.println("Bine");
			break;
		case 7:
		case 6:
			System.out.println("Mediu");
			break;
		default:
			System.out.println("Nota invalida");
		}
	}
}
