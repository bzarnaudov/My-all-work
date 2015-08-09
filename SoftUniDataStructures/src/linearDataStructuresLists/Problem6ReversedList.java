package linearDataStructuresLists;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Problem6ReversedList implements Iterable<Object>, Iterator<Object> {
	
	private Object[] arr;
	private int count;
	private static final int INITIAL_CAPACITY = 4;
	/** Initializes the array-based list – allocate memory **/
	
	public static void main(String[] args) {
		Problem6ReversedList shoppingList = 
				new Problem6ReversedList();
		shoppingList.add("Milk");
		shoppingList.add("Honey");
		shoppingList.add("Olives");
		shoppingList.add("Beer");
		System.out.println(shoppingList.capacity());
		shoppingList.remove(0);
		for (Object object : shoppingList) {
			System.out.println(object);
		}
	}
	
	public Problem6ReversedList() {
		arr = new Object[INITIAL_CAPACITY];
	}
	/**
	* @return the actual list length
	*/
	public int getLength() {
		return count;
	}
	
	
	public int capacity() {
		return arr.length;
	}
	
	/**
	* Adds element to the list
	* @param item - the element you want to add
	*/
	public void add(Object item) {
		add(count, item);
	}
	
	/**
	* Inserts the specified element at given position in this list
	* @param index -
	* index at which the specified element is to be inserted
	* @param item -
	* element to be inserted
	* @throws IndexOutOfBoundsException
	*/
	public void add(int index, Object item) {
		if (index>count || index<0) {
			throw new IndexOutOfBoundsException("Invalid index: " + index);
		}
		Object[] extendedArr = arr;
		if (count + 1 == arr.length) {
			extendedArr = new Object[arr.length * 2];
		}
		System.arraycopy(arr, 0, extendedArr, 0, index);
		count++;
		System.arraycopy(arr, index, extendedArr, index+1, count-index-1);
		extendedArr[index] = item;
		arr = extendedArr;
	}
	
	
	/**
	* @return the object on given position
	*/
	public Object elementAt(int index) {
		if (index>=count || index<0) {
			throw new IndexOutOfBoundsException(
					"Invalid index: " + index);
		}
		return arr[count - index - 1];
	}
	
	/**
	* Removes the element at the specified index
	* @param index - the index, whose element you want to remove
	* @return the removed element
	*/
	public Object remove(int index) {
		if (index>=count || index<0) {
			throw new IndexOutOfBoundsException(
					"Invalid index: " + index);
		}
		Object item = arr[count - index - 1];
		System.arraycopy(arr, count - index, arr, count - index - 1, index +1);
		arr[count - 1] = null;
		count--;
		return item;
	}


	@Override
	public boolean hasNext() {
		if (count > 0){
		      return true;
		}  
		return false;
	}

	@Override
	public Object next() {
		if (count == arr.length) {
		    throw new NoSuchElementException();
		}
		count--;
		return arr[count];
	}

	@Override
	public void remove() {
	    throw new UnsupportedOperationException();
	 }

	@Override
	public Iterator<Object> iterator() {
		return this;
	}	
}