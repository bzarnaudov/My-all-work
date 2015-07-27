package newToJava;

public class Recursia {
	private static int n = 5, k = 3;
	public static int[] loops = new int[k];
	public static void main(String[] args) {
		nestedLoops(0);
	}
	public static void nestedLoops(int currentLoop) {
		if (currentLoop == k) {
			printLoops();
			if (loops[0] != n) {
				System.out.print(", ");
			}
			return;
		}
		for (int counter = 1; counter <= n; counter++) {
			if (counter <= loops[currentLoop]) {
				if (currentLoop > 0) {
					counter = loops[currentLoop -1];
					loops[currentLoop] = counter;
				}
			} else loops[currentLoop] = counter;
			
			nestedLoops(currentLoop + 1);
		}
	}
	public static void printLoops() {
		for (int i = 0; i < k; i++) {
			if ( i == 0 ) {
				System.out.print("(");
			}
			System.out.print(loops[i]);
			if ( i == k -1 ) {
				System.out.print(")");
				break;
			}
			System.out.print(" ");
		}
	}
	
	
	
}
