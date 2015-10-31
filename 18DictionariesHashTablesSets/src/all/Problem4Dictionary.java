package all;

import java.security.KeyException;
import java.util.ArrayList;

/** A Map (Dictionary) just like Java's Map<K,V> interface except that
 * this interface has ArrayList for value
 */

public interface Problem4Dictionary<K, V> extends Iterable<Problem4DictionaryEntry<K, ArrayList<V>>> {
   
    void put(K key, V value) throws Exception;

    ArrayList<V> get(K key) throws KeyException;

    boolean remove(K key);

    /** Reset the dictionary so there are no elements. */
    void clear();
}
