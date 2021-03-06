package treeAndGraphTraversal;

import java.util.LinkedList;
import java.util.List;

public class Tree<T> {
	private T value;
	private Tree<T> parent;
	private List<Tree<T>> children;
	
	public Tree() {
		this.setChildren(new LinkedList<Tree<T>>());
	}
	
	@SuppressWarnings("unchecked")
	public Tree(T value, Tree<T> ...children) {
		this();
		if (value == null) {
			throw new IllegalArgumentException(
			"Cannot insert null value!");
		}
		this.value = value;
	
		for (Tree<T> child : children) {
			this.getChildren().add(child);
			child.setParent(this);
		}
	}
	
	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Tree<T> getParent() {
		return parent;
	}

	public void setParent(Tree<T> parent) {
		this.parent = parent;
	}

	public List<Tree<T>> getChildren() {
		return children;
	}

	public void setChildren(List<Tree<T>> children) {
		this.children = children;
	}
}