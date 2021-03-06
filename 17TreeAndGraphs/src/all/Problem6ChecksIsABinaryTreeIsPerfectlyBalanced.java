package all;

import java.util.Stack;

import all.BinaryTree.BinaryTreeNode;

public class Problem6ChecksIsABinaryTreeIsPerfectlyBalanced {

	public static BinaryTree<Integer> binaryTree;
	
	public static void main(String[] args) {
		binaryTree =
				new BinaryTree<Integer>(14,
						new BinaryTree<Integer>(19,
								new BinaryTree<Integer> (23,new BinaryTree<Integer>(10),null),
								new BinaryTree<Integer> (6,
										null,
										new BinaryTree<Integer>(21))),
						new BinaryTree<Integer>(15,
								new BinaryTree<Integer>(3),
								new BinaryTree<Integer>(16,new BinaryTree<Integer>(18),null)));
		System.out.println(isIdeallyBalanced());
	}
	
	public static int countNodesDfs(BinaryTreeNode<Integer> root) {
		int nodesCount = 1;
		Stack<BinaryTreeNode<Integer>> currentNodes = new Stack<BinaryTreeNode<Integer>>();
		currentNodes.push(root);

		while (currentNodes.size() > 0) {
			BinaryTreeNode<Integer> currentNode = currentNodes.pop();
			if (currentNode.getLeftChild() != null) {
				currentNodes.push(currentNode.getLeftChild());
				nodesCount++;
			}
			if (currentNode.getRightChild() != null) {
				currentNodes.push(currentNode.getRightChild());
				nodesCount++;
			}
		}
		return nodesCount;
	}

	public static boolean isIdeallyBalanced() {
		return isIdeallyBalanced(binaryTree.getRoot());
	}

	public static boolean isIdeallyBalanced(BinaryTreeNode<Integer> root)
	{
		long leftTreeNodesCount = 0;
		long rightTreeNodesCount = 0;

		if (root == null) {
			return true;
		}
		if (root.getLeftChild() != null) {
			leftTreeNodesCount = countNodesDfs(root.getLeftChild());
		}
		if (root.getRightChild() != null) {
			rightTreeNodesCount = countNodesDfs(root.getRightChild());
		}

		if (Math.abs(leftTreeNodesCount - rightTreeNodesCount) <= 1 &&
			isIdeallyBalanced(root.getLeftChild()) == true &&
			isIdeallyBalanced(root.getRightChild()) == true) {
			return true;
		}
		return false;
	}
}