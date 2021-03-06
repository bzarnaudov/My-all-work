package all;

public class Problem4Rectangle extends Problem4Shape {
	
	public Problem4Rectangle(double width, double height) {
		super(width, height);
	}
	
	@Override
	public double calculateSurface() {
		double rectangleSurface = this.getWidth() * this.getHeight();
		return rectangleSurface;
	}

	@Override
	public String toString() {
		return "Problem4Rectangle [calculateSurface()=" + calculateSurface()
				+ "]";
	}
	
}
