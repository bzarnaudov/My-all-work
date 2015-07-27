package all;

import java.util.Scanner;

public class SearchingForUnderString {
	public static void main(String[] args) {
		String text = "We are living in a yellow submarine. We don't have anything" + 
				 " else. Inside the submarine is very tight. So we are drinking all" +
				 " the day. We will move out of it in 5 days.";
		Scanner input = new Scanner(System.in);
		System.out.println(text);
		System.out.print("Please write thing for searching in this text: ");
		String inputString = input.nextLine();
		System.out.println(searchingForString(text, inputString));
		input.close();
	}

//	private static int searchingForString(String text, String inputString) {
//		int searchthingLength = inputString.length();
//		int countForSearch = 0;
//		for ( int i = 0; i <= text.length() - searchthingLength; i++) {
//			if (inputString.equalsIgnoreCase(text.substring(i, i+searchthingLength))) {
//				countForSearch++;
//			}
//		}
//		return countForSearch;
//	}
	private static int searchingForString(String text, String inputString) {
		int index = text.toLowerCase().indexOf(inputString);
		int countForSearch;
		if (index == -1) {
			countForSearch = 0;
		} else {
			countForSearch = 1;
			while ( index != -1) {
				index = text.toLowerCase().indexOf(inputString, index + 1);
				if (index >= 0) {
					countForSearch++;
				}
			}
		}
		return countForSearch;
	}
	
}
