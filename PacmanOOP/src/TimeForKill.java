
public class TimeForKill extends Writable {
	private int remainingTimeForKill, timeForKill;
	private boolean killerPacman;
	
	public TimeForKill() {
		remainingTimeForKill = 0;
		killerPacman = false;
		timeForKill = 10000;
	}
	
	public int getTimeForKill() {
		return timeForKill;
	}

	public int getRemainingTimeForKill() {
		return remainingTimeForKill;
	}

	public void setRemainingTimeForKill(int remainingTimeForKill) {
		this.remainingTimeForKill = remainingTimeForKill;
	}

	public boolean isKillerPacman() {
		return killerPacman;
	}

	public void setKillerPacman(boolean killerPacman) {
		this.killerPacman = killerPacman;
	}

	public void loweringRemainingTimeForKill() {
		if (remainingTimeForKill > 0) {
			remainingTimeForKill -= 1;
		}
	}
	
}
