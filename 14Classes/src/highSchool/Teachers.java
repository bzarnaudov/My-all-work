package highSchool;

import java.util.ArrayList;
import java.util.Iterator;

public class Teachers {
	private Name name;
	private ArrayList<Disciplines> disciplines = new ArrayList<Disciplines>();

	
	public void addDisciplines(String name, int numberOfLessons, int numberOfExercise) {
	    Disciplines newDiscipline = new Disciplines(name, numberOfLessons, numberOfExercise);
	    disciplines.add(newDiscipline);
	}
	
	public void allDisciplines() {
		int i = 1;
		for (Iterator<Disciplines> it = disciplines.iterator(); it.hasNext();) {
			System.out.println("Discipline " + i + " is: " + it.next());
			i++;
		}
	}
	
	public String removeBook(String name) {
		for (Disciplines d: disciplines) {
			if (name.compareTo(d.getName()) == 0) {
				disciplines.remove(d);
				return "discipline is removed";
			}
		}
		return "there is no discipline with this name";
	}

	public Teachers(Name name, ArrayList<Disciplines> disciplines) {
		super();
		this.name = name;
		this.disciplines = disciplines;
	}

	public Name getName() {
		return name;
	}
	
	
	
}
