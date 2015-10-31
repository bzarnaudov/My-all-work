package all;

public class Problem5Kitten extends Problem5Cat{

	public Problem5Kitten() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Problem5Kitten(int age, String name, Problem5Gender animalGender) {
		super(age, name, Problem5Gender.MALE);
		this.setSound("KittenMiaaayyy");
	}

}
