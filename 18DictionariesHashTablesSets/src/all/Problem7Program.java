package all;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Problem7Program {
	static StringBuilder output = new StringBuilder();
    static Problem7TreeMultiSet<Integer> set = new Problem7TreeMultiSet<Integer>();

    public static void main(String[] args) {
        readInput();
        try {
			printOutput("proba.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    private static void readInput() {
    	Scanner input = new Scanner(System.in);
        while (true) {
            String commandText = input.nextLine();
            if (commandText.equals("End") || commandText.equals(null)) {
                break;
            }
            try {
                processCommand(commandText);
            } catch (Exception ex) {
                output.append("Unhandled exception: " + ex);
            }
        }
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
        String line = reader.nextLine();
        while (!line.equals(null) || !(line.equals("End"))) {
            processCommand(line);
            line = reader.nextLine();
        }
        reader.close();
    }

    private static void processCommand(String commandText) {
        String[] command = commandText.split(" \\| ");
        switch (command[0]) {
            case "Add": set.add(Integer.parseInt(command[1])); break;
            case "Delete": set.delete(Integer.parseInt(command[1])); break;
            case "Find": output.append(String.valueOf(set.find(Integer.parseInt(command[1]))) + "\n"); break;
            case "Count": output.append(String.valueOf(set.getCount()) + "\n"); break;
            case "DeleteAll": set.deleteAll(Integer.parseInt(command[1])); break;
            case "FindMin": output.append(String.valueOf(set.findMin()) + "\n"); break;
            case "FindMax": output.append(String.valueOf(set.findMax()) + "\n"); break;
            case "DeleteLast": set.deleteLast(); break;
            case "DeleteFirst":  set.deleteFirst(); break;
            case "Foreach": 
                    for (Integer item : set) {
                        output.append(String.valueOf(item) + ",");
                    }
                    output.delete(output.length() - 1, output.length());
                    output.append("\n");
                    break;
        }
    }

	@SuppressWarnings("unused")
	private static void printOutput() {
        System.out.println(output);
    }

    private static void printOutput(String fileName) throws IOException {
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

}

