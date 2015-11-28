package all;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ExtractionTextFromHTML {

	private static final String INPUT_FILE_NAME = "Problem1.html";
	private static final String OUTPUT_FILE_NAME = "Problem1.txt";
	private static final String CHARSET = "windows-1251";
	
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(new FileInputStream(
				INPUT_FILE_NAME), CHARSET);
		PrintWriter writer = new PrintWriter(OUTPUT_FILE_NAME, CHARSET);
		try {
			boolean inTag = false;
			StringBuilder buffer = new StringBuilder();
			while (true) {
				int nextChar = reader.read();
				if (nextChar == -1) {
					// End of file reached
					printBuffer(writer, buffer);
					break;
				}
				char ch = (char) nextChar;
				if (ch == '<') {
					if (!inTag) {
						printBuffer(writer, buffer);
					}
					buffer.setLength(0);
					inTag = true;
				} else if (ch == '>') {
					inTag = false;
				} else {
					// We have other character (not "<" or ">")
					if (!inTag) {
						buffer.append(ch);
					}
				}
			}
		} finally {
			reader.close();
			writer.close();
		}
	}

	private static void printBuffer(PrintWriter writer, StringBuilder buffer) {
		String str = buffer.toString();
		String trimmed = str.trim();
		String textOnly = removeNewLineWithWhiteSpace(trimmed);
		if (textOnly.length() != 0) {
			writer.println(textOnly);
		}
	}

	private static String removeNewLineWithWhiteSpace(String str) {
		str = str.replaceAll("\n\\s+", "\n");
		return str;
	}

}
