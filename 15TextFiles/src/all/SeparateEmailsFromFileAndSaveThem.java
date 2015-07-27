package all;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Scanner;

public class SeparateEmailsFromFileAndSaveThem {

	private static int counting = 0;
	
	public static void main(String[] args) {
		String inputFile = "names.txt";
		String outputFile = "sortedNames.txt";
		Scanner fileInput = null;
		PrintStream fileOutput = null;
		Scanner fileInput2 = null;
		PrintStream fileOutput2 = null;
		try {
			// Create scanner with the Cyrillic encoding
			fileInput = new Scanner(
			new File(inputFile), "windows-1251");
			// Create PrintWriter with the Cyrillic encoding
			fileOutput = new PrintStream(
				outputFile, "windows-1251");
			
			String line = fileInput.nextLine();
			String[] separateWords = separator(line);
			int i = 0;
			while (separateWords[i] != null) {
				fileOutput.println(separateWords[i]);
				i++;
			}
			fileInput2 = new Scanner(
					new File(outputFile), "windows-1251");
			fileOutput2 = new PrintStream(
					"SortedWords.txt", "windows-1251");
			String[] wordsForSorting = readingWords(fileInput2);
			String[] sortedWords = sortingWords(wordsForSorting);
			for (int k = 0; k < counting; k++) {
				fileOutput2.println(sortedWords[k]);
			}

			
		} catch (FileNotFoundException fnfe) {
				System.err.println(fnfe.getMessage());
		} catch (UnsupportedEncodingException uee) {
				System.err.println(uee.getMessage());
		} finally {
			if (null != fileInput) {
				fileInput.close();
			}
			if (null != fileInput2) {
				fileInput2.close();
			}
			if (null != fileOutput) {
				fileOutput.close();
			}
			if (fileOutput2 != null ) {
				fileOutput2.close();
			}
		}

	}

	private static String[] sortingWords(String[] wordsForSorting) {
		Arrays.sort(wordsForSorting);
		return wordsForSorting;
	}

	private static String[] readingWords(Scanner fileInput2) {
		int i = 0;
		String[] line = new String[counting+1];
		while (fileInput2.hasNextLine()) {
			line[i] = fileInput2.nextLine();
			i++;
		}
		return line;
	}

	private static String[] separator(String line) {
		String[] separateWords = new String[line.length()/2];
		int startOfMail = 0;
		int endOfMail = line.indexOf(';');
		while (true) {
			separateWords[counting] = line.substring(startOfMail, endOfMail);
			
			startOfMail = endOfMail + 1;
			if ( startOfMail < line.length()) {
				endOfMail = line.indexOf(';', startOfMail + 1);
			} else {
				break;
			}
			
			counting++;
		}
				
		return separateWords;
	}

}
