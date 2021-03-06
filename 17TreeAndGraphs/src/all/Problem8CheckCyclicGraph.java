package all;

import java.util.LinkedList;
import java.util.List;

public class Problem8CheckCyclicGraph {

	public static int vertices[][] = { 	{ 0, 1, 0, 0 , 0 },
										{ 0, 0, 1, 0 , 0 },
										{ 0, 0, 0, 1 , 0 },
										{ 0, 0, 0, 0 , 1 },
										{ 1, 0, 0, 0 , 0 }
									};
	public static boolean[] visited = new boolean[vertices.length];
	public static Graph graph = new Graph(vertices);
	public static List<Integer> path = new LinkedList<Integer>();
	public static void main(String[] args) {
		List<Integer> returnedPath = DFS(0);
		if (returnedPath.get(0) != returnedPath.get(returnedPath.size()-1)) {
			System.out.println("graph is not cyclic");
		} else {
			System.out.println(returnedPath);
		}	
	}

	private static List<Integer> DFS(int vertex) {
		if (vertex >= vertices.length) {
			System.out.println("graph is not cyclic");
			return path;
		}
		if (!visited[vertex]) {
			visited[vertex] = true;
			path.add(vertex);
			for (int child : graph.getSuccessors(vertex)) {
				DFS(child);
			}
		} else {
			System.out.println("graph is cyclic : ");
			path.add(vertex);
			return path;
		}
		return path;
	}

	
	

}
