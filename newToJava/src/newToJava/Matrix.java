package newToJava;

public class Matrix {

	private static int[][] matrix =
			{       {1, 3, 2, 2, 2, 4},
					{3, 3, 3, 2, 4, 7},
					{4, 3, 1, 2, 3, 3},
					{4, 3, 1, 3, 3, 1},
					{4, 3, 3, 3, 1, 1},
			};

	private static int maxX = matrix[0].length;
	private static int maxY = matrix.length;

	private static int maxPath = 0;


	public static void main(String[] args) {
	    for (int i = 0; i < maxX; i++) {
			for (int j = 0; j < maxY; j++) {
				check(i,j,matrix[j][i], 0);
			}
		}
		System.out.println("maxPath = " + maxPath);
	}

	private static int check(int i, int j, int p, final int lastPathLen) {
		int pathLen = lastPathLen;
		if (i < 0 || i >= maxX || j < 0 || j >= maxY) {
			return 0;
		}
		int n = matrix[j][i];
		if (n == -1) {
			return 0; //used
		}
		if (n != p) {
			return 0;
		}
		pathLen++;
		matrix[j][i] = -1; //mark it as used
		pathLen += check(i-1, j, p, lastPathLen);
		pathLen += check(i+1, j, p, lastPathLen);
		pathLen += check(i, j+1, p, lastPathLen);
		pathLen += check(i, j-1, p, lastPathLen);

		if (maxPath < pathLen) {
			maxPath = pathLen;
		}

		return pathLen;
	}
}
