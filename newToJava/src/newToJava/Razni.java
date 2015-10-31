package newToJava;

import java.util.Scanner;




@SuppressWarnings("unused")
public class Razni {
	//public static void main(String[] args) {
		
		/*
		int number = 3645, number1 = 0,base = 1;
		int i = 0,ostatuk = 0,chislo = 1;
		char[] array = new char[20];
		int[] array1 = new int[20];
		int k2 = 0;
		while (number != 0) {
			ostatuk = number % 16;
			if (ostatuk < 10) {
				array[i] = (char) (48 + ostatuk);
			} else {
				array[i] = (char) (65 + ostatuk - 10);
			}
			number = number / 16;	
			i++;
		}
		for (int k = 19; k >= 0; k--) {
			System.out.print(array[k] + " ");
		}
		System.out.println("\n");
		
		for (int k1 = 0; k1 <= 19; k1++) {
			if (array[k1] > 64) {
				chislo = (array[k1]-65+10);
				for (int z = 0; z < 4;z++) {
					array1[k2]= chislo % 2;
					chislo /= 2;
					k2++;
				}
			} 
			chislo = 1;
			if ((array[k1] > 48) && (array[k1] < 64) ) {
				chislo = (array[k1]-48);
				for (int z = 0; z < 4; z++) {
					array1[k2]= chislo % 2;
					chislo /= 2;
					k2++;
				}
			}
		}
		
		for (int k = 19; k >= 0; k--) {
			System.out.print(array1[k] + " ");
			if ((k % 4) == 0) {
				System.out.print(" ");
			}
		}
		System.out.println(" ");
		int num = 0;
		char[] array2 = new char[20];
		for (int k = 0; k <= 20; k++) {
			if ((k % 4 == 0) && (k != 0)) {
				System.out.println(num);
				if (num < 10) {
					array2[(k / 4) -1] = (char) (48 + num);
				} else {
					array2[(k / 4) -1] = (char) (65 + num - 10);
				}
				num = 0;
				base = 1;
			}
			if (k == 20) {
				break;
			}
			num += (array1[k] * base);
			base *= 2;
				
			
			
		}
		
		for (int k = 19; k >= 0; k--) {
			System.out.print(array2[k] + " ");
		}
		System.out.println();
		int numDes = array1[19];
		for (int k = 19; k > 0; k--) {
			numDes = (numDes * 2) + array1[k-1];
		}
		System.out.println(numDes);
		*/
		
		/*
		char[] roman = { 'M', 'M', 'X', 'I', 'V'};
		int numberDes = 0, numberF = 0, numberS = 0;
		for (int i = 0; i <= roman.length - 2; i++) {
			if ( roman[i] == 'M') {
				numberF = 1000; 
			}
			if (roman[i] == 'D') {
				numberF = 500;
			}
			if (roman[i] == 'C') {
				numberF = 100;
			}
			if (roman[i] == 'L') {
				numberF = 50;
			}
			if (roman[i] == 'X') {
				numberF = 10;
			}
			if (roman[i] == 'V') {
				numberF = 5;
			}
			if (roman[i] == 'I') {
				numberF = 1;
			}
			if ( roman[i+1] == 'M') {
				numberS = 1000; 
			}
			if (roman[i+1] == 'D') {
				numberS = 500;
			}
			if (roman[i+1] == 'C') {
				numberS = 100;
			}
			if (roman[i+1] == 'L') {
				numberS = 50;
			}
			if (roman[i+1] == 'X') {
				numberS = 10;
			}
			if (roman[i+1] == 'V') {
				numberS = 5;
			}
			if (roman[i+1] == 'I') {
				numberS = 1;
			}
			
			if ( numberF >= numberS) {
				numberDes += numberF;
			} else {
				numberDes -= numberF;
			}
			
			
		}
		if ( roman[roman.length -1] == 'M') {
			numberF = 1000; 
		}
		if (roman[roman.length -1] == 'D') {
			numberF = 500;
		}
		if (roman[roman.length -1] == 'C') {
			numberF = 100;
		}
		if (roman[roman.length -1] == 'L') {
			numberF = 50;
		}
		if (roman[roman.length -1] == 'X') {
			numberF = 10;
		}
		if (roman[roman.length -1] == 'V') {
			numberF = 5;
		}
		if (roman[roman.length -1] == 'I') {
			numberF = 1;
		}
		numberDes += numberF;
		System.out.println(numberDes);
		numberDes = 2333;
		System.out.println(numberDes);
		char[] roman1 = new char[20];
		int hiliadi = numberDes / 1000;
		int stotici = (numberDes / 100) % 10;
		int desetici = (numberDes / 10) % 10;
		int edinici = numberDes % 10;
		int krai = hiliadi;
		int k = 0;
		for (k = 0; k < krai; k++) {
			roman1[k] = 'M';
		}
		System.out.println(stotici);
		if (stotici == 0) {
			k--;
		}
		if (stotici == 1) {
			roman1[k] = 'C';
		}
		if (stotici == 2) {
			roman1[k] = 'C';
			k++;
			roman1[k] = 'C';
		}
		if (stotici == 3) {
			roman1[k] = 'C';
			k++;
			roman1[k] = 'C';
			k++;
			roman1[k] = 'C';
		}
		if (stotici == 4) {
			roman1[k] = 'C';
			k++;
			roman1[k] = 'D';
		}
		if (stotici == 5) {
			roman1[k] = 'D';
		}
		if (stotici == 6) {
			roman1[k] = 'D';
			k++;
			roman1[k] = 'C';
		}
		if (stotici == 7) {
			roman1[k] = 'D';
			k++;
			roman1[k] = 'C';
			k++;
			roman1[k] = 'C';
		}
		if (stotici == 8) {
			roman1[k] = 'D';
			k++;
			roman1[k] = 'C';
			k++;
			roman1[k] = 'C';
			k++;
			roman1[k] = 'C';
		}
		if (stotici == 9) {
			roman1[k] = 'C';
			k++;
			roman1[k] = 'M';
		}
		k++;
		if (desetici == 0) {
			k--;
		}
		if (desetici == 1) {
			roman1[k] = 'X';
		}
		if (desetici == 2) {
			roman1[k] = 'X';
			k++;
			roman1[k] = 'X';
		}
		if (desetici == 3) {
			roman1[k] = 'X';
			k++;
			roman1[k] = 'X';
			k++;
			roman1[k] = 'X';
		}
		if (desetici == 4) {
			roman1[k] = 'X';
			k++;
			roman1[k] = 'L';
		}
		if (desetici == 5) {
			roman1[k] = 'L';
		}
		if (desetici == 6) {
			roman1[k] = 'L';
			k++;
			roman1[k] = 'X';
		}
		if (desetici == 7) {
			roman1[k] = 'L';
			k++;
			roman1[k] = 'X';
			k++;
			roman1[k] = 'X';
		}
		if (desetici == 8) {
			roman1[k] = 'L';
			k++;
			roman1[k] = 'X';
			k++;
			roman1[k] = 'X';
			k++;
			roman1[k] = 'X';
		}
		if (desetici == 9) {
			roman1[k] = 'X';
			k++;
			roman1[k] = 'C';
		}
		k++;
		if (edinici == 1) {
			roman1[k] = 'I';
		}
		if (edinici == 2) {
			roman1[k] = 'I';
			k++;
			roman1[k] = 'I';
		}
		if (edinici == 3) {
			roman1[k] = 'I';
			k++;
			roman1[k] = 'I';
			k++;
			roman1[k] = 'I';
		}
		if (edinici == 4) {
			roman1[k] = 'I';
			k++;
			roman1[k] = 'V';
		}
		if (edinici == 5) {
			roman1[k] = 'V';
		}
		if (edinici == 6) {
			roman1[k] = 'V';
			k++;
			roman1[k] = 'I';
		}
		if (edinici == 7) {
			roman1[k] = 'V';
			k++;
			roman1[k] = 'I';
			k++;
			roman1[k] = 'I';
		}
		if (edinici == 8) {
			roman1[k] = 'V';
			k++;
			roman1[k] = 'I';
			k++;
			roman1[k] = 'I';
			k++;
			roman1[k] = 'I';
		}
		if (edinici == 9) {
			roman1[k] = 'I';
			k++;
			roman1[k] = 'X';
		}
		for (k = 0; k < roman1.length; k++) {
			System.out.print(roman1[k]);
		}*/
		
		/*
		float number1 = -9.0f;
		double number2 = 3.22d;
		System.out.println(Float.floatToRawIntBits(number1));
		System.out.println(Double.doubleToRawLongBits(number2));
		int f = Float.floatToRawIntBits(number1);
		long d = Double.doubleToRawLongBits(number2);
		int s = ((f >> 31) == 0) ? 1 : -1;
		int e = ((f >> 23) & 0xff);
		int m = (e == 0) ?
                 (f & 0x7fffff) << 1 :
                 (f & 0x7fffff) | 0x800000;
		int s1 = ((d >> 63) == 0) ? 1 : -1;
		int e1 = (int)((d >> 52) & 0x7ffL);
		long m1 = (e1 == 0) ?
		                (d & 0xfffffffffffffL) << 1 :
		                (d & 0xfffffffffffffL) | 0x10000000000000L;
		System.out.println("znaka e " + s);
		System.out.println("eksponentata e " + e);
		System.out.println("mantisata e " + m);
		System.out.println("znaka e " + s1);
		System.out.println("eksponentata e " + e1);
		System.out.println("mantisata e " + m1);
		*/
	/*public static void main(String[] args) {
		// Entering the value of the variable n
		System.out.print("n = ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		System.out.println();
		// Printing the upper part of the triangle
		for (int line = 1; line <= n; line++) {
			printLine(1, line);
		}
		// Printing the bottom part of the triangle
		// that is under the longest line
		for (int line = n - 1; line >= 1; line--) {
			printLine(1, line);
		}
	}
	
	private static void printLine(int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.print(" " + i);	
		}
		System.out.println();
	}
	*/
	/*
	public static int[] sort(int... numbers) {
		// The sorting logic:
		for (int i = 0; i < numbers.length - 1; i++) {
		// Loop that is operating over the un-sorted part of
		// the array
		for (int j = i + 1; j < numbers.length; j++) {
		// Swapping the values
		if (numbers[i] > numbers[j]) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
		}
		}
		} // End of the sorting logic
		return numbers;
		}
		public static void printNumbers(int... numbers) {
		for (int i = 0; i < numbers.length; i++) {
		System.out.printf("%d", numbers[i]);
		if (i < (numbers.length - 1)) {
		System.out.print(", ");
		}
		}
		}
		public static void main(String[] args) {
		int[] numbers = sort(10, 3, 5, -1, 0, 12, 8);
		printNumbers(numbers);
		}
	*/	
//	public static void main(String[] args) {
		
//		int[] numbers = new int[3];
//		for (int i = 0; i < numbers.length; i++) {
//			numbers[i] = readNumber();
//		} 
//		
//		System.out.println(getMax(getMax(numbers[0], numbers[1]), numbers[2]));
		
//		int number = readNumber();
//		printLastNumber(number);
//	}
//
//	public static int makeNumberPositive(int number) {
//		if (number < 0) {
//			number *= -1;
//		}
//		return number;
//	}
//	public static void printLastNumber(int number) {
//		number = number % 10;
//		number = makeNumberPositive(number);
//		switch (number) {
//		case 0 : System.out.println("zero"); return;
//		case 1 : System.out.println("one"); return;
//		case 2 : System.out.println("two"); return;
//		case 3 : System.out.println("tree"); return;
//		case 4 : System.out.println("four"); return;
//		case 5 : System.out.println("five"); return;
//		case 6 : System.out.println("six"); return;
//		case 7 : System.out.println("seven"); return;
//		case 8 : System.out.println("eight"); return;
//		case 9 : System.out.println("nine"); return;
//		}
//	}
//	
//	public static int readNumber() {
//		Scanner input = new Scanner(System.in);
//		System.out.print("Molia napisheshe chislo : ");
//		int number = input.nextInt();
//		return number;
//	}
//	public static int getMax(int number1, int number2) {
//		int biggerNumber = number2;
//		if (number1 >= number2) {
//			biggerNumber = number1;
//		}
//		return biggerNumber;
//	}
//	
//	public static void printName1(String name) {
//		System.out.println("\"Hello, " + name + "!\"");
//	}
	
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		int tankPrice = input.nextInt();
//		int partyDays = input.nextInt();
//		int savePerMonth = (30 - partyDays) * 2 - (partyDays * 5);
//		if (savePerMonth > 0) {
//			int months = tankPrice / savePerMonth;
//			if ((tankPrice % savePerMonth) != 0 ) {
//				months++;
//			}
//			int years = months / 12;
//			months %= 12;
//			System.out.printf("%d years, %d months", years, months);
//		} else {
//			System.out.println("never");
//		}
//		input.close();
//	}
	
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		int r = input.nextInt();
//		int c = input.nextInt();
//		long v = input.nextLong();
//		long h = input.nextLong();
//		long startTime = System.currentTimeMillis();
//		for (long i = v; i < v + r; i++) {
//			for (long j = h; j < h + c; j++) {
//				System.out.print(i * j);
//				if (j < h + c - 1) {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//
//		input.close();
//		System.out.println("Order Done for " + (System.currentTimeMillis() - startTime) + " ms");
//		
//	}
	
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		int n = input.nextInt();
//		int bodyWidth = 2 * n;
//		int bodyHeight = (n - 1) / 2;
//		int point = 1;
//		for (int i = 0; i < (n+1) / 2; i++) {
//			for (int j = 0; j < bodyWidth; j++) {
//				if (j == n - point) {
//					j = j + point - 1;
//					for (int j2 = 0; j2 < point; j2++) {
//						System.out.print("*");
//					}
//				} else {
//					System.out.print(".");
//				}
//			}
//			point += 2;
//			System.out.println();
//		}
//		point = 2;
//		for (int i = 0; i < n / 2; i++) {
//			for (int j = 0; j < bodyWidth; j++) {
//				if (j == point) {
//					j = j + n - point - 1;
//					for (int j2 = 0; j2 < n - point; j2++) {
//						System.out.print("*");
//					}
//				} else {
//					System.out.print(".");
//				}
//			}
//			point += 2;
//			System.out.println();
//		}
//		
//		for (int i = 0; i < bodyHeight; i++) {
//			for (int j = 0; j < bodyWidth; j++) {
//				if ((j >= i)&&(j < (bodyWidth - i))) {
//					System.out.print("*");
//				} else {
//					System.out.print(".");
//				}
//			}
//			System.out.println();
//		}
//	}
	
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		String text = input.nextLine();
//		int lineWidht = Integer.parseInt(input.nextLine());
//		String bombardingNumber = input.nextLine();
//		input.close();
//		String[] bombs = bombardingNumber.split(" ");
//	    int[] bombsCol = new int[bombs.length];
//	    int rolsOfMatrix = text.length() / lineWidht;
//	    char tempChar = ' ';
//		if (text.length() % lineWidht != 0) {
//			rolsOfMatrix++;
//		}
//	    for (int i = 0 ; i < bombsCol.length; i++) {
//	    	bombsCol[i] = Integer.parseInt(bombs[i]);
//	    }
//		char[] charArray = text.toCharArray();
//		for (int i = 0; i < bombsCol.length; i++ ) {
//			tempChar = ' ';
//			for (int j = 0; j < rolsOfMatrix; j++) {
//				if (bombsCol[i]+(j * lineWidht) > charArray.length -1) {
//					break;
//				}
//				if ((charArray[bombsCol[i]+(j * lineWidht)] == ' ')&&(tempChar != ' ')) {
//					break;
//				}  else {
//					tempChar = charArray[bombsCol[i]+(j * lineWidht)];
//					charArray[bombsCol[i]+(j * lineWidht)] = ' ';
//				}
//			}
//		}
//		String bombardedText = new String(charArray);
//		bombardedText = bombardedText.replaceAll("\\s+$", "");
//		System.out.print(bombardedText);
//	}
//	public static void main(String[] args) {
//		
//		Scanner input = new Scanner(System.in);
//		String inputNumbers = input.nextLine();
//		String[] rows = inputNumbers.split(" ");
//		int[] rowsNumbers = new int[rows.length];
//		for (int i = 0 ; i < rows.length; i++) {
//			rowsNumbers[i] = Integer.parseInt(rows[i]);
//	    }
//		String[] rowsInBits = new String[rowsNumbers.length];
//		for (int i = 0 ; i < rowsNumbers.length; i++) {
//			rowsInBits[i] = Integer.toBinaryString(rowsNumbers[i]);
//			rowsInBits[i] = makeFull12(rowsInBits[i]);
//			System.out.println(rowsInBits[i]);
//	    }
//		
//		String[][] bitLock = new String[rowsInBits.length][rowsInBits[0].length()+1];
//		for (int i = 0; i < rowsInBits.length; i++) {
//			String[] devideBinary = rowsInBits[i].split("");
//			for (int j = 0; j < rowsInBits[0].length()+1; j++) {
//				bitLock[i][j] = devideBinary[j];
//			}
//		}
//		String commands = "";
//		while (true) {
//			commands = input.nextLine();
//			if (commands.contains("check")) {
//				String[] check = commands.split(" ");
//				int col = Integer.parseInt(check[1]);
//				System.out.println(check(col,rowsInBits.length,bitLock));
//			}
//			if (commands.contains("left")) {
//				String[] check = commands.split(" ");
//				int row = Integer.parseInt(check[0]);
//				int shift = Integer.parseInt(check[2]);
//				shiftLeft(row, shift, bitLock);
//			}
//			if (commands.contains("right")) {
//				String[] check = commands.split(" ");
//				int row = Integer.parseInt(check[0]);
//				int shift = Integer.parseInt(check[2]);
//				shiftRight(row, shift, bitLock);
//			}
//			if (commands.contentEquals("end")) {
//				String[] numberBack = new String[bitLock[0].length];
//				for (int i = 0; i < bitLock.length; i++) {
//					numberBack[i] = "";
//					for (int j = 0; j < bitLock[0].length; j++) {
//						numberBack[i] += bitLock[i][j];
//					}
//					
//				}
//				int[] lastNumbers = new int[rows.length];
//				for (int i = 0 ; i < rows.length; i++) {
//					lastNumbers[i] = Integer.parseInt(numberBack[i], 2);
//					System.out.print(lastNumbers[i] + " ");
//			    }	
//				break;
//			}
//		}
//	}
//	
//	private static void shiftRight(int row, int shift, String[][] matrix) {
//		String temp1 = "";
//		for (int i = 0; i < shift; i++) {
//			for (int j = matrix[0].length - 1; j > 0; j--) {
//				if (j == matrix[0].length - 1) {
//					temp1 = matrix[row][j];
//				}
//				matrix[row][j] = matrix[row][j-1];
//				if (j == 1) {
//					matrix[row][j-1] = temp1;
//				}
//				
//				
//			}
//		}
//	}
//
//	private static void shiftLeft(int row, int shift, String[][] matrix) {
//		String temp1 = "";
//		for (int i = 0; i < shift; i++) {
//			for (int j = 0; j < matrix[0].length - 1; j++) {
//				if (j == 0) {
//					temp1 = matrix[row][j];
//				}
//				matrix[row][j] = matrix[row][j+1];
//				if (j == matrix[0].length - 2) {
//					matrix[row][j+1] = temp1;
//				}
//			}
//		}
//	}
//
//	public static String makeFull12 (String rowNumber) { 
//			while (rowNumber.length() < 12) {
//				rowNumber = "0" + rowNumber;
//			}
//		return rowNumber;
//	}
//	
//	public static int check (int colValue, int rows, String[][] matrix) {
//		int sum = 0;
//		for (int i = 0; i < rows; i++) {
//			sum += Integer.parseInt(matrix[i][(12 - colValue)]);
//		}
//		return sum;
//	}
	
//	public static void main(String[] args) {
//		
//	
//		int[][] matrix = new int[][] { 
//            { 1, 3, 2, 2, 2, 4 },
//            { 3, 3, 3, 2, 4, 4 }, 
//            { 4, 3, 1, 2, 3, 3 },
//            { 4, 3, 1, 3, 3, 1 }, 
//            { 4, 3, 3, 3, 1, 1 } };
//	
//		int road = 0;
//		int row = 0;
//		int col = 0;
//		int[] numberOfTheRoad = new int[100];
//		int[] roadStep = new int[100];
//		for (road = 0;  road < 100; road++) {
//			roadStep[road] = 1;
//			
//			for (row = 0; row < matrix.length; row++) {
//				
//				for (col = 0; col < matrix[0].length; col++) {
//					if (numberOfTheRoad[road] == 0) {
//						if (matrix[row][col] == matrix[row][col+1]) {
//							numberOfTheRoad[road] = matrix[row][col];
//							roadStep[road]++;
//						}
//					} else {
//						if (numberOfTheRoad[road] == matrix[row][col+1]) {
//							
//						}
//					}
//					
//				}
//				
//				
//			}
//			
//			
//			
//		}
//	}
	
//	public static void main(String[] args) {
//		int[] array = new int[] {6, 3, 3, 3, 3, 23, 23, 2, 2, 3, 57, 28};
//		int number = 3;
//		int count = countSameNumbersInArray(number, array);
//		System.out.println("the number " + number + " is seen " + count + " times in the array");
//		number = isSmallerOrBigger(array);
//		System.out.println(number);
//	}
//	public static int isSmallerOrBigger(int[] array) {
//		if ( number == 0 && array[number] > array[number+1]) {
//			System.out.println("elementa " + array[number] + " e po goliam ot susedite si");
//		}
//		if ( number == 0 && array[number] < array[number+1]) {
//			System.out.println("elementa " + array[number] + " e po maluk ot susedite si");
//		}
//		if ( number == array[array.length-1] && array[number] > array[number-1]) {
//			System.out.println("elementa " + array[number] + " e po goliam ot susedite si");
//		}
//		if ( number == 0 && array[array.length-1] < array[number+1]) {
//			System.out.println("elementa " + array[number] + " e po maluk ot susedite si");
//		}
//		for (int number = 1; number < array.length - 1; number++) {
//			if ((array[number] > array[number-1]) && (array[number] > array[number+1])) {
//				System.out.println("elementa " + array[number] + " e po goliam ot susedite si");
//				return array[number];
//			}
//		}
//		return -1;
//		if ((array[number] < array[number-1]) && (array[number] < array[number+1])) {
//			System.out.println("elementa " + array[number] + " e po maluk ot susedite si");
//		}
//	}
	
//	public static int countSameNumbersInArray(int number, int[] array) {
//		int count = 0;
//		for (int i = 0; i < array.length; i++) {
//			if (number == array[i]) {
//				count++;	
//			}
//		}
//		return count;
//	}
//	
//	public static void main(String[] args) {
//		int number = 25600;
//		reverseNumber(number);
//	}
//	
//	public static void reverseNumber ( int number) {
//		String numberString = Integer.toString(number);
//		String[] numberChar = numberString.split("");
//		for (int i = numberChar.length -1; i >= 0; i--) {
//			System.out.print(numberChar[i]);
//		}
//		
//	}
	
//	public static void main(String args[])
//	   {
//	      String original, reverse = "";
//	      Scanner in = new Scanner(System.in);
//	 
//	      System.out.println("Enter a string to reverse");
//	      original = in.nextLine();
//	 
//	      int length = original.length();
//	 
//	      for ( int i = length - 1 ; i >= 0 ; i-- )
//	         reverse = reverse + original.charAt(i);
//	 
//	      System.out.println("Reverse of entered string is: "+reverse);
//	   }
	
//	public static void main(String[] args) {
//	int n = 100;
//		System.out.println(fakturiel(n));
//		System.out.println();
//	}
//	
//	private static String fakturiel(int n) {
//		int[] array = new int[158];
//		array[0] = 1;
//		int k = 0,plus = 0;
//		for (int i = 1; i <= n; i++) {
//			for (int j = 0; j <= k; j++) {
//				array[j] = array[j] * i;
//				array[j] += plus;
//				if (array[j] >= 10) {
//					plus = array[j] / 10; 
//					array[j] = array[j] % 10;
//					if (j == k) {
//						k++;
//					}
//				} else {
//					plus = 0;
//				}
//			}
//
//		}
//		String numberEnd = "";
//		for (int i = k; i >= 0; i--) {
//			numberEnd = numberEnd + Integer.toString(array[i]);			
//		}
//		System.out.println(k);
//		double sum = 1;
//		for (int i = 1; i <= 100; i++) {
//			sum *= i;
//		}
//		System.out.println(sum);
//		return numberEnd;
//	}
	
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("1. Write 1 for to reverse a number ");
//		System.out.println("2. Write 2 for average aritmetick for array ");
//		System.out.println("3. Write 3 for linear equation ");
//		System.out.println("4. Write 4 for exit ");
//		System.out.println("Your choise is : ");
//		while(true) {
//			String command = input.nextLine();
//			if (command.contentEquals("1")) {
//				System.out.println("write number which you want to reverse : ");
//				while (true) {
//					command = input.nextLine();
//					if (isPositive(command)) {
//						break;
//					}
//				}
//				reverseNumber(command);
//				break;
//			}
//			if (command.contentEquals("2")) {
//				System.out.println("write numbers devided with space ");
//				while (true) {
//					command = input.nextLine();
//					if (command.isEmpty() != true) {
//						break;
//					}
//					System.out.println("please enter numbers :");
//				}
//				averageArray(command);
//				
//				break;
//			}
//			if (command.contentEquals("3")) {
//				System.out.println("write a ( a * x + b = 0 ) : ");
//				while (true) {
//					command = input.nextLine();
//					if (isNotNull(command)) {
//						break;
//					}
//				}
//				System.out.println("write b ( a * x + b = 0 ) : ");
//				String command2 =input.nextLine();
//				calculateEquation(command,command2);
//				break;
//			}
//			if (command.contentEquals("4")) {
//				break;
//			}
//			
//		}
//	}
//
//	private static void calculateEquation(String command, String command2) {
//		int number = Integer.parseInt(command);
//		int number1 = Integer.parseInt(command2);
//		BigDecimal number3 = new BigDecimal(((float)(-1*number1) / (float)number));
//		
//		System.out.printf("%nx = %.5f", number3);
//		
//	}
//
//	private static boolean isNotNull(String command) {
//		int number = Integer.parseInt(command);
//		if ( number != 0) {
//			return true;
//		}
//		System.out.println("Please write number different from 0 ");
//		return false;
//	}
//
//	private static void averageArray(String command) {
//		String[] numberChar = command.split(" ");
//		int[] numbers = new int[numberChar.length];
//		for (int i = 0; i < numbers.length; i++) {
//			numbers[i] = Integer.parseInt(numberChar[i]);
//		}
//		int sum = 0;
//		for (int i = 0; i < numbers.length; i++) {
//			sum += numbers[i]; 
//		}
//		float whole = (float)sum / (float)numbers.length;
//		System.out.println(whole);
//	}
//
//	private static boolean isPositive(String command) {
//		int number = Integer.parseInt(command);
//		if ( number > 0) {
//			return true;
//		}
//		System.out.println("Please write positive number");
//		return false;
//	}
//
//	private static void reverseNumber(String command) {
//		String[] numberChar = command.split("");
//		for (int i = numberChar.length -1; i >= 0; i--) {
//			System.out.print(numberChar[i]);
//		}
//	}
	
//	public static void main(String[] args) {
//		boolean pass1 = true, pass2 = true;
//		String koeficienti1 = "", koeficienti2 = "";
//		Scanner input = new Scanner(System.in);
//		System.out.println("molia vuvedete stepenta na purvia mnogoclen : ");
//		String stepen1 = input.nextLine();
//		while (pass1) {
//			System.out.println("molia vuvedete koeficientite pred x ( a*x^n + b*x^(n-1) +"
//				+ " .... + c ) kato gi vudete na edin red razdeleni s interval");
//			koeficienti1 = input.nextLine();
//			pass1 = imaLiKoeficienti(stepen1, koeficienti1);
//		}
//		System.out.println("molia vuvedete stepenta na vtoria mnogoclen : ");
//		String stepen2 = input.nextLine();
//		while (pass2) {
//			System.out.println("molia vuvedete koeficientite pred x ( a*x^n + b*x^(n-1) +"
//				+ " .... + c ) kato gi vudete na edin red razdeleni s interval");
//			koeficienti2 = input.nextLine();
//			pass2 = imaLiKoeficienti(stepen2, koeficienti2);
//		}
//		umnojenieNa2Mnogochlena(stepen1, koeficienti1, stepen2, koeficienti2);
//		
//		
//	}
//
//	private static boolean imaLiKoeficienti(String stepen, String koeficienti) {
//		int stepenInt = Integer.parseInt(stepen);
//		String[] koeficientiRazdel = koeficienti.split(" ");
//		if ( stepenInt == koeficientiRazdel.length - 1) {
//			return false;
//		} else {
//			System.out.println(" molia vuvedete veren broi promenlivi : ");
//		}
//		return true;
//	}
//
//	
//	
//	
//	private static void umnojenieNa2Mnogochlena(String stepen1,
//			String koeficienti1, String stepen2, String koeficienti2) {
//		int stepenInt1 = Integer.parseInt(stepen1);
//		String[] koeficientiRazdel1 = koeficienti1.split(" ");
//		double[] koeficientiDouble1 = new double[koeficientiRazdel1.length];
//		for (int i = 0; i < koeficientiDouble1.length; i++) {
//			koeficientiDouble1[i] = Integer.parseInt(koeficientiRazdel1[i]);
//		}
//		int stepenInt2 = Integer.parseInt(stepen2);
//		String[] koeficientiRazdel2 = koeficienti2.split(" ");
//		double[] koeficientiDouble2 = new double[koeficientiRazdel2.length];
//		for (int i = 0; i < koeficientiDouble2.length; i++) {
//			koeficientiDouble2[i] = Integer.parseInt(koeficientiRazdel2[i]);
//		}
//		int tempStepen1 = stepenInt1;
//		int tempStepen2 = stepenInt2;
//		System.out.print("(");
//		for (int i = 0; i < koeficientiDouble1.length; i++) {
//			if ( koeficientiDouble1[i] > 0) {
//				System.out.print("+");
//			}
//			System.out.print(koeficientiDouble1[i] + "x^" + stepenInt1);
//			stepenInt1--;
//		}
//		System.out.print(")");
//		
//		System.out.print("(");
//		for (int i = 0; i < koeficientiDouble2.length; i++) {
//			if ( koeficientiDouble2[i] > 0) {
//				System.out.print("+");
//			}
//			System.out.print(koeficientiDouble2[i] + "x^" + stepenInt2);
//			stepenInt2--;
//		}
//		System.out.print(")");
//		System.out.print(" = ");
//		stepenInt1 = tempStepen1;
//		for (int i = 0; i < koeficientiDouble1.length; i++) {
//			stepenInt2 = tempStepen2;
//			for (int j = 0; j < koeficientiDouble2.length; j++) {
//				if ( koeficientiDouble1[i]*koeficientiDouble2[j] > 0) {
//					System.out.print("+");
//				}
//				System.out.print(koeficientiDouble1[i]*koeficientiDouble2[j] + "x^" +
//						(stepenInt1 + stepenInt2) );
//				stepenInt2--;
//			}
//			stepenInt1--;
//		}
//		
//	}
//	public static void main(String[] args) {
//		Date da = new Date();
//		System.out.println(da);
//		
//		String[] cities = {"aplovdiv", "saara zagora", "sofia" , "karlovo"};
//		for (int i = 0; i < cities.length - 1; i++) {
//			for (int j = i + 1; j < cities.length; j++) {
//				if (cities[i].charAt(0) > cities[j].charAt(0)) {
//					String temp = cities[i];
//					cities[i] = cities[j];
//					cities[j] = temp;
//				}
//				if ((cities[i].charAt(0) == cities[j].charAt(0)) && (cities[i].charAt(1) > cities[j].charAt(1))) {
//					String temp = cities[i];
//					cities[i] = cities[j];
//					cities[j] = temp;
//				}
//			}
//		}
//		for (String string : cities) {
//			System.out.println(string);
//		}
//		
//		
//	}

//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		int n = input.nextInt();
//		System.out.println(fib(n));
		
//		long first = 1;
//		long second = 1;
//		long sum = 0;
//		for (int i = 2; i < n; i++) {
//			sum = first + second ;
//			first = second;
//			second = sum;
//		}
//		System.out.println(sum);
	

//	private static long fib(int n) {
//		if (n <= 2) {
//			return 1;
//		}
//		return fib(n-1) + fib(n-2);
//	}
	
//		long sum = 1;
//		for (int i = 2; i <= n; i++) {
//			sum *= i;
//		}
//		System.out.println(sum);
//		System.out.println(factorial(n));
//	
//	}
//	
//	public static long factorial(int n) {
//		// The bottom of the recursion
//		if (n == 0) {
//			return 1;
//		}
//		// Recursive call: the method calls itself
//		else {
//			return n * factorial(n - 1);
//		}
//	}
//	public static int numberOfLoops;	
//	public static int numberOfIterations;
//	public static int[] loops;
//	
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.print("N = ");
//		numberOfLoops = input.nextInt();
//		System.out.print("K = ");
//		numberOfIterations = input.nextInt();
//		input.close();
//		loops = new int[numberOfLoops];
//		nestedLoops();
//	}
	
//	private static void nestedLoops() {
//		initLoops();
//		int currentPosition;
//		while(true) {
//			printLoops();
//			currentPosition = numberOfLoops - 1;
//			loops[currentPosition] = loops[currentPosition] + 1;
//			while ( loops[currentPosition] > numberOfIterations) {
//				loops[currentPosition] = 1;
//				currentPosition--;
//				if (currentPosition < 0) {
//					return;
//				}
//				loops[currentPosition] = loops[currentPosition] + 1;
//			}
//		}
//		
//	}

//private static void initLoops() {
//		for (int i = 0; i < numberOfLoops; i++) {
//			loops[i] = 1;
//		}
//	}

//	private static void nestedLoops(int currentLoop) {
//		if (currentLoop == numberOfLoops) {
//			printLoops();
//			return;
//		}
//		for (int counter = 1; counter <= numberOfIterations; counter++) {
//			loops[currentLoop] = counter;
//			nestedLoops(currentLoop + 1);
//		}
//		
//	}
//
//	private static void printLoops() {
//		for(int i = 0; i < numberOfLoops; i++) {
//			System.out.printf("%d ", loops[i]);
//		}
//		System.out.println();
//	}
		
//	public static long[] numbers;
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.print("n = ");
//		int n = input.nextInt();
//		numbers = new long[n + 2];
//		numbers[1] = 1;
//		numbers[2] = 1;
//		long result = fib(n);
//		System.out.printf("F%d = %d%n", n, result);
//		input.close();
//	}
//	public static long fib(int n) {
//		if (0 == numbers[n]) {
//			numbers[n] = fib(n - 1) + fib(n - 2);
//		}
//		return numbers[n];
//	}
//	private static char[][] lab = {
//		{' ', ' ', ' ', '*', ' ', ' ', ' '},
//		{'*', '*', ' ', '*', ' ', '*', ' '},
//		{' ', ' ', ' ', ' ', ' ', ' ', ' '},
//		{' ', '*', '*', '*', '*', ' ', ' '},
//		{' ', ' ', ' ', ' ', ' ', ' ', 'е'},
//		};
//	private static char[] path =new char[lab[0].length * lab.length];
//	private static int position = 0;
//	private static boolean noExit = true;
//	private static void findPath(int row, int col, char direction) {
//		if ((col<0) || (row<0) || (col>=lab[0].length) || (row >= lab.length)) {
//			// We are out of the labyrinth
//			return;
//		}
//		// Append the direction to the path
//		path[position] = direction;
//		position++;
//		// Check if we have found the exit
//		if (lab[row][col] == 'е') {
//			printPath(path, 1, position-1);
//			noExit = false;
//		}
//		if (lab[row][col] == ' ') {
//			// The current cell is free. Mark it as visited
//			lab[row][col] = 's';
//			// Invoke recursion the explore all possible directions
//			findPath(row, col-1, 'L'); // left
//			findPath(row-1, col, 'U'); // up
//			findPath(row, col+1, 'R'); // right
//			findPath(row+1, col, 'D'); // down
//			// Mark back the current cell as free
//			lab[row][col] = ' ';
//		}
//	
//		// Remove the direction from the path
//		position--;
//	}
//	
//	private static void printPath(char[] path, int startPos, int endPos) {
//		System.out.print("Found path to the exit: ");
//		for (int pos = startPos; pos<=endPos; pos++) {
//			System.out.print(path[pos]);
//		}
//		System.out.println();
//	}
//	
//	public static void main(String[] args) {
//		findPath(0, 0, 'S');
//		if (path[1] == '\u0000') {
//			System.out.println("empty path");
//		}
//		if (noExit == true) {
//			System.out.println("No exit");
//		}
//
//	}	
	private static char[][] matrix = {
	{'1', '3', '2', '2', '2', '4'},
	{'3', '3', '3', '2', '4', '4'},
	{'4', '3', '1', '2', '3', '3'},
	{'4', '3', '1', '3', '3', '1'},
	{'4', '3', '3', '3', '1', '1'},
	};
	private static char[] number =new char[matrix[0].length * matrix.length];
	private static int position = 0;
	private static void findPath(int row, int col, char direction) {
		number[position] = matrix[row][col];
		if ((col<0) || (row<0) || (col>=matrix[0].length) || (row >= matrix.length)) {
			// We are out of the labyrinth
			return;
		}


		if (matrix[row][col] == number[position]) {
			// The current cell is free. Mark it as visited
			matrix[row][col] = 's';
			// Invoke recursion the explore all possible directions
			findPath(row, col-1, 'L'); // left
			findPath(row-1, col, 'U'); // up
			findPath(row, col+1, 'R'); // right
			findPath(row+1, col, 'D'); // down
			// Mark back the current cell as free
			matrix[row][col] = number[position];
		}
		position++;
		// Remove the direction from the path
		position--;
	}	
	
	public static void main(String[] args) {
		
	}
	
	
	
	
}
