package all;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Problem5MainRealEstate {

	public static void main(String[] args) {
		// Crate a list of every  kind of items
        List<Problem5Apartment> apartments = new ArrayList<Problem5Apartment>();
        List<Problem5House> houses = new ArrayList<Problem5House>();
        List<Problem5Estate> shops = new ArrayList<Problem5Estate>();
        List<Problem5Employee> employees = new ArrayList<Problem5Employee>();

        Scanner reader = null;
		try {
			reader = new Scanner(new File("EstateDoc.txt"), "windows-1251");
			String line = "";
			
            while (true) {
                line = reader.nextLine();
                if (line.equals("!")) {
                    break;
                }

                String[] elements = line.split("-");
                apartments.add(new Problem5Apartment(
                    Double.parseDouble(elements[0]), Double.parseDouble(elements[1]), 
                    elements[2], Integer.parseInt(elements[3]), 
                    elements[4], elements[5]));
            }

            while (true) {
                line = reader.nextLine();
                if (line.equals("!")) {
                    break;
                }

                String[] elements = line.split("-");
                houses.add(new Problem5House(
                    Double.parseDouble(elements[0]), Double.parseDouble(elements[1]), 
                    elements[2], Double.parseDouble(elements[3]), Double.parseDouble(elements[4]), 
                    Integer.parseInt(elements[5]), elements[6]));
            }

            while (true) {
            	line = reader.nextLine();
                if (line.equals("!")) {
                    break;
                }

                String[] elements = line.split("-");
                shops.add(new Problem5Estate(Double.parseDouble(elements[0]), 
                    Double.parseDouble(elements[1]), elements[2]));
            }

            line = reader.nextLine();
            String[] properties = line.split("-");
            Problem5Company estateCompany = new Problem5Company(
                   properties[0], properties[1], properties[2]);
            
            while (reader.hasNextLine()) {
            	line = reader.nextLine();

                String[] emplyee = line.split("-");
                employees.add(new Problem5Employee(
                    emplyee[0], emplyee[1], Double.parseDouble(emplyee[2])));
            }

            for (Problem5Apartment apartment : apartments) {
                estateCompany.addApartment(apartment);
            }
            
            for (Problem5House house : houses) {
                estateCompany.addHouse(house);
            }
            
            for (Problem5Estate shop : shops) {
                estateCompany.addShop(shop);
            }
            
            for (Problem5Employee employee : employees) {
                estateCompany.addEmployee(employee);
            }

            estateCompany.apartmentCatalogPrint();
            System.out.println();
            estateCompany.houseCatalogPring();
            System.out.println();
            estateCompany.shopCatalog();
            System.out.println();
            estateCompany.employeesPrint();
        } catch (FileNotFoundException fnfe) {
			System.err.println(fnfe.getMessage());
		} finally {
			if (!(reader == null)) {
				reader.close();
			}
		}

	}
}
