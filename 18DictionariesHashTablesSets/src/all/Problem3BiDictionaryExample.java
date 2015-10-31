package all;


public class Problem3BiDictionaryExample {

	public static void main(String[] args) throws Exception {
		Problem3BiDictionary<Integer, String, String> combination = new Problem3BiDictionary<Integer, String, String>();
		combination.put(5, "key", "Boyan");
		System.out.println(combination.get(5, "key"));
		combination.put(5, "key223", "Bo");
		combination.put(7, "key22322", "Boba");
		
		for (Problem3DictionaryEntry<Integer, String, String> combo : combination) {
			System.out.println(combo);
		}
		
		//4 times faster from above implementation
		Problem3DictionaryBrotherImpl<Integer, String, String> combiBrother = new Problem3DictionaryBrotherImpl<>();
		combiBrother.put(5, "key", "Boyan");
		combiBrother.put(5, "key223", "Bo");
		combiBrother.put(7, "key22322", "Boba");
		for (Problem3DictionaryEntry<Integer, String, String> entry : combiBrother) {
			System.out.println(entry);
		}
		
		
	}

}
