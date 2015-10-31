package all;

import java.security.KeyException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Problem3DictionaryBrotherImpl<K1,K2,V> implements Problem3DictionaryBrother<K1,K2,V> {

	private static class Key<K1, K2> {
		private final K1 k1;
		private final K2 k2;

		private Key(K1 k1, K2 k2) {
			this.k1 = k1;
			this.k2 = k2;
		}

		public K1 getK1() {
			return k1;
		}

		public K2 getK2() {
			return k2;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;

			@SuppressWarnings("rawtypes")
			Key key = (Key) o;

			if (k1 != null ? !k1.equals(key.k1) : key.k1 != null) return false;
			if (k2 != null ? !k2.equals(key.k2) : key.k2 != null) return false;

			return true;
		}

		@Override
		public int hashCode() {
			int result = k1 != null ? k1.hashCode() : 0;
			result = 31 * result + (k2 != null ? k2.hashCode() : 0);
			return result;
		}
	}

	@SuppressWarnings("rawtypes")
	private final HashMap<Key, V> container = new HashMap<>();


	@Override
	public V put(K1 key1, K2 key2, V value) throws Exception {
		return container.put(new Key<>(key1, key2), value);
	}

	@Override
	public V get(K1 key1, K2 key2) throws KeyException {
		return container.get(new Key<>(key1, key2));
	}

	@Override
	public V remove(K1 key1, K2 key2) {
		return container.remove(new Key<>(key1, key2));
	}

	@Override
	public void clear() {
		container.clear();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Iterator<Problem3DictionaryEntry<K1, K2, V>> iterator() {
		final Iterator<Map.Entry<Key, V>> delegate = container.entrySet().iterator();
		return new Iterator<Problem3DictionaryEntry<K1, K2, V>> () {
			@Override
			public boolean hasNext() {
				return delegate.hasNext();
			}

			@SuppressWarnings("unchecked")
			@Override
			public Problem3DictionaryEntry<K1, K2, V> next() {
				final Map.Entry<Key, V> next = delegate.next();
				final Key key = next.getKey();
				return new Problem3DictionaryEntry<>((K1)key.getK1(), (K2)key.getK2(), next.getValue());
			}

			@Override
			public void remove() {
				delegate.remove();
			}
		};
	}
}
