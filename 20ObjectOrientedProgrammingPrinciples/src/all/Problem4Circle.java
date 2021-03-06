package all;

public class Problem4Circle extends Problem4Shape{
	
	public Problem4Circle() {
		super(0, 0);
	}
	
	public Problem4Circle(double width, double height) {
		super(width, height);
		if (width != height) {
			try {
				throw new Exception ("Height is not equal to width in circle shape");
			} catch (Exception e) {
				e.getMessage();
				e.printStackTrace();
			}
		}
	}
	
	public double calculateSurface() {
		double circleSurface = Math.PI * this.getHeight() * this.getHeight();
		return circleSurface;
	}

	@Override
	public String toString() {
		return "Problem4Circle [calculateSurface()=" + calculateSurface() + "]";
	}
	
	
}
