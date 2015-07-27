package all;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class ScannerFileReader {
	public static void main(String[] args) {
		File file = new File("sample.txt");
		System.out.println(file.getAbsolutePath());
		Scanner fileReader = null;
		try {
			fileReader = new Scanner(file, "UTF-8");
			int lineNumber = 0;
			
			//Read file
			while(fileReader.hasNextLine()) {
				lineNumber++;
				System.out.printf("Line %d: %s%n", lineNumber, fileReader.nextLine());
			}		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NullPointerException npe) {
			npe.printStackTrace();
		} finally {
			if (fileReader != null) {
				fileReader.close();
			}
			System.out.println("Scanner closed.");
		}
		
		PrintStream fileWriter = null;
		try {
			fileWriter = new PrintStream("sample.txt", "UTF-8");
			for (int num = 1; num <= 20; num++) {
				fileWriter.println(num);
			}
		} catch (FileNotFoundException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fileWriter != null) {
				fileWriter.close();
			}
			System.out.println("PrintStream closed.");
			
		}
		
		
		
		
	}

}
