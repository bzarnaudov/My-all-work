package linearDataStructuresLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Problem2SortWords {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		System.out.print("Please write sequence of words separated with space : ");
		String inputString = input.nextLine();
		String[] words = inputString.split(" ");	
		for (int i=0; i< words.length; i++) {
			list.add(words[i]);
		}
		Collections.sort(list);
		for (String string : list) {
			System.out.print(string + " ");
		}
		input.close();
	}

}
