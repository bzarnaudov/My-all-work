package stacksAndQueues;

import java.util.NoSuchElementException;

@SuppressWarnings({"unchecked"})
public class Problem3ArrayBasedStack<T> {
	
	private int count;
    private T[] elements;
    private final int INITIALCAPACITY = 16;

    public Problem3ArrayBasedStack() {
        elements = (T[]) new Object[INITIALCAPACITY];
        this.count = 0;
    }
    
    public Problem3ArrayBasedStack(int capacity) {
    	if (capacity <= 0) {
    		throw new IllegalArgumentException("Stack's capacity must be positive");
    	}
        this.elements = (T[]) new Object[capacity];
        this.count = 0;
    }

    public int capacity() {
    	return this.elements.length;
    }
    
    public int count() {
    	return this.count;
    }

    void push(T element) {
        if (this.count == this.elements.length) {
        	grow();
        }
        this.count++;
        this.elements[count-1] = element;
    }

    private void grow() {
		T[] newElements = (T[]) new Object[this.elements.length*2];
		System.arraycopy(this.elements, 0, newElements, 0, this.count);
		this.elements = newElements;
	}
    
	public T pop() {
        if (this.count == 0) {
              throw new NoSuchElementException("Stack is empty");
        }
        this.count--;
        return this.elements[count];
    }
    
	public T[] toArray() {
		if (this.count == 0) {
			return null;
		}
		T[] allElements = (T[]) new Object[this.count];
		System.arraycopy(this.elements, 0, allElements, 0, this.count);
		return allElements;
	}

}
