package newToJava;

public class Permutacia {
	private static int n = 4, broi = 0, fakt = 1;
	public static int[] p = new int[n];
	public static void main(String[] args) {
		for (int i = 0; i < n; i++) {
			p[i] = i + 1;
		}
		fakt = fakt();
		perm(0);
	}
	private static int fakt() {
		int sum = 1;
		for ( int i = 1; i <= n; i++) {
			sum = sum * i;
		}
		return sum;
	}
	public static void perm(int k) {
		if (k == n) {
			print();
			if (broi != fakt) {
				System.out.print(", ");
			}
		} else {
			for (int i = k; i < n; i++) {
				int z = p[k];
				p[k] = p[i];
				p[i] = z;
				perm(k+1);
				z = p[i];
				p[i] = p[k];
				p[k] = z;
			}
		}
	}
	
	public static void print() {
		for (int i = 0; i < n; i++) {
			if ( i == 0 ) {
				System.out.print("(");
			}
			System.out.print(p[i]);
			if ( i == n -1 ) {
				System.out.print(")");
				break;
			}
			System.out.print(" ");
		}
		broi++;
	}
	
	
//	private int[] inputArr;
//	private int[] tempMergArr;
//	private int length;
//	private int[] array;
//	
//public static void main(String a[]){
//	int[] inputArr = { 5, 7, 31, 25, 10, 6, 452, 8, 7 };
//	 Permutacia mms = new Permutacia();
//     mms.sort(inputArr);
//     for(int i:inputArr){
//        System.out.print(i);
//        System.out.print(" ");
//     }
//}
//
//public void sort(int inputArr[]) {
//    this.array = inputArr;
//    this.length = inputArr.length;
//    this.tempMergArr = new int[length];
//    doMergeSort(0, length - 1);
//}
//
// private void doMergeSort(int lowerIndex, int higherIndex) {
//     
//        if (lowerIndex < higherIndex) {
//            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
//            // Below step sorts the left side of the array
//            doMergeSort(lowerIndex, middle);
//            // Below step sorts the right side of the array
//            doMergeSort(middle + 1, higherIndex);
//            // Now merge both sides
//            mergeParts(lowerIndex, middle, higherIndex);
//        }
//    }
// 
//    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
// 
//        for (int i = lowerIndex; i <= higherIndex; i++) {
//            tempMergArr[i] = array[i];
//        }
//        int i = lowerIndex;
//        int j = middle + 1;
//        int k = lowerIndex;
//        while (i <= middle && j <= higherIndex) {
//            if (tempMergArr[i] <= tempMergArr[j]) {
//                array[k] = tempMergArr[i];
//                i++;
//            } else {
//                array[k] = tempMergArr[j];
//                j++;
//            }
//            k++;
//        }
//        while (i <= middle) {
//            array[k] = tempMergArr[i];
//            k++;
//            i++;
//        }
// 
//    }
	
	
	
	
	
}
