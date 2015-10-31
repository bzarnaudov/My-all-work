package all;

import java.util.*;

public class Problem6CarCatalogue {
	List<HashMap<String, HashMap<String, Problem6CarInfo>>> phoneBook = new ArrayList<HashMap<String, HashMap<String, Problem6CarInfo>>>();
    TreeMap<Double, Problem6CarInfo> priceCatalogue = new TreeMap<Double, Problem6CarInfo>();
    TreeMap<Integer, Problem6CarInfo> yearCatalogue = new TreeMap<Integer, Problem6CarInfo>();
    
    public String addNewEntry(Problem6CarInfo car) {
        String toReturn = "Entry Added";
        String currentString = null;
        for (int i = 0; i < phoneBook.size(); i++) {
            currentString = car.returnInfoByIndex(i);
            if (phoneBook.get(i).containsKey(currentString)) {
                phoneBook.get(i).get(currentString).put(car.returnWholeString(), car);
            } else {
            	phoneBook.get(i).put(currentString, new HashMap<String, Problem6CarInfo>());
            	phoneBook.get(i).get(currentString).put(car.returnWholeString(), car);
            }
        }
        priceCatalogue.put(car.price, car);
        yearCatalogue.put(car.year, car);
        return toReturn;
    }

    public String getEntriesByName(Problem6CarInfo contact, boolean[] used) {
        String toReturn = "";
        StringBuilder stringEntries = new StringBuilder();
        List<Problem6CarInfo> allEntries = new ArrayList<Problem6CarInfo>();

        for (int i = 0; i < phoneBook.size(); i++) {
            if (used[i]) {
                if (allEntries.size() == 0) {
                    String currentProperty = contact.returnInfoByIndex(i);
                    if (phoneBook.get(i).containsKey(currentProperty)) {
                        allEntries = new ArrayList<Problem6CarInfo>(phoneBook.get(i).get(currentProperty).values());
                    } else {
                        // if there is no such entry, there is nothing to be added
                    }
                } else {
                    List<Problem6CarInfo> refinedEntries = new ArrayList<Problem6CarInfo>();
                    String currentProperty = null;
                    for (Problem6CarInfo entry : allEntries) {
                        currentProperty = contact.returnInfoByIndex(i);
                        if (phoneBook.get(i).containsKey(currentProperty)) {
                            if (phoneBook.get(i).get(currentProperty).containsKey(entry.returnWholeString())) {
                                refinedEntries.add(entry);
                            }
                        }
                    }

                    allEntries = refinedEntries;
                }
            }
        }

        stringEntries.append(allEntries.size() + " cars found:\n");
        for (Problem6CarInfo entry : allEntries) {
            stringEntries.append(entry.printInformation() + "\n");
        }
        toReturn = stringEntries.toString();
        return toReturn;
    }

    public String yearSearch(int startYear, int endYear) {
        String toReturn = "";
        StringBuilder carsByYear = new StringBuilder();
        ArrayList<Problem6CarInfo> allEntries = new ArrayList<Problem6CarInfo>(yearCatalogue.values());
        int carsCounter = 0; 
        for (Problem6CarInfo entry : allEntries) {
            if (entry.year >= startYear && entry.year <= endYear) {
                carsCounter++;
            }
        }

        carsByYear.append(carsCounter + " cars found:\n");
        for (Problem6CarInfo entry : allEntries) {
            if (entry.year >= startYear && entry.year <= endYear) {
                carsByYear.append(entry.printInformation() + "\n");
            }
        }
        toReturn = carsByYear.toString();
        return toReturn;
    }

    public String priceSearch(double startPrice, double endPrice) {
        String toReturn = "";
        StringBuilder carsByPrice = new StringBuilder();
        ArrayList<Problem6CarInfo> allEntries = new ArrayList<Problem6CarInfo>(yearCatalogue.values());
        int carsCounter = 0; 
        for (Problem6CarInfo entry : allEntries) {
            if (entry.price >= startPrice && entry.price <= endPrice) {
                carsCounter++;
            }
        }
        carsByPrice.append(carsCounter + " cars found:\n");
        for (Problem6CarInfo entry : allEntries) {
            if (entry.price >= startPrice && entry.price <= endPrice) {
                carsByPrice.append(entry.printInformation() + "\n");
            }
        }
        toReturn = carsByPrice.toString();
        return toReturn;
    }

    public Problem6CarCatalogue() {
    	for (int i = 0; i < 3; i++) {
        	phoneBook.add(new HashMap<String, HashMap<String, Problem6CarInfo>>());
        }
    }
}
