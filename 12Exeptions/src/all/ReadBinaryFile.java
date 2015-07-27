package all;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadBinaryFile {

	private static Scanner input;

	public static void main(String[] args) {
		try {
			input = new Scanner(System.in);
			System.out.print("Molia vuvedete putia kum faila za chetene : ");
			String pathToFile = input.nextLine();
			byte[] fileSudurjanie = changeBinaryToByteArray(pathToFile);
			System.out.print("Molia vuvedete putia kum faila za zapisvane :");
			pathToFile = input.nextLine();
			saveFile(fileSudurjanie,pathToFile);
			

		} catch (IOException e) {
			System.out.println("ne moje da nameri faila");
			e.printStackTrace();
		} finally {
			System.out.println("tuk vsi4ko stava vinagi");
			input.close();
		}
		
	}

	private static void saveFile(byte[] fileSudurjanie, String pathToFile) throws IOException {
		File file = new File(pathToFile);
		FileOutputStream output = new FileOutputStream(file);
		output.write(fileSudurjanie);
		
		output.close();
	}

	private static byte[] changeBinaryToByteArray(String fileName) throws IOException {
			File file = new File(fileName);
			FileInputStream input = new FileInputStream(file);
			byte[] buffer = new byte[(int)file.length()];
			ByteArrayOutputStream in = new ByteArrayOutputStream();
			int n = 0;
		    while (-1 != (n = input.read(buffer))) {
		       in.write(buffer, 0, n);
		    }
					
			input.close();
			return buffer;
	}
	
}
