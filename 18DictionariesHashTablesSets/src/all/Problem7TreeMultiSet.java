package all;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Problem7TreeMultiSet<T> implements Iterable<T> {

	TreeMap<T, Integer> sortedDictionary;
	int count;
	
	public Problem7TreeMultiSet() {
		this.sortedDictionary = new TreeMap<T, Integer>();
		this.count = 0;
	}
	
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public Problem7TreeMultiSet(Comparator listComparer) {
        this.sortedDictionary = new TreeMap<T, Integer>(listComparer);
        this.count = 0;
    }

	public int getCount() {
		return count;
	}
	
	public void add(T element) {
        if (sortedDictionary.containsKey(element)) {
        	int value = sortedDictionary.get(element);
        	value++;
            sortedDictionary.put(element, value);
        } else {
            sortedDictionary.put(element, 1);
        }
        count++;
    }

    public int find(T element) {
        if (sortedDictionary.containsKey(element)) {
            return sortedDictionary.get(element);
        } else {
            return 0;
        }
    }

    public void delete(T element) {
        if (sortedDictionary.containsKey(element)) {
            if (sortedDictionary.get(element) > 1) {
            	int value = sortedDictionary.get(element);
            	value--;
                sortedDictionary.put(element, value);
            } else {
                sortedDictionary.remove(element);
            }
            count--;
        } else {
            try {
				throw new Exception("There is no such element in TreeMultiSet");
			} catch (Exception e) {
//				System.out.println(e.getMessage());
//				e.printStackTrace();
			}
        }
    }

    public void deleteAll(T element) {
        if (sortedDictionary.containsKey(element)) {
            count -= sortedDictionary.get(element);
            sortedDictionary.remove(element);
        } else {
            try {
				throw new Exception("There is no such element in TreeMultiSet");
			} catch (Exception e) {
//				System.out.println(e.getMessage());
//				e.printStackTrace();
			} 
        }
    }

    public T findMin() {
        return sortedDictionary.firstKey();
    }

    public T findMax() {
        return sortedDictionary.lastKey();
    }

    public void deleteFirst() {
        Map.Entry<T, Integer> minElements = sortedDictionary.firstEntry();
        if (minElements.getValue() > 1) {
        	int value = sortedDictionary.get(minElements.getKey());
        	value--;
        	sortedDictionary.put(minElements.getKey(), value);
        } else {
            sortedDictionary.remove(minElements.getKey());
        }
        count--;
    }

    public void deleteLast() {
    	Map.Entry<T, Integer> maxElements = sortedDictionary.lastEntry();
        if (maxElements.getValue() > 1) {
        	int value = sortedDictionary.get(maxElements.getKey());
        	value--;
        	sortedDictionary.put(maxElements.getKey(), value);
        } else {
            sortedDictionary.remove(maxElements.getKey());
        }
        count--;
    }
	
	@Override
	public Iterator<T> iterator() {
		List<T> entries = new ArrayList<T>(this.sortedDictionary.size());
		for (Map.Entry<T, Integer> entry : this.sortedDictionary.entrySet()) {
			for (int i = 0; i < entry.getValue(); i++) {
				entries.add(entry.getKey());
			}
		}
		return entries.iterator();
	}
}
