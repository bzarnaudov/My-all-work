package newToJava;

import java.util.LinkedList;
import java.util.Queue;

public class BfsGhostPacman1 {

	public static void main(String[] args) {
		int leveldata[] = {
				51, 26, 26, 18, 26, 26, 18, 18, 18, 26, 26, 18, 26, 26, 54,
		        21, 0, 0, 21, 0, 0, 17, 24, 20, 0, 0, 21, 0, 0, 21,
		        17, 26, 26, 24, 18, 26, 28, 0, 25, 26, 18, 24, 26, 26, 20,
		        21, 0, 0, 0, 21, 0, 0, 0, 0, 0, 21, 0, 0, 0, 21,
		        17, 26, 26, 26, 20, 0, 0, 0, 0, 0, 17, 26, 26, 26, 20,
		        21, 0, 0, 0, 17, 26, 22, 0, 19, 26, 20, 0, 0, 0, 21,
		        17, 26, 18, 26, 20, 0, 21, 0, 21, 0, 17, 26, 18, 26, 20,
		        21, 0, 21, 0, 17, 26, 16, 18, 16, 26, 20, 0, 21, 0, 21,
		        21, 0, 21, 0, 21, 0, 17, 16, 20, 0, 17, 26, 20, 0, 21,
		        21, 0, 17, 26, 20, 0, 25, 24, 28, 0, 21, 0, 21, 0, 21,
		        21, 0, 21, 0, 21, 0, 0, 0, 0, 0, 21, 0, 21, 0, 21,
		        17, 26, 16, 26, 16, 26, 18, 26, 18, 26, 16, 26, 16, 26, 20,
		        21, 0, 21, 0, 21, 0, 21, 0, 21, 0, 21, 0, 21, 0, 21,
		        21, 0, 21, 0, 21, 0, 21, 0, 21, 0, 21, 0, 21, 0, 21,
		        64, 26, 24, 26, 24, 26, 26, 26, 24, 26, 24, 26, 24, 26, 60
		};
		int c = 0;
		int[][] maze = new int[15][15];
		for (int x = 0; x < 15; x++) {
			for (int y = 0; y < 15; y++) {
				maze[x][y] = leveldata[c];
				c += 1;
			}
		}
		Node node = bfs(maze, 0, 0, 0);
		int ghostdx = 100,ghostdy = 100;
		while (node != null) {	
			System.out.println(node);
			String[] nodeMasive = node.toString().split(" ");
			if (nodeMasive[2].contentEquals("1") ) {
				ghostdx = Integer.parseInt(nodeMasive[1]);
				ghostdy = Integer.parseInt(nodeMasive[0]);
			}
			node = node.parent;
		}
		System.out.println(ghostdx);
		System.out.println(ghostdy);
	}

	private static class Node {
		int y;
		int x;
		int l;
		Node parent;

		private Node(int y, int x, int l, Node parent) {
			this.y = y;
			this.x = x;
			this.l = l;
			this.parent = parent;
		}

		@Override
		public String toString() {
			return "" + y + " " + x + " " + l;
		}
	}

	public static Node bfs(int[][] maze, int startX, int startY, int wall) {
		Queue<Node> queue = new LinkedList<>();
		Node start = new Node(startY, startX, 0, null);
		queue.add(start);

		while (queue.peek() != null) {
			Node current = queue.remove();
			int y = current.y;
			int x = current.x;
			int l = current.l;

			if (y - 1 > -1 && maze[y - 1][x] != wall) {
				Node next = new Node(y - 1, x, l + 1, current);
				if (maze[y - 1][x] == 64) {
					return next;
				} else {
					maze[y - 1][x] = wall;
					queue.add(next);
				}
			}

			if (x - 1 > -1 && maze[y][x - 1] != wall) {
				Node next = new Node(y, x - 1, l + 1, current);
				if (maze[y][x - 1] == 64) {
					return next;
				} else {
					maze[y][x - 1] = wall;
					queue.add(next);
				}
			}

			if (x + 1 < 15 && maze[y][x + 1] != wall) {
				Node next = new Node(y, x + 1, l + 1, current);
				if (maze[y][x + 1] == 64) {
					return next;
				} else {
					maze[y][x + 1] = wall;
					queue.add(next);
				}
			}

			if (y + 1 < 15 && maze[y + 1][x] != wall) {
				Node next = new Node(y + 1, x, l + 1, current);
				if (maze[y + 1][x] == 64) {
					return next;
				} else {
					maze[y + 1][x] = wall;
					queue.add(next);
				}
			}
		}
		return null;
	}
}
