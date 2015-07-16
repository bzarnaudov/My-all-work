package stacksAndQueues;

import java.util.Scanner;
import java.util.Stack;

public class Problem1ReverseNumbersWithAStack {

	public static void main(String[] args) {
		Stack<Integer> reverseNumbers = new Stack<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.print("Please write numbers separated with space : ");
		String inputString = input.nextLine();
		String[] numbers = inputString.split(" ");
		for (int i=0; i< numbers.length; i++) {
			reverseNumbers.push(Integer.parseInt(numbers[i]));
		}
		while (!reverseNumbers.isEmpty()) {
			System.out.print(reverseNumbers.pop() + " ");
		}
		input.close();
	}

}
