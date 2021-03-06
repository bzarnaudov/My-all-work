
import java.util.LinkedList;
import java.util.Queue;

public class SearchForShortestPath {
	//Breadth first search method
	public static Node bfs(int[][] maze, int startX, int startY, int wall) {
		Queue<Node> queue = new LinkedList<>();
		Node start = new Node(startY, startX, 0, null);
		queue.add(start);

		while (queue.peek() != null) {
			Node current = queue.remove();
			int y = current.y;
			int x = current.x;
			int l = current.l;

			//up
			if (y - 1 > -1 && maze[y - 1][x] != wall) {
				Node next = new Node(y - 1, x, l + 1, current);
				if (maze[y - 1][x] == 2) {
					return next;
				} else {
					maze[y - 1][x] = wall;
					queue.add(next);
				}
			}
			// left
			if (x - 1 > -1 && maze[y][x - 1] != wall) {
				Node next = new Node(y, x - 1, l + 1, current);
				if (maze[y][x - 1] == 2) {
					return next;
				} else {
					maze[y][x - 1] = wall;
					queue.add(next);
				}
			}
			// right
			if (x + 1 < maze.length && maze[y][x + 1] != wall) {
				Node next = new Node(y, x + 1, l + 1, current);
				if (maze[y][x + 1] == 2) {
					return next;
				} else {
					maze[y][x + 1] = wall;
					queue.add(next);
				}
			}
			// down
			if (y + 1 < maze[0].length && maze[y + 1][x] != wall) {
				Node next = new Node(y + 1, x, l + 1, current);
				if (maze[y + 1][x] == 2) {
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
