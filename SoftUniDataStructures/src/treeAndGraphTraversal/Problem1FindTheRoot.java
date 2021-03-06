package treeAndGraphTraversal;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem1FindTheRoot {
	
	static Map<Integer, Tree<Integer>> nodeByValue = new HashMap<>();
	
	public static void main(String[] args) {
		readFromConsole();
		findRootNode();
	}
	
	private static void readFromConsole() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please write number of nodes in the forest: ");
		int nodesCount = Integer.parseInt(input.nextLine());
		System.out.print("Please write number of edges in the forest: ");
		int edgesCount = Integer.parseInt(input.nextLine());
		for ( int i = 0; i < nodesCount; i++) {
			createTreeNodeByValue(i);
		}
		for (int i = 1; i <= edgesCount; i++) {
			System.out.println("Write parent and child with space between them(edge " + i + ") : " );
			String[] edge = input.nextLine().split(" ");
			int parentValue = Integer.parseInt(edge[0]);
			if (isNotCorrectNode(parentValue, nodesCount)) {
				break;
			}
			Tree<Integer> parentNode = nodeByValue.get(parentValue);
			int childValue = Integer.parseInt(edge[1]);
			if (isNotCorrectNode(childValue, nodesCount)) {
				break;
			}
			Tree<Integer> childNode = nodeByValue.get(childValue);
			parentNode.getChildren().add(childNode);
			childNode.setParent(parentNode);
		}
		input.close();
	}
	
	private static boolean isNotCorrectNode(int parentValue, int nodesCount) {
		if (parentValue < 0 || parentValue > nodesCount) {
			System.out.println("There is no node with this value: " + parentValue);
			return true;
		}
		return false;
	}

	//dictionary to map nodes by their value
	@SuppressWarnings("unchecked")
	private static void createTreeNodeByValue(int value) {
		nodeByValue.put(value, new Tree<Integer>(value));
		
	}
	
	public static void findRootNode() {
		Tree<Integer> rootNode = null;
		int rootNodeCount = 0;
		for (Tree<Integer> node : nodeByValue.values()) {
			if (node.getParent() == null) {
				rootNode = node;
				//roots of trees
//				System.out.println(rootNode.getValue() + " ");
				rootNodeCount++;
			}
		}
		if (rootNodeCount == 1) {
			System.out.println("Root node: " + rootNode.getValue());
		} else if (rootNodeCount > 1){
			System.out.println("Forest is not a tree");
		} else {
			System.out.println("No root!");
		}
	}
}
