package all;

import java.util.Scanner;
import java.util.Stack;

public class Problem12EulerianCycle {
	
	public static void main(String[] args) {
		Problem12Graph graph = new Problem12Graph(readGraph());
		if (graph.isEulerGraph()) {
			printResult(graph.findEulerCycle(0));
		} else {
			System.out.println("No");
		}
	}

	private static void printResult(Stack<Integer> eulerCycle) {
		// Print Euler cycle in format {start node1 node2 ... end}
        while (eulerCycle.size() > 0) {
            if (eulerCycle.size() > 1) {
            	System.out.printf("%d ", eulerCycle.pop());
            } else {
            	System.out.println(eulerCycle.pop());
            }
        }
	}

	private static int[][] readGraph() {
		// Read graph as adjacency matrix
		Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        int n = Integer.parseInt(inputString);

        int[][] graph = new int[n][n];
        for (int i = 0; i < n; i++) {
            inputString = input.nextLine();
            String[] rowElements = inputString.split(", ");
            for (int j = 0; j < n; j++) {
                graph[i][j] = Integer.parseInt(rowElements[j]);
            }
        }
        input.close();
        return graph;
	}
	
}
