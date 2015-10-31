package all;

public class Problem6CarInfo implements Comparable<Problem6CarInfo>{
	public String brand;
    public String model;
    public String color;
    public int year;
    public double price;
    private String[] allIfno = new String[5];
    
    public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public int getYear() {
		return year;
	}

	public double getPrice() {
		return price;
	}
	
	public Problem6CarInfo() {
        allIfno[0] = this.brand = "";
        allIfno[1] = this.model = "";
        allIfno[2] = this.color = "";
        allIfno[3] = "2012";
        this.year = 2012;
        allIfno[4] = "0";
        this.price = 0;
    }

	public Problem6CarInfo(String brand, String model, String color, int year, double price) {
        allIfno[0] = this.brand = brand;
        allIfno[1] = this.model = model;
        allIfno[2] = this.color = color;
        allIfno[3] = year + "";
        this.year = year;
        allIfno[4] = price + "";
        this.price = price;
    }

    public String returnInfoByIndex(int index) {
        String info = "";
        try {
            if (index >= 0 && index < allIfno.length) {
                info = allIfno[index];
            } else {
                throw new Exception("Incorrect index passed");
            }
        } catch (Exception e) {
        	System.out.println(e.getMessage());
        }
        return info;
    }

    public String returnWholeString() {
        String allStrings = brand + model + color + year + price;
        return allStrings;
    }

    public String printInformation() {
        String toReturn = String.format("Information about the car:\n" +
           "Brand: %s\nModel %s\nColor %s\nYear: %d\n$Price: %.2f\n",
           brand, model, color, year, price);
        return toReturn;
    }

    public int compareTo(Problem6CarInfo other) {
        int result = this.brand.compareTo(other.brand);
        if (result == 0) {
            result = this.model.compareTo(other.model);
        }
        if (result == 0) {
            result = this.color.compareTo(other.color);
        }
        return result;
    }
}
