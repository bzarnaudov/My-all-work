package all;

/**
* Interface that defines basic methods needed
* for a class which maps keys to values.
* @param <K> - type of the keys
* @param <V> - type of the values
*/

public interface Problem5Dictionary<K, V> extends Iterable<DictionaryEntry<K, V>> {
	/**
	* Adds specified value by specified key to the dictionary.
	* If the key already exists its value is replaced with the
	* new value and the old value is returned.
	* @param key - key for the new value
	* @param value - value to be mapped with that key
	* @return the old value for the specified key or null if the
	* key does not exists
	* @throws NullPointerException if specified key is null.
	*/
	public void put(K key, V value) throws Exception;
	
	/**
	* Finds the value mapped by specified key.
	* @param key - key for which the value is needed.
	* @return value for the specified key if present,
	* or null if there is no value with such key.
	 * @throws Exception 
	*/
	public V get(K key) throws Exception;
	
	/**
	* Removes a value mapped by specified key.
	* @param key - key for which the value will be removed
	* @return true if value for the specified
	* key if present, or false if there is
	* no value with such key in the dictionary.
	 * @throws Exception 
	*/
	public boolean remove(K key) throws Exception;
	
	/**
	* Checks if there are any elements in the dictionary.
	* @return true if there is more than
	* one element in the dictionary, and
	* false otherwise.
	*/
	public boolean isEmpty();
	
	/**
	* Removes all elements from the dictionary.
	*/
	public void clear();
	
}

