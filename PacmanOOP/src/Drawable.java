import java.awt.Color;

public abstract class Drawable {
	protected Color color;
	
	public Drawable() {
		color = new Color(196, 128, 255);
	}

	public Color getColor() {
		return color;
	}
}
