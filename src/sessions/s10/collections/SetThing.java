package sessions.s10.collections;

import java.util.HashSet;
import java.util.Set;

public class SetThing {
	public static void main(String[] args) {
		Set<String> strings = new HashSet<String>();
		strings.add("qwe");
		strings.add("asd");
		strings.add("zxc");
		strings.add("zxc");

		System.out.println(strings.toString());
	}
}
