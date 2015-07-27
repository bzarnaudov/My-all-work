package all;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(5);
		treeSet.add(8);
		treeSet.add(1);
		treeSet.add(6);
		treeSet.add(3);
		treeSet.remove(6);
		for (int i : treeSet) {
		System.out.printf(" %d", i);
		}
		// Result: 1 3 5 8

	}

}
