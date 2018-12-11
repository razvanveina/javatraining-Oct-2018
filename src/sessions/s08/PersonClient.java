package sessions.s08;

public class PersonClient {
	public static void main(String[] args) {
		Person p1 = new Person("123", "Ion", "20");
		Person p2 = new Person("234", "Mircea", "20");
		Person p3 = new Person("123", "Gheo", "20");

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p2.equals(p3));
	}
}
