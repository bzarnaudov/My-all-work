package all;

public class Run {
	public static void main(String[] args) {
		
		MobileTelephone[] telephones = new MobileTelephone[5];
		for (int i = 0; i < telephones.length; i++) {
			telephones[i] = new MobileTelephone();
		}
		
		telephones[0].setScreen(new Screen(3.2, 3.5, 5.0, "red"));
		telephones[1].setBatery(new Batery("Toshiba"));
		telephones[2].setManufactorer("hahahah");
		telephones[3].setModel("govedo");
		telephones[4] = MobileTelephone.nokiaN95;
		for (MobileTelephone mobileTelephone : telephones) {
			System.out.println(mobileTelephone);
		}
		
		telephones[4].addUser("fsfs","dasdasd","adad");
		telephones[4].addUser("1fsfs","1dasdasd","1adad");
		telephones[3].addUser("15.05.2015", "5:00", "20 s.");
		telephones[3].callHistory();
		telephones[4].callHistory();
		telephones[3].priceForCalls(5.5);
		telephones[4].priceForCalls(3.2);
		telephones[3].clearList();
		telephones[4].removeFromList(0);
		telephones[3].callHistory();
		telephones[4].callHistory();
		
//		MobileTelephone.getInfoForNokiaN95();
		

		
	}
}
