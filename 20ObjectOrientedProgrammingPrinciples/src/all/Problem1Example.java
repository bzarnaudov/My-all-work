package all;

public class Problem1Example {

	public static void main(String[] args) {
		Problem1Worker worker = new Problem1Worker("Pesho", "Petrov", 150, 20);
		System.out.println(worker);
		System.out.println(worker.getWagePerHour());
	}

}
