package all;

import java.util.Collections;

public class Problem2TwoDemensionalRegion {

	public static void main(String[] args) {
		Problem2ConvexHull area = new Problem2ConvexHull();
		area.readInput();
		area.getPoints().remove(area.getIndexOfMostDownLeftPoint());
		area.decrementNumberPointsByOne();
		Collections.sort(area.getPoints());
		area.findConvexHull();
		area.printConvexHull();
	}

}
