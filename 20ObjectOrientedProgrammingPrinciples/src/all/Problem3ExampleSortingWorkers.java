package all;

public class Problem3ExampleSortingWorkers {

	public static void main(String[] args) {
		Problem1Worker[] workers = new Problem1Worker[10];
		workers[0] = new Problem1Worker("Gosho", "Petkov", 100, 10);
		workers[1] = new Problem1Worker("Garo", "Petkov", 120, 15);
		workers[2] = new Problem1Worker("Gosho", "Kazanov", 50, 5);
		workers[3] = new Problem1Worker("Gergin", "Patkov", 400, 10);
		workers[4] = new Problem1Worker("Boyan", "Petkov", 356, 20);
		workers[5] = new Problem1Worker("Stavro", "Petkov", 366, 5);
		workers[6] = new Problem1Worker("Tigur", "Petkov", 546, 30);
		workers[7] = new Problem1Worker("Kzalatik", "Petkov45", 466, 25);
		workers[8] = new Problem1Worker("Kako", "Gamen", 3036, 50);
		workers[9] = new Problem1Worker("Gego", "Gamerov", 565, 40);
		
		java.util.Arrays.sort(workers);
		for (Problem1Worker student : workers) {
			System.out.println(student);
		}
	}

}
