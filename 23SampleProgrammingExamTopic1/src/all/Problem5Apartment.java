package all;

public class Problem5Apartment extends Problem5Estate {
	private int numberOfFloor;
	private String elevator;
	private String furniture;

    // Create a public constructor of the class
    public Problem5Apartment(double area, double pricePerSquareMeter, String location,
        int numberOfFloor, String elevator, String furniture) {
    	super(area, pricePerSquareMeter, location);
        this.numberOfFloor = numberOfFloor;
        this.elevator = elevator;
        this.furniture = furniture;
    }

    // Create an overridden method to represent the information from the class 
    // into a string
    public String toString() {
        return super.toString() + '\n' + "Number of floor of the apartment " + 
            this.numberOfFloor + '\n' + "Elevator " + this.elevator + '\n' + 
            "Furniture " + this.furniture;
    }

}
