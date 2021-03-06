package all;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.file.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BfsForAllDirectoriesOnHardDisk {

	public static void main(String[] args) {
		PrintStream fileOutput = null;
		String outputFile = "DirectoriesByBFS.txt";
		String hardDiskLetter;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter path for directory , which you want to see details : ");
		while (true) {
			hardDiskLetter = input.nextLine();
			if (chackingPath(hardDiskLetter)) {
				break;
			}
			System.out.println("Invalid path, please enter valid path :");
		}
		File file = new File(hardDiskLetter);
		Queue<File> queue = new LinkedList<File>();
		queue.add(file);
		try {
			fileOutput = new PrintStream(outputFile, "windows-1251");
			while (!queue.isEmpty()) {
				file = queue.poll();
				File[] listOfFiles = file.listFiles();
				if(listOfFiles != null) {
					for (int i = 0; i < listOfFiles.length; i++) {
						if (listOfFiles[i].isDirectory()) {
							System.out.println(listOfFiles[i]);
							fileOutput.println(listOfFiles[i]);
							queue.add(listOfFiles[i]);
						}
					}
				}
			}
		} catch (FileNotFoundException fnfe) {
			System.err.println(fnfe.getMessage());
		} catch (UnsupportedEncodingException uee) {
				System.err.println(uee.getMessage());
		} finally {
			if (null != fileOutput) {
				fileOutput.close();
			}
		}
		input.close();
	}

	private static boolean chackingPath(String pathName) {
		try {
			Path path = Paths.get(pathName);
			path.toRealPath();		
		} catch (InvalidPathException | IOException e) {
			return false;
		}
		return true;
	}	
}	