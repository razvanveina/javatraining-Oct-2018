package sessions.s04;

public class PersonClient {
	public static void main(String[] args) {
		Person p1 = new Person("123", "Vlad", 30);
		Person p2 = new Person("234", "Andrea");

		p1.cnp = "123456";
		p1.name = "Vlad";

		System.out.println(p1.name);
		System.out.println(p2.name);

		Person p3 = null;
		System.out.println(p3);
		p3 = p1;
		System.out.println(p3.name);
		p3.name = "Ion";
		System.out.println(p1.name);

		p1.display();
		p2.display();
		p3.display();

	}
}
