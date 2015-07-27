package all;

public class BinarySearchTreeExample {

	public static void main(String[] args) {
		BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<Integer>();
		binarySearchTree.insert(19);
		binarySearchTree.insert(11);
		binarySearchTree.insert(7);
		binarySearchTree.insert(16);
		binarySearchTree.insert(13);
		binarySearchTree.insert(17);
		binarySearchTree.insert(35);
		binarySearchTree.insert(23);
		binarySearchTree.remove(11);
		binarySearchTree.remove(35);
		binarySearchTree.printPreOrder();
	}

}
