package pacman;

import java.awt.EventQueue;

public class GameStart {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				GameInitilaization game = new GameInitilaization();
				game.setVisible(true);
			}
		});
	}
}
