package all;

import java.security.KeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Problem4HashTableWithValueArrayList<K, V> implements Problem4Dictionary<K, V> {
	
	private final HashMap<K, ArrayList<V>> container = new HashMap<>();

	@Override
	public void put(K key, V value) throws Exception {
		if (container.containsKey(key)) {
			container.get(key).add(value);
		} else {
			ArrayList<V> values = new ArrayList<>();
			values.add(value);
			container.put(key, values);
		}
	}

	@Override
	public ArrayList<V> get(K key) throws KeyException {
		return container.get(key);
	}

	@Override
	public boolean remove(K key) {
		if (container.remove(key) == null) {
			return false;
		}
		return true;
	}

	@Override
	public void clear() {
		container.clear();
	}

	@Override
	public Iterator<Problem4DictionaryEntry<K, ArrayList<V>>> iterator() {
		final Iterator<Map.Entry<K, ArrayList<V>>> delegate = container.entrySet().iterator();
		return new Iterator<Problem4DictionaryEntry<K, ArrayList<V>>> () {
			@Override
			public boolean hasNext() {
				return delegate.hasNext();
			}

			@Override
			public Problem4DictionaryEntry<K, ArrayList<V>> next() {
				final Map.Entry<K, ArrayList<V>> next = delegate.next();
				final K key = next.getKey();
				return new Problem4DictionaryEntry<>(key, next.getValue());
			}

			@Override
			public void remove() {
				delegate.remove();
			}
		};
	}
	
}
