package all;

import java.util.ArrayList;
import all.BinaryTree.BinaryTreeNode;

public class Problem5PrintsAllVerticesOfABinaryTreeWithLeavesSuccessors {
	public static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		BinaryTree<Integer> binaryTree =
				new BinaryTree<Integer>(14,
						new BinaryTree<Integer>(19,
								new BinaryTree<Integer> (23),
								new BinaryTree<Integer> (6,
										new BinaryTree<Integer>(10),
										new BinaryTree<Integer>(21))),
						new BinaryTree<Integer>(15,
								new BinaryTree<Integer>(3),
								new BinaryTree<Integer>(16)));
		
		findingNodes(binaryTree.getRoot());
		System.out.println(list.toString());
	}

	private static void findingNodes(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		// 1. Visit the root of this subtree.
		if (root.getLeftChild() != null &&
				root.getRightChild() != null) {
			if (root.getLeftChild().getLeftChild() == null &&
					root.getLeftChild().getRightChild() == null &&
					root.getRightChild().getLeftChild() == null &&
					root.getLeftChild().getRightChild() == null) {
				list.add(root.getValue());
			}
		}
		// 2. Visit the left child.
		findingNodes(root.getLeftChild());
		// 3. Visit the right child.
		findingNodes(root.getRightChild());
	}

}
