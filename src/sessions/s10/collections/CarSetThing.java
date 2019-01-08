package sessions.s10.collections;

import java.util.HashSet;
import java.util.Set;

public class CarSetThing {
	public static void main(String[] args) {
		Set<Car> cars = new HashSet<Car>();
		cars.add(new Car("Dacia", "Logan"));
		cars.add(new Car("Subaru", "Imprezza"));
		cars.add(new Car("Ford", "Focus RS"));

		System.out.println(cars.toString());

		System.out.println(cars.contains(new Car("Dacia", "Logan")));

		System.out.println();
	}
}
