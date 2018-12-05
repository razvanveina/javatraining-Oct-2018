package sessions.s07.tests;

public class StringDemo {
	public static void main(String[] args) {
		String s = "abc";
		String s2 = new String("def");
		String s3 = "abc";
		s3 = s3 + "d";
		String s4 = new String("def");
		s = s + "d";
		s = "abcd";

		s.replace('a', 'x');
		System.out.println(s);
	}
}
