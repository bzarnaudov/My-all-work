package all;

import java.util.ArrayList;

public class Problem4Example {

	public static void main(String[] args) throws Exception {
		Problem4HashTableWithValueArrayList<String, Integer> marks = new Problem4HashTableWithValueArrayList<String, Integer>();
		marks.put("Pesho", 6);
		marks.put("Pesho", 2);
		marks.put("Pesho", 5);
		marks.put("Pesho", 3);
		marks.put("Pesho", 5);
		marks.put("Pesho", 4);
		
		marks.put("Boyan", 2);
		
		for (Problem4DictionaryEntry<String, ArrayList<Integer>> entry : marks) {
			System.out.println(entry);
		}
		
		System.out.println(marks.get("Pesho"));
		System.out.println(marks.remove("gogo"));
		System.out.println(marks.remove("Boyan"));
		marks.put("Lili", 6);
		
		for (Problem4DictionaryEntry<String, ArrayList<Integer>> entry : marks) {
			System.out.println(entry);
		}
		
	}

}
