package treeAndGraphTraversal;

import java.util.LinkedList;

public class Node<T> {
	T element;
	LinkedList<Node<T>> childNodes;
	
	Node(T element) {
		this.element = element;
		childNodes = new LinkedList<Node<T>>();
	}
}
