package sessions.s09.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NumberInput {
	public static void main(String[] args) {
		String s = "123";

		try {
			System.out.println(Integer.parseInt(s));
		} catch (NumberFormatException | NullPointerException e) {
			System.out.println("numar incorect");
		} finally {
			System.out.println("finally");
		}
	}

	static String readFirstLineFromFile(String path) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			return br.readLine();
		}
	}
}
