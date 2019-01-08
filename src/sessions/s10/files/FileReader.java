package sessions.s10.files;

import java.io.File;
import java.io.IOException;

public class FileReader {
	static int counter = 0;
	static int lineCounter = 0;

	public static void main(String[] args) throws IOException {
		scan(new File("."));
		System.out.println("Files: " + counter);
		System.out.println("Lines: " + lineCounter);
	}

	private static void scan(File folder) throws IOException {
		File[] files = folder.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				scan(file);
			} else if (isJavaFile(file.getName())) {
				int lines = FileUtils.readFileToStringArray(file.getAbsolutePath()).size();
				counter++;
				lineCounter += lines;
				System.out.println(file + " " + lines);
			}
		}
	}

	private static boolean isJavaFile(String name) {
		return name.endsWith(".java");
	}
}
