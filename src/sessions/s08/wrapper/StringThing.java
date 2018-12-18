package sessions.s08.wrapper;

public class StringThing {
	public static void main(String[] args) {
		String s = new String("abcdef");
		System.out.println(s.equals("abcdef"));
		System.out.println(s == "abcdef"); // asa nu

		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 4));
		System.out.println(s.charAt(1));
		System.out.println(s.compareTo("abc"));
		System.out.println(s.compareTo("def"));
		System.out.println(s.compareToIgnoreCase("ABCDEF"));
		System.out.println(s.indexOf("def"));
		System.out.println(s.indexOf("asdef"));
		System.out.println(s.isEmpty());
		System.out.println(s.replace('a', 'A'));
		System.out.println(s.replace("def", "DEF"));
		System.out.println(s.toUpperCase());
		System.out.println("        ABC   ".trim());
		System.out.println(s.toCharArray());
		System.out.println(s.startsWith("a"));
		System.out.println(s.startsWith("b"));
		System.out.println(s.endsWith("b"));
		System.out.println(s.length());
		String[] splits = "123dwq,23asdf4,asdf345,45asdfs6".split(",");
		for (String ss : splits) {
			System.out.println(ss);
		}

		int n = 10;
		System.out.println(n);

		String s3 = "" + n;
		s3 = String.valueOf(n);
		s3 = Integer.toString(n);

	}
}
