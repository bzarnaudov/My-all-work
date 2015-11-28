package all;

import java.util.*;

public class Problem5Company {
	private String companyName;
    private String owner;
    private String bulstat;
    private List<Problem5Employee> employees;
    private HashMap<Double, Problem5Apartment> apartmentCatalog;
    private HashMap<Double, Problem5House> houseCatalog;
    private HashMap<Double, Problem5Estate> shopCatalog;

    public Problem5Company(String name, String owner, String bulstat) {
        this.companyName = name;
        this.owner = owner;
        this.bulstat = bulstat;
        this.apartmentCatalog = new HashMap<Double, Problem5Apartment>();
        this.houseCatalog = new HashMap<Double, Problem5House>();
        this.shopCatalog = new HashMap<Double, Problem5Estate>();
        this.employees = new ArrayList<Problem5Employee>();
    }

   

    public String getCompanyName() {
		return companyName;
	}



	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}



	public String getOwner() {
		return owner;
	}



	public void setOwner(String owner) {
		this.owner = owner;
	}



	public String getBulstat() {
		return bulstat;
	}



	public void setBulstat(String bulstat) {
		this.bulstat = bulstat;
	}



	public void addHouse(Problem5House hs) {
        if (houseCatalog.containsKey(
           calculatingHashCode(hs.getArea(), hs.getPricePerSquareMeter())) == false) {
            houseCatalog.put(calculatingHashCode(hs.getArea(), hs.getPricePerSquareMeter()), hs);
        }
    }

    public void addApartment(Problem5Apartment apartment) {
        if (apartmentCatalog.containsKey(calculatingHashCode(apartment.getArea(), 
            apartment.getPricePerSquareMeter())) == false) {
            apartmentCatalog.put(calculatingHashCode(apartment.getArea(), 
            		apartment.getPricePerSquareMeter()), apartment);
        }
    }

    public void addShop(Problem5Estate shop) {
        if (shopCatalog.containsKey(
            calculatingHashCode(shop.getArea(), shop.getPricePerSquareMeter())) == false) {
            shopCatalog.put(calculatingHashCode(shop.getArea(), shop.getPricePerSquareMeter()), shop);
        }
    }

    private double calculatingHashCode(double area, double pricePerSquare) {
        return 31 * area * pricePerSquare * 13.45 * 24.13;
    }

    public void apartmentCatalogPrint() {
        for (Map.Entry<Double, Problem5Apartment> apartment : apartmentCatalog.entrySet()) {
            System.out.println(apartment.getValue().toString());
        }
    }

    public void houseCatalogPring() {
        for (Map.Entry<Double, Problem5House> house : houseCatalog.entrySet()) {
            System.out.println(house.getValue().toString().trim());
            		//Trim('{', '}'));
        }
    }

    public void shopCatalog() {
        for (Map.Entry<Double, Problem5Estate> shop : shopCatalog.entrySet()) {
            System.out.println(shop.getValue().toString().trim());
            		//Trim('{', '}'));
        }
    }

    public void addEmployee(Problem5Employee emp) {
        if (employees.contains(emp) == false) {
            employees.add(emp);
        }
    }

    public void employeesPrint() {
        for (Problem5Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

}
