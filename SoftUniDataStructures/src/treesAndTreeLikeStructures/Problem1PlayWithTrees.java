package treesAndTreeLikeStructures;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

public class Problem1PlayWithTrees<T> {
	
	static Map<Integer, Tree<Integer>> nodeByValue = new HashMap<>();
	static int pathSum, subtreeSum;	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please write number of nodes in the tree : ");
		int nodesCount = Integer.parseInt(input.nextLine());
		for ( int i = 1; i < nodesCount; i++) {
			System.out.println("Write parent and child with space between them(edge " + i + ") : " );
			String[] edge = input.nextLine().split(" ");
			int parentValue = Integer.parseInt(edge[0]);
			Tree<Integer> parentNode = getTreeNodeByValue(parentValue);
			int childValue = Integer.parseInt(edge[1]);
			Tree<Integer> childNode = getTreeNodeByValue(childValue);
			parentNode.getChildren().add(childNode);
			childNode.setParent(parentNode);
		
		}
		System.out.println("Write path sum : ");
		pathSum = Integer.parseInt(input.nextLine());
		System.out.println("Write subtree sum : ");
		subtreeSum = Integer.parseInt(input.nextLine());
		Tree<Integer> rootNode = findRootNode();
		System.out.println("Root node: " + rootNode.getValue());
		System.out.printf("Leaf nodes: " + findLeafNodes().toString() + "\n");
		System.out.printf("Middle nodes: " + findMiddleNodes().toString() + "\n");
		System.out.println("Longest path: ");
		List<Integer> longestPath = findLongestPath(rootNode);
		printPath(longestPath);
		System.out.println("(length = " + findLongestPath(rootNode).size() + ")");
		System.out.println("Paths of sum " + pathSum + ":");
        List<Tree<Integer>> startLeafs = pathsOfSum();
        for (Tree<Integer> startLeaf : startLeafs) {
        	printPath(getPath(startLeaf));
        	System.out.println();
        }
        System.out.println("Subtrees of sum " + subtreeSum + ":");
        List<Tree<Integer>> subtrees = findSubtreeWithGivenSum();
        for (Tree<Integer> subtree : subtrees) {
        	System.out.print(subtree.getValue() + " + ");
        	for (int i = 0; i < subtree.getChildren().size(); i++) {
    			System.out.print(subtree.getChildren().get(i).getValue() + " ");
    			if (i != subtree.getChildren().size()-1) {
    				System.out.print("+ ");
    			}
    		}
        }
		input.close();
	}
	
	private static List<Tree<Integer>> findSubtreeWithGivenSum() {
        List<Tree<Integer>> nodes = new LinkedList<Tree<Integer>>();
        for (Tree<Integer> node : nodeByValue.values()) {
            if (TreeSum(node) == subtreeSum) {
                nodes.add(node);
            }
        }
        return nodes;
    }

    private static int TreeSum(Tree<Integer> node) {
        if (node == null) {
        	// node.Children.Count == 0 
            return 0;
        }
        int childSum = 0;
        for (Tree<Integer> child : node.getChildren()) {
            childSum += TreeSum(child);
        }
        return node.getValue() + childSum;
    }
    
	private static void printPath(List<Integer> pathList) {
		for (int i = 0; i < pathList.size(); i++) {
			System.out.print(pathList.get(i) + " ");
			if (i != pathList.size()-1) {
				System.out.print("-> ");
			}
		}
	}

	// Without recursion - Starts with leaf nodes list
	private static List<Tree<Integer>> pathsOfSum() {
        List<Tree<Integer>> leafNodes = findLeafNodesTreeList();
        List<Tree<Integer>> paths = new LinkedList<Tree<Integer>>(); 
        for (Tree<Integer> leaf : leafNodes) {
        	List<Integer> pathList = getPath(leaf);
        	int sum = 0;
        	for (int i : pathList) {
        		sum += i;
        	}
            if (sum == pathSum) {
                paths.add(leaf);
            }
        }
        return paths;
    }
	
	// Gets path from given leaf to root node
    static List<Integer> getPath(Tree<Integer> leafNode) {
        Stack<Integer> path = new Stack<Integer>();
        while (leafNode != null) {
            path.push(leafNode.getValue());
            leafNode = leafNode.getParent();
        }
        List<Integer> pathList = new LinkedList<Integer>();
        while (!path.isEmpty()) {
        	pathList.add(path.pop());
        }
        return pathList;
    }
    
	private static List<Tree<Integer>> findLeafNodesTreeList() {
		List<Tree<Integer>> leafNodes = new LinkedList<Tree<Integer>>();
		for (Tree<Integer> node : nodeByValue.values()) {
			if (node.getParent() != null && node.getChildren().isEmpty()) {
				leafNodes.add(node);
			}
		}	
		return leafNodes;
	}
	
	private static List<Integer> findLongestPath(Tree<Integer> node) {
		List<Integer> longestPath = new LinkedList<>();
		List<Integer> currentPath  = new LinkedList<>();
		for (Tree<Integer> child : node.getChildren()) {
			currentPath = findLongestPath(child);
			if (longestPath.size() < currentPath.size()) {
				longestPath = currentPath;
			}
		}
		longestPath.add(0, node.getValue());
		return longestPath;
	}

	private static TreeSet<Integer> findMiddleNodes() {
		TreeSet<Integer> middleNodes = new TreeSet<>();
		for (Tree<Integer> node : nodeByValue.values()) {
			if (node.getParent() != null && !node.getChildren().isEmpty()) {
				middleNodes.add(node.getValue());
			}
		}	
		return middleNodes;
	}

	private static TreeSet<Integer> findLeafNodes() {
		TreeSet<Integer> leafNodes = new TreeSet<>();
		for (Tree<Integer> node : nodeByValue.values()) {
			if (node.getParent() != null && node.getChildren().isEmpty()) {
				leafNodes.add(node.getValue());
			}
		}	
		return leafNodes;
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
	
	public static  Tree<Integer> findRootNode() {
		Tree<Integer> rootNode = null;
		for (Tree<Integer> node : nodeByValue.values()) {
			if (node.getParent() == null) {
				rootNode = node;
			}
		}
		return rootNode;
	}	
}

