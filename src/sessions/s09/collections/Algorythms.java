package sessions.s09.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Algorythms {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("asdf");
		list.add("xcv");
		list.add("vvv");
		list.add("fsdf");
		list.add("ger");
		list.add("ewr");
		list.add("ttry");

		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		System.out.println(Collections.min(list));
	}
}
