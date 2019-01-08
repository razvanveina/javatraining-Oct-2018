package sessions.s10.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
	public static void main(String[] args) throws IOException {
		writeFile();
		readFile();
		readFileToStringArray();
	}

	private static void readFileToStringArray() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("test.txt")));

		List<String> lines = new ArrayList<String>();

		while (true) {
			String s = br.readLine();

			if (s == null) {
				break;
			}
			lines.add(s);
			// System.out.println(s);
		}

		System.out.println(lines);
		br.close();
	}

	private static void readFile() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("test.txt")));

		while (true) {
			String s = br.readLine();
			if (s == null) {
				break;
			}
			System.out.println(s);
		}

		br.close();
	}

	private static void writeFile() throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(new File("test.txt"));

		// pw.println("1\r\n2\r\n3");
		pw.println("1" + System.lineSeparator() + "2" + System.lineSeparator() + "3");
//		pw.println("1");
//		pw.println("2");
//		pw.println("3");

		pw.close();
	}
}
