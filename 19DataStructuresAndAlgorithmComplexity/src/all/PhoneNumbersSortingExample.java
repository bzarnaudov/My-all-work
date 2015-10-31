package all;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class PhoneNumbersSortingExample {

	public static void main(String[] args) throws FileNotFoundException {
		// Read the file and build the phone book
		TreeMap<String, TreeMap<String, String>> phonesByTown =	new TreeMap<String, TreeMap<String, String>>();
		Scanner input = new Scanner(new File("TelephoneNumbers.txt"), "windows-1251");
		try {
			while (input.hasNext()) {
				String line = input.nextLine();
				String[] phoneBookEntry = line.split("\\s*\\|\\s*");
				String name = phoneBookEntry[0];
				String town = phoneBookEntry[1];
				String phone = phoneBookEntry[2];
				TreeMap<String, String> phoneBook = phonesByTown.get(town);
				if (phoneBook == null) {
					// This town is new. Create a phone book for it
					phoneBook = new TreeMap<String, String>();
					phonesByTown.put(town, phoneBook);
				}
				phoneBook.put(name, phone);
			}
		} finally {
			input.close();
		}
		
		// Print the phone book by towns
		Set<String> towns = phonesByTown.keySet();
		for (String town : towns) {
			System.out.println("Town " + town + ":");
			TreeMap<String, String> phoneBook = phonesByTown.get(town);
			for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
				String name = entry.getKey();
				String phone = entry.getValue();
				System.out.printf("\t%s - %s\n", name, phone);
			}
		}
	}
}
