package spaceCraft;

import javax.swing.JFrame;

public class Collision extends JFrame {
	
    public static int w = 400, h = 300;

	public Collision() {
    	
 
        add(new Board());
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(w, h);
        setLocationRelativeTo(null);
        setTitle("Alien Fucker by Arnaudov");
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Collision();
    }
}