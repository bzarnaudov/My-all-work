package highSchool;

import java.util.ArrayList;
import java.util.Iterator;

public class Courses {
	private ArrayList<Teachers> teachers = new ArrayList<Teachers>();
	private String identification;
	
	
	

	public Courses(ArrayList<Teachers> teachers, String identification) {
		super();
		this.teachers = teachers;
		this.identification = identification;
	}

	public void addTeacher(Name name, ArrayList<Disciplines> disciplines) {
	    Teachers newTeacher = new Teachers(name, disciplines);
	    teachers.add(newTeacher);
	}
	
	public void allTeachers() {
		int i = 1;
		for (Iterator<Teachers> it = teachers.iterator(); it.hasNext();) {
			System.out.println("Teacher " + i + " is: " + it.next());
			i++;
		}
	}	
	
	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	@Override
	public String toString() {
		return "Courses [teachers=" + teachers + ", identification="
				+ identification + "]";
	}
	
	
	
}
