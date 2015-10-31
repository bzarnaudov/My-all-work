package all;

import java.util.Stack;

public class Problem12Graph {
	private int[][] nodes;
	
	public Problem12Graph(int[][] nodes) {
		this.nodes = nodes;
	}
	
	public Stack<Integer> findEulerCycle(int startNode) {
		int[][] graphCopy = new int[nodes.length][nodes[0].length];
		for (int i = 0; i < nodes.length; i++) {
			for (int j = 0; j < nodes[i].length; j++) {
				graphCopy[i][j] = nodes[i][j];
			}
		}
		Stack<Integer> currentCycle = new Stack<Integer>();
		Stack<Integer> eulerCycle = new Stack<Integer>();
		currentCycle.push(startNode);
		while (currentCycle.size() > 0) {
			int currentNode = currentCycle.peek();
			boolean hasChilds = true;
            for (int i = 0; i < graphCopy.length; i++) {
			    if (graphCopy[currentNode][i] == 1) {
		            graphCopy[currentNode][i] = 0;
                    currentNode = i;
                    break;
	            }
                if (i == graphCopy.length - 1) {
                    hasChilds = false;
                }
			}

            if (hasChilds) {
                currentCycle.push(currentNode);
            } else {
                eulerCycle.push(currentCycle.pop());
            }
	    }
		return eulerCycle;
	}
		
	public boolean isEulerGraph() {
        for (int i = 0; i < nodes.length; i++) {
            int degree = 0;
            for (int j = 0; j < nodes[0].length; j++) {
                if (nodes[i][j] == 1) {
                    degree++;
                }
                if (nodes[j][i] == 1) {
                    degree--;
                }
            }
            if (degree != 0) {
                return false;
            }
        }
        return true;
    }
}
