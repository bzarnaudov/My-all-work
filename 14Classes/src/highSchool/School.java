package highSchool;

import java.util.ArrayList;
import java.util.Iterator;

public class School {
	private ArrayList<Courses> courses = new ArrayList<Courses>();
	private ArrayList<SchoolBoy> schoolBoy = new ArrayList<SchoolBoy>();

	
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public void addCourse(ArrayList<Teachers> teachers, String identification) {
	    Courses newCourse = new Courses(teachers, identification);
	    courses.add(newCourse);
	}
	
	public void allCourses() {
		int i = 1;
		for (Iterator<Courses> it = courses.iterator(); it.hasNext();) {
			System.out.println("Course " + i + " is: " + it.next());
			i++;
		}
	}	
	
	public void addSchoolBoy(Name name, int number) {
	    SchoolBoy newSchoolBoy = new SchoolBoy(name, number);
	    schoolBoy.add(newSchoolBoy);
	}
	
	public void allSchoolBoys() {
		int i = 1;
		for (Iterator<SchoolBoy> it = schoolBoy.iterator(); it.hasNext();) {
			System.out.println("SchoolBoy " + i + " is: " + it.next());
			i++;
		}
	}	
	
	
}
