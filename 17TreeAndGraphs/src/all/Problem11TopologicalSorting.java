package all;

import org.omg.CORBA.portable.ApplicationException;

public class Problem11TopologicalSorting {
	private static Problem11Graph exercises = new Problem11Graph(null);
	
	public static void main(String[] args) throws ApplicationException {
		exercises = Problem11Graph.createGraphFromPairs();
		exercises.topologicalSort();
	}
}
