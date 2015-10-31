package all;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Problem5Event implements Comparable<Problem5Event>{
	private String name;
    private Date meetingStart;
    private Date meetingEnd;
    @SuppressWarnings("unused")
	private SimpleDateFormat ft = new SimpleDateFormat("yyyy-M-d'T'H:m:s");

    public Problem5Event(String name, Date meetingStart, Date meetingEnd) {
        this.name = name;
        this.meetingStart = meetingStart;
        this.meetingEnd = meetingEnd;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getMeetingStart() {
		return meetingStart;
	}

	public void setMeetingStart(Date meetingStart) {
		this.meetingStart = meetingStart;
	}

	public Date getMeetingEnd() {
		return meetingEnd;
	}

	public void setMeetingEnd(Date meetingEnd) {
		this.meetingEnd = meetingEnd;
	}

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((meetingStart == null) ? 0 : meetingStart.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public int compareTo(Problem5Event obj) {
		int compare = this.meetingStart.compareTo(obj.meetingStart);   
        if (compare==0) {
            return this.name.compareTo(obj.name);
        }
        return this.meetingStart.compareTo(obj.meetingStart);
	}
}
