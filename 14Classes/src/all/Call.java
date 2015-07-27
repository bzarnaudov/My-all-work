package all;

public class Call {
	private String date;
	private String startTime;
	private String duration;
	
	public Call() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Call(String date, String startTime, String duration) {
		super();
		this.date = date;
		this.startTime = startTime;
		this.duration = duration;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return  "Call [date=" + date + ", startTime=" + startTime
				+ ", duration=" + duration + "]";
	}
	
}
