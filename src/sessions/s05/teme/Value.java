package sessions.s05.teme;

public class Value {
	private int nr;

	public Value(int nr) {
		this.nr = nr;
	}

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	@Override
	public void finalize() {
		System.out.println("Obiectul " + nr + " a fost sters.");
	}
}
