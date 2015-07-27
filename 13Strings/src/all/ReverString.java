package all;

import java.util.Scanner;

public class ReverString {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please write text for reversing : ");
		String inputString = input.nextLine();
		reverseString(inputString);
		input.close();
	}

	private static void reverseString(String inputString) {
		StringBuilder string1 = new StringBuilder();
		for(int i = inputString.length() - 1; i >= 0 ; i--) {
			string1.append(inputString.charAt(i));
		}
		System.out.println(string1.toString());
	}

}
