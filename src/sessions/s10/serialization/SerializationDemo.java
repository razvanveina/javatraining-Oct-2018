package sessions.s10.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import sessions.s10.collections.Car;

public class SerializationDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//		List<Car> cars = new ArrayList<Car>();
//		cars.add(new Car("Dacia", "Logan"));
//		cars.add(new Car("Subaru", "Imprezza"));
//		cars.add(new Car("Ford", "Focus RS"));
//
//		saveDatabase(cars);

		List<Car> cars2 = readDatabase();

		System.out.println(cars2);
	}

	private static List<Car> readDatabase() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.ser"));
		List<Car> result = (List<Car>) ois.readObject();
		ois.close();
		return result;
	}

	private static void saveDatabase(List<Car> cars) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("data.ser")));
		oos.writeObject(cars);
		oos.close();
	}

}
