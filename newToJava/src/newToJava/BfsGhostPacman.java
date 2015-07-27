package newToJava;

import java.util.*;
//import java.util.LinkedList;
//import java.util.Queue;

public class BfsGhostPacman {

	public static void main(String[] args) {
		int leveldata[] = {
		        51, 26, 26, 18, 26, 26, 0, 18, 18, 26, 26, 18, 26, 26, 54,
		        21, 0, 0, 21, 0, 0, 17, 24, 20, 0, 0, 21, 0, 0, 21,
		        17, 26, 26, 24, 18, 26, 28, 0, 25, 26, 18, 24, 26, 26, 20,
		        0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 21, 0, 0, 0, 0,
		        17, 26, 26, 26, 20, 0, 0, 0, 0, 0, 17, 26, 26, 26, 20,
		        0, 0, 0, 0, 17, 26, 22, 0, 19, 26, 20, 0, 0, 0, 21,
		        17, 26, 18, 26, 20, 0, 21, 0, 21, 0, 17, 26, 18, 26, 20,
		        21, 0, 21, 0, 17, 26, 16, 18, 16, 26, 20, 0, 21, 0, 21,
		        21, 0, 21, 0, 21, 0, 17, 16, 20, 0, 17, 26, 20, 0, 21,
		        21, 0, 17, 26, 20, 0, 25, 24, 28, 0, 21, 0, 21, 0, 21,
		        21, 0, 21, 0, 21, 0, 0, 0, 0, 0, 21, 0, 21, 0, 21,
		        17, 26, 16, 26, 16, 26, 18, 26, 18, 26, 16, 26, 16, 26, 20,
		        21, 0, 21, 0, 21, 0, 21, 0, 21, 0, 21, 0, 21, 0, 21,
		        21, 0, 21, 0, 21, 0, 21, 0, 21, 0, 21, 0, 21, 0, 21,
		        57, 26, 24, 26, 24, 26, 24, 26, 24, 26, 24, 26, 24, 26, 60
		    };
		int c = 0;
		int[][] maze = new int[15][15];
		for (int x = 0; x < 15; x++) {
		     for (int y = 0; y < 15; y++) {
		         maze[x][y] = leveldata[c];
		         c += 1;
		     }
		 }
		System.out.println(bfs(maze, 0, 0, 0));
		for (int x = 0; x < 15; x++) {
		     for (int y = 0; y < 15; y++) {
		         System.out.print(maze[x][y] + " ");
		         if ( y == 14) {
		        	 System.out.println();
		         }
		     }
		 }
	}
	
	   public static int bfs(int[][] maze, int x, int y, int wall) {
	        Queue<int[]> queue = new LinkedList<int[]>();
	        int[] start = {y, x, 0};
	        queue.add(start);

	        while (queue.peek() != null) {
	            int[] array = queue.remove();

	            if (array[0] - 1 > -1 && maze[array[0] - 1][array[1]] != wall) {

	                if (maze[array[0] - 1][array[1]] == 60) {
	                    return array[2] + 1;
	                } else {
	                    maze[array[0] - 1][array[1]] = wall;
	                    int[] temp = {array[0] - 1, array[1], array[2] + 1};
	                    queue.add(temp);
	                }
	            }

	            if (array[1] - 1 > -1 && maze[array[0]][array[1] - 1] != wall) {

	                if (maze[array[0]][array[1] - 1] == 60) {
	                    return array[2] + 1;
	                } else {
	                    maze[array[0]][array[1] - 1] = wall;
	                    int[] temp = {array[0], array[1] - 1, array[2] + 1};
	                    queue.add(temp);
	                }
	            }

	            if (array[1] + 1 < 15 && maze[array[0]][array[1] + 1] != wall) {

	                if (maze[array[0]][array[1] + 1] == 60) {
	                    return array[2] + 1;
	                } else {
	                    maze[array[0]][array[1] + 1] = wall;
	                    int[] temp = {array[0], array[1] + 1, array[2] + 1};
	                    queue.add(temp);
	                }
	            }

	            if (array[0] + 1 < 15 && maze[array[0] + 1][array[1]] != wall) {

	                if (maze[array[0] + 1][array[1]] == 60) {
	                    return array[2] + 1;
	                } else {
	                    maze[array[0] + 1][array[1]] = wall;
	                    int[] temp = {array[0] + 1, array[1], array[2] + 1};
	                    queue.add(temp);
	                }
	            }
	        }
	        return 0;
	    }
}
