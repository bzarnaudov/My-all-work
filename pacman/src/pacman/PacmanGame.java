package pacman;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class PacmanGame extends JFrame {

	private static final long serialVersionUID = 1L;

	public PacmanGame() {

		initUI();
	}

	private void initUI() {

		add(new Board());
		setTitle("Pacman by Arnaudov");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(375, 420);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				PacmanGame ex = new PacmanGame();
				ex.setVisible(true);
			}
		});
	}
}
