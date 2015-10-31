package all;

public class Problem5Cat extends Problem5Animal{
		
	public Problem5Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Problem5Cat(int age, String name, Problem5Gender animalGender) {
		super(age, name, Problem5Gender.FEMALE);
		this.setSound("CatMiaaayyy");
	}

	@Override
	public String getAnimalSound() {
		return this.getSound();
	}


}
