package all;

import java.util.Scanner;

public class HypotynuseOfRectangularTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("vuvedete goleminata na vseki katet s natiskane na enter");
		double katetA = input.nextDouble();
		double katetB = input.nextDouble();
		double hypotenuse = Math.sqrt(Math.pow(katetA, 2)+Math.pow(katetB, 2));
		System.out.println("hipotenuzata e = " + hypotenuse);
		input.close();
	}
}
