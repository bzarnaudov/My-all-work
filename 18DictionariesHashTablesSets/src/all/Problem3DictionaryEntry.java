package all;

/**
* This class is used by Dictionary Abstract Data Type (ADT).
* It encapsulates Key and Value objects.
* @param <K1> - type of the keys.
* @param <K2> - type of the keys.
* @param <V> - type of the values.
*/

public class Problem3DictionaryEntry<K1, K2, V> {
	private K1 key1;
	private K2 key2;
	private V value;
	
	public Problem3DictionaryEntry(K1 key1, K2 key2, V value) {
		this.key1 = key1;
		this.key2 = key2;
		this.value = value;
	}
	
	public K1 getKey1() {
		return key1;
	}

	public K2 getKey2() {
		return key2;
	}
	
	public V getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return String.format("[%s, %s, %s]", key1, key2, value);
	}
}
