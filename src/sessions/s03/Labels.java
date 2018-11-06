package sessions.s03;

public class Labels {
	public static void main(String[] args) {
		labelulMeu: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(i + " - " + j);
				if (j == 1) {
					break labelulMeu;
				}
			}
		}
	}
}
