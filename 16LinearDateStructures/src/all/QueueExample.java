package all;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("Message One");
		queue.offer("Message Two");
		queue.offer("Message Three");
		queue.offer("Message Four");
		while (queue.size() > 0) {
		String msg = queue.poll();
		System.out.println(msg);
		}
	}

}
