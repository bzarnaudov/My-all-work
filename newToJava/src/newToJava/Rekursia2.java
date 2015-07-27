package newToJava;


public class Rekursia2 {
	
	private static String[] x = {"kur0", "kur1", "kur2"};
	
	private static int n = x.length, kMax = n, k = 1;
	
	public static void main(String[] args) {
		System.out.print("(),");
		for (k = 1; k <= kMax; k++) {
			int[] loops = new int[k];
			FindCombinations(loops,0,0,n);
			if (k != kMax) {
            	System.out.print(", ");
            }
		}
	}
	
    public static void FindCombinations(int[] vector, int index, int start, int end)
    {
        if (index >= vector.length) {
            Print(vector);
            if (vector[0] != end-k) {
            	System.out.print(", ");
            }
        } else
        	{
            	for (int i = start; i < end; i++){
            		vector[index] = i;
            		FindCombinations(vector, index + 1, i + 1, end);
            	}
        	}
    }

    static void Print(int[] vector)
    {
        for (int i = 0; i < vector.length; i++) {
        	if (i == 0) {
        		System.out.print("(");
        	}
            System.out.printf("%s", x[vector[i]]);
            if (i != vector.length - 1) {
                System.out.print(" ");
            }
            if (i == vector.length - 1) {
        		System.out.print(")");
        	}    
        }
    }

	
		
}
	
	
	
	
	
	
	
	
	
	


