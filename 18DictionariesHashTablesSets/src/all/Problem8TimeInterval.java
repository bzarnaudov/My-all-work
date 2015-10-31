package all;

import java.util.Date;

public class Problem8TimeInterval {
	private Date arriveTime;
    private Date leaveTime;

    public Date getArriveTime() {
		return arriveTime;
	}
    
	public Date getLeaveTime() {
		return leaveTime;
	}
	
	public Problem8TimeInterval(Date arriveTime, Date leaveTime) {
        this.arriveTime = arriveTime;
        this.leaveTime = leaveTime;
    }
	
    @SuppressWarnings("deprecation")
	public Problem8TimeInterval(String stringTime) {
        StringBuilder stringBuilder = new StringBuilder(stringTime.length() * 2);
        for (int i = 0; i < stringTime.length(); i++) {
        	if (Character.isDigit(stringTime.charAt(i))) {
        		stringBuilder.append(stringTime.charAt(i));
        	} else {
        		stringBuilder.append(' ');
        	}
        }
        stringBuilder = new StringBuilder(stringBuilder.toString().trim());
        String[] stringTimes = stringBuilder.toString().split(" ");

        this.arriveTime = new Date(0, 0, 0, Integer.parseInt(stringTimes[0]), Integer.parseInt(stringTimes[1]));
        this.leaveTime = new Date(0, 0, 0, Integer.parseInt(stringTimes[2]), Integer.parseInt(stringTimes[3]));
    }

}
