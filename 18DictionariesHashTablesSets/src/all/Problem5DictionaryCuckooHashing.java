package all;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
* Implementation of {@link Dictionary} interface
* using hash table. Collisions are resolved by cuckoo hashing.
* @param <K> - the type of the keys
* @param <V> - the type of the values
*/
public class Problem5DictionaryCuckooHashing<K, V> implements Problem5Dictionary<K, V> {
	private static final int DEFAULT_CAPACITY = 16;
	private static final float DEFAULT_LOAD_FACTOR = 0.75f;
	private DictionaryEntry<K, V>[] table;
	private float loadFactor;
	@SuppressWarnings("unused")
	private int threshold;
	private int size;
	
	public Problem5DictionaryCuckooHashing() throws Exception {
		this(DEFAULT_CAPACITY, DEFAULT_LOAD_FACTOR);
	}
	
	@SuppressWarnings("unchecked")
	private Problem5DictionaryCuckooHashing(int capacity, float loadFactor) throws Exception {
		this.table = new DictionaryEntry[capacity];
		this.loadFactor = loadFactor;
		this.size = 0;
		this.threshold = (int) (table.length * this.loadFactor);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void clear() {
//		Arrays.fill(this.table, null);
		this.table = new DictionaryEntry[DEFAULT_CAPACITY];
		size = 0;
	}
	
	private int[] getThreeHashCodes(K key) throws Exception {
        int[] hashCodes = new int[3];
        hashCodes[0] = key.hashCode() % table.length;
        hashCodes[1] = (key.hashCode() * 31 + 7) % table.length;
        hashCodes[2] = (key.hashCode() * key.hashCode() + 19) % table.length;
        return hashCodes;
    }

	
	public void put(K key, V value) throws Exception {
		int[] hashCodes = getThreeHashCodes(key);
        checkKeyForDuplicate(hashCodes, key);
        
        if (table[hashCodes[0]] == null) {
            table[hashCodes[0]] = new DictionaryEntry<K, V>(key, value);
        } else if (table[hashCodes[1]] == null) {
        	table[hashCodes[1]] = new DictionaryEntry<K, V>(key, value);
        } else {
            if (table[hashCodes[2]] == null) {
            	table[hashCodes[2]] = new DictionaryEntry<K, V>(key, value);
            } else {
                DictionaryEntry<K, V> movingKeyValuePair = table[hashCodes[2]];
                table[hashCodes[2]] = new DictionaryEntry<K, V>(key, value);
                HashSet<Integer> hashSetVisitedPosiotion = new HashSet<Integer>();
                hashSetVisitedPosiotion.add(hashCodes[2]);
                findNewPlace(movingKeyValuePair, hashCodes[2], hashSetVisitedPosiotion);
            }
        }
        size++;
	}

	private void findNewPlace(DictionaryEntry<K, V> movingKeyValuePair, int oldPosition, HashSet<Integer> hashSetVisitedPosiotion) throws Exception {
        int[] hashCodes = getThreeHashCodes(movingKeyValuePair.getKey());
        int numberOfLastPossiblePosition = 0;
        boolean needToContinueReplacing = true;
        for (int i = 0; i < hashCodes.length; i++) {
            if (hashCodes[i] == oldPosition) {
                continue;
            }
            if (table[hashCodes[i]] == null) {
            	table[hashCodes[i]] = movingKeyValuePair;
                needToContinueReplacing = false;
                break;
            }
            numberOfLastPossiblePosition = i;
        }

        if (needToContinueReplacing) {
            if (hashSetVisitedPosiotion.contains(hashCodes[numberOfLastPossiblePosition])) {
                resizeHashTable();
                if (table[hashCodes[numberOfLastPossiblePosition]] == null) {
                    table[hashCodes[numberOfLastPossiblePosition]] = movingKeyValuePair;
                } else {
                	HashSet<Integer> hashSetVisitedPosiotion1 = new HashSet<Integer>();
                    hashSetVisitedPosiotion1.add(hashCodes[numberOfLastPossiblePosition]);
                    findNewPlace(movingKeyValuePair, hashCodes[numberOfLastPossiblePosition], hashSetVisitedPosiotion1);
                }
            } else {
                HashSet<Integer> oldHashSetVisitedPosiotion = hashSetVisitedPosiotion;
                oldHashSetVisitedPosiotion.add(hashCodes[numberOfLastPossiblePosition]);
                DictionaryEntry<K, V> newMovingPair = table[hashCodes[numberOfLastPossiblePosition]];
                table[hashCodes[numberOfLastPossiblePosition]] = movingKeyValuePair;
                findNewPlace(newMovingPair, hashCodes[numberOfLastPossiblePosition], oldHashSetVisitedPosiotion);
            }
        }
    }

	private void resizeHashTable() throws Exception {
		int currentCapacity = table.length;
        currentCapacity *= 2;
        DictionaryEntry<K, V>[] oldHashTable = table;
        @SuppressWarnings("unchecked")
		DictionaryEntry<K, V>[] newHashTable = new DictionaryEntry[currentCapacity];
        table = newHashTable;
        size = 0;
        for (DictionaryEntry<K, V> item : oldHashTable) {
        	this.put(item.getKey(), item.getValue());
        }		
	}

	private void checkKeyForDuplicate(int[] hashCodes, K key) throws Exception {
		for (int item : hashCodes) {
            if (table[item] != null && table[item].getKey().equals(key)) {
                throw new Exception("An element with the same key already exists in the CuckooHashingHashTable<Key, Value>.");
            }
        }
    }

	public boolean remove(K key) throws Exception {
        int[] hashCodes = getThreeHashCodes(key);
        for (int hashCode : hashCodes) {
            if (table[hashCode] != null && table[hashCode].getKey().equals(key)) {
            	table[hashCode] = null;
            	size--;
                return true;
            }
        }
        throw new Exception("Cant find KeyValuePair with this key.");
    }
	
	public V get(K key) throws Exception {
		int[] hashCodes = getThreeHashCodes(key);
        for (int hashCode : hashCodes) {
            if (table[hashCode] != null && table[hashCode].getKey().equals(key)) {
                return table[hashCode].getValue();
            }
        }
        throw new Exception("Cant find KeyValuePair with this key.");
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	
	@Override
	public Iterator<DictionaryEntry<K, V>> iterator() {
		List<DictionaryEntry<K, V>> entries = new ArrayList<DictionaryEntry<K, V>>(size);
		for (DictionaryEntry<K, V> entry : this.table) {
			if (entry != null) {
				entries.add(entry);
			}
		}
		return entries.iterator();
	}
}