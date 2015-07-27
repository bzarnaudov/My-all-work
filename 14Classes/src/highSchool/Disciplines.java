package highSchool;

public class Disciplines {
	private String name;
	private int numberOfLessons;
	private int numberOfExercise;
	
	
	
	public Disciplines() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Disciplines(String name, int numberOfLessons, int numberOfExercise) {
		super();
		this.name = name;
		this.numberOfLessons = numberOfLessons;
		this.numberOfExercise = numberOfExercise;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getNumberOfLessons() {
		return numberOfLessons;
	}



	public void setNumberOfLessons(int numberOfLessons) {
		this.numberOfLessons = numberOfLessons;
	}



	public int getNumberOfExercise() {
		return numberOfExercise;
	}



	public void setNumberOfExercise(int numberOfExercise) {
		this.numberOfExercise = numberOfExercise;
	}



	@Override
	public String toString() {
		return "Disciplines [name=" + name + ", numberOfLessons="
				+ numberOfLessons + ", numberOfExercise=" + numberOfExercise
				+ "]";
	}
	

}
