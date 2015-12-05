package all;

import javax.swing.*;

public class FlashingText extends JApplet implements Runnable {

	private static final long serialVersionUID = 1L;
	private JLabel jlblText = new JLabel("Welcome", JLabel.CENTER);

	public FlashingText() {
		add(jlblText);
		new Thread(this).start();
	}

	@Override
	/** Set the text on/off every 200 milliseconds */
	public void run() {
		try {
			while (true) {
				if (jlblText.getText() == null) {
					jlblText.setText("Welcome");
				} else {
					jlblText.setText(null);
				}
				Thread.sleep(200);
			}
		} catch (InterruptedException ex) {

		}
	}
}
