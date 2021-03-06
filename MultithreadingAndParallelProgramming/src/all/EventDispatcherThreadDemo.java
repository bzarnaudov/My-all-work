package all;

import javax.swing.*;

public class EventDispatcherThreadDemo extends JApplet {

	private static final long serialVersionUID = -5853204645210979615L;

	public EventDispatcherThreadDemo() {
		add(new JLabel("Hi, it runs from an event dispatch thread"));
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame("EventDispatcherThreadDemo");
				frame.add(new EventDispatcherThreadDemo());
				frame.setSize(300, 300);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setLocationRelativeTo(null); // Center the frame
				frame.setVisible(true);
			}
		});
	}
}
