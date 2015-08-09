package all;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem4RemoveOddOccurrences {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.print("Please write numbers separated with space : ");
		String inputString = input.nextLine();
		String[] numbers = inputString.split(" ");
		for (int i=0; i< numbers.length; i++) {
			list.add(Integer.parseInt(numbers[i]));
		}
		list = removeOddOccurrences(list);
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
		input.close();
	}

	private static ArrayList<Integer> removeOddOccurrences(
			ArrayList<Integer> list) {
		ArrayList<Integer> numbersForDelete = new ArrayList<Integer>();
		ArrayList<Integer> numbersToStay = new ArrayList<Integer>();
		for (int index1 = 0; index1 <= list.size() - 1; index1++ ) {
			int occurrences = 1;
			if ((index1 == list.size() - 1) && !numbersToStay.contains(list.get(index1))) {
				numbersForDelete.add(list.get(index1));
				break;
			} else if((index1 == list.size() - 1) && numbersToStay.contains(list.get(index1))) {
				break;
			}
			for (int index2 = index1 + 1; index2 <= list.size() - 1; index2++) {
				if ( numbersForDelete.contains(list.get(index1)) || 
						numbersToStay.contains(list.get(index1))) {
					occurrences = 0;
					break;
				}
				if ( list.get(index1) == list.get(index2)) {
					occurrences++;
				}
			}
			if (occurrences % 2 == 1) {
				numbersForDelete.add(list.get(index1));
			} else {
				numbersToStay.add(list.get(index1));
			}
		}
		for (int index3 = 0; index3 <= numbersForDelete.size() - 1; index3++) {
			while ( list.contains(numbersForDelete.get(index3))) {
				list.remove(numbersForDelete.get(index3));
			}
		}
		return list;
	}

}
