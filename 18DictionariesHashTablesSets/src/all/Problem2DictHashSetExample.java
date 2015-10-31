package all;

public class Problem2DictHashSetExample {

	public static void main(String[] args) {
		Problem2DictHashSet<String> marks =	new Problem2DictHashSet<String>();
		marks.put("Pepi");
		marks.put("Kiro");
		marks.put("Mimi");
		marks.put("Pepi"); // replace key "Pepi"
		marks.remove("Kiro"); // remove key "Kiro"
		marks.remove("123"); // key not found
		// Use the iterator to traverse all entries
		for (Problem2DictionaryEntry<String,String> entry : marks) {
			System.out.print(entry + " ");
		}
		// Output: [Mimi, 6] [Pepi, 5]
	}

}
