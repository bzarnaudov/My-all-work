package all;

public class TimeFrom1970 {
	
	public static void main(String[] args) {
		long minutesFrom1970 = System.currentTimeMillis() / 60000;
		long minutes = minutesFrom1970 % 60;
		long hoursFrom1970 = minutesFrom1970 / 60;
		long hours = hoursFrom1970 % 24;
		long days = hoursFrom1970 / 24;
		System.out.printf("From 1970 till now are pass %s days , %s hours , %s minutes.",
				days,hours,minutes);
		
	}

}
