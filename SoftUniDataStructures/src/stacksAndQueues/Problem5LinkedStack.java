package stacksAndQueues;

import java.util.NoSuchElementException;
@SuppressWarnings({"unchecked"})

public class Problem5LinkedStack<T> {
	
	@SuppressWarnings("hiding")
	private class Node<T>{
		T value;
		Node<T> nextNode;
		
		Node(T value, Node<T> nextNode) {
			this.value = value;
			this.nextNode = nextNode;
		}
		Node(T value) {
			this.value = value;
			this.nextNode = null;
		}
	}

	private Node<T> firstNode;
	private int count;
	
	public Problem5LinkedStack() {
		this.firstNode = null;
		this.count = 0;
	}
		
	public void push(T value) {
		if (this.firstNode == null) {
			// We have empty list
			this.firstNode = new Node<T>(value);
		} else {
			// We have non-empty list
			Node<T> newNode = new Node<T>(value, this.firstNode);
			this.firstNode = newNode;
		}
		count++;
	}
	
	public int count() {
		return count;
	}
	
	public T pop() {
        if (this.count == 0) {
              throw new NoSuchElementException("Stack is empty");
        }
        this.count--;
        T poppedvalue = this.firstNode.value;
        this.firstNode = this.firstNode.nextNode;
        return poppedvalue;
    }

	public T[] toArray() {
		if (this.count == 0) {
			return null;
		}
		Node<T> currentNode = this.firstNode;
		T[] allElements =(T[]) new Object[this.count];
		for (int i = 0; i < this.count; i++) {
			allElements[i] = currentNode.value;
			currentNode = currentNode.nextNode;
		}
		return allElements;
	}
}
