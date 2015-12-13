package exercises;

import java.io.*;

import all.PrintChar;
import all.PrintNum;

public class Exercise1TaskThreadManipulation {
	public static void main(String[] args) throws InterruptedException {

		// Create tasks
		Runnable printA = new PrintChar('a', 100);
		Runnable printB = new PrintChar('b', 100);
		Runnable print100 = new PrintNum(100);

		final Thread thread1 = new Thread(printA);
		final Thread thread2 = new Thread(printB);
		final Thread thread3 = new Thread(print100);

		final PrintStream out = System.out;
		System.setOut(new PrintStream(new OutputStream() {
			@Override
			public void write(int b) throws IOException {
				out.write(b);
				out.flush();
			}
		}, true) {
			private volatile boolean outNum3once;
			private volatile boolean outA1once;
			private volatile boolean outB2once;

			@Override
			public void print(String s) {
				// call from thread3
				super.print(s);
				outNum3once = true;
				while (!outA1once || !outB2once) {
					waitPlease();
				}
			}

			private void waitPlease() {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			@Override
			public void print(char c) {
				while (!outNum3once) {
					waitPlease();
				}
				if (Thread.currentThread() == thread1) {
					callFromA1Thread(c);
				} else {
					callFromB2Thread(c);
				}
			}

			private void callFromB2Thread(char c) {
				while (!outA1once) {
					waitPlease();
				}
				super.print(c);
				outB2once = true;
				while (thread3.isAlive()) {
					waitPlease();
				}
			}

			private void callFromA1Thread(char c) {
				if (outA1once) {
					while (thread2.isAlive()) {
						waitPlease();
					}
				}
				super.print(c);
				outA1once = true;
				while (thread3.isAlive() && thread2.isAlive()) {
					waitPlease();
				}
			}
		});

		thread1.start();
		thread2.start();
		thread3.start();
	}
}
