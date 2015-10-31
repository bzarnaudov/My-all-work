package all;

public class Problem4Article implements Comparable<Problem4Article> {
	private String barcode;
    private String vendor;
    private String title;
    private double price;

    public Problem4Article(String barcode, String vendor, String title, double price) {
        this.barcode = barcode;
        this.vendor = vendor;
        this.title = title;
        this.price = price;
    }

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Title: " + this.title +
	            " Price: " + this.price +
	            " Barcode: " + this.barcode +
	            " Vendor: " + this.vendor;
	}
	   
	@Override
	public int compareTo(Problem4Article obj) {
		int compare = Integer.MAX_VALUE;
		if (this.price == obj.price) {
			compare = this.title.compareTo(obj.title);
			if (compare==0) {
				compare = this.vendor.compareTo(obj.vendor);
				if (compare==0) {
					return this.barcode.compareTo(obj.barcode);
				}
				return this.vendor.compareTo(obj.vendor);
			}
			return this.title.compareTo(obj.title);
		} else if (this.price > obj.price) {
			return 1;
		} else {
			return -1;
		}
	}
}
