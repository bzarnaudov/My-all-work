package all;

public class Problem1Human{
	private String name;
	private String surname;

	public Problem1Human(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}
	
	@Override
	public String toString() {
		return "Problem1Human [name=" + name + ", surname=" + surname + "]";
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
}
