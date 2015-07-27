package all;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class SquareMatrixReadAndWriteSumOfUnder2x2Matrix {

	public static void main(String[] args) {
		String inputFile = "matrix.txt";
		String outputFile = "sumOf2x2Matrix.txt";
		Scanner fileInput = null;
		PrintStream fileOutput = null;
		
		try {
			// Create scanner with the Cyrillic encoding
			fileInput = new Scanner(
			new File(inputFile), "windows-1251");
			// Create PrintWriter with the Cyrillic encoding
			fileOutput = new PrintStream(
				outputFile, "windows-1251");
			
			int volumeOfMatrix  = Integer.parseInt(fileInput.nextLine());
			int[][] matrix = new int[volumeOfMatrix][volumeOfMatrix];
			String[] matrixRow = new String[volumeOfMatrix];
			int k = 0;
			while (fileInput.hasNextLine()) {
				matrixRow = fileInput.nextLine().split(" ");
				for (int i = 0; i < volumeOfMatrix; i++) {
					matrix[k][i] = Integer.parseInt(matrixRow[i]);
				}
				k++;
			}
			int sum = calculateSum(matrix);
			fileOutput.println(sum);
			
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

	private static int calculateSum(int[][] matrix) {
		int sum = 0;
		int biggestSum = 0;
		
		for (int i = 0; i < matrix.length - 1; i++) {
			for (int k = 0; k < matrix.length - 1; k++) {
				sum = matrix[i][k] + matrix[i+1][k] + matrix[i][k+1] 
						+ matrix[i+1][k+1];
				System.out.println(sum);
				if (sum > biggestSum) {
					biggestSum = sum;
				}
			}
		}
		return biggestSum;
	}

}
