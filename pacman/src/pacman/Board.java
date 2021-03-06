package pacman;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private final Font smallfont = new Font("Ariel", Font.BOLD, 16);

	private Image ii;
	private final Color dotcolor = new Color(192, 192, 0);
	private final Color dotcolor1 = new Color(196, 128, 255);
	private Color mazecolor;

	private boolean ingame = true;
	private boolean dying = false;
	private boolean killerPacman = false;

	private final int blocksize = 24;
	private final int nrofblocks = 15;
	private final int scrsize = nrofblocks * blocksize;
	private final int pacanimdelay = 2;
	private final int pacmananimcount = 4;
	private final int pacmanspeed = 6;

	private int pacanimcount = pacanimdelay;
	private int pacanimdir = 1;
	private int pacmananimpos = 0;
	private int nrofghosts = 4;
	private int score;
	private int[] dx, dy;
	private int[] ghostx, ghosty, ghostdx, ghostdy, ghostspeed;
	private int endPositionForBfsX, endPositionForBfsY;
	private int counterForDiagonalY = 0, counterForDiagonalX = 0;

	private int timeForKill = 10000, remainingTimeForKill = 0;

	private Image ghost;
	private Image pacman1, pacman2up, pacman2left, pacman2right, pacman2down;
	private Image pacman3up, pacman3down, pacman3left, pacman3right;
	private Image pacman4up, pacman4down, pacman4left, pacman4right;

	private String ghostS = "ghost.png";
	private String pacman1S = "pacman.png";
	private String pacman2upS = "up1.png";
	private String pacman3upS = "up2.png";
	private String pacman4upS = "up3.png";
	private String pacman2downS = "down1.png";
	private String pacman3downS = "down2.png";
	private String pacman4downS = "down3.png";
	private String pacman2leftS = "left1.png";
	private String pacman3leftS = "left2.png";
	private String pacman4leftS = "left3.png";
	private String pacman2rightS = "right1.png";
	private String pacman3rightS = "right2.png";
	private String pacman4rightS = "right3.png";

	// the x and y coordinates of the Pacman sprite.
	// the delta changes in horizontal and vertical directions.
	private int pacmanx, pacmany, pacmandx, pacmandy;

	private int reqdx, reqdy, viewdx, viewdy;

	// level
	private final short leveldata[] = { 51, 26, 26, 18, 26, 26, 22, 0, 19, 26,
			26, 18, 26, 26, 54, 21, 0, 0, 21, 0, 0, 17, 26, 20, 0, 0, 21, 0, 0,
			21, 17, 26, 26, 24, 18, 26, 20, 0, 17, 26, 18, 24, 26, 26, 20, 21,
			0, 0, 0, 21, 0, 29, 0, 29, 0, 21, 0, 0, 0, 21, 17, 26, 26, 26, 20,
			0, 0, 0, 0, 0, 17, 26, 26, 26, 20, 21, 0, 0, 0, 17, 26, 22, 0, 19,
			26, 20, 0, 0, 0, 21, 17, 26, 18, 26, 20, 0, 21, 0, 21, 0, 17, 26,
			26, 26, 20, 21, 0, 21, 0, 17, 26, 24, 18, 24, 26, 20, 0, 0, 0, 21,
			21, 0, 21, 0, 21, 0, 0, 21, 0, 0, 17, 26, 22, 0, 21, 21, 0, 25, 26,
			20, 0, 27, 24, 30, 0, 21, 0, 21, 0, 21, 21, 0, 0, 0, 21, 0, 0, 0,
			0, 0, 21, 0, 21, 0, 21, 17, 26, 18, 26, 16, 26, 18, 26, 18, 26, 16,
			26, 16, 26, 20, 21, 0, 21, 0, 21, 0, 21, 0, 21, 0, 21, 0, 21, 0,
			21, 21, 0, 21, 0, 21, 0, 21, 0, 21, 0, 21, 0, 21, 0, 21, 57, 26,
			24, 26, 24, 26, 24, 26, 24, 26, 24, 26, 24, 26, 60 };

	private final int validspeeds[] = { 1, 2, 3, 4, 6, 8 };

	private int currentspeed = 3;
	private short[] screendata;
	private Timer timer, timer1;
	int[][] maze = new int[nrofblocks][nrofblocks];

	public Board() {

		loadImages();
		initVariables();

		addKeyListener(new TAdapter());

		setFocusable(true);

		setBackground(Color.black);
		setDoubleBuffered(true);
	}

	private void initVariables() {

		screendata = new short[nrofblocks * nrofblocks];
		mazecolor = new Color(150, 100, 5);
		ghostx = new int[nrofghosts];
		ghostdx = new int[nrofghosts];
		ghosty = new int[nrofghosts];
		ghostdy = new int[nrofghosts];
		ghostspeed = new int[nrofghosts];
		dx = new int[4];
		dy = new int[4];

		timer = new Timer(40, this);
		timer.start();
	}

	@Override
	public void addNotify() {
		super.addNotify();

		initGame();
	}

	private void doAnim() {

		pacanimcount--;

		if (pacanimcount <= 0) {
			pacanimcount = pacanimdelay; // make pacman to open his mouth slowly
			pacmananimpos = pacmananimpos + pacanimdir;

			if (pacmananimpos == (pacmananimcount - 1) || pacmananimpos == 0) {
				pacanimdir = -pacanimdir;
			}
		}
	}

	private void playGame(Graphics2D g2d) {

		if (dying) {

			death();

		} else {

			movePacman();
			drawPacman(g2d);
			moveGhosts(g2d);
			checkMaze();
		}
	}

	private void drawScore(Graphics2D g) {

		String s;

		g.setFont(smallfont);
		g.setColor(new Color(196, 128, 255));
		s = "Score: " + score;
		g.drawString(s, scrsize / 2 + 96, scrsize + 16);

	}

	private void checkMaze() {

		short i = 0;
		boolean finished = true;

		while (i < nrofblocks * nrofblocks && finished) {

			if ((screendata[i] & 48) != 0) {
				finished = false;
			}

			i++;
		}

		if (finished) {

			score = 0;
			remainingTimeForKill = 1;
			initLevel();
		}
	}

	private void death() {
		score = 0;
		initLevel();
	}

	public void movePacman() {

		int pos;
		short ch;

		if (reqdx == -pacmandx && reqdy == -pacmandy) {
			pacmandx = reqdx;
			pacmandy = reqdy;
			viewdx = pacmandx;
			viewdy = pacmandy;
		}

		if (pacmanx % blocksize == 0 && pacmany % blocksize == 0) {
			pos = pacmanx / blocksize + nrofblocks
					* (int) (pacmany / blocksize);
			ch = screendata[pos];

			if ((ch & 16) != 0) {
				screendata[pos] = (short) (ch & 15);
				score++;
			}
			if ((ch & 32) != 0) {
				score += 49;
				killerPacman = true;
				if (remainingTimeForKill == 0) {
					timer();
				}
				remainingTimeForKill = timeForKill / 1000;
			}

			if (reqdx != 0 || reqdy != 0) {
				if (!((reqdx == -1 && reqdy == 0 && (ch & 1) != 0)
						|| (reqdx == 1 && reqdy == 0 && (ch & 4) != 0)
						|| (reqdx == 0 && reqdy == -1 && (ch & 2) != 0) || (reqdx == 0
						&& reqdy == 1 && (ch & 8) != 0))) {
					pacmandx = reqdx;
					pacmandy = reqdy;
					viewdx = pacmandx;
					viewdy = pacmandy;
				}
			}

			// Check for standstill
			if ((pacmandx == -1 && pacmandy == 0 && (ch & 1) != 0)
					|| (pacmandx == 1 && pacmandy == 0 && (ch & 4) != 0)
					|| (pacmandx == 0 && pacmandy == -1 && (ch & 2) != 0)
					|| (pacmandx == 0 && pacmandy == 1 && (ch & 8) != 0)) {
				pacmandx = 0;
				pacmandy = 0;
			}
		}
		pacmanx = pacmanx + pacmanspeed * pacmandx;
		pacmany = pacmany + pacmanspeed * pacmandy;
	}

	private void moveGhosts(Graphics2D g2d) {

		short i;
		int posGhost;

		if (killerPacman == false) {
			endPositionForBfsX = pacmanx / blocksize;
			endPositionForBfsY = pacmany / blocksize;
		} else {
			endPositionForBfsX = 7;
			endPositionForBfsY = 9;
		}

		for (i = 0; i < nrofghosts; i++) {
			if (ghostx[i] % blocksize == 0 && ghosty[i] % blocksize == 0) {
				posGhost = ghostx[i] / blocksize + nrofblocks
						* (int) (ghosty[i] / blocksize);
				// the shortest path
				if (i == 0) {
					levelForBfs(endPositionForBfsY, endPositionForBfsX);
					ghostBfsMove(i);

				}

				// 50% the shortest path and 50% random
				if (i == 1) {
					if (Math.random() > 0.5) {
						levelForBfs(endPositionForBfsY, endPositionForBfsX);
						ghostBfsMove(i);
					} else {
						randomMoveGhost(posGhost, i);
					}
				}
				// path between four edges
				if (i == 2) {
					if (killerPacman == false) {
						levelForBfs(counterForDiagonalY, counterForDiagonalX);
						ghostBfsMove(i);
						if (ghostx[i] / blocksize == 0
								&& ghosty[i] / blocksize == 0) {
							counterForDiagonalX = 14;
							counterForDiagonalY = 14;
						}
						if (ghostx[i] / blocksize == 14
								&& ghosty[i] / blocksize == 14) {
							counterForDiagonalX = 0;
							counterForDiagonalY = 14;
						}
						if (ghostx[i] / blocksize == 0
								&& ghosty[i] / blocksize == 14) {
							counterForDiagonalX = 14;
							counterForDiagonalY = 0;
						}
						if (ghostx[i] / blocksize == 14
								&& ghosty[i] / blocksize == 0) {
							counterForDiagonalX = 0;
							counterForDiagonalY = 0;
						}
					} else {
						levelForBfs(endPositionForBfsY, endPositionForBfsX);
						ghostBfsMove(i);
					}
				}
				// random wandering
				if (i > 2) {
					if (killerPacman == false) {
						randomMoveGhost(posGhost, i);
					} else {
						levelForBfs(endPositionForBfsY, endPositionForBfsX);
						ghostBfsMove(i);
					}
				}
			}
			// the new position of ghost
			ghostx[i] = ghostx[i] + (ghostdx[i] * ghostspeed[i]);
			ghosty[i] = ghosty[i] + (ghostdy[i] * ghostspeed[i]);
			drawGhost(g2d, ghostx[i] + 1, ghosty[i] + 1);

			// meeting between pacman and ghost
			if (pacmanx > (ghostx[i] - 12) && pacmanx < (ghostx[i] + 12)
					&& pacmany > (ghosty[i] - 12) && pacmany < (ghosty[i] + 12)
					&& ingame) {
				if (killerPacman == false) {
					dying = true;
				} else {
					ghostx[i] = 7 * blocksize;
					ghosty[i] = 9 * blocksize;
				}
			}
		}
	}

	// first step to the end
	private void ghostBfsMove(int i) {
		Node node = bfs(maze, ghostx[i] / blocksize, ghosty[i] / blocksize, 0);
		while (node != null) {
			if (node.l == 1) {
				ghostdx[i] = node.x - (ghostx[i] / blocksize);
				ghostdy[i] = node.y - (ghosty[i] / blocksize);
			}
			node = node.parent;
		}
	}

	private void levelForBfs(int endy, int endx) {
		int c = 0;
		for (int x = 0; x < 15; x++) {
			for (int y = 0; y < 15; y++) {
				maze[x][y] = leveldata[c];
				c += 1;
			}
		}
		maze[endy][endx] = 64; // the end of maze
	}

	private void randomMoveGhost(int posGhost, int i) {
		int count = 0;
		// algorithm for success escape of tunnels
		if ((screendata[posGhost] & 1) == 0 && ghostdx[i] != 1) {
			dx[count] = -1;
			dy[count] = 0;
			count++;
		}

		if ((screendata[posGhost] & 2) == 0 && ghostdy[i] != 1) {
			dx[count] = 0;
			dy[count] = -1;
			count++;
		}

		if ((screendata[posGhost] & 4) == 0 && ghostdx[i] != -1) {
			dx[count] = 1;
			dy[count] = 0;
			count++;
		}

		if ((screendata[posGhost] & 8) == 0 && ghostdy[i] != -1) {
			dx[count] = 0;
			dy[count] = 1;
			count++;
		}

		// random
		if (count == 0) {

			if ((screendata[posGhost] & 15) == 15) {
				ghostdx[i] = 0;
				ghostdy[i] = 0;
			} else {
				ghostdx[i] = -ghostdx[i];
				ghostdy[i] = -ghostdy[i];
			}

		} else {
			count = (int) (Math.random() * count);
			if (count > 3) {
				count = 3;
			}
			ghostdx[i] = dx[count];
			ghostdy[i] = dy[count];
		}
	}

	private void drawGhost(Graphics2D g2d, int x, int y) {

		g2d.drawImage(ghost, x, y, this);
	}

	private void drawTimeForKill(Graphics2D g) {

		String s;

		g.setFont(smallfont);
		g.setColor(new Color(196, 128, 255));
		s = "Remaining time to kill: " + remainingTimeForKill;
		g.drawString(s, scrsize / 15, scrsize + 16);

	}

	private void timer() {
		int delay = 1000;
		timer1 = new Timer(delay, new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				loweringRemainingTimeForKill();
				if (remainingTimeForKill < 1) {
					killerPacman = false;
					timer1.stop();
				}
			}
		});
		timer1.start();
	}

	private void loweringRemainingTimeForKill() {
		remainingTimeForKill -= 1;
	}

	private void drawPacman(Graphics2D g2d) {

		if (viewdx == -1) {
			drawPacnanLeft(g2d);
		} else if (viewdx == 1) {
			drawPacmanRight(g2d);
		} else if (viewdy == -1) {
			drawPacmanUp(g2d);
		} else {
			drawPacmanDown(g2d);
		}
	}

	private void drawPacmanUp(Graphics2D g2d) {

		switch (pacmananimpos) {
		case 1:
			g2d.drawImage(pacman2up, pacmanx + 1, pacmany + 1, this);
			break;
		case 2:
			g2d.drawImage(pacman3up, pacmanx + 1, pacmany + 1, this);
			break;
		case 3:
			g2d.drawImage(pacman4up, pacmanx + 1, pacmany + 1, this);
			break;
		default:
			g2d.drawImage(pacman1, pacmanx + 1, pacmany + 1, this);
			break;
		}
	}

	private void drawPacmanDown(Graphics2D g2d) {

		switch (pacmananimpos) {
		case 1:
			g2d.drawImage(pacman2down, pacmanx + 1, pacmany + 1, this);
			break;
		case 2:
			g2d.drawImage(pacman3down, pacmanx + 1, pacmany + 1, this);
			break;
		case 3:
			g2d.drawImage(pacman4down, pacmanx + 1, pacmany + 1, this);
			break;
		default:
			g2d.drawImage(pacman1, pacmanx + 1, pacmany + 1, this);
			break;
		}
	}

	private void drawPacnanLeft(Graphics2D g2d) {

		switch (pacmananimpos) {
		case 1:
			g2d.drawImage(pacman2left, pacmanx + 1, pacmany + 1, this);
			break;
		case 2:
			g2d.drawImage(pacman3left, pacmanx + 1, pacmany + 1, this);
			break;
		case 3:
			g2d.drawImage(pacman4left, pacmanx + 1, pacmany + 1, this);
			break;
		default:
			g2d.drawImage(pacman1, pacmanx + 1, pacmany + 1, this);
			break;
		}
	}

	private void drawPacmanRight(Graphics2D g2d) {

		switch (pacmananimpos) {
		case 1:
			g2d.drawImage(pacman2right, pacmanx + 1, pacmany + 1, this);
			break;
		case 2:
			g2d.drawImage(pacman3right, pacmanx + 1, pacmany + 1, this);
			break;
		case 3:
			g2d.drawImage(pacman4right, pacmanx + 1, pacmany + 1, this);
			break;
		default:
			g2d.drawImage(pacman1, pacmanx + 1, pacmany + 1, this);
			break;
		}
	}

	private void drawMaze(Graphics2D g2d) {

		short i = 0;
		int x, y;

		for (y = 0; y < scrsize; y += blocksize) {
			for (x = 0; x < scrsize; x += blocksize) {

				g2d.setColor(mazecolor);
				g2d.setStroke(new BasicStroke(2));

				if ((screendata[i] & 1) != 0) {
					g2d.drawLine(x, y, x, y + blocksize - 1);
				}

				if ((screendata[i] & 2) != 0) {
					g2d.drawLine(x, y, x + blocksize - 1, y);
				}

				if ((screendata[i] & 4) != 0) {
					g2d.drawLine(x + blocksize - 1, y, x + blocksize - 1, y
							+ blocksize - 1);
				}

				if ((screendata[i] & 8) != 0) {
					g2d.drawLine(x, y + blocksize - 1, x + blocksize - 1, y
							+ blocksize - 1);
				}

				if ((screendata[i] & 16) != 0) {
					g2d.setColor(dotcolor);
					g2d.fillRect(x + 11, y + 11, 2, 2);
				}

				if ((screendata[i] & 32) != 0) {
					g2d.setColor(dotcolor1);
					g2d.fillRect(x + 6, y + 6, 12, 12);
				}

				i++;
			}
		}
	}

	private void initGame() {

		score = 0;
		initLevel();
	}

	private void initLevel() {

		int i;
		for (i = 0; i < nrofblocks * nrofblocks; i++) {
			screendata[i] = leveldata[i];
		}

		continueLevel();
	}

	private void continueLevel() {

		short i;
		int dy = -1;
		int random;

		for (i = 0; i < nrofghosts; i++) {

			ghostx[i] = 7 * blocksize; // ghosts starting point
			ghosty[i] = 9 * blocksize;
			ghostdx[i] = 0;
			ghostdy[i] = dy;
			dy = -dy;
			// random for speed of ghost
			random = (int) (Math.random() * (currentspeed + 1));

			if (random > currentspeed) {
				random = currentspeed;
			}

			ghostspeed[i] = validspeeds[random];
		}

		pacmanx = 7 * blocksize; // pacman starting point
		pacmany = 14 * blocksize;
		pacmandx = 0;
		pacmandy = 0;
		reqdx = 0;
		reqdy = 0;
		viewdx = -1;
		viewdy = 0;
		dying = false;
		counterForDiagonalX = 0;
		counterForDiagonalY = 0;
	}

	private void loadImages() {

		ghost = new ImageIcon(this.getClass().getResource(ghostS)).getImage();
		pacman1 = new ImageIcon(this.getClass().getResource(pacman1S))
				.getImage();
		pacman2up = new ImageIcon(this.getClass().getResource(pacman2upS))
				.getImage();
		pacman3up = new ImageIcon(this.getClass().getResource(pacman3upS))
				.getImage();
		pacman4up = new ImageIcon(this.getClass().getResource(pacman4upS))
				.getImage();
		pacman2down = new ImageIcon(this.getClass().getResource(pacman2downS))
				.getImage();
		pacman3down = new ImageIcon(this.getClass().getResource(pacman3downS))
				.getImage();
		pacman4down = new ImageIcon(this.getClass().getResource(pacman4downS))
				.getImage();
		pacman2left = new ImageIcon(this.getClass().getResource(pacman2leftS))
				.getImage();
		pacman3left = new ImageIcon(this.getClass().getResource(pacman3leftS))
				.getImage();
		pacman4left = new ImageIcon(this.getClass().getResource(pacman4leftS))
				.getImage();
		pacman2right = new ImageIcon(this.getClass().getResource(pacman2rightS))
				.getImage();
		pacman3right = new ImageIcon(this.getClass().getResource(pacman3rightS))
				.getImage();
		pacman4right = new ImageIcon(this.getClass().getResource(pacman4rightS))
				.getImage();

	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		doDrawing(g);
	}

	private void doDrawing(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;

		g2d.setColor(Color.black);

		drawMaze(g2d);
		drawScore(g2d);
		drawTimeForKill(g2d);
		doAnim();
		playGame(g2d);

		g2d.drawImage(ii, 5, 5, this);
		Toolkit.getDefaultToolkit().sync();
		g2d.dispose();
	}

	class TAdapter extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {

			int key = e.getKeyCode();

			if (ingame) {
				if (key == KeyEvent.VK_LEFT) {
					reqdx = -1;
					reqdy = 0;
				} else if (key == KeyEvent.VK_RIGHT) {
					reqdx = 1;
					reqdy = 0;
				} else if (key == KeyEvent.VK_UP) {
					reqdx = 0;
					reqdy = -1;
				} else if (key == KeyEvent.VK_DOWN) {
					reqdx = 0;
					reqdy = 1;
				}
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {

			int key = e.getKeyCode();

			if (key == Event.LEFT || key == Event.RIGHT || key == Event.UP
					|| key == Event.DOWN) {
				reqdx = 0;
				reqdy = 0;
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		repaint();
	}

	public static class Node {
		int y;
		int x;
		int l;
		Node parent;

		private Node(int y, int x, int l, Node parent) {
			this.y = y;
			this.x = x;
			this.l = l;
			this.parent = parent;
		}

		@Override
		public String toString() {
			return "" + y + " " + x + " " + l;
		}
	}

	public static Node bfs(int[][] maze, int startX, int startY, int wall) {
		Queue<Node> queue = new LinkedList<>();
		Node start = new Node(startY, startX, 0, null);
		queue.add(start);

		while (queue.peek() != null) {
			Node current = queue.remove();
			int y = current.y;
			int x = current.x;
			int l = current.l;

			if (y - 1 > -1 && maze[y - 1][x] != wall) {
				Node next = new Node(y - 1, x, l + 1, current);
				if (maze[y - 1][x] == 64) {
					return next;
				} else {
					maze[y - 1][x] = wall;
					queue.add(next);
				}
			}

			if (x - 1 > -1 && maze[y][x - 1] != wall) {
				Node next = new Node(y, x - 1, l + 1, current);
				if (maze[y][x - 1] == 64) {
					return next;
				} else {
					maze[y][x - 1] = wall;
					queue.add(next);
				}
			}

			if (x + 1 < 15 && maze[y][x + 1] != wall) {
				Node next = new Node(y, x + 1, l + 1, current);
				if (maze[y][x + 1] == 64) {
					return next;
				} else {
					maze[y][x + 1] = wall;
					queue.add(next);
				}
			}

			if (y + 1 < 15 && maze[y + 1][x] != wall) {
				Node next = new Node(y + 1, x, l + 1, current);
				if (maze[y + 1][x] == 64) {
					return next;
				} else {
					maze[y + 1][x] = wall;
					queue.add(next);
				}
			}
		}
		return null;
	}
}