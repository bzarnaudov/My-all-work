package exercises;

import java.math.BigDecimal;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Exercise15ParallelSum {

	public static void main(String[] args) {
		final int SIZE = 9000000;
		double[] list = new double[SIZE];

		for (int i = 0; i < list.length; i++) {
			list[i] = Math.random() * 100;
		}

		long startTime = System.currentTimeMillis();
		BigDecimal result = sequentialSum(list, 0, list.length);
		long endTime = System.currentTimeMillis();
		System.out.println(result.toPlainString());
		System.out.println("\nSequential time is " + (endTime - startTime)
				+ " milliseconds");

		startTime = System.currentTimeMillis();
		result = parallelSum(list);
		endTime = System.currentTimeMillis();
		System.out.println(result.toPlainString());
		System.out.println("\nParallel time with "
				+ Runtime.getRuntime().availableProcessors()
				+ " processors is " + (endTime - startTime) + " milliseconds");
	}

	private static BigDecimal sequentialSum(double[] list, int offset, int len) {
		BigDecimal sum = new BigDecimal(0);
		for (int i = offset + len - 1; i >= offset; i--) {
			sum = sum.add(new BigDecimal(list[i]));
		}
		return sum;
	}

	private static BigDecimal parallelSum(double[] list) {

		RecursiveTask<BigDecimal> mainTask = new SumTask(list, 0, list.length);
		ForkJoinPool pool = new ForkJoinPool();
		return pool.invoke(mainTask);
	}

	@SuppressWarnings("serial")
	private static class SumTask extends RecursiveTask<BigDecimal> {
		private static final int THRESHOLD = 10000;
		private final double[] list;
		private final int offset;
		private final int len;

		SumTask(double[] list, int offset, int len) {
			this.list = list;
			this.offset = offset;
			this.len = len;
		}

		@Override
		protected BigDecimal compute() {
			if (len < THRESHOLD) {
				return sequentialSum(list, offset, len);
			} else {
				final int firstHalfLen = len / 2;
				final int secondHalfLength = len - firstHalfLen;

				SumTask first = new SumTask(list, offset, firstHalfLen);
				SumTask second = new SumTask(list, offset + firstHalfLen,
						secondHalfLength);
				first.fork();
				second.fork();
				return first.join().add(second.join());
			}
		}

	}

}