package all;

public class DoubleDynamicLinkedList {
	
	public static void main(String[] args){
		DoubleDynamicLinkedList shoppingList = new DoubleDynamicLinkedList();
		shoppingList.add("Milk");
		shoppingList.add("Honey");
		shoppingList.add("Olives");
		shoppingList.add("Beer");
		shoppingList.add("gurmen", 3);
		shoppingList.remove("Beer");
		System.out.println(shoppingList.elementAt(3));
		System.out.println("We need to buy:");
		for (int i = 0; i < shoppingList.getLength(); i++) {
			System.out.println(shoppingList.elementAt(i));
		}
		String[] array = shoppingList.listToArray();
		for (String string : array) {
			System.out.println(string);
		}
		
	}
	
	
	private class Node{
		Object element;
		Node next;
		Node previous;
		
		Node(Object element) {
			this.element = element;
			next = null;
			previous = null;
		}
	}
	
	private Node firstNode;
	private Node lastNode;
	private int count;
	
	public DoubleDynamicLinkedList() {
		this.firstNode = null;
		this.lastNode = null;
		this.count = 0;
	}
	
	public String[] listToArray() {
		String[] array = new String[getLength()];
		Node node = firstNode;
		for (int i = 0; i < count; i++) {
			array[i] = (String) node.element;
			node = node.next;
		}
		
		return array;
	}
	
	/**
	* Add element at the end of the list
	* @param item - the element you want to add
	*/
	
	public void add(Object item) {
		if (firstNode == null) {
			//We have empty list
			insertBeginning(new Node(item));
		} else {
			// We have non-empty list
			insertAfter(lastNode, new Node(item));
		}
		count++;
	}
	
	public void insertBeginning(Node newNode) {
		if (firstNode == null) {
			firstNode = newNode;
			lastNode = newNode;
			newNode.previous = null;
			newNode.next = null;
		} else {
			insertBefore(firstNode, newNode);
		}
	}
	
	public void insertAfter(Node node, Node newNode) {
		newNode.previous = node;
		newNode.next = node.next;
		if (node.next == null) {
			lastNode = newNode;
		} else {
			node.next.previous = newNode;
		}
		node.next = newNode;
	}
	
	public void insertBefore(Node node, Node newNode) {
		newNode.previous = node.previous;
		newNode.next = node;
		if (node.previous == null) {
			firstNode = newNode;
		} else {
			node.previous.next = newNode;
		}
		node.previous = newNode;
	}
	
	/**
	* Removes the specified item and return its index
	* @param item – the item for removal
	* @return the index of the element or -1 if does not exist
	*/
	public void remove(Object item){
		// Find the element containing searched item
		Node currentNode = firstNode;
		Node prevNode = null;
		while (currentNode != null) {
			if ((currentNode.element!=null &&
					currentNode.element.equals(item)) ||
					(currentNode.element==null) && (item==null)){
				break;
			}
			prevNode = currentNode;
			currentNode = currentNode.next;
		}
		if (currentNode != null) {
			// Element is found in the list. Remove it
			count--;
			if (count==0) {
				firstNode = null;
				lastNode = null;
			} else if (prevNode == null) {
				firstNode = currentNode.next;
			} else {
				prevNode.next = currentNode.next;
			}
			return;
		} else {
			System.out.println("There is not this " + item + " in the list.");
			return;
		}
	}
	
	/**
	* Searches for given element in the list
	* @param item - the item you are searching for
	* @return the index of the first occurrence of
	* the element in the list or -1 when not found
	*/
	public int indexOf(Object item) {
		int index = 0;
		Node current = firstNode;
		while (current != null) {
			if ((current.element!=null && current.element.equals(new Node(item)))
					|| (current.element == null) && (new Node(item) == null)) {
					return index;
			}
			current = current.next;
			index++;
		}
		return -1;
	}
	
	public void add(Object item,int index) {
		if (index>=count || index<0) {
			throw new IndexOutOfBoundsException(
					"Invalid index: " + index);
		}
		Node currentNode = firstNode;
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.next;
		}
		if (index == 0) {
			Node movedNode = currentNode;
			currentNode = new Node(item);
			currentNode.next = movedNode;
			firstNode = currentNode;
			currentNode.next.previous = currentNode;
		} else {
			Node movedNode = currentNode;
			currentNode.previous.next = new Node(item);
			currentNode = currentNode.previous.next;
			currentNode.next = movedNode;
			currentNode.previous = movedNode.previous;
			currentNode.next.previous = currentNode;
		}
		count++;
	}
	
	/**
	* @param index – the position of the element [0 … count-1]
	* @return the object at the specified index
	* @exception IndexOutOfBoundsException - when index is invalid
	*/
	public Object elementAt(int index) {
		if (index >= count || index < 0) {
			throw new IndexOutOfBoundsException(
					"Invalid index: " + index);
		}
		Node currentNode = this.firstNode;
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.next;
		}
		return currentNode.element;
	}
	
	/**
	* @return the actual list length
	*/
	public int getLength() {
		return count;
	}
	
}
