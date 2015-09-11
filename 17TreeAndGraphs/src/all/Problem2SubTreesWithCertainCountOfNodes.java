package all;

import java.util.Scanner;

import all.Tree.TreeNode;

public class Problem2SubTreesWithCertainCountOfNodes {

	static int count = 0, occurrences = 0;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Write count of nodes of Subtrees for searching: ");
		count = input.nextInt();
		@SuppressWarnings("unchecked")
		Tree<Integer> tree =
				new Tree<Integer>(7,
						new Tree<Integer>(19,
								new Tree<Integer>(6),
								new Tree<Integer>(12),
								new Tree<Integer>(31)),
						new Tree<Integer>(21),
						new Tree<Integer>(14,
								new Tree<Integer>(23),
								new Tree<Integer>(6))
				);
		System.out.println("subtrees roots with " + count + " nodes are : ");
		findingRoots(tree.getRoot());
		if (occurrences == 0) {
			System.out.println("none");
		}
		input.close();
	}

	private static void findingRoots(TreeNode<Integer> treeNode) {
		if (treeNode == null) {
			return;
		}
		if (count == treeNode.getChildrenCount()) {
			System.out.print(treeNode.getValue() + " ");
			occurrences();
		}
		TreeNode<Integer> child = null;			
		for (int i = 0; i < treeNode.getChildrenCount(); i++) {
			child = treeNode.getChild(i);
			findingRoots(child);
		}	
	}

	private static void occurrences() {
		occurrences++;
	}

}
