package school;

import java.util.Scanner;

import school.student.Major;
import school.student.Name;
import school.student.Student;
import school.student.University;

public class Usage {
	private static Student stud4;
	private static Student stud5;
	
	public static void main(String[] args) {
		
		Student stud1 = new Student("kura");
		System.out.println("student = " + stud1);
		
		Student stud2 = new Student("kuraaaaaaaaaaa");
		System.out.println("student = " + stud2);
		
		Student stud3 = new Student();
		System.out.println("student = " + stud3);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Write major Lasers or Space : ");
		String some = input.nextLine();
		
		try {
			Student student = Student.getBuilder()
					.setName(new Name("Star", "kur", "Gruhtar"))
					.setMajor(Major.valueOf(some.toUpperCase()))
					.setYear(2005)
					.setEmail("bob@yahoo.com")
					.setUniversity(University.NBU)
					.build();
			System.out.println("student = " + student);
		} catch (IllegalArgumentException e) {
			System.out.println("write the correct major");
			
		}
		input.close();
		Usage.create();
		Usage.showCreated();
		Student.printCount();
	}
	
	public static void create() {
		stud4 = new Student("kura");
		System.out.println("student = " + Usage.stud4);
		
		stud5 = new Student("pute");
		System.out.println("student = " + Usage.stud5);
	}
	
	public static void showCreated() {
		System.out.println(Usage.stud4);
		System.out.println(Usage.stud5);
	}
	
}
