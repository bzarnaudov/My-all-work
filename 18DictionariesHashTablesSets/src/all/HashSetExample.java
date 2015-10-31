package all;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> javaStudents = new HashSet<String>();
		javaStudents.add("S. Nakov");
		javaStudents.add("V. Kolev");
		javaStudents.add("V. Tsanev");
		Set<String> linuxStudents = new HashSet<String>();
		linuxStudents.add("D. Alexiev");
		linuxStudents.add("V. Tsanev");
		System.out.println("Java Students: " + javaStudents);
		System.out.println("Linux Students: " + linuxStudents);
		System.out.println("Java or Linux Students: " +
		union(javaStudents, linuxStudents));
		System.out.println("Java and Linux Students: " +
		intersect(javaStudents, linuxStudents));
	}

	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
		// Here we use HashSet but you can use TreeSet if appropriate
		Set<E> union = new HashSet<E>();
		union.addAll(set1);
		union.addAll(set2);
		return union;
	}
	
	public static <E> Set<E> intersect(Set<E> set1, Set<E> set2) {
		// Here we use HashSet but you can use TreeSet if appropriate
		Set<E> intersect = new HashSet<E>();
		intersect.addAll(set1);
		intersect.retainAll(set2);
		return intersect;
	}
}
