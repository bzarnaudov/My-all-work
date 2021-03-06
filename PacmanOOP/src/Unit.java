
import java.awt.Image;

import javax.swing.ImageIcon;

public abstract class Unit {
	protected int speed;
	protected int rowPosition;
	protected int columnPosition;
	protected int directionX;
	protected int directionY;
	
	protected Image unit1, unit2up, unit2left, unit2right, unit2down;
	protected Image unit3up, unit3down, unit3left, unit3right;
	protected Image unit4up, unit4down, unit4left, unit4right;
	
	public void setImages(String unit) {
		setImages(unit, unit, unit, unit, unit, unit, unit, unit, unit, unit,
				unit, unit, unit);
	}

	public void setImages(String unit1S, String unit2upS, String unit3upS,
			String unit4upS, String unit2downS, String unit3downS,
			String unit4downS, String unit2leftS, String unit3leftS,
			String unit4leftS, String unit2rightS, String unit3rightS,
			String unit4rightS) {

		unit1 = new ImageIcon(this.getClass().getResource(unit1S)).getImage();
		unit2up = new ImageIcon(this.getClass().getResource(unit2upS))
				.getImage();
		unit3up = new ImageIcon(this.getClass().getResource(unit3upS))
				.getImage();
		unit4up = new ImageIcon(this.getClass().getResource(unit4upS))
				.getImage();
		unit2down = new ImageIcon(this.getClass().getResource(unit2downS))
				.getImage();
		unit3down = new ImageIcon(this.getClass().getResource(unit3downS))
				.getImage();
		unit4down = new ImageIcon(this.getClass().getResource(unit4downS))
				.getImage();
		unit2left = new ImageIcon(this.getClass().getResource(unit2leftS))
				.getImage();
		unit3left = new ImageIcon(this.getClass().getResource(unit3leftS))
				.getImage();
		unit4left = new ImageIcon(this.getClass().getResource(unit4leftS))
				.getImage();
		unit2right = new ImageIcon(this.getClass().getResource(unit2rightS))
				.getImage();
		unit3right = new ImageIcon(this.getClass().getResource(unit3rightS))
				.getImage();
		unit4right = new ImageIcon(this.getClass().getResource(unit4rightS))
				.getImage();
	}

	public Image getUnit1() {
		return unit1;
	}

	public Image getUnit2up() {
		return unit2up;
	}

	public Image getUnit2left() {
		return unit2left;
	}

	public Image getUnit2right() {
		return unit2right;
	}

	public Image getUnit2down() {
		return unit2down;
	}

	public Image getUnit3up() {
		return unit3up;
	}

	public Image getUnit3down() {
		return unit3down;
	}

	public Image getUnit3left() {
		return unit3left;
	}

	public Image getUnit3right() {
		return unit3right;
	}

	public Image getUnit4up() {
		return unit4up;
	}

	public Image getUnit4down() {
		return unit4down;
	}

	public Image getUnit4left() {
		return unit4left;
	}

	public Image getUnit4right() {
		return unit4right;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getRowPosition() {
		return rowPosition;
	}

	public void setRowPosition(int rowPosition) {
		this.rowPosition = rowPosition;
	}

	public int getColumnPosition() {
		return columnPosition;
	}

	public void setColumnPosition(int columnPosition) {
		this.columnPosition = columnPosition;
	}

	public int getDirectionX() {
		return directionX;
	}

	public void setDirectionX(int directionX) {
		this.directionX = directionX;
	}

	public int getDirectionY() {
		return directionY;
	}

	public void setDirectionY(int directionY) {
		this.directionY = directionY;
	}
}
