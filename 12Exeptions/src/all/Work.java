package all;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Work {
	
	public static void readFile(String fileName) {
		
		try {
			FileInputStream fis = new FileInputStream(fileName);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));
			String tmp = null;
			while ((tmp = in.readLine()) != null) {
				System.out.println(tmp);
			}
			in.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("The file \"" + fileName + "\" does not exist. Unable"
					+ " to read it.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		readFile("c:\\mylog.log");
		
//		RuntimeException exception = new RuntimeException("Problem");
//		throw exception;
	}
	
}
