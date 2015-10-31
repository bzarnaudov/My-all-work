package all;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem9HappyNumbersInSequence {
	static StringBuilder output = new StringBuilder();
    static Problem9ListComparator listComparer = new Problem9ListComparator();
    static Problem7TreeMultiSet<ArrayList<Integer>> longestLists = new Problem7TreeMultiSet<ArrayList<Integer>>(listComparer);
    static ArrayList<Integer> sequence = new ArrayList<Integer>();
    
    public static void main(String[] args) {
		readInput();
		printOutput();
	}
    
    private static void readInput() {
    	Scanner input = new Scanner(System.in);
        int sum = Integer.parseInt(input.nextLine());
        prepareInputSequence(input.nextLine());
        findLongestSequence(sum);
        input.close();
    }

    @SuppressWarnings("unused")
	private static void readInput(String fileName) {
    	Scanner reader = null;
    	int sum = 0;
		try {
			reader = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        while (reader.hasNextLine()) {
        	sum = Integer.parseInt(reader.nextLine());
        	prepareInputSequence(reader.nextLine());
        }
        findLongestSequence(sum);
        reader.close();
    }

    private static void prepareInputSequence(String inputLine) {
        String[] stringSequence = inputLine.split(" ");
        for (String item : stringSequence) {
            sequence.add(Integer.parseInt(item));
        }
    }
    
    private static void findLongestSequence(int sum) {
        int currentSum = 0;
        for (int startIndex = 0; startIndex < sequence.size(); startIndex++) {
            ArrayList<Integer> newList = new ArrayList<Integer>();
            currentSum = 0;
            for (int i = startIndex; i < sequence.size(); i++) {
                newList.add(sequence.get(i));
                currentSum += sequence.get(i);
                if (currentSum == sum) {
                    longestLists.add(new ArrayList<Integer>(newList));
                    if (longestLists.getCount() > 10) {
                        longestLists.deleteLast();
                    }
                }
            }
        }
    }

    private static void printOutput() {
        prepareOutPut();
        System.out.println(output);
    }

    @SuppressWarnings("unused")
	private static void printOutput(String fileName) throws IOException {
        prepareOutPut();
        BufferedWriter writer = null;
    	try {
	    	writer = new BufferedWriter(new FileWriter(new File(fileName)));
	    	writer.write(output.toString());
    	} finally {
    		if (writer != null) {
    			writer.close();
    		}
    	}
    }

    private static void prepareOutPut() {
        if (longestLists.getCount() == 0) {
            output.append(-1);
        }
        for (ArrayList<Integer> list : longestLists) {
            output.append("[");
            for (Integer item : list) {
                output.append(item + ",");
            }
            output.delete(output.length() - 1, output.length());
            output.append("]");
            output.append("\n");
        }
    }
}
