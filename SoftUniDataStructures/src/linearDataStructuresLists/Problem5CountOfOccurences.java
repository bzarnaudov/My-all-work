package linearDataStructuresLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem5CountOfOccurences {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.print("Please write numbers separated with space : ");
		String inputString = input.nextLine();
		if ( inputString.isEmpty()) {
			System.out.println("The list is empty");
			System.out.print("Please write numbers separated with space : ");
			inputString = input.nextLine();
		}
		String[] numbers = inputString.split(" ");
		for (int i=0; i< numbers.length; i++) {
			list.add(Integer.parseInt(numbers[i]));
		}
		list = countOfOccurrences(list);
		for (int index = 0; index < list.size(); index += 2) {
			System.out.print(list.get(index) + " -> " + list.get(index + 1) +
					" times\n");
		}
		input.close();

	}

	private static ArrayList<Integer> countOfOccurrences(ArrayList<Integer> list) {
		Collections.sort(list);
		ArrayList<Integer> checkedNumbersAndCount = new ArrayList<Integer>();
		int index1 = 0;
		boolean end = true;
//		if (list.size() == 1) {
//			checkedNumbersAndCount.add(list.get(0));
//			checkedNumbersAndCount.add(1);
//			return checkedNumbersAndCount;
//		}
//		if (list.size() == 2) {
//			if (list.get(0) == list.get(1)) {
//				checkedNumbersAndCount.add(list.get(0));
//				checkedNumbersAndCount.add(2);
//			} else {
//				checkedNumbersAndCount.add(list.get(0));
//				checkedNumbersAndCount.add(1);
//				checkedNumbersAndCount.add(list.get(1));
//				checkedNumbersAndCount.add(1);
//			}
//			return checkedNumbersAndCount;
//		}
		while (end) {
			int occurrences = 1;
			int currentNumber = list.get(index1);
			for (int index2 = index1 + 1; index2 <= list.size() - 1; index2++) {
				if ( currentNumber == list.get(index2)) {
					occurrences++;
				} else {
					checkedNumbersAndCount.add(list.get(index1));
					checkedNumbersAndCount.add(occurrences);
					index1 = index2;
					break;
				}
				if (index2 == list.size() - 1) {
					index1 = index2;
				}
			}
			if ((index1 == list.size() - 1) && (currentNumber == list.get(index1))) {
				checkedNumbersAndCount.add(list.get(index1));
				checkedNumbersAndCount.add(occurrences);
				end = false;
			} else if (index1 == list.size() - 1){
				checkedNumbersAndCount.add(list.get(index1));
				checkedNumbersAndCount.add(1);
				end = false;
			}
		}
		return checkedNumbersAndCount;
	}

}
