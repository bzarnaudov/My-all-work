package all;

public class Problem5Example {

	public static void main(String[] args) {
		Problem5Animal[] animals = new Problem5Animal[10];
		animals[0] = new Problem5Cat (15, "Petka", Problem5Gender.FEMALE);
		animals[1] = new Problem5Dog (25, "goga", Problem5Gender.FEMALE);
		animals[2] = new Problem5Cat (5, "etkona", Problem5Gender.FEMALE);
		animals[3] = new Problem5Cat (53, "gipa", Problem5Gender.FEMALE);
		animals[4] = new Problem5Dog (12, "skuri", Problem5Gender.MALE);
		animals[5] = new Problem5Frog (68, "Gegova", Problem5Gender.FEMALE);
		animals[6] = new Problem5Kitten (52, "zlatko", Problem5Gender.MALE);
		animals[7] = new Problem5Tomcat (14, "Galacticon", Problem5Gender.MALE);
		animals[8] = new Problem5Frog (10, "Vselena", Problem5Gender.FEMALE);
		animals[9] = new Problem5Dog (1, "Petkolio", Problem5Gender.MALE);
		
		for (Problem5Animal animal : animals) {
			System.out.println(animal);
		}
	}

	
}
