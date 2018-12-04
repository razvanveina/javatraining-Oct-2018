package sessions.s07.shapes;

// o metoda care primeste ca parametru 2 numere intregi a si b si returneaza
// a/b iar daca b = 0 returneaza -1

public class ShapeClient {
	public static void main(String[] args) {
		// Rectangle[] arr = { new Square(), new Rectangle() };
		// Square[] arr2 = { new Square(), new Rectangle() };
		Shape[] arr3 = { new Square(), new Rectangle() };
		for (Shape shape : arr3) {
			shape.draw();
		}
	}
}
