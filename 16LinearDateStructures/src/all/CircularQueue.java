package all;

import java.util.NoSuchElementException;

@SuppressWarnings({"unchecked"})

public class CircularQueue<T> {
	private T[] elements;
	private int startIndex = 0;
    private int endIndex = 0;
    private int count;

    private final int INITIALCAPACITY = 16;
    
    public static void main(String[] args) {
    	CircularQueue<Integer> queue = new CircularQueue<Integer>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);

        System.out.printf("Count = {%d}", queue.count);
        Object[] arr = queue.toArray();
        for (Object object : arr) {
        	System.out.printf(", " + object);
		}
        System.out.printf("\n---------------------------\n");

        int first = queue.dequeue();
        System.out.printf("First = {%d}", first);
        System.out.printf("Count = {%d}", queue.count);
        arr = queue.toArray();
        for (Object object : arr) {
        	System.out.printf(", " + object);
		}
        System.out.printf("\n---------------------------\n");

        queue.enqueue(-7);
        queue.enqueue(-8);
        queue.enqueue(-9);
        System.out.printf("Count = {%d}", queue.count);
        arr = queue.toArray();
        for (Object object : arr) {
        	System.out.printf(", " + object);
		}
        System.out.printf("\n---------------------------\n");

        first = queue.dequeue();
        System.out.printf("First = {%d}", first);
        System.out.printf("Count = {%d}", queue.count);
        arr = queue.toArray();
        for (Object object : arr) {
        	System.out.printf(", " + object);
		}
        System.out.printf("\n---------------------------\n");

        queue.enqueue(-10);
        System.out.printf("Count = {%d}", queue.count);
        arr = queue.toArray();
        for (Object object : arr) {
        	System.out.printf(", " + object);
		}
        System.out.printf("\n---------------------------\n");

        first = queue.dequeue();
        System.out.printf("First = {%d}", first);
        System.out.printf("Count = {%d}", queue.count);
        arr = queue.toArray();
        for (Object object : arr) {
        	System.out.printf(", " + object);
		}
        System.out.printf("\n---------------------------\n");
	}
    
    public int count() {
    	return this.count;
    }
	
    public CircularQueue() {
    	this.elements = (T[]) new Object[INITIALCAPACITY];
        this.count = 0;
    }
    
    public CircularQueue(int capacity) {
    	this.elements = (T[]) new Object[capacity];
        this.count = 0;
    }
    
    public void enqueue(T element) {
    	if (this.count >= this.elements.length) {
            this.Grow();
        }
        this.elements[this.endIndex] = element;
        this.endIndex = (this.endIndex + 1) % this.elements.length;
        this.count++;
    }

	private void Grow() {
		T[] newElements = (T[]) new Object[2 * this.elements.length];
		newElements = this.copyAllElementsTo(newElements);
        this.elements = newElements;
        this.startIndex = 0;
        this.endIndex = this.count;
		
	}

	private T[] copyAllElementsTo(T[] resultArr) {
		 int sourceIndex = this.startIndex;
	     int destinationIndex = 0;
	     for (int i = 0; i < this.count; i++) {
	        resultArr[destinationIndex] = this.elements[sourceIndex];
	        sourceIndex = (sourceIndex + 1) % this.elements.length;
	        destinationIndex++;
	     }
	     return resultArr;
	}
	
	public T dequeue() {
        if (this.count == 0)
        {
            throw new NoSuchElementException("The queue is empty!");
        }
        T result = this.elements[startIndex];
        this.startIndex = (this.startIndex + 1) % this.elements.length;
        this.count--;
        return result;
    }
	
	public T[] toArray()
    {
        T[] arr = (T[]) new Object[this.count];
        arr = this.copyAllElementsTo(arr);
        return arr;
    }
}
