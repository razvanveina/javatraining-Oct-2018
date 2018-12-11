package sessions.s08.pck;

import sessions.s08.SubClasa;
import sessions.s08.SuperClasa;

public class TestClient {
	public static void main(String[] args) {
		SubClasa x = new SubClasa();
		System.out.println(x.var);
		x.doSomethingSpecial();

		SuperClasa y = new SubClasa();

	}
}
