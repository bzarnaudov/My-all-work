package all;

import java.util.ArrayList;
import java.util.Iterator;

public class MobileTelephone {
	private String model;
	private String manufactorer;
	private float price;
	private String owner;
	private Batery batery;
	private Screen screen;
	private ArrayList<Call> callArrayList = new ArrayList<Call>();
	private int countForCalls;
	private int allDuration;
	private int longestCall;
	private int longestCallIndex;
	
	public void addUser(String date, String startTime, String duration) {
	    Call newUser = new Call();
	    newUser.setDate(date);
	    newUser.setStartTime(startTime);
	    newUser.setDuration(duration);
	    countForCalls++;
	    allDuration += Integer.parseInt(duration);
	    if (longestCall < Integer.parseInt(duration)) {
	    	longestCall = Integer.parseInt(duration);
	    	longestCallIndex = countForCalls-1;
	    }
	    this.callArrayList.add(newUser);
	}
	
	public void isEmpty() {
		boolean check = callArrayList.isEmpty();
		System.out.println("Checking if the arraylist is empty: " + check);
	}
	public void deleteLongestCall() {
		this.callArrayList.remove(longestCallIndex);
		allDuration -= longestCall;
		System.out.println("deleting is done");
	}
	
	public void priceForDuration(double price) {
		System.out.printf("%.2f%n" ,price*allDuration/60);
	}
	
	public void priceForCalls(double price) {
		System.out.println("price of calls of this gsm is " + price*countForCalls);
	}
	
	public void clearList() {
		this.callArrayList.clear();
	}

	public Call removeFromList(int index) {
		return callArrayList.remove(index);
	}



	public void callHistory() {
		int i = 1;
		for (Iterator<Call> it = callArrayList.iterator(); it.hasNext();) {
			System.out.println("Call " + i + " is: " + it.next());
			i++;
		}
	}

	public static MobileTelephone nokiaN95 = new MobileTelephone("N95", "Nokia", 
			253.50f, "Goshko", new Batery("Li-ion", 220.0, 6.5), 
			new Screen(99.0, 53.0, 21.0, "black")); 
	
	public static void getInfoForNokiaN95() {
		// po gornia na4in se pishe po burzo 
//		nokiaN95 = new MobileTelephone();
//		nokiaN95.batery = new Batery("Li-ion", 220.0, 6.5);
//		nokiaN95.screen = new Screen(99.0, 53.0, 21.0, "black");
//		nokiaN95.setModel("N95");
//		nokiaN95.setManufactorer("Nokia");
//		nokiaN95.setPrice(253.50f);
//		nokiaN95.setOwner("Goshko");
		System.out.println(nokiaN95);
	}
	
	public MobileTelephone() {
	}

	@Override
	public String toString() {
		return "MobileTelephone [model=" + model + ", manufactorer="
				+ manufactorer + ", price=" + price + ", owner=" + owner
				+ ", batery=" + batery + ", screen=" + screen + "]";
	}

	public MobileTelephone(String model, String manufactorer, float price,
			String owner, Batery batery, Screen screen) {
		this.model = model;
		this.manufactorer = manufactorer;
		this.price = price;
		this.owner = owner;
		this.batery = batery;
		this.screen = screen;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufactorer() {
		return manufactorer;
	}

	public void setManufactorer(String manufactorer) {
		this.manufactorer = manufactorer;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Batery getBatery() {
		return batery;
	}

	public void setBatery(Batery batery) {
		this.batery = batery;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	
	
}
