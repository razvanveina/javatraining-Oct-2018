package sessions.s09.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StringListDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("asdf");
		list.add("xcv");
		list.add("vvv");
		list.add("sadf");
		list.add("sadf");
		list.add("sadf");
		list.add("sadf");
		// list.add(new Integer(5));

		System.out.println(list.toString());
		System.out.println(list.get(1));
		System.out.println(list.set(1, "xcvzxcs"));
		System.out.println(list.get(1));

		List<String> list2 = new LinkedList<String>();
		list2.addAll(list);
		System.out.println(list2);
		list2.remove(0);
		list2.remove("sadf");
		System.out.println(list2);

		// ConcurrentModificationException
//		for (String s : list) {
//			if (s.equals("vvv")) {
//				list.remove(s);
//			}
//		}

		// ConcurrentModificationException solution
		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			String s = iterator.next();
			if (s.equals("vvv")) {
				iterator.remove();
			}
		}
		System.out.println(list);

		System.out.println(list.indexOf("sadf"));
		System.out.println(list.lastIndexOf("sadf"));
		Collections.sort(list);
		System.out.println(list.toString());
	}
}
