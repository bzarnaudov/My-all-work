package all;

public class PrintChar implements Runnable {

	private char charToPrint; // The character to print
	private int times; // The times to repeat

	/**
	 * Construct a task with specified character and number of times to print
	 * the character
	 */
	public PrintChar(char c, int t) {
		charToPrint = c;
		times = t;
	}

	@Override
	/** Override the run() method to tell the system
	 *  what the task to perform
	 */
	public void run() {
		for (int i = 0; i < times; i++) {
			System.out.print(charToPrint);
		}
	}
}
