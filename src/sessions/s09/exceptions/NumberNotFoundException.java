package sessions.s09.exceptions;

public class NumberNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NumberNotFoundException() {
		super("Numar inexistent");
	}
}
