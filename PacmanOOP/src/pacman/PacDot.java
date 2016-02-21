package pacman;

import java.awt.Color;

public class PacDot extends Drawable {
	protected int size;
	protected int score;

	public PacDot() {
		size = 2;
		score = 1;
		color = new Color(192, 192, 0);
	}

	/**
	 * Returns the value of the pac-dot to add to the player's score when eaten
	 */
	public int getScore() {
		return score;
	}

	/**
	 * Returns the size of the pac-dot
	 */
	public int getSize() {
		return size;
	}
}