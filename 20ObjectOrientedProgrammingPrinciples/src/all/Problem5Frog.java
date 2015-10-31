package all;

public class Problem5Frog extends Problem5Animal {

	public Problem5Frog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Problem5Frog(int age, String name, Problem5Gender animalGender) {
		super(age, name, animalGender);
		this.setSound("FrogQuack");
	}
}
