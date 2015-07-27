package highSchool;

import java.util.ArrayList;

public class TestHighSchool {

	public static void main(String[] args) {
		School school1 = new School();
		school1.addSchoolBoy(new Name("Boyan", "Zdravkov", "Arnaudov"), 8);
		school1.addSchoolBoy(new Name("Boyan1", "Zdravkov2", "Arnaudov3"), 18);
		school1.allSchoolBoys();
		school1.addCourse(new ArrayList<Teachers>(), "Geometria");
		school1.allCourses();
		//i taka natatuka
	}

}
