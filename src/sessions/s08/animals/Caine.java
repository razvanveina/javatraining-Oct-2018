package sessions.s08.animals;

import sessions.s08.Person;

public class Caine extends Mamifer /* implements Runnable, Serializable */ {
	public String name;
	public Person stapan;

	public void latra() {

	}

	@Override
	public void scoateUnSunet() {
		// var 2: super.afiseazaMesaj()
		System.out.println("Ham");
		// super.scoateUnSunet();
	}

	public static void doSomething() {
		System.out.println(2);
	}

	@Override
	public String toString() {
		return "acesta este un catzelush";
	}
}
