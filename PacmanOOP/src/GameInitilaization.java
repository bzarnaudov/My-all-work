import javax.swing.JFrame;

public class GameInitilaization extends JFrame {

	private static final long serialVersionUID = -8178336655433621024L;
	
	public GameInitilaization() {
		initUI();
	}

	private void initUI() {
		Game game = new Game();
		add(game);
		setTitle("Pacman by Arnaudov");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		int screenWidth = game.getScreenSizeHeight() + 15;
		int screenHeight = game.getScreenSizeWidth() + 60;
		setSize(screenWidth, screenHeight);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
