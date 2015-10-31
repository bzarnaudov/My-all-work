package all;

import java.util.*;

public class Problem2StructForFastAddAndMinElement<T extends Comparable<T>> {
	private List<T> elements;
	private T minElement;
	
    public Problem2StructForFastAddAndMinElement(T value) {
        this.elements = new ArrayList<T>();
        this.elements.add(value);
        this.minElement = value;
    }

    public void add(T element) {
        this.elements.add(element);
        if (minElement.compareTo(element) == 1) {
            this.minElement = element;
        }
    }

    public T getMinElement() {
		return minElement;
	}	
}
