package exercises;

public class Exercise11DemonstrateDeadlock {
	private static Target target = new Target();
	private static Bullet bullet = new Bullet();

	public static void main(String[] args) {

		Thread t1 = new Thread(new BulletGo());
		Thread t2 = new Thread(new TargetHitting());
		t1.start();
		t2.start();
	}

	private static class Target {
		private int size;

		public Target() {
			this.size = 5;
		}

		public void setSize(int size) {
			this.size = size;
		}

		public void printSize() {
			System.out.println(size);
		}
	}

	private static class Bullet {
		private int speed;

		public Bullet() {
			this.speed = 100;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
		}

		public void printSpeed() {
			System.out.println(speed);
		}
	}

	private static class BulletGo implements Runnable {

		@Override
		public void run() {
			while (true) {
				System.out.println("going");

				synchronized (bullet) {
					bullet.setSpeed(150);
					bullet.printSpeed();
					synchronized (target) {
						target.printSize();
					}
				}
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static class TargetHitting implements Runnable {

		@Override
		public void run() {
			while (true) {
				System.out.println("Target hit");
				int size = (int) (Math.random() * 100) + 1;
				int speed = (int) (Math.random() * 10) + 1;
				synchronized (target) {
					target.setSize(size);
					target.printSize();
					synchronized (bullet) {
						bullet.setSpeed(speed);
						bullet.printSpeed();
					}
				}

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
