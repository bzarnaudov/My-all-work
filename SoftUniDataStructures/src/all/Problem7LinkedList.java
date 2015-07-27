package all;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Problem7LinkedList implements Iterable<Object> {
	
	public static void main(String[] args){
		Problem7LinkedList shoppingList = new Problem7LinkedList();
		shoppingList.add("Milk");
		shoppingList.add("Honey");
		shoppingList.add("Olives");
		shoppingList.add("Beer");
		shoppingList.add("Olives");
		shoppingList.add("Olives");
		System.out.println(shoppingList.lastIndexOf("Olives"));
		for (Object object : shoppingList) {
			System.out.println(object);
		}
	}
	
	
	private class Node{
		Object element;
		Node next;
		
		Node(Object element, Node prevNode) {
			this.element = element;
			prevNode.next = this;
		}
		Node(Object element) {
			this.element = element;
			next = null;
		}
	}

	private Node head;
	private Node tail;
	private int count;
	
	public Problem7LinkedList() {
		this.head = null;
		this.tail = null;
		this.count = 0;
	}
	
	/**
	* Add element at the end of the list
	* @param item - the element you want to add
	*/
	
	public void add(Object item) {
		if (head == null) {
			// We have empty list
			head = new Node(item);
			tail = head;
		} else {
			// We have non-empty list
			Node newNode = new Node(item, tail);
			tail = newNode;
		}
		count++;
	}
	
	/**
	* Removes and returns element on the specific index
	* @param index - the index of the element you want to remove
	* @return the removed element
	* @exception IndexOutOfBoundsException - when index is invalid
	*/
	public Object remove(int index) {
		if (index>=count || index<0) {
			throw new IndexOutOfBoundsException(
					"Invalid index: " + index);
		}
	
		// Find the element at the specified index
		int currentIndex = 0;
		Node currentNode = head;
		Node prevNode = null;
		while (currentIndex < index) {
			prevNode = currentNode;
			currentNode = currentNode.next;
			currentIndex++;
		}
	
		// Remove the element
		count--;
		if (count==0) {
			head = null;
			tail = null;
		} else if (prevNode == null) {
			head = currentNode.next;
		} else {
			prevNode.next = currentNode.next;
		}
		return currentNode.element;
	}
	
	/**
	* Searches for given element in the list
	* @param item - the item you are searching for
	* @return the index of the last occurrence of
	* the element in the list or -1 when not found
	*/
	public int lastIndexOf(Object item) {
		int index = 0;
		int found = -1;
		Node current = head;
		while (index < count) {
			if ((current.element!=null && current.element.equals(item))
					|| (current.element==null) && (item==null)) {
				found = index;
			}
			current = current.next;
			index++;
		}
		return found;
	}
	
	/**
	* Searches for given element in the list
	* @param item - the item you are searching for
	* @return the index of the first occurrence of
	* the element in the list or -1 when not found
	*/
	public int firstIndexOf(Object item) {
		int index = 0;
		Node current = head;
		while (current != null) {
			if ((current.element!=null && current.element.equals(item))
					|| (current.element==null) && (item==null)) {
					return index;
			}
			current = current.next;
			index++;
		}
		return -1;
	}
	
	/**
	* @return the actual list length
	*/
	public int count() {
		return count;
	}

	 @Override
	 public Iterator<Object> iterator() {
	     return new ListIterator();
	 }

	 public class ListIterator implements Iterator<Object> {
		 private Node currentNode;
		 private Node previous;

		 /**
		 * @param currentNode
		 */
		 public ListIterator() {
			 super();
			 this.currentNode = (Node) head;
			 this.previous = null;
	     }

	     @Override
	     public boolean hasNext() {
	    	 if (currentNode != null && currentNode.next != null) {
	    		 return true;
	    	 } else {
	    		 return false;
	    	 }
	     }

	     @Override
	     public Object next() {
	    	 if (!hasNext()) {
	    		 throw new NoSuchElementException();
	    	 }
	    	 if ( previous == null ) {
	    		 previous = currentNode;
	    		 return previous.element;
	    	 }
	    	 currentNode = currentNode.next;
	    	 return currentNode.element;
	     }

	     @Override
	     public void remove() {
	    	 
	     }
	 }
}
