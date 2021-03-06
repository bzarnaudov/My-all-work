package all;

import all.Tree.TreeNode;

public class Problem3NumberOfLeavesAndNumberOfInternalVertices {

	static int numberOfLeaves = 0, numberOfInternalVertices = 0;
	
	public static void main(String[] args) {
		@SuppressWarnings("unchecked")
		Tree<Integer> tree =
				new Tree<Integer>(7,
						new Tree<Integer>(19,
								new Tree<Integer>(6),
								new Tree<Integer>(12),
								new Tree<Integer>(31)),
						new Tree<Integer>(21,new Tree<Integer>(1),new Tree<Integer>(122)),
						new Tree<Integer>(14,
								new Tree<Integer>(23),
								new Tree<Integer>(6))
				);
		
		findingRoots(tree.getRoot());
		System.out.println("number of leaves is " + numberOfLeaves +
				", number of internal vertices is " + numberOfInternalVertices);
	}

	private static void findingRoots(TreeNode<Integer> treeNode) {
		if (treeNode == null) {
			return;
		}
		if (treeNode.getChildrenCount() == 0) {
			numberOfLeaves = occurrences(numberOfLeaves);
		}
		if (treeNode.getChildrenCount() != 0 && treeNode.hasParent() == true) {
			numberOfInternalVertices = occurrences(numberOfInternalVertices);
		}
		
		TreeNode<Integer> child = null;			
		for (int i = 0; i < treeNode.getChildrenCount(); i++) {
			child = treeNode.getChild(i);
			findingRoots(child);
		}	
	}

	private static int occurrences(int number) {
		number++;
		return number;
	}

}
