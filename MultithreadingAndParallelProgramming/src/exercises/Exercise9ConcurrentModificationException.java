package exercises;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercise9ConcurrentModificationException {
	
	private static HashSet<Integer> list;

	public static void main(String[] args) {
		// Create a thread pool with two threads
		ExecutorService executor = Executors.newFixedThreadPool(2);

		System.out.println("ConcurrentModificationException test");

		executor.execute(new CreateHashSetAndAddNumberToIt());
		executor.execute(new TraverseHashSet());
		executor.shutdown();
	}
	
	public static class CreateHashSetAndAddNumberToIt implements Runnable {
		@Override
		public void run() {
			try {
				while (true) {
					int number = (int) (Math.random() * 1000) + 1;
					if (list == null) {
						list = new HashSet<Integer>();
						list.add(number);
					} else {
						list.add(number);
					}	
					System.out.println(number + " is added to the list");
					Thread.sleep(1000);
				}
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	public static class TraverseHashSet implements Runnable {
		@Override
		public void run() {
			try {
				while (true) {
					Iterator<Integer> iterator = list.iterator();
					while(iterator.hasNext()) {
						System.out.println(iterator.next());
					}
					Thread.sleep(1000);
				}
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

}
