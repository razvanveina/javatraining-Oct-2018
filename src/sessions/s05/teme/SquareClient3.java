package sessions.s05.teme;

public class SquareClient3 {
	public static void main(String[] args) {
		Square s1 = new Square(7);

		System.out.println(s1.getArea());
		System.out.println(s1.getLength() * s1.getLength());

		// Square s2 = new Square(2);
		// Square s3 = new Square(3);

		// System.out.println(s2.getArea());
		// System.out.println(s3.getArea());
	}

}