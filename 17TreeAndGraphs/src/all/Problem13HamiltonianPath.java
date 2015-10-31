package all;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem13HamiltonianPath {
	private static List<Problem13Vertex>[] graph;
	private static int minimumSum = Integer.MAX_VALUE;
	private static int currentSum;
	private static int[] minimumCycle;
	private static int[] currentCycle;
	private static boolean[] visited;
	private static final int MaxVertexCount = 151;

	private static void hamilton(int currentNode, int level) {
		if (currentNode == 0 && level > 0) {
			if (level == graph.length) {
				minimumSum = currentSum;
				for (int i = 0; i < graph.length; i++) {
					minimumCycle[i] = currentCycle[i];
				}
			}
			return;
		}
		if (visited[currentNode] == true) {
			return;
		}
		visited[currentNode] = true;

		for (int k = 0; k < graph[currentNode].size(); k++) {
			int nextVertex = graph[currentNode].get(k).getTo();
			int price = graph[currentNode].get(k).getPrice();
			currentCycle[level] = nextVertex;
			currentSum += price;
			if (currentSum < minimumSum) {
				hamilton(nextVertex, level + 1);
			}
			currentSum -= price;
		}
		visited[currentNode] = false;
	}
	
	private static void hamilton(int startNode) {
		currentSum = 0;
		minimumCycle = new int[MaxVertexCount];
		currentCycle = new int[MaxVertexCount];
		visited = new boolean[graph.length];
		currentCycle[0] = 0;
		hamilton(startNode, 0);
	}
	
	private static void printHamiltonCycle() {
		System.out.print("0");
		for (int i = 0; i < graph.length - 1; i++) {
			System.out.printf(" %d", minimumCycle[i]);
		}
		System.out.println();
		System.out.println(minimumSum);
	}

	@SuppressWarnings("unchecked")
	private static void readGraph() {
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
		String[] nodesEdges = inputString.split(" ");
		int nodes = Integer.parseInt(nodesEdges[0]);
		int edges = Integer.parseInt(nodesEdges[1]);

		graph = new ArrayList[nodes];
		for (int i = 0; i < nodes; i++) {
			graph[i] = new ArrayList<Problem13Vertex>();
		}

		for (int i = 0; i < edges; i++) {
			inputString = input.nextLine();
			String[] currentEdge = inputString.split(" ");
			int from = Integer.parseInt(currentEdge[0]);
			int to = Integer.parseInt(currentEdge[1]);
			int weight = Integer.parseInt(currentEdge[2]);
			graph[from].add(new Problem13Vertex(to, weight));
		}
		input.close();
	}
	
	public static void main(String[] args) {
		readGraph();
		hamilton(0);
		if (minimumSum != Integer.MAX_VALUE) {
			printHamiltonCycle();
		} else {
			System.out.println("No");
		}
	}
}
