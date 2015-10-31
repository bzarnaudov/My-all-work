package all;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Problem10DijkstraGraphFindShortPath {
	static List<Problem10Vertex>[] matrix;
	static long shortestTotal = Long.MAX_VALUE;
	static int startNode;
	
	static void dijkstraAlgorithm(int startNode) {
		long[] shortestPaths = new long[matrix.length];
		boolean[] visited = new boolean[matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			shortestPaths[i] = Integer.MAX_VALUE;
		}
		Queue<Integer> nodesQueue = new LinkedList<Integer>();
		shortestPaths[startNode] = 0;
		nodesQueue.add(startNode);
		
		int currentNode;
		while (nodesQueue.size() > 0) {
			currentNode = nodesQueue.poll();
			if (visited[currentNode] == true) {
				continue;
			}
			visited[currentNode] = true;
			for (int i = 0; i < matrix[currentNode].size(); i++) {
				int j = matrix[currentNode].get(i).getTo();
				int weight = matrix[currentNode].get(i).getPrice();
				long currentDistance = shortestPaths[currentNode] + weight;
				if (currentDistance < shortestPaths[j]) {
					shortestPaths[j] = currentDistance;
					nodesQueue.add(j);
					visited[j] = false;
				}
			}
		}
		
		for (int i = 0; i < shortestPaths.length; i++) {
			if (i == startNode) {
				continue;
			}
			if (shortestPaths[i] == Integer.MAX_VALUE) {
				System.out.printf("From {%d} to {%d} -> No path%n", startNode, i);
			} else {
				System.out.printf("From {%d} to {%d} -> {%d}%n", startNode, i, shortestPaths[i]);			
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void readGraph() {
		Scanner input = new Scanner(System.in);
		String nodesEdgesInput = input.nextLine();
		String[] nodesEdges = nodesEdgesInput.split(" ");
		int nodes = Integer.parseInt(nodesEdges[0]);
		int edges = Integer.parseInt(nodesEdges[1]);
		
		matrix = new ArrayList[nodes];
		for (int i = 0; i < matrix.length; i++) {
			matrix[i] = new ArrayList<Problem10Vertex>();
		}
		for (int i = 0; i < edges; i++) {
			String currentEdges = input.nextLine();
			String[] currentEdge = currentEdges.split(" ");
			int from = Integer.parseInt(currentEdge[0]);
			int to = Integer.parseInt(currentEdge[1]);
			int weight = Integer.parseInt(currentEdge[2]);
			matrix[from].add(new Problem10Vertex(to, weight));
		}
		
		startNode = Integer.parseInt(input.nextLine());
		input.close();
	}
	
	public static void main(String[] args) {
		readGraph();
		dijkstraAlgorithm(startNode);
	}
}
