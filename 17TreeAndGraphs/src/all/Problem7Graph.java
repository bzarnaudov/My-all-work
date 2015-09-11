package all;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem7Graph {
    private List<Problem7Edge> edges = new LinkedList<Problem7Edge>();

    public Problem7Graph() {  	
    }

    public void addEdge(char nodeOne, char nodeTwo) {
        edges.add(new Problem7Edge(nodeOne, nodeTwo));
    }

    public List<Problem7Edge> getEdges() {
		return edges;
	}

    public Problem7Graph createGraph() throws Exception {
    	Problem7Graph graph = new Problem7Graph();
        Scanner input = new Scanner(System.in);
        System.out.print("Write the edges : ");
        String line = input.nextLine();
        System.out.println();

        while (!line.equals("")) {
            String[] edgeNodes = line.split(" ");
            if (edgeNodes.length > 2) {
            	input.close();
                throw new Exception("Incorrect input: Graph edges can only have two nodes.");    
            }
            graph.addEdge(edgeNodes[0].charAt(0), edgeNodes[1].charAt(0));
            System.out.print("Write the edges : ");
            line = input.nextLine();
            System.out.println();
        }
        input.close();
        return graph;
    }
}
