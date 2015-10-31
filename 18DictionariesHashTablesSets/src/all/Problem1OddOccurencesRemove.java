package all;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Problem1OddOccurencesRemove {

	public static void main(String[] args) {
		Map<String, Integer> numbers = new HashMap<String, Integer>();
		String stringWithNumbers = "4, 2, 2, 5, 2, 3, 2, 3, 1, 5, 2, 6, 6, 6";
		String[] arrrayOfStrings = stringWithNumbers.split(", ");
		ArrayList<String> numbersList = new ArrayList<String>();
		for (int i = 0; i < arrrayOfStrings.length; i++) {
			numbersList.add(arrrayOfStrings[i]);
		}
		int counting;
		for (int i = 0; i < numbersList.size(); i++) {
			if (numbers.get(numbersList.get(i)) != null) {
				counting = numbers.get(numbersList.get(i));
			} else {
				counting = 0;
			}
			
			if (counting != 0) {
				counting++;
				numbers.put(numbersList.get(i), counting);
			} else {
				numbers.put(numbersList.get(i), 1);
			}
		}
		ArrayList<String> numbersListCopy = new ArrayList<String>(numbersList);
		for (String element : numbersListCopy) {
			if (numbers.containsKey(element) && numbers.get(element) % 2 == 1) {
				while (numbersList.remove(element));
			}
		}
//		for (Map.Entry<String, Integer> number : numbers.entrySet()) {
//			if (number.getValue() % 2 == 1) {
//				for (String element : numbersListCopy) {
//					if (number.getKey().equals(element)){
//						while (numbersList.remove(element));
//					}
//				}
//			}
//		}
		System.out.println(numbersList.toString());
		
	}

}
