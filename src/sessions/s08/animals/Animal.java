package sessions.s08.animals;

public abstract class Animal {
	public String name;

	public void mananca() {

	}

	public void afiseazaMesaj() {
		System.out.print("Sunetul scos de acest animal este: ");
		scoateUnSunet();
	}

	public abstract void scoateUnSunet();

	public static void doSomething() {
		System.out.println(1);
	}
}
