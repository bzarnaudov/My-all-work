package all;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

import org.omg.CORBA.portable.ApplicationException;

public class Problem9Graph {
	private int[][] childNodes;
	private static int vertexCount;
	private boolean[] visited;
	private SortedSet<Integer> currentComponent;
	
	public Problem9Graph() {
		
	}
	public Problem9Graph(int[][] nodes) {
		this.childNodes = nodes;
		this.visited = new boolean[vertexCount];
	}

	public int[][] getChildNodes() {
		return childNodes;
	}

	public void setChildNodes(int[][] childNodes) {
		this.childNodes = childNodes;
	}

	private void printConnectedComponent() {
		for (Integer vertex : currentComponent) {
			System.out.print(vertex + " ");
		}
		System.out.println();
		this.currentComponent.clear();
	}
	
	public void getConnectedComponents() {
		currentComponent = new TreeSet<Integer>() ;
		int componentsCounter = 1;
		for (int node = 0; node < this.visited.length; node++) {
			if (this.visited[node] == false) {
				System.out.print("Connected component " + componentsCounter + " : ");
				this.dfs(node);
				printConnectedComponent();
				componentsCounter++;
			}
		}
	}
	
	private void dfs(int currentNode) {
		this.visited[currentNode] = true;
		currentComponent.add(currentNode);
		for (int childNode : this.childNodes[currentNode]) {
			if (this.visited[childNode] == false) {
				dfs(childNode);
			}
		}
	}
	
	public static Problem9Graph createGraph() throws ApplicationException {
		Scanner input = new Scanner(System.in);
		vertexCount = Integer.parseInt(input.nextLine());
		int[][] graphArray = new int[vertexCount][];
		for (int i = 0; i < vertexCount; i++) {
			String sucessors = input.nextLine();
			if (!sucessors.equals("")) {
				String[] currentVertexSucessors = sucessors.split(",");
				graphArray[i] = new int[currentVertexSucessors.length];
				for (int j = 0; j < currentVertexSucessors.length; j++) {
					graphArray[i][j] = Integer.parseInt(currentVertexSucessors[j]);
					if (graphArray[i][j] == i) {
						input.close();
						throw new ApplicationException("A vertex cannot be it's own successors", null);
					}
				}
			} else {
				graphArray[i] = new int[1];
				graphArray[i][0] = 0;
			}
		}
		Problem9Graph newGraph = new Problem9Graph(graphArray);
		input.close();
		return newGraph;
	}
}
