package sessions.s05.teme;

public class SquareClient {
	public static void main(String[] args) {
		Square s1 = new Square(7);
		Square s2 = new Square();

		System.out.println("Aria unui patrat cu latura " //
				+ s1.getLength() + " este " + s1.getArea());

		System.out.println("Aria unui patrat cu latura " //
				+ s2.getLength() + " este " + s2.getArea());
		// System.out.println(s1.length * s1.length);

		// Square s2 = new Square(2);
		// Square s3 = new Square(3);

		// System.out.println(s2.getArea());
		// System.out.println(s3.getArea());
	}

}