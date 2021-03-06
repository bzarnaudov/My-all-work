package exercises;

import java.util.concurrent.*;

public class Exercise13GenericParallelMergeSort {
	public static void main(String[] args) {

		final int SIZE = 7000000;
		Integer[] list1 = new Integer[SIZE];
		int[] list2 = new int[SIZE];

		for (int i = 0; i < list1.length; i++) {
			list1[i] = list2[i] = (int) (Math.random() * 10000000);
		}
//		Double[] list1 = new Double[SIZE];
//		for (int i = 0; i < list1.length; i++) {
//			list1[i] = Math.random() * 10000000;
//		}
		
		long startTime = System.currentTimeMillis();
		all.MergeSort.mergeSort(list2);
		long endTime = System.currentTimeMillis();
		System.out.println("\nSequential time is " + (endTime - startTime)
				+ " milliseconds");
		
		startTime = System.currentTimeMillis();
		parallelMergeSort(list1);
		endTime = System.currentTimeMillis();
		System.out.println("\nParallel time with "
				+ Runtime.getRuntime().availableProcessors()
				+ " processors is " + (endTime - startTime) + " milliseconds");

		
	}

	public static <E extends Comparable<E>> void parallelMergeSort(E[] list) {
		RecursiveAction mainTask = new SortTask<E>(list);
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(mainTask);
	}

	@SuppressWarnings("serial")
	private static class SortTask<E extends Comparable<E>> extends
			RecursiveAction {
		private final int THRESHOLD = 500;
		private E[] list;

		SortTask(E[] list) {
			this.list = list;
		}
		
		/** Merge two sorted lists */
		private static <E extends Comparable<E>> void merge(E[] firstHalf, E[] secondHalf, E[] list2) {
			int current1 = 0; // Current index in list1
			int current2 = 0; // Current index in list2
			int current3 = 0; // Current index in temp

			while (current1 < firstHalf.length && current2 < secondHalf.length) {
				if (firstHalf[current1].compareTo(secondHalf[current2]) < 0)
					list2[current3++] = firstHalf[current1++];
				else
					list2[current3++] = secondHalf[current2++];
			}

			while (current1 < firstHalf.length)
				list2[current3++] = firstHalf[current1++];

			while (current2 < secondHalf.length)
				list2[current3++] = secondHalf[current2++];
		}

		@SuppressWarnings("unchecked")
		@Override
		protected void compute() {
			if (list.length < THRESHOLD) {
				java.util.Arrays.sort(list);
			} else {
				// Obtain the first half
				E[] firstHalf = (E[]) new Comparable[list.length / 2];
				System.arraycopy(list, 0, firstHalf, 0, list.length / 2);

				// Obtain the second half
				int secondHalfLength = list.length - list.length / 2;
				E[] secondHalf = (E[]) new Comparable[secondHalfLength];
				System.arraycopy(list, list.length / 2, secondHalf, 0,
						secondHalfLength);

				// Recursively sort the two halves
				invokeAll(new SortTask<E>(firstHalf), new SortTask<E>(secondHalf));

				// Merge firstHalf with secondHalf into list
				merge(firstHalf, secondHalf, list);
			}
		}
	}
}
