package all;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	
	public static void main(String[] args) {
		try {
			String fileSudurjanie = putFileToString("c:\\mylog.log");
			System.out.println(fileSudurjanie);
		} catch (IOException e) {
			System.out.println("ne moje da nameri faila");
			e.printStackTrace();
		} finally {
			
		}
			
		
		
	}

	private static String putFileToString(String fileName) throws IOException {
			Scanner input = new Scanner(new File(fileName));
			StringBuilder buildString = new StringBuilder();
			while (input.hasNextLine()) {
				buildString.append(input.nextLine() + "\n");
			}
			input.close();
			return buildString.toString();
	}
	
	
	
	

}
