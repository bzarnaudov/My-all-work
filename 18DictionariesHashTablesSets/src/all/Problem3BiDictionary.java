package all;

import java.security.KeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Problem3BiDictionary<K1, K2, V> implements Problem3Dictionary<K1,K2, V>{
	private HashMap<K1, HashMap<K2, V>> container;
	private int size = 0;
	public Problem3BiDictionary() {
		this.container = new HashMap<K1, HashMap<K2, V>>();
	}
	
	public V get(K1 key1, K2 key2) throws KeyException {
		if (!containsKeys(key1, key2)){
			throw new KeyException("The given keys was not present in the dictionary.");
		} else {
			return container.get(key1).get(key2);
		}
	}

	private boolean containsKeys(K1 key1, K2 key2) {
		if (container.containsKey(key1)) {
			return container.get(key1).containsKey(key2);
		} else {
			return false;
		}
	}
	
	public void put(K1 key1, K2 key2, V value) throws Exception {
		if (containsKeys(key1, key2)) {
			throw new Exception("An item with the same two keys has already been added.");
		} else if (!container.containsKey(key1)){
				HashMap<K2, V> innerHashMap = new HashMap<K2, V>();
				innerHashMap.put(key2, value);
				container.put(key1,innerHashMap);
				size++;
		} else {
			container.get(key1).put(key2, value);
		}
	}
	
	public boolean remove(K1 key1, K2 key2) {
		if (containsKeys(key1, key2)) {
			size--;
			container.get(key1).remove(key2);
			return true;
		} else {
			return false;
		}
	}
	
	public void clear() {
        container.clear();
        size = 0;
    }

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Iterator<Problem3DictionaryEntry<K1, K2, V>> iterator() {
		List<Problem3DictionaryEntry<K1, K2, V>> entries = new ArrayList<Problem3DictionaryEntry<K1, K2, V>>(this.container.size());
		for (Map.Entry<K1, HashMap<K2, V>> pair : container.entrySet()) {
			for (Map.Entry<K2, V> innerPair : pair.getValue().entrySet()) {
				entries.add(new Problem3DictionaryEntry(pair.getKey(), innerPair.getKey(), innerPair.getValue()));
			}
		}
		return entries.iterator();
	}
	
}
