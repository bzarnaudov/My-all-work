package linearDataStructuresLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem3LongestSubsequence {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.print("Please write numbers separated with space : ");
		String inputString = input.nextLine();
		String[] numbers = inputString.split(" ");
		for (int i=0; i< numbers.length; i++) {
			list.add(Integer.parseInt(numbers[i]));
		}
		list = longestSubsequence(list);
		for (Integer integer : list) {
			System.out.print(integer + " ");
		}
		input.close();
	}

	private static ArrayList<Integer> longestSubsequence(ArrayList<Integer> list) {
		ArrayList<Integer> sameNeighbours = new ArrayList<Integer>();
		int currentNumber = list.get(list.size()-1);
		int numberWithMostOccurrences = 0;
		int occurrences = 1;
		int occurrencesMax = 1;
		for (int index = list.size() -1; index >= 1; index--) {
			if (currentNumber != list.get(index - 1)) {
				occurrences = 1;
			}
			if (currentNumber == list.get(index - 1)) {
				occurrences++;
			}
			if (occurrencesMax <= occurrences) {
				occurrencesMax = occurrences;
				numberWithMostOccurrences = currentNumber;
			}
			currentNumber = list.get(index - 1);
			if ( index - 1 == 0 && occurrencesMax == 1) {
				numberWithMostOccurrences = currentNumber;
			}
		}
		for (int i = 1 ; i <= occurrencesMax; i++) {
			sameNeighbours.add(numberWithMostOccurrences);
		}
		return sameNeighbours;
	}

}
