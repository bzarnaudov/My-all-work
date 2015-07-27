package all;

public class Batery {
	private String model;
	private double idleTime;
	private double hoursForTalk;
	
	@Override
	public String toString() {
		return "Batery [model=" + model + ", idleTime=" + idleTime
				+ ", hoursForTalk=" + hoursForTalk + "]";
	}

	
	
	public Batery(double hoursForTalk) {
		this.hoursForTalk = hoursForTalk;
	}

	public Batery(String model) {
		this.model = model;
	}

	public Batery(String model, double idleTime, double hoursForTalk) {
		this.model = model;
		this.idleTime = idleTime;
		this.hoursForTalk = hoursForTalk;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getIdleTime() {
		return idleTime;
	}

	public void setIdleTime(float idleTime) {
		this.idleTime = idleTime;
	}

	public double getHoursForTalk() {
		return hoursForTalk;
	}

	public void setHoursForTalk(float hoursForTalk) {
		this.hoursForTalk = hoursForTalk;
	}
	
	
}
