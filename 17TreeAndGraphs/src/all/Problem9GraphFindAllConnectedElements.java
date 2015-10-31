package all;

import org.omg.CORBA.portable.ApplicationException;

public class Problem9GraphFindAllConnectedElements {
	private static Problem9Graph network = new Problem9Graph();

	public static void main(String[] args) throws ApplicationException {
		network = Problem9Graph.createGraph();
		network.getConnectedComponents();
	}
	
	
}
