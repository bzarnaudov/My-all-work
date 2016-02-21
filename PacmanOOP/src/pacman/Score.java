package pacman;

public class Score extends Writable {
	private int score;

	public Score() {
		score = 0;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public void addToScore(int addScore) {
		score += addScore;
	}

}
