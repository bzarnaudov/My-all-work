
import java.awt.Font;

public abstract class Writable extends Drawable {
	protected Font font;
	
	public Writable() {
		font = new Font("Ariel", Font.BOLD, 16);
	}
	
	public Font getFont() {
		return font;
	}
}
