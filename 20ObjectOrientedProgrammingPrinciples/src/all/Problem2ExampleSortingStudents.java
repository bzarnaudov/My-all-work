package all;

public class Problem2ExampleSortingStudents {

	public static void main(String[] args) {
		Problem1Student[] students = new Problem1Student[10];
		students[0] = new Problem1Student("Gosho", "Petkov", 3.16);
		students[1] = new Problem1Student("Garo", "Petkov", 5.16);
		students[2] = new Problem1Student("Gosho", "Kazanov", 2.16);
		students[3] = new Problem1Student("Gergin", "Patkov", 4.16);
		students[4] = new Problem1Student("Boyan", "Petkov", 3.56);
		students[5] = new Problem1Student("Stavro", "Petkov", 3.66);
		students[6] = new Problem1Student("Tigur", "Petkov", 5.46);
		students[7] = new Problem1Student("Kzalatik", "Petkov45", 4.66);
		students[8] = new Problem1Student("Kako", "Gamen", 3.36);
		students[9] = new Problem1Student("Gego", "Gamerov", 5.65);
		
		java.util.Arrays.sort(students);
		for (Problem1Student student : students) {
			System.out.println(student);
		}
	}

}
