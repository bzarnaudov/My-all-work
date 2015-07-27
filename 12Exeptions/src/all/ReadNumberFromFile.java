package all;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadNumberFromFile {
	public static Scanner input;
	public static BufferedReader in;
	public static void main(String[] args) {
		try {
			input = new Scanner(System.in);
			System.out.print("Molia vuvedete putia kum faila za chetene na chisla: ");
			String pathToFile = input.nextLine();
			File file = new File(pathToFile);
			FileReader output = new FileReader(file);
			in = new BufferedReader(output);
			String tmp = null;
			int line = 0;
			while ((tmp = in.readLine()) != null) {
				line++;
				fileChekForNumbers(tmp, pathToFile, line);
			}
			System.out.println("Faila sudurja na vseki red 4islo");
			
		} catch (FileNotFoundException e) {
			System.out.println("ne moje da nameri faila");
			e.printStackTrace();
		} catch (IOException e) {
			
		} catch (FileParseException e) {
				
		} finally {
			input.close();
			try {
				in.close();
			} catch (IOException e) {
				
			}
		}
		
	}
	private static void fileChekForNumbers(String tmp, String pathToFile, int line) throws FileParseException {
		boolean containesNumber = true;
		for (int i = 0; i < tmp.length(); i++) {
			if ((tmp.charAt(i) > 47) && (tmp.charAt(i) < 58)) {
				containesNumber = false;
				break;
			}			
		}
		if (containesNumber) {
			throw new FileParseException( "There is no number ", pathToFile, line);
		}
		
	}

}
