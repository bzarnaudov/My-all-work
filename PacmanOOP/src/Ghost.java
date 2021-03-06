
import java.awt.Graphics2D;

/**
 * The Ghost Class
 */
public class Ghost extends Unit {
	private String ghostImage = "images/ghost.png";

	// pointer for four diagonals ghost behavior
	private int counterForDiagonalX = 0;
	private int counterForDiagonalY = 0;
	
	private int endPositionForBfsX;
	private int endPositionForBfsY;

	public static final int validSpeeds[] = { 1, 2, 3, 4, 6, 8 };

	public Ghost(int startRowPosition, int startColumnPosition) {
		super.setImages(ghostImage);
		rowPosition = startRowPosition;
		columnPosition = startColumnPosition;
		speed = 3;
	}

	public void moveGhosts(Graphics2D g2d, boolean killerPacman, Pacman pacman,
			int blockSize, Level level, int i) {

		int positionX;
		int positionY;
		MapSpot pointOfMap;
		MapSpot[][] levelContent = level.getLevelContent();

		if (killerPacman == false) {
			endPositionForBfsX = pacman.getRowPosition() / blockSize;
			endPositionForBfsY = pacman.getColumnPosition() / blockSize;
		} else {
			endPositionForBfsX = level.getRowStartingPositionGhost();
			endPositionForBfsY = level.getColumnStartingPositionGhost();
		}

		if (columnPosition % blockSize == 0 && rowPosition % blockSize == 0) {
			positionX = columnPosition / blockSize;
			positionY = rowPosition / blockSize;
			pointOfMap = levelContent[positionY][positionX];

			// the shortest path
			if (i == 0) {
				Level.setLevelForBFS(endPositionForBfsX, endPositionForBfsY);
				ghostBfsMove(blockSize);

			} else if (i == 1) { // 50% the shortest path and 50% random
				if (Math.random() > 0.5) {
					Level.setLevelForBFS(endPositionForBfsX, endPositionForBfsY);
					ghostBfsMove(blockSize);
				} else {
					randomMoveGhost(pointOfMap);
				}
			} else if (i == 2) { // path between four edges
				if (killerPacman == false) {
					Level.setLevelForBFS(counterForDiagonalY, counterForDiagonalX);
					ghostBfsMove(blockSize);
					if (columnPosition / blockSize == 0
							&& rowPosition / blockSize == 0) {
						counterForDiagonalX = 14;
						counterForDiagonalY = 14;
					}
					if (columnPosition / blockSize == 14
							&& rowPosition / blockSize == 14) {
						counterForDiagonalX = 0;
						counterForDiagonalY = 14;
					}
					if (columnPosition / blockSize == 0
							&& rowPosition / blockSize == 14) {
						counterForDiagonalX = 14;
						counterForDiagonalY = 0;
					}
					if (columnPosition / blockSize == 14
							&& rowPosition / blockSize == 0) {
						counterForDiagonalX = 0;
						counterForDiagonalY = 0;
					}
				} else {
					Level.setLevelForBFS(endPositionForBfsX, endPositionForBfsY);
					ghostBfsMove(blockSize);
				}
			} else if (i > 2) { // random wandering
				if (killerPacman == false) {
					randomMoveGhost(pointOfMap);
				} else {
					Level.setLevelForBFS(endPositionForBfsX, endPositionForBfsY);
					ghostBfsMove(blockSize);
				}
			}
		}

		// the new position of ghost
		columnPosition = columnPosition + (directionX * speed);
		rowPosition = rowPosition + (directionY * speed);

		// meeting between pacman and ghost
		if (pacman.columnPosition > (columnPosition - blockSize / 2)
				&& pacman.columnPosition < (columnPosition + blockSize / 2)
				&& pacman.rowPosition > (rowPosition - blockSize / 2)
				&& pacman.rowPosition < (rowPosition + blockSize / 2)) {
			if (killerPacman == false) {
				pacman.setAlive(false);
			} else {
				columnPosition = level.getColumnStartingPositionGhost()
						* blockSize;
				rowPosition = level.getRowStartingPositionGhost() * blockSize;
			}
		}
	}

	// first step to the end
	private void ghostBfsMove(int blockSize) {
		Node node = SearchForShortestPath.bfs(Level.levelForBFS, columnPosition / blockSize,
				rowPosition / blockSize, 1);
		while (node != null) {
			if (node.l == 1) {
				directionX = node.x - (columnPosition / blockSize);
				directionY = node.y - (rowPosition / blockSize);
			}
			node = node.parent;
		}
	}

	private void randomMoveGhost(MapSpot pointOfMap) {
		int count = 0;
		int[] directionArrayX = new int[4];
		int[] directionArrayY = new int[4];

		// algorithm for success escape of tunnels
		if (!pointOfMap.hasLeftWall() && directionX != 1) {
			directionArrayX[count] = -1;
			directionArrayY[count] = 0;
			count++;
		}

		if (!pointOfMap.hasTopWall() && directionY != 1) {
			directionArrayX[count] = 0;
			directionArrayY[count] = -1;
			count++;
		}

		if (!pointOfMap.hasRightWall() && directionX != -1) {
			directionArrayX[count] = 1;
			directionArrayY[count] = 0;
			count++;
		}

		if (!pointOfMap.hasBottomWall() && directionY != -1) {
			directionArrayX[count] = 0;
			directionArrayY[count] = 1;
			count++;
		}

		// random
		if (count == 0) {

			if (pointOfMap.hasBottomWall() && pointOfMap.hasLeftWall()
					&& pointOfMap.hasRightWall() && pointOfMap.hasTopWall()) {
				directionX = 0;
				directionY = 0;
			} else {
				directionX = -directionX;
				directionY = -directionY;
			}

		} else {
			count = (int) (Math.random() * count);
			if (count > 3) {
				count = 3;
			}
			directionX = directionArrayX[count];
			directionY = directionArrayY[count];
		}
	}
}