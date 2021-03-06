package all;

import java.util.ArrayList;
import java.util.Collections;

public class Problem4Example {

	public static void main(String[] args) {
		Problem4Shape[] shapes = new Problem4Shape[10];
		shapes[0] = new Problem4Triangle(2, 10);
		shapes[1] = new Problem4Rectangle(2, 2.2);
		shapes[2] = new Problem4Circle(2, 2);
		shapes[3] = new Problem4Triangle(2, 2.2);
		shapes[4] = new Problem4Rectangle(20, 2.2);
		shapes[5] = new Problem4Triangle(12, 2.2);
		shapes[6] = new Problem4Rectangle(23, 21);
		shapes[7] = new Problem4Triangle(7, 4.2);
		shapes[8] = new Problem4Rectangle(12, 13);
		shapes[9] = new Problem4Triangle(15, 10.2);
		
		ArrayList<Double> surfacesOfShapes = new ArrayList<Double>();
		
		for (Problem4Shape shape : shapes) {
			surfacesOfShapes.add(shape.calculateSurface());
			System.out.println(shape);
		}
		
		Collections.sort(surfacesOfShapes);
		for (Double surface : surfacesOfShapes) {
			System.out.println(surface);
		}

	}

}
