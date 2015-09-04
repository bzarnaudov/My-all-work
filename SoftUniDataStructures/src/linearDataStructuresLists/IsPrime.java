package linearDataStructuresLists;

public class IsPrime {

	public static void main(String[] args) {
		
		Long startTime = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++)	{
		   //IsPrime(i);
		   IsPrimeFast(i);
		}
		
		System.out.println("OrderDone for " + (System.currentTimeMillis() - startTime) + " ms");

	}
	
	// 07. in milliseconds
	// ╔════════════════╦══════════════════╦══════════════════╦══════════════════╦══════════════════╦══════════════════╗
	// ║ Function 		║ p = 1 000 	   ║ p = 10 000       ║ p = 50 000       ║ p = 100 000      ║ p = 1 000 000    ║
	// ╠════════════════╬══════════════════╬══════════════════╬══════════════════╬══════════════════╬══════════════════╣
	// ║ IsPrime(p)     ║ 		1		   ║       27         ║       490        ║       1832       ║      hangs       ║
	// ║ IsPrimeFast(p) ║       0          ║        5         ║         9        ║         16       ║        280       ║
	// ╚════════════════╩══════════════════╩══════════════════╩══════════════════╩══════════════════╩══════════════════╝

	private static void IsPrimeFast(int num) {
		int maxDivisor = (int)Math.sqrt(num);
		for (int i = 2; i <= maxDivisor; i++) {
			if (num % i == 0) {
				return;
		    }
		}
		return;
	}

//	private static void IsPrime(int num) {
//		for (int i = 2; i < num; i++) {
//	        if (num % i == 0) {
//	        	return;
//		    }
//		}
//	    return;
//	}
}
