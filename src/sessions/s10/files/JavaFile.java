package sessions.s10.files;

public class JavaFile {
	public static void main(String[] args) {
		System.out.println(isJavaFile("MyClass.java")); // true
		System.out.println(isJavaFile("test.txt")); // false
		System.out.println(isJavaFile("java.txt")); // false
		System.out.println(isJavaFile(".java.txt")); // false
	}

	private static boolean isJavaFile(String name) {
		return name.equals(".java");
	}
}
