package all;

import java.util.*;

public class Problem1MatrixSpiral {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter N :");
		String inputLine = input.nextLine();
		input.close();
		int arraySize = Integer.parseInt(inputLine);

		int[][] matrix = new int[arraySize][arraySize];

		int row = 0;
		int col = arraySize - 1;

		Problem1Direction direction = Problem1Direction.Down;
		int spiralInnerRadius = arraySize;

		for (int i = 1; i <= arraySize * arraySize; i++) {
			matrix[row][col] = i;

			switch (direction) {
			case Down:
				if (row < spiralInnerRadius - 1) {
					row++;
				} else {
					direction = Problem1Direction.Left;
					col--;
				}
				break;
			case Right:
				if (col < spiralInnerRadius - 1) {
					col++;
				} else {
					direction = Problem1Direction.Down;
					row++;
				}
				break;
			case Up:
				if (row > arraySize - spiralInnerRadius) {
					row--;
				} else {
					direction = Problem1Direction.Right;
					col++;
					spiralInnerRadius--;
				}
				break;
			case Left:
				if (col > arraySize - spiralInnerRadius) {
					col--;
				} else {
					direction = Problem1Direction.Up;
					row--;
				}
				break;
			}
		}
		printMatrix(matrix);
		System.out.println();
	}

	static void printMatrix(int[][] matrix) {
		StringBuilder output = new StringBuilder();

		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix.length; c++) {
				output.append(String.format("%3d ", matrix[r][c]));
			}
			output.append("\n");
		}

		System.out.println(output);
	}

}