package all;

public class Problem5Example {

	public static void main(String[] args) throws Exception {
		Problem5DictionaryCuckooHashing<Integer, String> cuckoo = new Problem5DictionaryCuckooHashing<Integer, String>();
		cuckoo.put(1, "goga");
		cuckoo.put(2, "goga2");
		cuckoo.put(133, "goga2");
		cuckoo.put(125, "bobo");
		
		System.out.println(cuckoo.get(125));
		
		for (DictionaryEntry<Integer, String> entry : cuckoo) {
			System.out.println(entry);
		}

	}

}
