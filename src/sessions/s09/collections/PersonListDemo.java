package sessions.s09.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PersonListDemo {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("Emil", 22));
		list.add(new Person("Vlad", 25));
		list.add(new Person("Andrea", 23));

		System.out.println(list.toString());
		System.out.println(list.get(1));
		Person vlad = new Person("Vlad", 26);
		System.out.println(list.set(1, vlad));
		System.out.println(list.get(1));

		System.out.println("----------------------");
		List<Person> list2 = new LinkedList<Person>();
		list2.addAll(list);
		System.out.println(list2);
		// list2.remove(0);
		// list2.remove(new Person("Vlad", 26));

		System.out.println(">>>>" + list2);

		// ConcurrentModificationException
//		for (String s : list) {
//			if (s.equals("vvv")) {
//				list.remove(s);
//			}
//		}

		// ConcurrentModificationException solution
		Iterator<Person> iterator = list.iterator();

		while (iterator.hasNext()) {
			Person person = iterator.next();
			if (person.equals(new Person("ssdfsd", 26))) {
				iterator.remove();
			}
		}
		System.out.println(list);

		System.out.println(list.indexOf(new Person("Andrea", 32)));
		System.out.println(list.lastIndexOf(new Person("Andrea", 32)));
		Collections.sort(list);

		Collections.sort(list, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				if (o1.age < o2.age) {
					return -1;
				} else if (o1.age > o2.age) {
					return +1;
				}
				return 0;
			}
		});

		// Collections.sort(list, new MyComparator());

		System.out.println(list.toString());
	}
}
