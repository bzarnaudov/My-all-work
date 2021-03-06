package all;

import java.util.*;

public class Problem2LabirintAllPaths {
	private char[][] matrix;
	private Problem2Cell startCell;

	public Problem2LabirintAllPaths(int n) {
		this.matrix = new char[n][n];
		startCell = null;
	}
	
	public char[][] getMatrix() {
		return matrix;
	}

	public void setMatrixElement(int row, int col, char element) {
		this.matrix[row][col] = element;
	}

	public Problem2Cell getStartCell() {
		return startCell;
	}

	public void setStartCell(Problem2Cell startCell) {
		this.startCell = startCell;
	}

	public void findingAllPaths() {
        Queue<Problem2Cell> cellQueue = new LinkedList<Problem2Cell>();
        cellQueue.add(startCell);

        do {
        	Problem2Cell currentCell = cellQueue.remove();
            
            if (currentCell.getRow() + 1 < matrix.length) {
                if (matrix[currentCell.getRow() + 1][currentCell.getCol()] == 'O') {
                    cellQueue.add(new Problem2Cell(currentCell.getRow() + 1, currentCell.getCol()));
                    matrix[currentCell.getRow() + 1][currentCell.getCol()] = 'a';
                }
            }
            
            if (currentCell.getRow() - 1 >= 0) {
                if (matrix[currentCell.getRow() - 1][currentCell.getCol()] == 'O') {
                    cellQueue.add(new Problem2Cell(currentCell.getRow() - 1, currentCell.getCol()));
                    matrix[currentCell.getRow() - 1][currentCell.getCol()] = 'a';
                }
            }
            
            if (currentCell.getCol() + 1 < matrix.length) {
                if (matrix[currentCell.getRow()][currentCell.getCol() + 1] == 'O') {
                    cellQueue.add(new Problem2Cell(currentCell.getRow(), currentCell.getCol() + 1));
                    matrix[currentCell.getRow()][currentCell.getCol() + 1] = 'a';
                }
            }
            
            if (currentCell.getCol() - 1 >= 0) {
                if(matrix[currentCell.getRow()][currentCell.getCol()-1] == 'O') {
                    cellQueue.add(new Problem2Cell(currentCell.getRow(), currentCell.getCol() - 1));
                    matrix[currentCell.getRow()][currentCell.getCol() - 1] = 'a';
                }
            }
        } while (cellQueue.size() != 0);
    }

	public int findExits() {
        int counterExits = 0;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; i < this.matrix.length; i++) {
                if (matrix[i][j] == 'a') {                     
                    counterExits++;
                    if (i == j) continue;
                }
                if (matrix[j][i] == 'a') {
                    counterExits++;
                }
            }
        }

        for (int i = matrix.length - 1; i > matrix.length - 2; i--) {
            for (int j = matrix.length - 1; i > 0; i--) {
                if (matrix[i][j] == 'a') {
                    counterExits++;
                    if (i == j) continue;
                }
                if (matrix[j][i] == 'a') {
                    counterExits++;
                }
            }
        }
        return counterExits;
    }

}
