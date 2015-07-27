package introToJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;


//public class MyQuickSort {
	
//	public static void main(String[] args) {
	
		
	
//public class MyMergeSort {

	//public static void main(String[] args) {
		//System.out.println("Good day dude");
		//Declare some variables
		//byte centuries = 20;
		//short years = 100*20;
		//int days = 365*2000;
		//long hours = 365*2000*24;
		//long proba = 0;
		//float floatPI = 3.141592653589793238f;
		//double doublePI = 3.141592653589793238;
		
		//Print the result on the console
		//System.out.println(proba + "  " + centuries + " centuries is " + years + " years, or " + days + " days, or " + hours + " hours.");
		//System.out.println(floatPI + "    " + doublePI);
		//int a = 2;
		//int b = 2;
		//boolean greaterAB = (a > b);
		//boolean equalAB = (a == b);
		//if(greaterAB){
			//System.out.println("A > B");
		//} else {
			//System.out.println("A <= B");
		//}
		//System.out.println("greaterAB = " + greaterAB);
		//System.out.println("equalAB = " + equalAB);
		//char symbol = 'a';
		//System.out.println("koda na simvola '" + symbol + "' e  " + (int) symbol);
		//symbol = 'r';
		//System.out.println("koda na simbola ' " + symbol + "'e " + (int) symbol);
		//symbol = 'R';
		//System.out.println("koda na simbola ' " + symbol + "'e " + (int) symbol);

		//int number = 52132;
		//byte number1 = -112;
		//int number2 = 0x200;
		//byte number3 = 97;
		//boolean isMail = true;
		//System.out.println(number + "\n" + number1 + "\n" + number2 + "\n" + number3 + "\n" + isMail);
		//String word1 = "Hello";
		//String word2 = "World";
		//Object word3 = word1 + " " + word2;
		//System.out.println(word3);
		//String word4 = (String) word3;
		//System.out.println(word4);
		//String word5 = "The " + "\"" + "use" + "\"" + " of quotations causes difficulties.";
		//System.out.println(word5);
		//String word6 = "\"";
		//System.out.println("The " + word6 + "use" + word6 + " of quotations causes difficulties.");
		//System.out.println("    *");
		//System.out.println("   * *");
		//System.out.println("  *   *");
		//System.out.println(" *     *");
		//System.out.println("* * * * *");
		//heart shape
		//System.out.println("    o o   o o");
		//System.out.println("  o    o o    o");
		//System.out.println("   o    o    o");
		//System.out.println("    o       o");
		//System.out.println("     o     o");
		//System.out.println("      o   o");
		//System.out.println("       o o");
		//System.out.println("        o");
		//String firstName = "Boyan";
		//String lastName = "Arnaudov";
		//byte age = 29;
		//char gender = 'M';
		//int id = 25000;
		//int uniqueNumber = 27565000;
		//System.out.println(firstName + " " + lastName + " " + age + " " + gender + " " + id + " " + uniqueNumber);
		//int number10 = 5;
		//int number11 = 10;
		//int switch1 = number11;
		//System.out.println(number10 + " " + number11);
		//number11 = number10;
		//number10 = switch1;
		//System.out.println(number10 + " " + number11);
		/**int number1 = 15;
		int number2 = 27;
		int number3 = 34;
		int rest;
		boolean isEven;
		rest = number1 % 2;
		isEven = (rest == 0);
		if (isEven){
			System.out.println(number1 + " e chetno");
		} else {
			System.out.println(number1 + " e nechetno");
		}
		rest = number2 % 2;
		isEven = (rest == 0);
		if (isEven){
			System.out.println(number2 + " e chetno");
		} else {
			System.out.println(number2 + " e nechetno");
		}
		rest = number3 % 2;
		isEven = (rest == 0);
		if (isEven){
			System.out.println(number3 + " e chetno");
		} else {
			System.out.println(number3 + " e nechetno");
		}
		*/
		/**int number1 = 35*5*7;
		int rest1, rest2;
		boolean deli; // ostatuk
		rest1 = number1 % 5;
		rest2 = number1 % 7;
		deli = ((rest1 == 0) && (rest2 == 0));
		if (deli){
			System.out.println(number1 + " se deli na 5 i 7");
		} else {
			System.out.println(number1 + " ne se deli na 5 i 7");
		}*/
		/**boolean sedem;
		int rest;
		int number = 55747, number1;
		number1 = number / 100; //delia 4isloto na 100
		rest = number1 % 10;
		sedem = (rest == 7);
		if (sedem){
			System.out.println(number + " sudurja 7 kato 3 ta cifra otdiasno naliavo");
		} else {
			System.out.println(number + " ne sudurja 7 kato 3 ta cifra otdiasno naliavo");
		}*/
		
		/**int n = 208;
		int k = 4;
		if ((n & k) == 0){
			System.out.println("na tretia bit 4isloto ima 0");
		}	else{
			System.out.println("na tretia bit 4isloto ima 1");
		}*/
		//pravougulnik
		/**float h = 5.8f;
		float dulgina = 7f;
		float perimeter, lice;
		perimeter = (2 * dulgina) + (2 * h);
		lice = dulgina * h;
		System.out.println(perimeter + " e perimetura");
		System.out.println(lice + "  e liceto");
		*/
		/**lice na trapec
		float a = 5f;
		float b = 8f;
		float h = 3.4f;
		float s = (a+b)*h/2;
		System.out.println(s + "   e   liceto ");
		*/
		/**
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number:");
		double gEarth = input.nextInt();
		double gMoon = gEarth * 0.17;
		System.out.println(gMoon);
		input.close();
		*/
		
		/**Scanner input = new Scanner(System.in);
		System.out.print("Enter X:");
		int x = input.nextInt();
		System.out.print("Enter Y:");
		int y = input.nextInt();
		boolean isPointInCircle = Math.sqrt(x * x + y * y) <= 5;

		input.close();
		System.out.println(isPointInCircle);
		*/
		/**Scanner input = new Scanner(System.in);
		System.out.println("Enter X d e 4 cifreno:");
		int x = input.nextInt();
		System.out.println(x);
		int d = x % 10;
		System.out.println(d);
		x = x / 10;
		int c = x % 10;
		System.out.println(c);
		x = x / 10;
		int b = x % 10;
		System.out.println(b);
		x = x / 10;
		int a = x % 10;
		System.out.println(a);
		int sum = a + b + c + d;
		System.out.println(sum);
		input.close();
		System.out.println(d * 1000 + c * 100 + b * 10 + a);
		*/
		/**Scanner input = new Scanner(System.in);
		System.out.println("chislo ot 1 do 100:");
		int x = input.nextInt();
		input.close();
		boolean isPrime = true;
		for (int divisor = 2; divisor <= Math.sqrt(x); divisor++)
		{
			System.out.println(divisor);
			if (x % divisor == 0)
			{
				System.out.println(divisor);
				isPrime = false;
				break;
			}
		}
		System.out.println(isPrime);
		*/
		/**int sum = 0;
		
		for (int number = 1; number < 1000; number++)
		{
			System.out.println(number);
			if ((number % 3 == 0) || (number % 5 == 0))
			{
				sum = sum + number;
			}			
		}
		System.out.println(sum);
		*/
		/**
		System.out.printf("the time is : %1$tH:%1$tM:%1$tS %n", new java.util.Date());
		long proba = 4435647;
		System.out.printf("%d %n", proba); 
		Date date = new Date();
		System.out.printf(Locale.JAPANESE, "The date in Day/Mont/Year is : %1$tI/%1$tM/%1$tp %n", date); 
		Calendar c = Calendar.getInstance();
		System.out.format("%tB %te, %tY%n", c, c, c);
		// --> "Август 9, 2008"
		System.out.format("%tl:%tM %tp%n" + Locale.getDefault().toString(), c, c, c);
		System.out.printf(Locale.JAPANESE, "The date in Day/Mont/Year is : %1$tB/%1$tm/%1$tY %n", date);
		*/
		/**Scanner input = new Scanner(System.in);
		System.out.print("Napishete 3 chisla: ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		System.out.printf("%d + %d + %d = %d", a, b, c, a + b + c );
		*/
		/**Scanner input = new Scanner(System.in);
		System.out.print("molia napishere radiusa na krug : ");
		int r = input.nextInt();
		System.out.printf("perimetura e %f , liceto e %f", 2 * r * Math.PI, Math.PI * r * r );
		*/
		/**Scanner input = new Scanner(System.in);
		System.out.print("Imeto na firmata e : ");
		String name = input.nextLine();
		System.out.print("Adresa na firmata e : ");
		String address = input.nextLine();
		System.out.print("Telefona na firmata e : ");
		String numberTel = input.nextLine();
		System.out.print("Faksa na firmata e : ");
		String numberFax = input.nextLine();
		System.out.print("web saita na firmata e : ");
		String site = input.nextLine();
		System.out.print("Ime na menadjera na firmata e : ");
		String managerNameFirst = input.nextLine();
		System.out.print("Familia na menadjera na firmata e : ");
		String managerNameLast = input.nextLine();
		System.out.print("Telefona na menadjera na firmata e : ");
		String numberManager = input.nextLine();
		System.out.printf("Firma %s s adres : %s , tel : %s , faks : %s , website : %s " +
		 " Menadjer : %s %s , tel : %s", name, address, numberTel, numberFax, site, 
		 managerNameFirst, managerNameLast, numberManager);
		*/
		/**Scanner input = new Scanner(System.in);
		System.out.print("Napishete dve chisla : ");
		int a = input.nextInt();
		int b = input.nextInt();
		int obshto = 0;
		for (int number = a; number < b; number++){
				if (number % 5 == 0 ){
					obshto++;
					System.out.println(number);
				}	
		}
		System.out.print(obshto);
		*/
		/**
		Scanner input = new Scanner(System.in);
		int a = 0, b = 0;
		System.out.print("Napishete pet chisla : ");
		for (int number = 0; number < 5; number++){
			a = input.nextInt();
			if (b < a){
				b = a;
			}
		}
		System.out.print(b);		
		*/
		/**int sum=0, first = 1, second = 1, third = 0;
		for (int number = 3; number < 100; number++){
			third = first + second;
			System.out.println(number + "  " + third);
			if (third % 2 == 0){
				sum = sum + third;
			}
			first = second;
			second = third;
			if (first + second >= 4E6){
				break;
			}
		}
		System.out.println(sum);
		*/
		/**int a = 9, b = 7;
		boolean c = (a/b != 0);
		boolean d = (a-b != 0);
		if (!c) // if a is less than b then division result will be zero.
			{
			System.out.println(" b is greater than a");
			}
		else {
			if (!d) // we know a is greater than or equal to b now. check whether they are equal.
			{
				System.out.println("a and b are equal");
			}
			else {
				System.out.println("a is greater than b");
			}
		
		}
		*/
		/**int a = 15, b = 3;
		if (a > b){
			a=a-b;
			b=b+a;
			a=b-a;
			System.out.printf("a e po goliamo ot b i sled zamestvane a = %d i b = %d %n", a, b );
		} else {
			System.out.println("b e po goliamo ot a i 4islata ne se zamestvat");
		}
		*/
		/**Scanner input = new Scanner(System.in);
		System.out.println("napishete 2 4isla realni na 2 reda");
		float a = input.nextFloat();
		float b = input.nextFloat();
		if (((a > 0) && (b > 0))||((a < 0)&&(b < 0))){
			System.out.println("znaka na 4astnoto e plus");
		} else {
			System.out.println("znaka na 4astnoto e minus");
		}*/
		/**Scanner input = new Scanner(System.in);
		System.out.println("napishete 3 4isla na 3 reda");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		if (a > b){
			if (a > c){
				System.out.println("nai goliamoto chislo e " + a);
			} else {
				System.out.println("nai goliamoto chislo e " + c);
			}
		} else {
			if (b > c){
				System.out.println("nai goliamoto chislo e " + b);
			} else {
				System.out.println("nai goliamoto chislo e " + c);
			}
		}*/
		/**Scanner input = new Scanner(System.in);
		System.out.println("napishete 4islo ot 0 do 9");
		int a = input.nextInt();
		switch (a){
			case 0 : System.out.println("нула");break;
			case 1 : System.out.println("едно");break;
			case 2 : System.out.println("две");break;
			case 3 : System.out.println("три");break;
			case 4 : System.out.println("четири");break;
			case 5 : System.out.println("пет");break;
			case 6 : System.out.println("шест");break;
			case 7 : System.out.println("седем");break;
			case 8 : System.out.println("осем");break;
			case 9 : System.out.println("девет");break;
			default: System.out.println("greshno chislo");
		}*/
		/**Scanner input = new Scanner(System.in);
		System.out.println("napishete a b i c za kvadratno uravnenie");
		double a = input.nextFloat();
		double b = input.nextFloat();
		double c = input.nextFloat();
		double d = Math.pow(b, 2) - 4*a*c;
		if (d > 0){
			System.out.println("edinia realen koren e " + ((-b+Math.sqrt(d))/(2*a)));
			System.out.println("drugia realen koren e " + ((-b-Math.sqrt(d))/(2*a)));
		} else {
			if (d == 0){
				System.out.println("edinstvenia koren e " + -b/(2*a));
			} else {
				System.out.println("niama realni koreni");
			}
		}*/
		/**Scanner input = new Scanner(System.in);
		System.out.println("napishete 5 chisla za sravnenie");
		double max = Double.MIN_VALUE;
		for (int i = 0; i < 5; i++){
			double a = input.nextDouble();
			if (a > max){
				max = a;
			}
		}
		System.out.println("nai goliamoto 4islo e " + max);
		*/
		/**int a = -3, b = 1, c = 3;
		if ( (a + b) == 0 ){
			System.out.printf("{%1$d,%2$d} e podmnojestvo na {%1$d,%2$d,%3$d}%n", a, b, c);
		} else{
			if ((a + c) == 0){
				System.out.printf("{%1$d,%3$d} e podmnojestvo na {%1$d,%2$d,%3$d}%n", a, b, c);
			} else {
				if ( (b + c) == 0){
					System.out.printf("{%2$d,%3$d} e podmnojestvo na {%1$d,%2$d,%3$d} %n", a, b, c);
				} else{
					System.out.printf("niama podmnojestvo na {%1$d,%2$d,%3$d}", a, b, c);
				}
			}
		}*/
		/**Scanner input = new Scanner(System.in);
		System.out.println("napishete 4islo ot 1 do 9");
		int a = input.nextInt();
		switch (a){
			case 1 : System.out.println("tochkite stavat " + a * 10 );break;
			case 2 : System.out.println("tochkite stavat " + a * 10 );break;
			case 3 : System.out.println("tochkite stavat " + a * 10 );break;
			case 4 : System.out.println("tochkite stavat " + a * 100 );break;
			case 5 : System.out.println("tochkite stavat " + a * 100 );break;
			case 6 : System.out.println("tochkite stavat " + a * 100 );break;
			case 7 : System.out.println("tochkite stavat " + a * 1000 );break;
			case 8 : System.out.println("tochkite stavat " + a * 1000 );break;
			case 9 : System.out.println("tochkite stavat " + a * 1000 );break;
			default: System.out.println("greshno chislo");
		}*/
		
		/**Scanner input = new Scanner(System.in);
		System.out.println("napishete 4islo ot 0 do 999");
		int number = input.nextInt();
		if ((number < 0)||(number > 999)) {
			System.out.println("greshno vuvedeno chislo");
		} else {
			
			String n1 = "едно";
			String n2 = "две";
			String n3 = "три";
			String n4 = "четири";
			String n5 = "пет";
			String n6 = "шест";
			String n7 = "седем";
			String n8 = "осем";
			String n9 = "девет";
			String n10 = "десет ";
			String na = "на";
			String n11 = "еди" + na + n10;
			String n12 = "два" + na + n10;
			String n13 = n3 + na + n10;
			String n14 = n4 + na + n10;
			String n15 = n5 + na + n10;
			String n16 = n6 + na + n10;
			String n17 = n7 + na + n10;
			String n18 = n8 + na + n10;
			String n19 = n9 + na + n10;
			String sto = "стотин ";
			int stotici = number / 100;
			int desetici = (number - stotici * 100) / 10;
			int edinici = number - stotici * 100 - desetici * 10;
			switch (stotici) {
				case 1: System.out.print("сто "); break;
				case 2: System.out.print(n2 + "ста "); break;
				case 3: System.out.print(n3 + "ста "); break; 
				case 4: System.out.print(n4 + sto); break;
				case 5: System.out.print(n5 + sto); break;
				case 6: System.out.print(n6 + sto); break; 
				case 7: System.out.print(n7 + sto); break; 
				case 8: System.out.print(n8 + sto); break; 
				case 9: System.out.print(n9 + sto); break; 
			}
			if (desetici != 0){
				if (((desetici == 1) || (edinici == 0)) && (number > 100)){
					System.out.print("и ");
				}
			}
			switch (desetici) {
				case 1: switch (number - stotici * 100){
					case 10: System.out.print(n10); break;
					case 11: System.out.print(n11); break;
					case 12: System.out.print(n12); break;
					case 13: System.out.print(n13); break;
					case 14: System.out.print(n14); break;
					case 15: System.out.print(n15); break;
					case 16: System.out.print(n16); break;
					case 17: System.out.print(n17); break;
					case 18: System.out.print(n18); break;
					case 19: System.out.print(n19); break;
				}; break;
				case 2: System.out.print("два" + n10); break;
				case 3: System.out.print(n3 + n10); break; 
				case 4: System.out.print(n4 + n10); break;
				case 5: System.out.print(n5 + n10); break;
				case 6: System.out.print(n6 + n10); break; 
				case 7: System.out.print(n7 + n10); break; 
				case 8: System.out.print(n8 + n10); break; 
				case 9: System.out.print(n9 + n10); break; 
			}
			if ((edinici != 0) && (desetici != 1) && (number > 10)){
				System.out.print("и ");
			}
			if (desetici != 1){
				switch (edinici) {
					case 1: System.out.print(n1); break;
					case 2: System.out.print(n2); break;
					case 3: System.out.print(n3); break;
					case 4: System.out.print(n4); break;
					case 5: System.out.print(n5); break;
					case 6: System.out.print(n6); break;
					case 7: System.out.print(n7); break; 
					case 8: System.out.print(n8); break;
					case 9: System.out.print(n9); break;
				}
			}
			if (number == 0){
				System.out.print("нула");
			}
		}*/
		
		/**long num = 600851475143l;
		long delitel = 1;
		
		while (delitel <= num){
			delitel++;
			if ( num % delitel == 0){
				num = num / delitel;
				System.out.println(delitel);
			}
		}
		System.out.printf("nai golemia prost delitel e : %d" ,delitel);
		*/
		/**int n = 1;
		int maxN = 100;
		int sumOfSquares = 0;
		int squareOfSum = 0;
		int difference = 0;
		
		for ( n = 1; n <= maxN; n++ ){
			sumOfSquares += n*n;
			squareOfSum += n;
		}
		squareOfSum *= squareOfSum;
		difference = squareOfSum - sumOfSquares;
		System.out.printf("%d  -  %d  =  %d", squareOfSum, sumOfSquares, difference);
		*/
		
	/**private static final String AND = " и ";
	private static final String SPACE = " ";
	private static final String VOID = "";
	private static final String ZERO = "нула";

	private static final String UNITS[] = {
			VOID, "едно", "две", "три", "четири",
			"пет", "шест", "седем", "осем", "девет"};
	private static final String UNITS_TEN_TO_TWENTY[] = {
			"десет", "единадесет", "дванадесет", "тринадесет", "четиринадесет",
			"петнадесет", "шестнадесет", "седемнадесет", "осемнадесет", "деветнадесет"};
	private static final String TENTHS[] = {VOID, VOID, "двадесет", "тридесет", "четиридесет", "петдесет",
			"шестдесет", "седемдесет", "осемдесет", "деветдесет"};
	private static final String HUNDREDS[] = {VOID, "сто", "двеста", "триста", "четиристотин", "петстотин",
			"шестстотин", "седемстотин", "осемстотин", "деветстотин"};


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("vuvedete chislo");
		int i = input.nextInt();
		//for (int i = 0; i < 1000; i++) {
			System.out.println(print(i));
		//}
	}

	public static String print(final int number) {
		if (number < 0 || number > 999) {
			throw new IllegalArgumentException("Number " + number + " must be in [0;999]");
		}

		final int hundreds = number / 100;
		final int tenthsAndUnits = number % 100;
		final int units = tenthsAndUnits % 10;
		final int tents = tenthsAndUnits / 10;
		final boolean isToTwenty = tenthsAndUnits < 20;
		final boolean isToTen = tenthsAndUnits < 10;

		boolean isAndUsed = false;
		String result;
		if (isToTen) {
			result = UNITS[units];
		} else if (isToTwenty) {
			result = UNITS_TEN_TO_TWENTY[units];
		} else {
			String tmpUnits = UNITS[units];
			String tmpTents = TENTHS[tents];
			isAndUsed = !tmpUnits.isEmpty() && !tmpTents.isEmpty();
			result = tmpTents + (isAndUsed ? AND : VOID) + tmpUnits;
		}
		String tmpHundreds = HUNDREDS[hundreds];

		result = tmpHundreds.isEmpty() ? result : result.isEmpty() ? tmpHundreds :
				(tmpHundreds + (isAndUsed ? SPACE : AND) + result);

		return result.isEmpty() ? ZERO : result;
	}*/

		/*for (int i1 = 1; i1 <= 44; i1++)
			for (int i2 = i1 + 1; i2 <= 45; i2++)
			for (int i3 = i2 + 1; i3 <= 46; i3++)
			for (int i4 = i3 + 1; i4 <= 47; i4++)
			for (int i5 = i4 + 1; i5 <= 48; i5++)
			for (int i6 = i5 + 1; i6 <= 49; i6++)
			System.out.printf(
			"%d %d %d %d %d %d%n",
			i1, i2, i3, i4, i5, i6);
	*/
	//Scanner input = new Scanner(System.in);
	//System.out.println("napishete broi chisla : ");
	/*String[] karti = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "vale", "dama", "pop" , "aso"};
	for (int k = 0; k < 4; k++){
		for (String i : karti){
		System.out.printf("%s " , i);
		}
		switch (k){
		case 0 : System.out.println("kupa");break;
		case 1 : System.out.println("karo");break;
		case 2 : System.out.println("pika");break;
		case 3 : System.out.println("spatia");break;
		}
		System.out.println();
	}*/
		/*Scanner input = new Scanner(System.in);
		System.out.println("vuvedete chislo ");
		int n = input.nextInt();
		int sum=1, first = 0, second = 1, third = 0;
		for (int number = 2; number < n; number++){
			third = first + second;
			System.out.println(number + "  " + third);
			first = second;
			second = third;
			sum += third;
		}
		System.out.println(sum);	
		*/
		
		/*long n = 20, k = 3;
		long faktN = 1;
		for (int i =(int) n ; i > k; i-- ){
			faktN *= i;
		}
		System.out.println(faktN);
		
		
		long p = 20, z = 3;
		long faktP = 1, faktZ = 1;
		for (long i = p; i > 0; i--){
			faktP *= i;
		}
		for (long i = z; i > 0; i--){
			faktZ *= i;
		}
		System.out.println(faktP);
		System.out.println(faktZ);
		System.out.println(faktP/faktZ);
		*/
		
       /* for (int i = 1; i < 255; i++){
        	for ( int n = 1; n < 255; n++){
        		String ip = "94.190." + i + "." + n;
        		String pingCmd = "ping " + ip + " -n 1";
        		try {
        			Runtime r = Runtime.getRuntime();
        			Process p = r.exec(pingCmd);
        			BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
        			String inputLine;
        			while ((inputLine = in.readLine()) != null) {
        				System.out.println(inputLine);
        			}
        			in.close();
        		} catch (IOException e) {
        			System.out.println(e);
        		}
        	}
        }  */
		
		/*long n = 9, k = 5, nMinusK = n - k;
		long faktN = 1, faktK = 1, faktNMinusK = 1, faktLesno = 1;
		for (long i = n; i > 0; i--){
			faktN *= i;
		}
		for (long i = k; i > 0; i--){
			faktK *= i;
		}
		for (long i = nMinusK; i > 0; i--){
			faktNMinusK *= i;
		}
		
		for (long i = n; i > k - 1; i--){
			faktLesno *= i;
		}
		System.out.println(faktN);
		System.out.println(faktK);
		System.out.println(faktNMinusK);
		System.out.print(faktN * faktK / faktNMinusK);
		System.out.println("," + faktN * faktK % faktNMinusK);
		System.out.println(faktLesno * faktK);
		*/
		/*double sum1 = 0d, xN = 1d, x = 3d, fackN = 1d, k = 1d;
		long n = 4;
		for (long i = n - 1; i >= 0; i-- ){
			fackN *= k; 
			sum1 += Math.pow(x, i) * fackN;
			k++;
			System.out.println(sum1 + "  " + k);
		}
		xN = Math.pow(x, n);
		sum1 += xN;
		System.out.println(sum1/xN);*/
		/*long n = 10, fackt1 = 1, fackt2 = 1;
		for (int i = (int) (2 * n); i > 0; i--){
			fackt1 *= (long) i;
		}
		for (int i = (int) n; i > 0; i--){
			fackt2 *= i;
		}
		System.out.println(fackt1/(fackt2 * fackt2 * (n+1)));
		*/
		
		/*Scanner input = new Scanner(System.in);
		int n = input.nextInt(), k = n;
		if ((n < 20)||(n > 0)){
			for (int i = 0; i < n; i++){
				for (int i1 = i + 1; i1 <= k; i1++ ){
					System.out.print(i1 + " ");
				}
				k++;
				System.out.printf("%n");
			}
		} else {
			System.out.println("greshka , chisloto triabva da mejdu 0 i 20");
		}
		*/
		/*long fackt = 1;
		int nuli = 0;
		for (int i = 1; i < 21; i++){
			fackt *= i;
			System.out.println(fackt);
			nuli = 0;
			for (long i1 = 10; i1 < 1000000; i1 *= 10 ){
				if ( fackt % i1 == 0){
					nuli++;
				}
			}
			System.out.println(nuli);
		}*/
		
		/*long x = 205;
		long dvoichno = 0;
		for (long i = 1; i < 1000000000; i *= 10 ){
			if ( x % 2 == 1){
				dvoichno += 1 * i ;
			}
			x /= 2;
		}
		System.out.println(dvoichno);
		
		long step = 0, chislo = 0;
		int i = 1;
		while (dvoichno != 0){
			chislo  += (dvoichno % 10) * Math.pow(2, step);
			dvoichno /= 10;
			System.out.println(i + " suma " + chislo);
			step++;
			i++;
		}
		System.out.println(chislo);
		*/
		/*char bukva = '0', b1 = '0', b2 = '0', b3 = '0', b4 = '0', b5 = '0', b6 = '0', b7 = '0', b8 = '0', b9 = '0';
		int x = 2050; 
		int ostatuk = 0, i = 1;
		
		while ( x != 0){
			ostatuk = x % 16;
			System.out.println(ostatuk);
			switch (ostatuk){
			case 0 : bukva = '0';break;
			case 1 : bukva = '1';break;
			case 2 : bukva = '2';break;
			case 3 : bukva = '3';break;
			case 4 : bukva = '4';break;
			case 5 : bukva = '5';break;
			case 6 : bukva = '6';break;
			case 7 : bukva = '7';break;
			case 8 : bukva = '8';break;
			case 9 : bukva = '9';break;
			case 10: bukva = 'A';break;
			case 11: bukva = 'B';break;
			case 12: bukva = 'C';break;
			case 13: bukva = 'D';break;
			case 14: bukva = 'E';break;
			case 15: bukva = 'F';break;
			}
			switch (i){
			case 1 : b1 = bukva;break;
			case 2 : b2 = bukva;break;
			case 3 : b3 = bukva;break;
			case 4 : b4 = bukva;break;
			case 5 : b5 = bukva;break;
			case 6 : b6 = bukva;break;
			case 7 : b7 = bukva;break;
			case 8 : b8 = bukva;break;
			case 9 : b9 = bukva;break;
			}
			x /= 16;
			i++;
		}
		System.out.println(b9 + "" + b8 + b7 + b6 + b5 + b4 + b3 + b2 + b1);
		int bN1 = 0, bN2 = 0, bN3 = 0, bN4 = 0,bN5 = 0, bN6=0,bN7=0,bN8=0,bN9=0,bN10=0,bN11=0,bN12=0,bN13=0,bN14=0,bN15=0;
		int step = 0, chislo = 0;
		if (b1 == '0'){
			bN1 = 0;
			chislo  += bN1 * Math.pow(16, 0);
		}
		if (b1 == '1'){
			bN1 = 1;
			chislo  += bN1 * Math.pow(16, 0);
		}
		if (b1 == '2'){
			bN1 = 2;
			chislo  += bN1 * Math.pow(16, 0);
		}
		System.out.println(chislo);
		*/
		/*Random chislo = new Random();
		int p = chislo.nextInt(100);
		System.out.println(p);
		*/
		
		/*
		int x = 150006;
		String res = "";
		while ( x != 0) {
			int c = x % 16;
			res = (char)(c >= 10 ? 'a' + c - 10 : c + '0') + res;
			x /= 16;
			}
		res = res.isEmpty() ? "0" : res;
		System.out.println(res);
		*/
		
		/*String res = "2050";
		int l = res.length();
		int y = 0, stepen = 1;
		
		for (int i = 0; i < l; i++) {
			
			y += stepen * ((int) res.charAt(Math.abs(i-l+1)) >= 96 ? 
					(int) res.charAt(Math.abs(i-l+1)) - 87 : 
						(int) res.charAt(Math.abs(i-l+1)) - 48) ;
			stepen *= 16;
		}
		System.out.println(y);*/
		
		

		/*
		
		Long startTime = System.currentTimeMillis();

		for (int i = 0x0; i <= 10_000_000; i++) {
			String hex = Integer.toHexString(i).toLowerCase();
			int y = -1;
			try {
				y = convertBoian1(hex);
			} catch (Exception e) {
				System.out.println("e.getMessage() = " + e.getMessage());
			}
			if (y != i) {
				System.out.println("Failed!");
				return;
			}
		}
		System.out.println("OrderDone for " + (System.currentTimeMillis() - startTime) + " ms");
	}
			*/

/*
		private static int convertBoian1(String res) {
			int l = res.length();
			int y = 0, stepen = 1;
			for (int i = 0; i < l; i++) {
				y += stepen * ((int) res.charAt(Math.abs(i-l+1)) >= 96 ?
						((int) res.charAt(Math.abs(i-l+1))) - 87 :
							((int) res.charAt(Math.abs(i-l+1))) - 48) ;
				stepen *= 16;
			}
			return y;
		}

		private static int convertBoian2(String res) {
			int y = 0;
			final int lowCaseDif = 'a' - 0xa;
			final int upCaseDif = 'A' - 0xA;
			for (int i = res.length() - 1, pow = 1; i >= 0; i--, pow *= 0x10) {
				int c = res.charAt(i);
				if (c >= '0' && c <= '9') {
					y += pow * (c - '0');
				} else if (c >= 'a' && c <= 'f') {
							y += pow * (c - lowCaseDif);
						} else if (c >= 'A' && c <= 'F') {
									y += pow * (c - upCaseDif);
								} else {
									throw new IllegalArgumentException("Invalid char: " + (char)c);
								}
						}
						return y;
				}
			
		*/
		
		/*
			int l = res.length();
			int y = 0, stepen = 1;
			for (int i = 0; i < l; i++) {
				y += stepen * ((int) res.charAt(Math.abs(i-l+1)) >= 96 ?
						((int) res.charAt(Math.abs(i-l+1))) - 87 :
							((int) res.charAt(Math.abs(i-l+1))) - 48) ;
				stepen *= 16;
			}
			System.out.println(y);
		*/
		
		/*
		int[] deliteli = new int[19];
		for ( int i1 = 2520*11*13; i1 <= Integer.MAX_VALUE; i1 += (2520*11*13))	{
			int daToE = 1;
			for (int k = 0; k < 19; k++) {
				deliteli[k] = 0;
			}
			for ( int i2 = 2; i2 <= 20; i2++)	{
				if (i1 % i2 == 0) {
					deliteli[i2-2] = 1;
				}
				daToE *= deliteli[i2-2];
			}
			if ( daToE == 1) {
				System.out.println(i1);
				break;
			}
		}*/
		
		/*
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		if (n != m) {
			System.out.println("razlichni sa goleminite na masivite");
		} else {
			int[] array1 = new int[n];
			int[] array2 = new int[m];
			System.out.println("vuvedete purvia masiv ");
			for (int i = 0; i < n; i++) {
				array1[i] = input.nextInt(); 
			}
			System.out.println("vuvedete vtoria masiv ");
			for (int i = 0; i < m; i++) {
				array2[i] = input.nextInt(); 
			}
			System.out.println(Arrays.toString(array1));
			System.out.println(Arrays.toString(array2));
			long startTime = System.currentTimeMillis();
			for (int i = 0; i < n; i++) {
				if ( array1[i] != array2[i]) {
					System.out.println("masivite sa razlichni");
					break;
				}
				if ( i == n -1) {
					System.out.println("masivite sa ednakvi");
				}
			}
			
			System.out.println("Order Done for " + (System.currentTimeMillis() - startTime) + " ms");
		}*/
		
/*
		int length = 0;
		char[] array1 = {'a', '5','g'};
		char[] array2 = {'a', '5','g','t'};
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		if ( array1.length <= array2.length ) {
			length = array1.length;
		} else {
			length = array2.length;
		}
		for (int i = 0; i < length; i++) {
			if ( (int) array1[i] > (int) array2[i]) {
				System.out.println("vtoria e predi purvia");
				break;
			}
			if ( (int) array1[i] < (int) array2[i]) {
				System.out.println("purvia e predi vtoria");
				break;
			}
			if ( i == length -1) {
				if ( array1.length < array2.length ) {
					System.out.println("purvia e predi vtoria");
				}
				if (array1.length > array2.length) {
					System.out.println("vtoria e predi purvia");
				}
				if (array1.length == array2.length) {
					System.out.println("masivite sa ednakvi");
				}
				
			}
		}*/
		/*
		int[] array = {3, 4, 5, 6, 7, 3, 2, 4, 4,1,2,3,3,5,6,7,8, 2, 2};
		int n = array.length, len = 1, bestlen = 0, elem = 0;
		for (int i = 0; i < n - 1; i++) {			
			if ( array[i] == array[i+1] - 1) {
				len++;
			} 
			if ( array[i] != array[i+1] - 1) {
				len = 1;
			}
			if ( len > bestlen) {
				bestlen = len;
				elem = array[i+1] - len + 1;
			}
		}
		System.out.print("{");
		for ( int i = 0 ; i < bestlen ; i++) {
				System.out.print(elem + i);
				if ( i < bestlen -1) {
					System.out.print(", ");
				}
		}
		System.out.print("}");*/
		/*
		int bestArray = Integer.MIN_VALUE, sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete broia na elementite v masiva :");
		int n = input.nextInt();
		System.out.println("Vuvedete broi elementi koito da se sumirat :");
		int k = input.nextInt();
		int[] array = new int[n];
		int[] arraySort = new int[n];
		System.out.println("Vuvedete chislata v masiva :");
		for (int i = 0; i < n; i++ ) {
			array[i] = input.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for ( int i1 = 0; i1 < n; i1++) {
				if (array[i1] >= bestArray) {
					bestArray = array[i1];
				}
			}
			for (int i1 = 0; i1 < n; i1++) {
				if ( array[i1] == bestArray) {
					array[i1] = Integer.MIN_VALUE;
					break;
				}
			}
			arraySort[i] = bestArray;
			bestArray = Integer.MIN_VALUE;
		}
		
		/*for (int i = 0; i < k; i++) {
			for ( int i1 = 0; i1 < n; i1++) {
				if (array[i1] >= bestArray) {
					bestArray = array[i1];
				}
			}
			for (int i1 = 0; i1 < n; i1++) {
				if ( array[i1] == bestArray) {
					array[i1] = Integer.MIN_VALUE;
					break;
				}
			}
			sum += bestArray;
			System.out.println(bestArray);
			bestArray = Integer.MIN_VALUE;
		}
		for ( int i = 0; i < k; i++) {
			sum += arraySort[i];
		}
		System.out.println(sum);
		
		*/
		/*int link = 0, n = 0;
		int[] array = {3, 4, 5, 6, 7, 3, 2, 4, 4,1,2,3,3,5,6,7,8, 2, 2};
		while ( n != array.length) {
			for (int i = n; i < array.length - 1; i++ ) {
				if ( array[n] >= array[i+1]) {
					link = array[n];
					array[n] = array[i+1];
					array[i+1] = link;
				}
			}
			n++;
		}
		for ( int ar : array) {
			System.out.println(ar);
		}*/
		/*
		int[] array = {3, 4, 5, 6, 7, 3, 2, 4, 4,7,7,7,7,7,7,7,7,1,2,3,3,5,6,7,8, 2, 2};
		int switch1 = 0, len = 1, bestlen = 0, elem = 0;
		for (int i = 0; i < array.length -1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if ( array[i] > array[j]) {
					switch1 = array[i];
                	array[i] = array[j];
                	array[j] = switch1;
				}
			}
		}
		for ( int ar : array) {
			System.out.println(ar);
		}
		
		for (int i = 0; i < array.length - 1; i++) {			
				if ( array[i] == array[i+1]) {
					len++;
				} 
				if ( array[i] != array[i+1]) {
					len = 1;
				}
				if ( len > bestlen) {
					bestlen = len;
					elem = array[i];
				}
		}
		System.out.print("{");
			for ( int i = 0 ; i < bestlen ; i++) {
					System.out.print(elem);
					if ( i < bestlen -1) {
						System.out.print(", ");
					}
			}
			System.out.print("}"+ bestlen + " puti se sreshta " + elem);
		*/
		
		/*int[] array = {3, 4, 50, 10, 1,2,3, 7, 2, 2, 4, 4,7,7,7,7,7,7, 2, 2};
		int len = 1, suma = 0, sum = 0;
		boolean ima = false;
		Scanner input = new Scanner(System.in);
		suma = input.nextInt();
		for (int i = 0; i < array.length; i++) {
			for (int i1 = i; i1 < array.length; i1++) {
				sum += array[i1];
				if ( sum == suma ) {
					for ( int i2 = i1 - len; i2 < i1; i2++) {
					System.out.print(array[i2+1] + " ");
					}
					break;
				} 
				if ( sum  <= suma) {
					len++;
				}
				if ( sum > suma) {
					sum = 0;
					len = 1;
					break;
				}
			}
			if ( sum == suma ) {
				ima = true;
				break;
			}
		}	
		if ( ima == false) {
			System.out.println("niama takava suma");
		}*/
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("Vuvedete broia na redovete na matrica :");
		int n = input.nextInt();
		System.out.println("Vuvedete broia na kolonite na matrica :");
		int k = input.nextInt();
		int[][] matrix = new int[n][k];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				System.out.println("matrix[" + row + "][" + col + "] =");
				matrix[row][col] = input.nextInt();
			}
		}
		long startTime = System.currentTimeMillis();
		int bestSum = Integer.MIN_VALUE;
		int bestRow = 0;
		int bestCol = 0;
		for (int row = 0; row < matrix.length - 2; row++) {
			for (int col = 0; col < matrix[0].length - 2; col++) {
				int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2]
				+ matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2]
				+ matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];
				if (sum > bestSum) {
					bestSum = sum;
					bestRow = row;
					bestCol = col;
				}
			}
		}
		*/
		
		
		/*int numConcentricSquares = (int)Math.ceil(n / 2.0);
        int j;
        int sideLen = n;
        int currNum = 0;

        for (int i = 0; i < numConcentricSquares; i++) {
            // do left side
            for (j = 0; j < sideLen; j++) {
                matrix[i + j][i] = ++currNum;
            }
            // do bottom side
            for (j = 1; j < sideLen - 1; j++) {
                matrix[n - 1 - i][i + j] = ++currNum;
            }
            // do right side
            for (j = sideLen - 1; j > 0; j--) {
                matrix[i + j][n - 1 - i] = ++currNum;
            }
            // do top side
            for (j = sideLen - 1; j > 0; j--) {
                matrix[i][i + j] = ++currNum;
            }
            sideLen -= 2;
        }*/
		
		
		/*for ( int i = 0; i < n; i++) {
			matrix[i][0] += k;
			k++;
		}
		for (int i = 1; i < n; i++) {
			matrix[n-1][i] += k;
			k++;
		}
		for ( int i = n-2; i >= 0; i--) {
			matrix[i][n-1] += k;
			k++;
		}
		for ( int i = n-2; i > 0; i--) {
			matrix[0][i] += k;
			k++;
		}
		for ( int i = 1; i <= n-2; i++) {
			matrix[i][1] += k;
			k++;
		}
		for (int i = 2; i <= n -2; i++) {
			matrix[n-2][i] += k;
			k++;
		}
		for ( int i = n-3; i >= 1; i--) {
			matrix[i][n-2] += k;
			k++;
		}*/
		
		
		
		
		
		/*matrix[n-1][0] = k;
	    for (int row = n - 2; row >= 0; row--) {
	    	matrix[row][0] = matrix[row + 1][0] + k;
	        int newRow = row;
	        for (int diagonal = 1; diagonal <= k; diagonal++) {
	           matrix[newRow + 1][diagonal] = matrix[newRow][diagonal - 1] + 1;
	           newRow++;
	        }
	        k++;
	    }
	    matrix[0][n - 1] = n * n;
        int diagonalLength = 2;
        int posX = 1;
        int posY = n - 1;
        int prevX = 0;
        int prevY = n - 1;

        for (int i = 1; i < k - 1; i++) {
            for (int j = 1; j <= diagonalLength; j++) {
                matrix[posX][posY] = matrix[prevX][prevY] - 1;
                prevX = posX;
                prevY = posY;
                posX--;
                posY--;
            }
            diagonalLength++;
            posX = i + 1;
            posY = n - 1;
        }*/
			
			
		/*for (int i = 0; i < matrix.length; i++) {
			if ( i % 2 == 0 ) {
				for (int j = 0; j < matrix.length; j++) {
					matrix[j][i] += k; 
					k++;
				}
			}
			if ( i % 2 == 1 ) {
				for (int j = matrix.length - 1; j >= 0; j--) {
					matrix[j][i] += k; 
					k++;
				}
			}	
			
		}*/
		/*
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				System.out.printf("%d ", matrix[row][col]);
			}
			System.out.println();
		}
		System.out.println("Order Done for " + (System.currentTimeMillis() - startTime) + " ms");
		
		System.out.println("The best platform is:");
		System.out.printf(" %d %d %d%n",
				matrix[bestRow][bestCol],
				matrix[bestRow][bestCol + 1],matrix[bestRow][bestCol + 2]);
		System.out.printf(" %d %d %d%n",
				matrix[bestRow + 1][bestCol],
				matrix[bestRow + 1][bestCol + 1],matrix[bestRow + 1][bestCol + 2]);
		System.out.printf(" %d %d %d%n",
				matrix[bestRow + 2][bestCol],
				matrix[bestRow + 2][bestCol + 1],matrix[bestRow + 2][bestCol + 2]);
		System.out.printf("The maximal sum is: %d%n", bestSum);
		*/
		/*int n = 26;
		char[] alphabet = new char[n];
		for (int i = 0; i < n; i++) {
			alphabet[i] = (char) (97 + i);
		}
		for (int i = 0; i < n; i++) {
			System.out.print(alphabet[i] + " ");
		}
		String word;
		Scanner input = new Scanner(System.in);
		System.out.println("\nnapishete duma : ");
		word = input.nextLine();
		System.out.println(word);
		for (int i = 0;i < word.length(); i++){
		    System.out.println(word.charAt(i) + " - " + (int)word.charAt(i));
		    System.out.println((int)word.charAt(i) - (int) 'A');
		}
		*/
		/*
		int[] array = { 5, 7, 25, 31, 6, 10, 452, 8 };
	    for (int i = 0; i < array.length - 1; i++) {
	    	for (int j = i + 1; j < array.length; j++) {
	    		if (array[i] > array[j]) {
	               int tmp = array[i];
	               array[i] = array[j];
	               array[j] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
        	System.out.print(array[i] + " ");
	    }
        Scanner input = new Scanner(System.in);
		System.out.println("\nnapishete chislo za tursene v masiva : ");
		int number = input.nextInt();
		int right = array.length - 1;
		int left = 0;
        while ( left <= right ) {
        	int middle = (left + right) / 2;
        	if ( number == array[middle]) {
        		System.out.println(array[middle] + " e na miasto " + middle + " v masiva.");
        		break;
        	} else if ( number > array[middle]) {
        		left = middle + 1;
        	} else {
        		right = middle - 1;
        	}
        	if (left > right) {
        		System.out.println("ne e namereno");
        		break;
        	}
        }*/
		/*private int[] inputArr;
		private int[] tempMergArr;
		private int length;
		private int[] array;
		
	public static void main(String a[]){
		int[] inputArr = { 5, 7, 31, 25, 10, 6, 452, 8, 7 };
		 MyMergeSort mms = new MyMergeSort();
	     mms.sort(inputArr);
	     for(int i:inputArr){
	        System.out.print(i);
	        System.out.print(" ");
	     }
	}
	
	public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }

	 private void doMergeSort(int lowerIndex, int higherIndex) {
         
	        if (lowerIndex < higherIndex) {
	            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
	            // Below step sorts the left side of the array
	            doMergeSort(lowerIndex, middle);
	            // Below step sorts the right side of the array
	            doMergeSort(middle + 1, higherIndex);
	            // Now merge both sides
	            mergeParts(lowerIndex, middle, higherIndex);
	        }
	    }
	 
	    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
	 
	        for (int i = lowerIndex; i <= higherIndex; i++) {
	            tempMergArr[i] = array[i];
	        }
	        int i = lowerIndex;
	        int j = middle + 1;
	        int k = lowerIndex;
	        while (i <= middle && j <= higherIndex) {
	            if (tempMergArr[i] <= tempMergArr[j]) {
	                array[k] = tempMergArr[i];
	                i++;
	            } else {
	                array[k] = tempMergArr[j];
	                j++;
	            }
	            k++;
	        }
	        while (i <= middle) {
	            array[k] = tempMergArr[i];
	            k++;
	            i++;
	        }
	 
	    }*/
		/*int[] inputArr = { 5, 7, 31, 25, 10, 6, 2, 4, 3, 1, -5, 5, 452, 8, 7 };
		int l = inputArr.length, k = 0, temp = 0;
		for (int i = l - 1; i > k; i--) {
			if (inputArr[k] >= inputArr[i] ) {
				temp = inputArr[i];
				inputArr[i] = inputArr[k];
				inputArr[k] = inputArr[i - 1];
				inputArr[i - 1] = temp;
				k--;
			} else {
				i++;
			}
			k++;
		}
		
		for (int a : inputArr) {
			System.out.print(a + " ");
		}
		System.out.println();
		int startBig = k + 1;
		int endBig = inputArr.length;
		for (int i = endBig - 1; i > startBig; i--) {
			if (inputArr[startBig] >= inputArr[i] ) {
				temp = inputArr[i];
				inputArr[i] = inputArr[startBig];
				inputArr[startBig] = inputArr[i - 1];
				inputArr[i - 1] = temp;
				startBig--;
			} else {
				i++;
			}
			startBig++;
		}
		for (int a : inputArr) {
			System.out.print(a + " ");
		}
		*/
			
		/*}
	     
	    private int array[];
	    private int length;
	 
	    public void sort(int[] inputArr) {
	         
	        if (inputArr == null || inputArr.length == 0) {
	            return;
	        }
	        this.array = inputArr;
	        length = inputArr.length;
	        quickSort(0, length - 1);
	    }
	 
	    private void quickSort(int lowerIndex, int higherIndex) {
	         
	        int i = lowerIndex;
	        int j = higherIndex;
	        // calculate pivot number, I am taking pivot as middle index number
	        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
	        // Divide into two arrays
	        while (i <= j) {*/
	            /**
	             * In each iteration, we will identify a number from left side which
	             * is greater then the pivot value, and also we will identify a number
	             * from right side which is less then the pivot value. Once the search
	             * is done, then we exchange both numbers.
	             */
	           /* while (array[i] < pivot) {
	                i++;
	            }
	            while (array[j] > pivot) {
	                j--;
	            }
	            if (i <= j) {
	                exchangeNumbers(i, j);
	                //move index to next position on both sides
	                i++;
	                j--;
	            }
	        }
	        // call quickSort() method recursively
	        if (lowerIndex < j)
	            quickSort(lowerIndex, j);
	        if (i < higherIndex)
	            quickSort(i, higherIndex);
	    }
	 
	    private void exchangeNumbers(int i, int j) {
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }
	     
	    public static void main(String a[]){
	         
	        MyQuickSort sorter = new MyQuickSort();
	        int[] input = {24,2,45,20,56,75,2,56,99,53,12};
	        sorter.sort(input);
	        for(int i:input){
	            System.out.print(i);
	            System.out.print(" ");
	        }
	    }
	}*/
	
/*
		int maxX = 10_000_000;
		int broi = 0;
		for ( int i = 2; i <= maxX; i++) {
			boolean isPrime = true;
			for (int divisor = 2; divisor <= Math.sqrt(i); divisor++)
			{
				//System.out.println(divisor);
				if (i % divisor == 0)
				{
					//System.out.println(divisor);
					isPrime = false;
					break;
				}
			}
			
			if (isPrime == true) {
				System.out.println(i);
				broi++;
			}
		}
		System.out.println(broi);
		
		broi = 0;
		int number = 10000000;
		boolean[] primeN = new boolean[number];
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (primeN[i] == false) {
				for (int j = i*i; j <= number - 1; j += i) {
					primeN[j] = true;
				}
			}
		}
		for ( int i = 2; i <= number - 1; i++) {
			if (primeN[i] == false) {
				System.out.println(i);
				broi++;
			}
		}
		System.out.println(broi);
		*/

		public class MyQuickSort {
		    /*
		     * Enums for the state of the Nodes, for use in DFS/BFS
		     */
		    private enum NodeState {
		        Visited, InProgress, Unvisited
		    }; 

		    /*
		     * These 2 'magic' numbers come from the hardcoded 'matrix' below,
		     * cause it has 5 rows and 6 columns
		     */
		    public static final int ROWSCOUNT = 5;
		    public static final int COLUMNSCOUNT = 6;

		    /*
		     * Two variables for counting the maximum sequence 
		     * of numbers (as required by the problem definition)
		     */
		    private static int tempElementsCount = 1;
		    private static int maxElementsCount = 1; // except if the matrix is empty, then it should be 0

		    /*
		     * The hardcoded matrix
		     */
		    private static final int[][] matrix = new int[][] { 
		            { 2, 33, 2, 2, 2, 3 },
		            { 2, 2, 2, 2, 4, 4 }, 
		            { 4, 3, 4, 2, 3, 3 },
		            { 4, 3, 3, 3, 3, 4 }, 
		            { 4, 4, 4, 4, 4, 4 } };

		    /* 
		     * Create an auxiliary matrix 'state' to implement DFS. 
		     * Initialize the whole matrix as 'unvisited' and
		     * start DFS at the first element of the matrix
		     */
		    public static void DFS() {
		        NodeState state[][] = new NodeState[ROWSCOUNT][COLUMNSCOUNT];
		        // clear the state of the matrix
		        for (int i = 0; i < ROWSCOUNT; i++) {
		            for (int j = 0; j < COLUMNSCOUNT; j++) {
		                state[i][j] = NodeState.Unvisited;
		            }
		        }
		        runDFS(0, 0, state);    
		    }

		    /*
		     * Using the auxiliary matrix "state[][]", use DFS to traverse the
		     * 'real' matrix[][] 
		     */
		    public static void runDFS(int i, int j, NodeState state[][]) {
		        state[i][j] = NodeState.InProgress;
		        // traverse the whole matrix state[][] and recursively run runDFS() from the needed elements. 
		        for (int rows = 0; rows < ROWSCOUNT; rows++) {
		            for (int columns = 0; columns < COLUMNSCOUNT; columns++) {
		                /*
		                 * ----------------------------------------------------------------------
		                 * For the logic in the 'if' statement regarding the adjacent elements:
		                 * i0j0 i1j0 i1j0
		                 * i0j1 i1j1 i2j1
		                 * i0j2 i1j2 i2j2
		                 * It uses the thing, that the sum of (i+j) for the coordinates of
		                 * the elements above, below, on the left and on the right of i1j1
		                 * are exactly +1/-1 of the sum of the coordinates of i1j1
		                 * -> i1j2 to 1+2 = 3 
		                 * -> i2j1 to 1+2 = 3 
		                 * -> i1j1 to 1+1 = 2 (the current element) -> matrix[i][j] 
		                 * -> i1j0 to 1+0 = 1 
		                 * -> i0j1 to 1+0 = 1 
		                 * ----------------------------------------------------------------------
		                 */
		                if ((matrix[i][j] == matrix[rows][columns]) // if the values are equal
		                        && ((((i+j) - (rows + columns)) == 1) || (((i+j) - (rows + columns)) == -1))// and if the element is adjacent
		                        && (state[rows][columns] == NodeState.Unvisited)) { // and if the element is still not visited
		                    tempElementsCount++;
		                    if (tempElementsCount > maxElementsCount) {
		                        maxElementsCount = tempElementsCount;
		                    }
		                    runDFS(rows, columns, state); // recursively run DFS for each element, that "isEdge"
		                } else {
		                    // if the elements aren't [adjacent, equal and not visited], start the count again from '0'
		                    //tempElementsCount = 1;  
		                }
		            }
		        }
		        state[i][j] = NodeState.Visited;
		    }

		    public static void main(String[] args) {
		        MyQuickSort.DFS();
		        System.out.println(maxElementsCount);
		    }
		}  
