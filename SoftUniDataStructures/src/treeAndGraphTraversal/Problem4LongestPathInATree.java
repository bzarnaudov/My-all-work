package treeAndGraphTraversal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Problem4LongestPathInATree {
	static Map<Integer, Tree<Integer>> nodeByValue = new HashMap<>();
	static Map<Integer, Integer> pathBetweenRootAndNode = new HashMap<>();
	static int pathSum, subtreeSum;	
	static Tree<Integer> rootNode;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please write number of nodes in the tree : ");
		@SuppressWarnings("unused")
		int nodesCount = Integer.parseInt(input.nextLine());
		System.out.print("Please write number of edges in the tree : ");
		int edgesCount = Integer.parseInt(input.nextLine());
		for ( int i = 1; i <= edgesCount; i++) {
			System.out.println("Write parent and child with space between them(edge " + i + ") : " );
			String[] edge = input.nextLine().split(" ");
			int parentValue = Integer.parseInt(edge[0]);
			Tree<Integer> parentNode = getTreeNodeByValue(parentValue);
			int childValue = Integer.parseInt(edge[1]);
			Tree<Integer> childNode = getTreeNodeByValue(childValue);
			parentNode.getChildren().add(childNode);
			childNode.setParent(parentNode);
		}
		findRootNode();
		sumLongPath();
		input.close();
	}
	
	
	public static Queue<Tree<Integer>> findLeaf() {
		Stack<Tree<Integer>> stack = new Stack<Tree<Integer>>();
		Queue<Tree<Integer>> listLeaf = new LinkedList<Tree<Integer>>();
		Tree<Integer> currentNode = rootNode;

		stack.add(currentNode);
		do {
			currentNode = stack.pop();

			for (Tree<Integer> childNode : currentNode.getChildren()) {
				stack.add(childNode);
				if (childNode.getChildren().size() == 0) {
					listLeaf.add(childNode);
				}
			}
		} while (stack.size() > 0);

		return listLeaf;
	}
	
	
	public static void sumLongestPath() {
		Queue<Tree<Integer>> leafs = findLeaf();
		while (leafs.size() > 0) {
			
		}
	}
	
	public static void sumLongPath() {
		Queue<Tree<Integer>> leafs = findLeaf();
		List<List<Integer>> pathsToRootList = new LinkedList<List<Integer>>();
		while (leafs.size() > 0) {
			Tree<Integer> currentNode = leafs.poll();
			int currentValue = currentNode.getValue();
			List<Integer> currentPathToRoot = new LinkedList<Integer>();
			while (currentNode != rootNode) {
				currentPathToRoot.add(currentValue);
				currentNode = currentNode.getParent();
				currentValue = currentNode.getValue();
			}
			pathsToRootList.add(currentPathToRoot);
		}
		int maximumPath = Integer.MIN_VALUE;
		for (int i = 0; i < pathsToRootList.size(); i++) {
            for (int j = i + 1; j < pathsToRootList.size(); j++) {
            	ArrayList<Integer> unionList = new ArrayList<Integer>();
            	unionList.addAll(pathsToRootList.get(i));
        		unionList.removeAll(pathsToRootList.get(j));
        		unionList.addAll(pathsToRootList.get(j));
        		ArrayList<Integer> intersectList = new ArrayList<Integer>();
        		intersectList.addAll(pathsToRootList.get(i));
        		intersectList.retainAll(pathsToRootList.get(j));
            	intersectList.addAll(pathsToRootList.get(i));
            	intersectList.retainAll(pathsToRootList.get(j));
            	
            	if (unionList.removeAll(intersectList) == false) {
                	int sumI = sumOfPath(pathsToRootList.get(i));
                	int sumJ = sumOfPath(pathsToRootList.get(j));
                    int currentSum = sumI + sumJ + rootNode.getValue();
                    if (currentSum > maximumPath) {
                        maximumPath = currentSum;
                    }
                } else {
                	unionList.trimToSize();
                	int currentSum = sumArrayList(unionList) + 
                			getTreeNodeByValue(unionList.get(unionList.size()-1)).getParent().getValue();
                	if (currentSum > maximumPath) {
                        maximumPath = currentSum;
                    }
                }
            }
        }
		System.out.println(maximumPath);
	}
	
	private static Integer sumArrayList(ArrayList<Integer> unionList) {
		int sum = 0;
		for (int i = 0; i < unionList.size(); i++) {
			sum += unionList.get(i);
		}
		return sum;
	}


	private static int sumOfPath(List<Integer> list) {
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum;
	}


	private static void findRootNode() {
		for (Tree<Integer> node : nodeByValue.values()) {
			if (node.getParent() == null) {
				rootNode = node;
			}
		}
	}

	//dictionary to map nodes by their value
		@SuppressWarnings("unchecked")
		private static Tree<Integer> getTreeNodeByValue(
				int value) {
			if (!nodeByValue.containsKey(value)) {
				nodeByValue.put(value, new Tree<Integer>(value));
			}
			return nodeByValue.get(value);
		}
}
