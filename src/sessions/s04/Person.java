package sessions.s04;

public class Person {
	int age;
//	char sex;
//	int height;
	String name;
	String cnp;

	// class constructor
	public Person(String cnp, String name, int age) {
		this.cnp = cnp;
		this.name = name;
		this.age = age;
	}

	public Person(String cnp, String name) {
		this.cnp = cnp;
		this.name = name;
		this.age = -1;
	}

	public void display() {
		System.out.println(this.cnp + " " + this.name + " " + this.age);
	}

}
