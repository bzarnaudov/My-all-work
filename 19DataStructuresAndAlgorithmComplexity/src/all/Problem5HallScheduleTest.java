package all;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Problem5HallScheduleTest {

	public static void main(String[] args) throws ParseException {
        TreeMap<Date, Problem5Event> hallEvents = new TreeMap<Date, Problem5Event>();
        Date meetingStart;
        Date meetingEnd;
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-M-d'T'H:m:s");
        
        Scanner input = new Scanner(System.in);
        String[] meetingRange = input.nextLine().split(" ");
        meetingStart = ft.parse(meetingRange[0]);
        meetingEnd = ft.parse(meetingRange[1]);
        int eventsCount = Integer.parseInt(input.nextLine());
        for (int i = 0; i < eventsCount; i++) {
            String[] articleInfo = input.nextLine().split("\\|");
            for (int j = 0; j < articleInfo.length; j++) {
            	articleInfo[j] = articleInfo[j].trim();
            }
            Date currentMeetingStart = ft.parse(articleInfo[1]);
            Date currentMeetingEnd = ft.parse(articleInfo[2]);
            Problem5Event currentEvent = new Problem5Event(articleInfo[0], currentMeetingStart, currentMeetingEnd);
            hallEvents.put(currentMeetingStart, currentEvent);
        }
        
        SortedMap<Date, Problem5Event> searchedTime = hallEvents.subMap(meetingStart, true, meetingEnd, true);
        if (searchedTime.size() == 0) {
            System.out.println("Hall available");
            input.close();
            return;
        }
        StringBuilder rezult = new StringBuilder();
        for (Map.Entry<Date, Problem5Event> time : searchedTime.entrySet()) {
        	if (time.getValue().getMeetingEnd().before(meetingEnd) || time.getValue().getMeetingEnd().equals(meetingEnd)) {
        		rezult.append(time.getValue().toString() + "\n");
        	} 
        }
        System.out.println(rezult); 
        input.close();
	}

}
