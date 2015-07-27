package school.student;

public class Name {
	private final String given;
	private final String middle;
	private final String surname;

	public Name(String given, String middle, String surname) {
		this.given = given;
		this.middle = middle;
		this.surname = surname;
		if (given == null) {
			throw new IllegalArgumentException("Name must have a not null given name");
		}
	}

	public String getGiven() {
		return given;
	}

	public String getMiddle() {
		return middle;
	}

	public String getSurname() {
		return surname;
	}

	@Override
	public String toString() {
		return "Name{" +
				"given='" + given + '\'' +
				", middle='" + middle + '\'' +
				", surname='" + surname + '\'' +
				'}';
	}
}
