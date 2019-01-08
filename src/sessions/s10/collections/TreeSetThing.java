package sessions.s10.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetThing {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		set.add("ertdfg");
		set.add("asdf");
		set.add("gsdfg");
		set.add("grh");

		System.out.println(set.toString());
	}
}
