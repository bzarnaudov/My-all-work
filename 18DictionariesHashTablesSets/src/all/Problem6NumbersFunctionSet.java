package all;

import java.util.TreeSet;

public class Problem6NumbersFunctionSet {
	private TreeSet<Integer> members;


    public TreeSet<Integer> getMembers() {
		return members;
	}

	private Problem6NumbersFunctionSet() {
        members = new TreeSet<Integer>();
	}

    public Problem6NumbersFunctionSet(int a, int b, int c, int minRange, int maxRange) {
        members = new TreeSet<Integer>();
        int current = a;
        while (current <= maxRange && current >= minRange) {
            members.add(current);
            current = b * current + c;
        }
    }
    
    public Problem6NumbersFunctionSet union(Problem6NumbersFunctionSet... otherFunctionsSets) {
        Problem6NumbersFunctionSet unionSet = new Problem6NumbersFunctionSet();
        unionSet.members.addAll(this.members);
        for (Problem6NumbersFunctionSet functionSet : otherFunctionsSets) {
            unionSet.members.addAll(functionSet.members);
        }
        return unionSet;
    }

    public Problem6NumbersFunctionSet intersect(Problem6NumbersFunctionSet... otherFunctionsSets) {
    	Problem6NumbersFunctionSet intersectSet = new Problem6NumbersFunctionSet();
        intersectSet.members.addAll(this.members);
        for (Problem6NumbersFunctionSet functionSet : otherFunctionsSets) {
            intersectSet.members.retainAll(functionSet.members);
        }
        return intersectSet;
    }
}
