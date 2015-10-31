package all;

import java.util.Comparator;
import java.util.List;

public class Problem9ListComparator implements Comparator<List<Integer>>{

	@Override
	public int compare(List<Integer> x, List<Integer> y) {
		if (x.size() == y.size()) {
            for (int i = 0; i < x.size(); i++) {
                if (x.get(i) != y.get(i)) {
                	if (x.get(i) < y.get(i)) {
                		return -1;
                	} else {
                		return 1;
                	}
                }
            }
            return 0;
        } else if (x.size() < y.size()) {
        	return 1;
        } else {
        	return -1;
        }
	}
}
