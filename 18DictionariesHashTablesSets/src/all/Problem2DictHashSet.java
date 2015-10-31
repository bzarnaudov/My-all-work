package all;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Problem2DictHashSet<T> implements Problem2Dictionary<T, T> {
	private static final int DEFAULT_CAPACITY = 2;
	private static final float DEFAULT_LOAD_FACTOR = 0.75f;
	private List<Problem2DictionaryEntry<T, T>>[] table;
	private float loadFactor;
	private int threshold;
	private int size;
	
	public Problem2DictHashSet() {
		this(DEFAULT_CAPACITY, DEFAULT_LOAD_FACTOR);
	}
	
	@SuppressWarnings("unchecked")
	private Problem2DictHashSet(int capacity, float loadFactor) {
		this.table = new List[capacity];
		this.loadFactor = loadFactor;
		this.threshold = (int) (this.table.length * this.loadFactor);
	}
	
	@Override
	public void clear() {
		Arrays.fill(this.table, null);
		this.size = 0;
	}
	
	private List<Problem2DictionaryEntry<T, T>> findChain(T key, boolean createIfMissing) {
		int index = key.hashCode();
		index = index % this.table.length;
		if (table[index] == null && createIfMissing) {
			table[index] = new ArrayList<Problem2DictionaryEntry<T, T>>();
		}
		return table[index];
	}
	
	@Override
	public T get(T key) {
		List<Problem2DictionaryEntry<T, T>> chain = findChain(key, false);
		if (chain != null) {
			for (Problem2DictionaryEntry<T, T> dictionaryEntry : chain) {
				if (dictionaryEntry.getKey().equals(key)) {
					return dictionaryEntry.getValue();
				}
			}
		}
		return null;
	}
	
	@Override
	public boolean isEmpty() {
		return size == 0;
	}
	
	public T put(T key) {
		return this.put(key,key);
	}
	@Override
	public T put(T key, T value) {
		value = key;
		List<Problem2DictionaryEntry<T, T>> chain = findChain(key, true);
		for (int i=0; i < chain.size(); i++) {
			Problem2DictionaryEntry<T, T> entry = chain.get(i);
			if (entry.getKey().equals(key)) {
				// Key found -> replace its value with the new value
				Problem2DictionaryEntry<T, T> newEntry = new Problem2DictionaryEntry<T, T>(key, value);
				chain.set(i, newEntry);
				return entry.getValue();
			}
		}
		chain.add(new Problem2DictionaryEntry<T, T>(key, value));
		if (size++ >= threshold) {
			expand();
		}
		return null;
	}
	
	/**
	* Expands the underling table
	*/
	@SuppressWarnings("unchecked")
	private void expand() {
		int newCapacity = 2 * this.table.length;
		List<Problem2DictionaryEntry<T, T>>[] oldTable = this.table;
		this.table = new List[newCapacity];
		this.threshold = (int) (newCapacity * this.loadFactor);
		for (List<Problem2DictionaryEntry<T, T>> oldChain : oldTable) {
			if (oldChain != null) {
				for (Problem2DictionaryEntry<T, T> dictionaryEntry : oldChain){
					List<Problem2DictionaryEntry<T, T>> chain =
					findChain(dictionaryEntry.getKey(), true);
					chain.add(dictionaryEntry);
				}
			}
		}
	}
	
	@Override
	public boolean remove(T key) {
		List<Problem2DictionaryEntry<T, T>> chain = findChain(key, false);
		if (chain != null) {
			for (int i=0; i < chain.size(); i++) {
				Problem2DictionaryEntry<T, T> entry = chain.get(i);
				if (entry.getKey().equals(key)) {
					// Key found -> remove it
					chain.remove(i);
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public Iterator<Problem2DictionaryEntry<T, T>> iterator() {
		List<Problem2DictionaryEntry<T, T>> entries = new ArrayList<Problem2DictionaryEntry<T, T>>(this.table.length);
		for (List<Problem2DictionaryEntry<T, T>> chain : this.table) {
			if (chain != null) {
				entries.addAll(chain);
			}
		}
		return entries.iterator();
	}
	
	
}
