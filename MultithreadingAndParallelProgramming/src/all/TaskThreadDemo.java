package all;

public class TaskThreadDemo {

	public static void main(String[] args) {

		// Create tasks
		Runnable printA = new PrintChar('a', 1000);
		Runnable printB = new PrintChar('b', 1000);
		Runnable print100 = new PrintNum(1000);

		Thread thread1 = new Thread(printA);
		Thread thread2 = new Thread(printB);
		Thread thread3 = new Thread(print100);

		thread1.setPriority(Thread.MIN_PRIORITY);
		System.out.println(thread1.getPriority());
		thread1.start();
		thread2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(thread2.getPriority());
		thread2.start();
		thread3.setPriority(Thread.MAX_PRIORITY);
		thread3.start();
	}
}
