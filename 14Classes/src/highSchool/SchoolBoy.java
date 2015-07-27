package highSchool;

public class SchoolBoy {
	private Name name;
	private int number;
	
	
	
	public SchoolBoy() {
		super();
		// TODO Auto-generated constructor stub
	}



	public SchoolBoy(Name name, int number) {
		super();
		this.name = name;
		this.number = number;
	}



	public Name getName() {
		return name;
	}



	public void setName(Name name) {
		this.name = name;
	}



	public int getNumber() {
		return number;
	}



	public void setNumber(int number) {
		this.number = number;
	}



	@Override
	public String toString() {
		return "schoolBoy [name=" + name + ", number=" + number + "]";
	}
	
}
