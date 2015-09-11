package all;

import java.util.LinkedList;
import java.util.Queue;

public class Problem7GraphShortestPathbetweenVertices {

    public static void BFS(Problem7Graph graph, char startNode, char goalNode) {
        int cost = 1;
        Queue<Problem7Edge> openEdges = new LinkedList<Problem7Edge>();
        char currentNode = startNode;
        boolean[] visitedEdges = new boolean[graph.getEdges().size()];

        for (int index = 0; index < graph.getEdges().size(); index++) {
            if ((graph.getEdges().get(index).edgeNodeOne == currentNode) || 
            		(graph.getEdges().get(index).edgeNodeTwo == currentNode)) {
            	Problem7Edge temp = graph.getEdges().get(index);

                visitedEdges[index] = true;
                temp.cost = cost;
                openEdges.add(temp);
            }
        }

        while (openEdges.size() != 0) {
        	Problem7Edge currentEdge = openEdges.peek();

            currentNode = currentEdge.edgeNodeOne;
            char nextNode = currentEdge.edgeNodeTwo;

            openEdges.poll();

            if (currentEdge.edgeNodeOne == goalNode || currentEdge.edgeNodeTwo == goalNode) {
                System.out.println(currentEdge.cost);
                return;
            }

            cost = currentEdge.cost + 1;

            for (int index = 0; index < graph.getEdges().size(); index++) {
                if (!visitedEdges[index]) {
                    if ((graph.getEdges().get(index).edgeNodeOne == nextNode) ||
                    		(graph.getEdges().get(index).edgeNodeTwo == nextNode)) {
                    	Problem7Edge temp = graph.getEdges().get(index);

                        visitedEdges[index] = true;
                        temp.cost = cost;
                        openEdges.add(temp);
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
    	Problem7Graph graph = new Problem7Graph().createGraph();
		BFS(graph, 'x','y');
	}
                                   
}
