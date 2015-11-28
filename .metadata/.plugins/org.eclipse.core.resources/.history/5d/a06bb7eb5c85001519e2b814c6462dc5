package all;

import java.io.IOException;

public class ExitingFromMaze {

	public static void main(String[] args) throws IOException {
		Maze maze = new Maze();
		maze.readFromFile(Maze.getInputFileName());
		int pathLength = maze.findShortestPath(maze.getStartCell());
		maze.saveResult(Maze.getOutputFileName(), pathLength);
	}

}
