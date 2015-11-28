package all;

public class Problem5Estate {
	private double area;
    private double pricePerSquareMeter;
    private String location;

    // Crate a public constructor of the class
    public Problem5Estate(double area, double pricePerSquareMeter, String location) {
        this.area = area;
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.location = location;
    }

    // Default constructor
    public Problem5Estate() {
    }

    
    public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPricePerSquareMeter() {
		return pricePerSquareMeter;
	}

	public void setPricePerSquareMeter(double pricePerSquareMeter) {
		this.pricePerSquareMeter = pricePerSquareMeter;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	//Create an overridden method to represent the information from the class 
    // into a string
    @Override
    public String toString() {
        String result = "Area " + this.area + '\n' + "Price per square meter " + 
            this.pricePerSquareMeter + '\n' + "Location " + this.location;
        return result;
    }

}
