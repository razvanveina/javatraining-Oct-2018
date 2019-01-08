package sessions.s10.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapThing {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("Ion", 30);
		map.put("Gheo", 31);
		map.put("Mircea", 20);

		System.out.println(map.get("Ion"));

		System.out.println(map.values());

		Set<Entry<String, Integer>> entrySet = map.entrySet();

		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry);
			if (entry.getValue() == 20) {
				System.out.println(entry.getKey());
			}
		}

		System.out.println(map.containsKey("Ion"));
		System.out.println(map.keySet());
		System.out.println(map.replace("Ion", 30, 40));
		System.out.println(map);

		System.out.println(map.get("qwer"));
	}
}
