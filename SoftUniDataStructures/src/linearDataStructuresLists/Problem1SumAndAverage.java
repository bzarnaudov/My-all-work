package linearDataStructuresLists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem1SumAndAverage {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		System.out.print("Please write numbers separated with space : ");
		String inputString = input.nextLine();
		String[] numbers = inputString.split(" ");
		for (int i=0; i< numbers.length; i++) {
			list.add(Integer.parseInt(numbers[i]));
		}
		int sum = sum(list);
		DecimalFormat format = new DecimalFormat("#.##############");
        
		System.out.printf("Sum=" + sum + "; Average=" + format.format(average(list, sum)));
		input.close();
	}

	private static int sum(ArrayList<Integer> list) {
		int sum = 0;
		for ( int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum;
	}

	private static double average(ArrayList<Integer> list, double sum) {
		double average = sum / list.size();
		return average;
	}

}
