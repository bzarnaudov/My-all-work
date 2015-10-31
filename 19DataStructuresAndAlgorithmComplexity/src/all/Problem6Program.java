package all;

import java.util.Scanner;

public class Problem6Program {

	public static void main(String[] args) {
		carCatalogueTest();
	}
	
	private static void carCatalogueTest() {
		Problem6CarCatalogue testCatalogue = new Problem6CarCatalogue();

        StringBuilder output = new StringBuilder();
        String[] commands = null;
        String inputLine = null;
        Scanner input = new Scanner(System.in);
        while (true) {
            inputLine = input.nextLine();
            commands = inputLine.split(" ");

            if (commands[0].equals("Add")) {
               output.append(testCatalogue.addNewEntry(new Problem6CarInfo(commands[1], commands[2], commands[3],
                        Integer.parseInt(commands[4]), Double.parseDouble(commands[5]))) + "\n");
            } else if (commands[0].equals("PrintByPriceRange")) {
                output.append(testCatalogue.priceSearch(Double.parseDouble(commands[1]),Double.parseDouble(commands[2])) + "\n");
            } else if (commands[0].equals("PrintByYearRange")) {
                output.append(testCatalogue.yearSearch(Integer.parseInt(commands[1]),Integer.parseInt(commands[2])) + "\n");
            } else if (commands[0].equals("PrintByBrandAndModel")) {
                boolean[] param = { true, true, false, false };
                output.append(testCatalogue.getEntriesByName(new Problem6CarInfo(commands[1], commands[2], "" , 0, 0), param) + "\n");
            } else if (commands[0].equals("End")) {
            	input.close();
                break;
            }
        }
        System.out.println(output.toString());
    }
}
