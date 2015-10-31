package all;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		String[] bandNames = new String[] {
				"manowar", "blind guardian", "dio",
				"grave digger", "slayer", "seputltura", "kiss", "sodom",
				"manowar", "megadeth", "dio", "judas priest", "slayer",
				"manowar", "kreator", "blind guardian", "iron maiden",
				"accept", "seputltura", "iced earth", "manowar", "slayer",
				"manowar", "helloween", "running wild", "manowar",
				"sodom", "kiss", "iron maiden", "manowar", "manowar",
				"sodom", "manowar", "slayer", "blind guardian", "accept",
				"grave digger", "accept", "seputltura", "dio",
				"running wild", "manowar", "iron maiden", "kiss",
				"manowar", "manowar", "kiss", "manowar", "slayer",
				"seputltura", "manowar", "manowar", "blind guardian",
				"iron maiden", "sodom", "dio", "accept", "manowar",
				"slayer", "megadeth", "dio", "manowar", "running wild",
				"grave digger", "accept", "kiss", "manowar", "iron maiden",
				"manowar", "judas priest", "sodom", "iced earth",
				"manowar", "dio", "iron maiden", "manowar", "slayer",
				"manowar" };
		SortedSet<String> uniqueBandNames = new TreeSet<String>();
		for (String bandName : bandNames) {
			uniqueBandNames.add(bandName);
		}
		System.out.println("List of sorted and unique band names:");
		for (String bandName : uniqueBandNames) {
			System.out.println(bandName);
		}
	}

}
