package treeAndGraphTraversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem3RideTheHorse {

	public static int[][] matrix;
	public static int startPositionN, startPositionM;
	public static int horseStepNumber = 1;
	
	public static void main(String[] args) {
		input();
		Queue<Integer[]> queue = new LinkedList<Integer[]>();
		Integer[] cordination = {startPositionN, startPositionM, horseStepNumber};
		queue.add(cordination);
		matrix[startPositionN][startPositionM] = horseStepNumber;
		while (!queue.isEmpty()) {
			cordination = queue.poll();
			movingLikeHorse(queue, cordination[0], cordination[1], cordination[2]);
		}
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(matrix[i][matrix[0].length/2]);
//			for (int j = 0; j < matrix[i].length; j++) {
//				System.out.print(matrix[i][j] + " ");
//				if (j == matrix[i].length - 1) {
//					System.out.println();
//				}
//			}
		}
	}

	private static void movingLikeHorse(Queue<Integer[]> queue,
			Integer row, Integer column, Integer number) {
		//up-left move
		if (row - 2 >= 0 && column - 1 >= 0 && matrix[row - 2][column - 1] == 0) {
			matrix[row - 2][column - 1] = number + 1;
			queue.add(new Integer[]{row - 2, column - 1, number + 1});
		}
		//up-right
		if ((row - 2 >= 0 && column + 1 <= matrix[0].length - 1) && matrix[row - 2][column + 1] == 0) {
			matrix[row - 2][column + 1] = number + 1;
			queue.add(new Integer[]{row - 2, column + 1, number + 1});
		}
		//right-up
		if (row - 1 >= 0 && column + 2 <= matrix[0].length - 1 && matrix[row - 1][column + 2] == 0) {
			matrix[row - 1][column + 2] = number + 1;
			queue.add(new Integer[]{row - 1, column + 2, number + 1});
		}
		//right-down
		if (row + 1 <= matrix.length - 1 && column + 2 <= matrix[0].length - 1 && matrix[row + 1][column + 2] == 0) {
			matrix[row + 1][column + 2] = number + 1;
			queue.add(new Integer[]{row + 1, column + 2, number + 1});
		}
		//down-right
		if (row + 2 <= matrix.length - 1 && column + 1 <= matrix[0].length - 1 && matrix[row + 2][column + 1] == 0) {
			matrix[row + 2][column + 1] = number + 1;
			queue.add(new Integer[]{row + 2, column + 1, number + 1});
		}
		//down-left
		if (row + 2 <= matrix.length - 1 && column - 1 >= 0 && matrix[row + 2][column - 1] == 0) {
			matrix[row + 2][column - 1] = number + 1;
			queue.add(new Integer[]{row + 2, column - 1, number + 1});
		}
		//left-down
		if (row + 1 <= matrix.length - 1 && column - 2 >= 0 && matrix[row + 1][column - 2] == 0) {
			matrix[row + 1][column - 2] = number + 1;
			queue.add(new Integer[]{row + 1, column - 2, number + 1});
		}
		//left-up
		if (row - 1 >= 0 && column - 2 >= 0 && matrix[row - 1][column - 2] == 0) {
			matrix[row - 1][column - 2] = number + 1;
			queue.add(new Integer[]{row - 1, column - 2, number + 1});
		}
	}

	private static void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please write number of Rows in matrix:");
		int sizeOfRows = Integer.parseInt(input.nextLine());
		System.out.println("Please write number of Columns in matrix:");
		int sizeOfColumns = Integer.parseInt(input.nextLine());
		System.out.println("Please write position in which row in matrix to start:");
		startPositionN = Integer.parseInt(input.nextLine());
		System.out.println("Please write position in which column in matrix to start:");
		startPositionM = Integer.parseInt(input.nextLine());
		matrix = new int[sizeOfRows][sizeOfColumns];
		input.close();
	}
}
