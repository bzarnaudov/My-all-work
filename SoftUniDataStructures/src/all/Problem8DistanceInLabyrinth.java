package all;

import java.util.LinkedList;
import java.util.Queue;

public class Problem8DistanceInLabyrinth {

	public static void main(String[] args) {
		String[][] matrix =
			{       {"0", "0", "0", "x", "0", "x"},
					{"0", "x", "0", "x", "0", "x"},
					{"0", "*", "x", "0", "x", "0"},
					{"0", "x", "0", "0", "0", "0"},
					{"0", "0", "0", "x", "x", "0"},
					{"0", "0", "0", "x", "0", "x"}
			};
		
		for (String[] str1 : matrix) {
			for (String str : str1) {
				System.out.print(str + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		matrix = calculateDistanceInMatrix(matrix);
		
		for (String[] str1 : matrix) {
			for (String str : str1) {
				System.out.print(str + " ");
			}
			System.out.println();
		}
	}

	private static String[][] calculateDistanceInMatrix(String[][] matrix) {
		String start = "*";
		String wall = "x";
		int startPositionRow = -1, startPositionCol = -1;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (start.equals(matrix[i][j])) {
					startPositionRow = i;
					startPositionCol = j;
					break;
				}
			}
			if (startPositionRow != -1) {
				break;
			}
		}
		
		matrix = bfsMarking(matrix, startPositionRow, startPositionCol, wall);
		return matrix;
	}

	private static String[][] bfsMarking(String[][] maze, int x, int y, String wall) {
		Queue<int[]> queue = new LinkedList<int[]>();
        int[] start = {x, y, 0};
        queue.add(start);
        
        while (queue.peek() != null) {
            int[] array = queue.remove();

            //up
            if (array[0] - 1 > -1 && !maze[array[0] - 1][array[1]].equals(wall) && maze[array[0] - 1][array[1]].equals("0")) {
	            maze[array[0] - 1][array[1]] = Integer.toString(array[2] + 1);
	            int[] temp = {array[0] - 1, array[1], array[2] + 1};
	            queue.add(temp);
            }
            
            //left
            if (array[1] - 1 > -1 && !maze[array[0]][array[1] - 1].equals(wall) && maze[array[0]][array[1] - 1].equals("0")) {
	            maze[array[0]][array[1] - 1] = Integer.toString(array[2] + 1);
	            int[] temp = {array[0], array[1] - 1, array[2] + 1};
	            queue.add(temp);
            }

            //right
            if (array[1] + 1 < maze[array[1]].length && !maze[array[0]][array[1] + 1].equals(wall) && maze[array[0]][array[1] + 1].equals("0")) {
	            maze[array[0]][array[1] + 1] = Integer.toString(array[2] + 1);
	            int[] temp = {array[0], array[1] + 1, array[2] + 1};
	            queue.add(temp);
            }

            //down
            if (array[0] + 1 < maze.length && !maze[array[0] + 1][array[1]].equals(wall) && maze[array[0] + 1][array[1]].equals("0")) {
	            maze[array[0] + 1][array[1]] = Integer.toString(array[2] + 1);
	            int[] temp = {array[0] + 1, array[1], array[2] + 1};
	            queue.add(temp);
            }
        }
        
        maze = searchForUnreachableCells(maze);
		return maze;
	}

	private static String[][] searchForUnreachableCells(String[][] maze) {
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[i].length; j++) {
				if (maze[i][j].equals("0")) {
					maze[i][j] = "u";
				}
			}
		}
		return maze;
	}
}
