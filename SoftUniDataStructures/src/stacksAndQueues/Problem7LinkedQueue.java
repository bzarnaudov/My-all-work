package stacksAndQueues;

import java.util.NoSuchElementException;
@SuppressWarnings({"unchecked"})

public class Problem7LinkedQueue<T> {

	@SuppressWarnings("hiding")
	private class Node<T>{
		T element;
		Node<T> nextNode;
		Node<T> prevNode;
		
		Node(T element) {
			this.element = element;
			nextNode = null;
			prevNode = null;
		}
	}
	
	private Node<T> head;
	private Node<T> tail;
	private int count;
	
	public Problem7LinkedQueue() {
		this.head = null;
		this.tail = null;
		this.count = 0;
	}
	
	public int count() {
		return this.count;
	}
	
	public void enqueue(T element) {
		if ( this.head == null) {
			// empty queue
			this.head = this.tail = new Node<T>(element);
			this.count++;
		} else {
			Node<T> newNode = new Node<T>(element);
			newNode.nextNode = this.head;
			this.head.prevNode = newNode;
			this.head = newNode;
			this.count++;
		}	
	}
	
	public T dequeue() {
		if (this.count == 0) {
			throw new NoSuchElementException("Queue is empty");
		}
		T element = this.tail.element;
		this.tail = this.tail.prevNode;
		this.count--;
		if (count == 0) {
			this.head = null;
			this.tail = null;
		} else {
			this.tail.nextNode = null;
		}
		return element;
	}
	
	public T[] toArray() {
		if (this.count == 0) {
			return null;
		}
		Node<T> currentNode = this.head;
		T[] allElements =(T[]) new Object[this.count];
		for (int i = 0; i < this.count; i++) {
			allElements[i] = currentNode.element;
			currentNode = currentNode.nextNode;
		}
		return allElements;
	}
}