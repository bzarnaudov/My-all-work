package all;

public class GSMCallHistoryTest {
	public static void main(String[] args) {
		MobileTelephone telephone1 = MobileTelephone.nokiaN95;
		telephone1.addUser("15.05.2015", "5:00", "20");
		telephone1.addUser("15.05.2015", "5:00", "2100");
		telephone1.addUser("15.05.2015", "5:00", "200");
		telephone1.callHistory();
		telephone1.priceForDuration(0.37);
		telephone1.deleteLongestCall();
		telephone1.callHistory();
		telephone1.priceForDuration(0.37);
		telephone1.clearList();
		telephone1.callHistory();
		telephone1.isEmpty();
	}
}
