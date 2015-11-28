package all;

public class Problem5House extends Problem5Estate {
	private double constructedArea;
    private double yard;
    private int floors;
    private String furniture;

    // Crate a public constructor of the class
    public Problem5House(double area, double pricePerSquareMeter, String location,
        double constructedArea, double yard, int floors, String furniture) {
    	super(area, pricePerSquareMeter, location);
        this.constructedArea = constructedArea;
        this.yard = yard;
        this.floors = floors;
        this.furniture = furniture;
    }

    
    public double getConstructedArea() {
		return constructedArea;
	}


	public void setConstructedArea(double constructedArea) {
		this.constructedArea = constructedArea;
	}


	public double getYard() {
		return yard;
	}


	public void setYard(double yard) {
		this.yard = yard;
	}


	public int getFloors() {
		return floors;
	}


	public void setFloors(int floors) {
		this.floors = floors;
	}


	public String getFurniture() {
		return furniture;
	}


	public void setFurniture(String furniture) {
		this.furniture = furniture;
	}


	//Create an overridden method to represent the information from the class 
    // into a string
    @Override
    public String toString() {
        return super.toString() + '\n' + 
            "Constructed area of the house " + this.constructedArea + 
            '\n' + "Yard space " + this.yard + '\n' + "Number of floors " +
            this.floors + '\n' + "Furniture " + this.furniture;
    }

}
