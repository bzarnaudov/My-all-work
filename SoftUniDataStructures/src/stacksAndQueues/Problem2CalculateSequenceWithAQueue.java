package stacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem2CalculateSequenceWithAQueue {

	public static void main(String[] args) {
		Queue<Integer> queueSequence = new LinkedList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.print("Please write number for the first of a sequence  : ");
		int inputN = input.nextInt();
		queueSequence.add(inputN);
		for (int index = 1; index <= 50; index++) {
			int current = queueSequence.poll();
			System.out.println(current);
			queueSequence.add(current + 1);
			queueSequence.add(current + current + 1);
			queueSequence.add(current + 2);
		}
		input.close();
	}
}
