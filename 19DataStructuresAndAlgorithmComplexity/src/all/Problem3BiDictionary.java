package all;

import java.util.*;

public class Problem3BiDictionary<K1, K2, T> {
	private List<T> rezult;
	private HashMap<K1, List<Map.Entry<Integer, T>>> key1;
    private HashMap<K2, List<Map.Entry<Integer, T>>> key2;
    @SuppressWarnings("unused")
	private T value;
    private int index;

    public Problem3BiDictionary() {
        this.key1 = new HashMap<K1, List<Map.Entry<Integer, T>>>();
        this.key2 = new HashMap<K2, List<Map.Entry<Integer, T>>>();
        this.index = 0;
    }

    public HashMap<K1, List<Map.Entry<Integer, T>>> getKey1() {
		return key1;
	}

	public void setKey1(HashMap<K1, List<Map.Entry<Integer, T>>> key1) {
		this.key1 = key1;
	}

	public HashMap<K2, List<Map.Entry<Integer, T>>> getKey2() {
		return key2;
	}

	public void setKey2(HashMap<K2, List<Map.Entry<Integer, T>>> key2) {
		this.key2 = key2;
	}

    public void add(K1 key1, K2 key2, T value) {
    	Map.Entry<Integer, T> newEntry = new AbstractMap.SimpleEntry<Integer, T>(index, value);
        if (this.key1.containsKey(key1)) {
        	List<Map.Entry<Integer, T>> current = this.key1.get(key1);
        	current.add(newEntry);
            this.key1.put(key1, current);
        } else {
        	List<Map.Entry<Integer, T>> current = new ArrayList<Map.Entry<Integer, T>>();
        	current.add(newEntry);
            this.key1.put(key1, current);
        }

        if (this.key2.containsKey(key2)) {
            List<Map.Entry<Integer, T>> current = this.key2.get(key2);
        	current.add(newEntry);
            this.key2.put(key2, current);
        } else {
        	List<Map.Entry<Integer, T>> current = new ArrayList<Map.Entry<Integer, T>>();
        	current.add(newEntry);
            this.key2.put(key2, current);
        }
        this.index++;
        this.value = value;
    }

    public boolean searchByBothKeys(K1 key1, K2 key2) {
        rezult = new ArrayList<T>();
        List<Map.Entry<Integer, T>> firstKeyRezults = this.key1.get(key1);
        List<Map.Entry<Integer, T>> secondKeyRezults = this.key2.get(key2);

        if (this.key1.size() == 0 || this.key2.size() == 0 || firstKeyRezults == null || secondKeyRezults == null) {
            return false;
        }

        if (firstKeyRezults.size() > secondKeyRezults.size()) {
            for (Map.Entry<Integer, T> firstKey : secondKeyRezults) {
                for (Map.Entry<Integer, T> secondKey : firstKeyRezults) {
                    if (firstKey.getKey() == secondKey.getKey()) {
                        rezult.add(firstKey.getValue());
                    }
                }
            }
        }

        if (secondKeyRezults.size() >= firstKeyRezults.size()) {
            for (Map.Entry<Integer, T> firstKey : firstKeyRezults) {
                for (Map.Entry<Integer, T> secondKey : secondKeyRezults) {
                    if (firstKey.getKey() == secondKey.getKey()) {
                        rezult.add(firstKey.getValue());
                    }
                }
            }
        }
        return true;
    }

    public boolean searchByFirstKey(K1 key1) {
        rezult = new ArrayList<T>();
        List<Map.Entry<Integer, T>> rez = new ArrayList<Map.Entry<Integer, T>>();
        
        if (this.key1.containsKey(key1)) {
        	rez = this.key1.get(key1);
            for (Map.Entry<Integer, T> item : rez) {
                rezult.add(item.getValue());
            }
            return true;
        }
        return false;
    }

    public List<T> getRezult() {
		return rezult;
	}

	public boolean searchBySecondKey(K2 key2) {
        rezult = new ArrayList<T>();
        List<Map.Entry<Integer, T>> rez = new ArrayList<Map.Entry<Integer, T>>();
        if (this.key2.containsKey(key2)) {
        	rez = this.key2.get(key2);
            for (Map.Entry<Integer, T> item : rez) {
                rezult.add(item.getValue());
            }
            return true;
        }
        return false;
    }
}
