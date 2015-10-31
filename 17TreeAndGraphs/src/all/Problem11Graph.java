package all;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import org.omg.CORBA.portable.ApplicationException;

public class Problem11Graph {
	private List<Integer>[] childNodes;
	private boolean[] dependantNodes;
	
	public Problem11Graph(List<Integer>[] nodes) {
		this.childNodes = nodes;
	}

	public List<Integer>[] getChildNodes() {
		return childNodes;
	}

	public void setChildNodes(List<Integer>[] childNodes) {
		this.childNodes = childNodes;
	}
	
	private void determineDependantNodes() {
		this.dependantNodes = new boolean[this.childNodes.length];
		for (int i = 0; i < this.childNodes.length; i++) {
			for(int j = 0; j < this.childNodes[i].size(); j++) {
				dependantNodes[this.childNodes[i].get(j)] = true;
			}
		}
	}
	
	private boolean hasCyclesAfterTopologicalSort(List<Integer>[] graph) {
		for (List<Integer> successors : graph) {
			if (successors.size() > 0) {
				return true;
			}
		}
		return false;
	}
	
	private void printSortedElements(List<Integer> sortedElements) {
		System.out.print(sortedElements.get(1));
		for (int i = 2; i < sortedElements.size(); i++) {
			System.out.printf(", %d", sortedElements.get(i));
		}
	}
	
	public void topologicalSort() {
		@SuppressWarnings("unchecked")
		List<Integer>[] sortingGraph = new List[this.childNodes.length];
		System.arraycopy(childNodes, 0, sortingGraph, 0, childNodes.length);
		determineDependantNodes();
		Queue<Integer> startNodes = new LinkedList<Integer>();
		for (int i = 0; i < dependantNodes.length; i++) {
			if (dependantNodes[i] == false) {
				startNodes.add(i);
			}
		}
		List<Integer> sortedElements = new ArrayList<Integer>();
		while (startNodes.size() > 0) {
			int currenNode = startNodes.poll();
			sortedElements.add(currenNode);
			List<Integer> searchingList = new ArrayList<Integer> (sortingGraph[currenNode]);
			for (Integer node : searchingList) {
				while (sortingGraph[currenNode].remove(node)){}
				boolean addToStartNodes = true;
				for (List<Integer> successors : sortingGraph) {
					if (successors.contains(node)) {
						addToStartNodes = false;
						break;
					}
				}
				if (addToStartNodes == true) {
					startNodes.add(node);
				}
			}
		}
		boolean hasCycles = hasCyclesAfterTopologicalSort(sortingGraph);
		if (hasCycles == true) {
			System.out.println("Cannot sort");
			return;
		} else {
			printSortedElements(sortedElements);
			return;
		}
	}
	
	public static Problem11Graph createGraphFromPairs() throws ApplicationException {
		Scanner input = new Scanner(System.in);
		String pairsInfoInput = input.nextLine();
		String[] pairsInfo = pairsInfoInput.split(" ");
		int verticesCount = Integer.parseInt(pairsInfo[0]);
		int pairsCount = Integer.parseInt(pairsInfo[1]);
		if (verticesCount < 2) {
			input.close();
			throw new ApplicationException("Graph must have at least two vertices", null);
		}
		if (pairsCount < 0) {
			input.close();
			throw new ApplicationException("Pairs must be zero or more", null);
		}
		@SuppressWarnings("unchecked")
		List<Integer>[] graphArray = new List[verticesCount + 1];
		for (int i = 0; i < graphArray.length; i++) {
			graphArray[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < pairsCount; i++) {
			String currentPairInput = input.nextLine();
			String[] currentPair = currentPairInput.split(",");
			int left = Integer.parseInt(currentPair[0]);
			int right = Integer.parseInt(currentPair[1]);
			if (left != right) {
				graphArray[left].add(right);
			} else {
				input.close();
				throw new ApplicationException("A vertex cannot be it's own successor", null);
			}
		}
		Problem11Graph newGraph = new Problem11Graph(graphArray);
		input.close();
		return newGraph;
	}
}
