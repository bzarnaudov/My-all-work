
public class MapSpot {
	private boolean leftWall, topWall, rightWall, bottomWall;
	private boolean dot;
	private boolean powerDot;

	public MapSpot(boolean leftWall, boolean topWall, boolean rightWall,
			boolean bottomWall, boolean dot, boolean powerDot) {
		this.leftWall = leftWall;
		this.topWall = topWall;
		this.rightWall = rightWall;
		this.bottomWall = bottomWall;
		this.dot = dot;
		this.powerDot = powerDot;
	}

	public boolean hasDot() {
		return dot;
	}

	public void setDot(boolean dot) {
		this.dot = dot;
	}

	public boolean hasPowerDot() {
		return powerDot;
	}

	public void setPowerDot(boolean powerDot) {
		this.powerDot = powerDot;
	}

	public boolean hasLeftWall() {
		return leftWall;
	}

	public boolean hasTopWall() {
		return topWall;
	}

	public boolean hasRightWall() {
		return rightWall;
	}

	public boolean hasBottomWall() {
		return bottomWall;
	}

}
