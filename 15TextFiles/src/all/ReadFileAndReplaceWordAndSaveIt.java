package all;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class ReadFileAndReplaceWordAndSaveIt {

	public static void main(String[] args) {
		String inputFile = "text.txt";
		String outputFile = "newText.txt";
		Scanner fileInput = null;
		PrintStream fileOutput = null;
		String wordForReplace = "Java";
		String replacingWord = "kureee";
		try {
			// Create scanner with the Cyrillic encoding
			fileInput = new Scanner(
			new File(inputFile), "windows-1251");
			// Create PrintWriter with the Cyrillic encoding
			fileOutput = new PrintStream(
				outputFile, "windows-1251");
			String line;
			while (fileInput.hasNextLine()) {
				line = fileInput.nextLine();
				String fixedLine = fixLine(line,wordForReplace,replacingWord);
				fileOutput.println(fixedLine);
			}	
		} catch (FileNotFoundException fnfe) {
				System.err.println(fnfe.getMessage());
		} catch (UnsupportedEncodingException uee) {
				System.err.println(uee.getMessage());
		} finally {
			if (null != fileInput) {
				fileInput.close();
			}
			if (null != fileOutput) {
				fileOutput.close();
			}
		}
	}

	private static String fixLine(String line, String wordForReplace,
			String replacingWord) {
		String fixedLine = line;
		//tuk smenia vsi4ki namereni ednakvi dori i da ne sa sami dumi
//		fixedLine = fixedLine.replace(wordForReplace, replacingWord);
		fixedLine = fixedLine.replace(" " + wordForReplace + " ", 
				" " + replacingWord + " ");
		if (fixedLine.startsWith(wordForReplace)) {
			fixedLine = fixedLine.replace(wordForReplace + " ", 
					replacingWord + " ");
		}
		if (fixedLine.endsWith(wordForReplace)) {
			fixedLine = fixedLine.replace(" " + wordForReplace, 
					" " + replacingWord);
		}
		return fixedLine;
	}


}
