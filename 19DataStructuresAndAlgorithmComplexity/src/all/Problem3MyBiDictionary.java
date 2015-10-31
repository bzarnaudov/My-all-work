package all;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem3MyBiDictionary {

	public static Problem3BiDictionary<String, String, Integer> biDictionary = new Problem3BiDictionary<String, String, Integer>();
    private static StringBuilder output = new StringBuilder();
   
    public static void processAllCommands() throws Exception {
    	Scanner input = new Scanner(System.in);
        while (true) {     	
            String commandText = input.nextLine();
            if (commandText.equals("End")) {
                break;
            }
            processCommand(commandText);
        }
        input.close();
    }

    private static void processCommand(String commandText) throws Exception {

        // Parse the command and its arguments
        int spaceIndex = commandText.indexOf(": ");
        if (spaceIndex == -1) {
            throw new Exception("Invalid command: " + commandText);
        }
        String command = commandText.substring(0, spaceIndex);
        String argumentsStr = commandText.substring(spaceIndex + 2);
        String[] arguments = argumentsStr.split(";");
        for (int i = 0; i < arguments.length; i++) {
            arguments[i] = arguments[i].trim();
        }

        // Execute the parsed command
        if (command.equals("Add")) {
            processAddCommand(command, arguments);
        } else if ((command.equals("FindOne")) || (command.equals("FindTwo")) || (command.equals("FindThree"))) {
            processFindCommand(command, arguments);
        } else {
            throw new Exception("Invalid command: " + commandText);
        }
    }
    
    private static void processFindCommand(String command, String[] arguments) {
        List<Integer> elements = new ArrayList<Integer>();
        boolean hasElements = false;
        if (command.equals("FindOne")) {
            hasElements = biDictionary.searchByFirstKey(arguments[0]);
        } else if (command.equals("FindTwo")) {
            hasElements = biDictionary.searchBySecondKey(arguments[0]);
        } else if (command.equals("FindThree")) {
            hasElements = biDictionary.searchByBothKeys(arguments[0],arguments[1]);
        }
        if (hasElements==false) {
            print("No elements found");
        } else {
        	elements = biDictionary.getRezult();
            for (Integer item : elements) {
                print(item.toString());
            }
        }
    }

    private static void processAddCommand(String command, String[] arguments) {
        biDictionary.add(arguments[0], arguments[1], Integer.parseInt(arguments[2]));
        print("Element added");
    }
    
    private static void printCollectedOutput() {
        System.out.print(output);
    }
    
    private static void print(String text)  {
        output.append(text + "\n");
    }
    
    public static void main(String[] args) throws Exception {
    	processAllCommands();
        printCollectedOutput();
	}
}
