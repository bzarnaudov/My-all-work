package all;

public class Screen {
	private double height;
	private double width;
	private double thickness;
	private String colors;
	
	
	@Override
	public String toString() {
		return "Screen [height=" + height + ", width=" + width + ", thickness="
				+ thickness + ", colors=" + colors + "]";
	}


	public Screen(double height, double width, double thickness, String colors) {
		this.height = height;
		this.width = width;
		this.thickness = thickness;
		this.colors = colors;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(float height) {
		this.height = height;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(float width) {
		this.width = width;
	}


	public double getThickness() {
		return thickness;
	}


	public void setThickness(float thickness) {
		this.thickness = thickness;
	}


	public String getColors() {
		return colors;
	}


	public void setColors(String colors) {
		this.colors = colors;
	}
	
	
	
}
