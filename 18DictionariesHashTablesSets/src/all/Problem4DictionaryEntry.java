package all;

import java.util.ArrayList;

/**
* This class is used by Dictionary Abstract Data Type (ADT).
* It encapsulates Key and Value objects.
* @param <K> - type of the keys.
* @param ArrayList - type of the values.
*/

@SuppressWarnings("hiding")
public class Problem4DictionaryEntry<K, ArrayList> {
	private K key;
	private ArrayList values;
	
	public Problem4DictionaryEntry(K key, ArrayList values) {
		this.key = key;
		this.values = values;
	}
	
	public void setKey(K key) {
		this.key = key;
	}

	public void setValues(ArrayList values) {
		this.values = values;
	}

	public K getKey() {
		return key;
	}
	
	public ArrayList getValues() {
		return values;
	}
	
	@Override
	public String toString() {
		return String.format("[%s, %s]", key, values);
	}
}
