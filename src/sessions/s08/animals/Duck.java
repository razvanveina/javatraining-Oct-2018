package sessions.s08.animals;

public class Duck extends Animal implements OZN {

	@Override
	public void scoateUnSunet() {
		System.out.println("Mac-mac");
	}

	@Override
	public boolean detectabilDeRadar() {
		return false;
	}

}
