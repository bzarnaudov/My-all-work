package school.student;

public class Student {
	//Дефинирайте клас Student, който съдържа следната информация за студентите:
	// трите имена, курс, специалност, университет, електронна поща и телефонен номер.
	//Използвайте enum за специалностите и университетите.
	private Name name;
	private int year;
	private Major major;
	private University university;
	private String email;
	private String phone;
	
	private static int count = 0;

	public Student() {
		count++;
	}
	
	public Student(String email) {
		this.email = email;
		count++;
	}

	public Name getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public Major getMajor() {
		return major;
	}

	public University getUniversity() {
		return university;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}
	
	public static void printCount() {
		System.out.println(count);
	}

	@Override
	public String toString() {
		return "Student{" +
				"name=" + name +
				", year=" + year +
				", major=" + major +
				", university=" + university +
				", email='" + email + '\'' +
				", phone='" + phone + '\'' +
				'}';
	}

	public static StudentBuilder getBuilder() {
		return new StudentBuilder();
	}

	public static class StudentBuilder {
		private Name name;
		private int year;
		private Major major;
		private University university;
		private String email;
		private String phone;

		private StudentBuilder() {
		}

		public StudentBuilder setName(Name name) {
			this.name = name;
			return this;
		}

		public StudentBuilder setYear(int year) {
			this.year = year;
			return this;
		}

		public StudentBuilder setMajor(Major major) {
			this.major = major;
			return this;
		}

		public StudentBuilder setUniversity(University university) {
			this.university = university;
			return this;
		}

		public StudentBuilder setEmail(String email) {
			this.email = email;
			return this;
		}

		public StudentBuilder setPhone(String phone) {
			this.phone = phone;
			return this;
		}

		public Student build() {
			Student student = new Student();
			student.email = email;
			student.name = name;
			student.year = year;
			student.major = major;
			student.university = university;
			student.phone = phone;

			// validation
			if (name == null) {
				throw new IllegalArgumentException("Student must have a not null name");
			}
			return student;
		}
	}

}


