package newToJava;

import java.util.*;


public class BFS {

    public static void main(String[] args) {
        int c = 0;
        String text = "A........."
        			+ "##....##.."
        			+ ".####...##"
        			+ ".........."
	                + ".......###"
	                + ".....#...."
	                + "####...###"
	                + "B........."
	                + "#...#.###."
	                + "..........";
        char[][] maze = new char[10][10];
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                maze[x][y] = text.charAt(c);
                c += 1;
            }
        }
        System.out.println(bfs(maze, 0, 0, '#'));
    }

    public static int bfs(char[][] maze, int x, int y, char wall) {
        Queue<int[]> queue = new LinkedList<int[]>();
        int[] start = {y, x, 0};
        queue.add(start);

        while (queue.peek() != null) {
            int[] array = queue.remove();

            if (array[0] - 1 > -1 && maze[array[0] - 1][array[1]] != wall) {

                if (maze[array[0] - 1][array[1]] == 'B') {
                    return array[2] + 1;
                } else {
                    maze[array[0] - 1][array[1]] = wall;
                    int[] temp = {array[0] - 1, array[1], array[2] + 1};
                    queue.add(temp);
                }
            }

            if (array[1] - 1 > -1 && maze[array[0]][array[1] - 1] != wall) {

                if (maze[array[0]][array[1] - 1] == 'B') {
                    return array[2] + 1;
                } else {
                    maze[array[0]][array[1] - 1] = wall;
                    int[] temp = {array[0], array[1] - 1, array[2] + 1};
                    queue.add(temp);
                }
            }

            if (array[1] + 1 < 10 && maze[array[0]][array[1] + 1] != wall) {

                if (maze[array[0]][array[1] + 1] == 'B') {
                    return array[2] + 1;
                } else {
                    maze[array[0]][array[1] + 1] = wall;
                    int[] temp = {array[0], array[1] + 1, array[2] + 1};
                    queue.add(temp);
                }
            }

            if (array[0] + 1 < 10 && maze[array[0] + 1][array[1]] != wall) {

                if (maze[array[0] + 1][array[1]] == 'B') {
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
