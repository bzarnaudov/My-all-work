package all;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintOddLinesFromFile {

	public static void main(String[] args) {
		File file = new File("sample.txt");
		Scanner fileReader = null;
		try {
			fileReader = new Scanner(file, "UTF-8");
			int lineNumber = 0;
			
			//Read file
			while(fileReader.hasNextLine()) {
				lineNumber++;
				if (lineNumber % 2 != 0) {
					System.out.printf("Line %d: %s%n", lineNumber, fileReader.nextLine());
				} else {
					fileReader.nextLine();
				}
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

	}

}
