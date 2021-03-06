package all;

import java.util.ArrayList;
import all.BinaryTree.BinaryTreeNode;

public class Problem4SumOfTheVerticesOfEachLevelOfTheTree {
	
	public static ArrayList<Integer> sumOfLevel = new ArrayList<Integer>();
	public static void main(String[] args) {
		// Create the binary tree from the sample.
		BinaryTree<Integer> binaryTree =
					new BinaryTree<Integer>(14,
							new BinaryTree<Integer>(19,
									new BinaryTree<Integer> (23),
									new BinaryTree<Integer> (6,
											new BinaryTree<Integer>(10),
											new BinaryTree<Integer>(21))),
							new BinaryTree<Integer>(15,
									new BinaryTree<Integer>(3),
									null));
		
		setDepthOfNodes(binaryTree.getRoot(), 0);
		System.out.println(sumOfLevel.toString());
}
	

	public static void setDepthOfNodes(BinaryTreeNode<Integer> root, int depth) {
		if (root == null) {
			return;
		}
		// 1. Visit the root of this subtree.
		root.setDepth(depth);
		if (sumOfLevel.size() <= depth) {
			sumOfLevel.add(0);
		}
		sumOfLevel.set(depth, sumOfLevel.get(depth) + root.getValue());
		// 2. Visit the left child.
		setDepthOfNodes(root.getLeftChild(), depth + 1);
		// 3. Visit the right child.
		setDepthOfNodes(root.getRightChild(), depth + 1);
	}

}
