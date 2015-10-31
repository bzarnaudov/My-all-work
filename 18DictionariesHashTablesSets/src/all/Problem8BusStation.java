package all;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Problem8BusStation {
	static StringBuilder output = new StringBuilder();
	public static void main(String[] args) {
		readInput();
		printOutput();
	}
	
    private static void readInput() {
    	Scanner input = new Scanner(System.in);
        Problem8TimeInterval searchingTimeInterval = new Problem8TimeInterval(input.nextLine());
        ArrayList<Problem8TimeInterval> busIntervals = prepareInputSequence(input.nextLine());
        findAllBus(searchingTimeInterval, busIntervals);
        input.close();
    }

    @SuppressWarnings("unused")
	private static void readInput(String fileName) {
    	Scanner reader = null;
		try {
			reader = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        while (reader.hasNextLine()) {
        	Problem8TimeInterval searchingTimeInterval = new Problem8TimeInterval(reader.nextLine());
            ArrayList<Problem8TimeInterval> busIntervals = prepareInputSequence(reader.nextLine());
            findAllBus(searchingTimeInterval, busIntervals);
        }
        reader.close();
    }

    private static ArrayList<Problem8TimeInterval> prepareInputSequence(String inputLine) {
        String[] stringSequence = inputLine.split(",");
        ArrayList<Problem8TimeInterval> busIntervals = new ArrayList<Problem8TimeInterval>();
        for (String item : stringSequence) {
            busIntervals.add(new Problem8TimeInterval(item));
        }
        return busIntervals;
    }

    private static void findAllBus(Problem8TimeInterval searchingTimeInterval, ArrayList<Problem8TimeInterval> busIntervals) {
        HashSet<Problem8TimeInterval> arriveAfter = new HashSet<Problem8TimeInterval>();
        HashSet<Problem8TimeInterval> leaveBefore = new HashSet<Problem8TimeInterval>();

        for (Problem8TimeInterval bus : busIntervals) {
            if (bus.getArriveTime().getTime() >= searchingTimeInterval.getArriveTime().getTime()) {
                arriveAfter.add(bus);
            }
            if (bus.getLeaveTime().getTime() <= searchingTimeInterval.getLeaveTime().getTime()) {
                leaveBefore.add(bus);
            }
        }

        HashSet<Problem8TimeInterval> searchedBus = new HashSet<Problem8TimeInterval>();
        searchedBus.addAll(arriveAfter);
        searchedBus.retainAll(leaveBefore);
        DateFormat format = new SimpleDateFormat("HH:mm");
        for (Problem8TimeInterval bus : searchedBus) {
        	output.append("[" + format.format(bus.getArriveTime()));
            output.append("-" + format.format(bus.getLeaveTime()) + "]");
            output.append(",");
        }
    }

    private static void printOutput() {
        if (output.length() > 1) {
        	System.out.println(output.delete(output.length() - 1, output.length()));
        } else {
            output.append("-1\n");
            System.out.println(output);
        }
    }
    
    @SuppressWarnings("unused")
	private static void printOutput (String fileName) throws IOException {
    	 BufferedWriter writer = null;
    		try {
    	    	writer = new BufferedWriter(new FileWriter(new File(fileName)));
    	    	if (output.length() > 1) {
    	    		writer.write(output.delete(output.length() - 1, output.length()).toString());
    	    	} else {
    	    		output.append("-1\n");
                    writer.write(output.toString());
    	    	}
    		} finally {
    	    	if (writer != null) {
    	    		writer.close();
    	    	}
    		}
    }

}
