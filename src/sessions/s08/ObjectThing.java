package sessions.s08;

public class ObjectThing {
	public static void main(String[] args) {
		Object obj = new Object();
		Object obj2 = new Object();
		System.out.println(obj.getClass());
		System.out.println(obj.equals(obj));
		System.out.println(obj.equals(obj2));
		System.out.println(obj.toString());
	}
}
