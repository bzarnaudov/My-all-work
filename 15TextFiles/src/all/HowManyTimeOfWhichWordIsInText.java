package all;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HowManyTimeOfWhichWordIsInText {

	public static void main(String[] args) {
		String inputFile = "words.txt";
		String inputFile2 = "text.txt";
		String outputFile = "resultFromHowManyTimeOfWhichWordIsInText.txt";
		Scanner fileInput = null;
		Scanner fileInput2 = null;
		PrintStream fileOutput = null;
		
		try {
			// Create scanner with the Cyrillic encoding
			fileInput = new Scanner(
			new File(inputFile), "windows-1251");
			fileInput2 = new Scanner(
					new File(inputFile2), "windows-1251");
			// Create PrintWriter with the Cyrillic encoding
			fileOutput = new PrintStream(
				outputFile, "windows-1251");
			String[] words = fileInput.nextLine().split(" ");
			int[] times = new int[words.length];
			
			while (fileInput2.hasNextLine()) {
				StringTokenizer st = new StringTokenizer(fileInput2.nextLine(), " .!");
				while (st.hasMoreTokens()) {
					String nextWord = st.nextToken();
					for (int i = 0; i < words.length; i++) {
				         if (words[i].equals(nextWord)) {
				        	 times[i]++;
				         }
					}
			     }
			}
			for (String i : words) {
				System.out.println(i);
			}
			for (int i : times) {
				System.out.println(i);
			}
			 for (int n = 0; n < words.length; n++) {
			        for (int m = 0; m < words.length - 1 - n; m++) {
			        	if (times[m] >= times[m+1]) {
			        		int swapInt = times[m];
			                times[m] = times[m + 1];
			                times[m + 1] = swapInt;
			                String swapString = words[m];
			                words[m] = words[m + 1];
			                words[m + 1] = swapString;
			        	}
			        }
			    }
			
			for (int i = 0; i < words.length; i++) {
				words[i] = times[i] + " " + words[i];
			}
						
			for (String i : words) {
				System.out.println(i);
			}
			//zapisva v faila sortiranite neshta
			for (int i = words.length - 1; i >= 0; i--) {
				fileOutput.println(words[i]);
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
		}	
			

	}

}
