package all;

import java.util.ArrayList;
import java.util.Date;

public class ArrayListInt {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList list = new ArrayList();
		list.add("Hello");
		list.add(5);
		list.add(3.14159);
		list.add(new Date());
		for (int i=0; i<list.size(); i++) {
			Object value = list.get(i);
			System.out.printf("Index=%d; Value=%s\n", i, value);
		}
		
		@SuppressWarnings("rawtypes")
		ArrayList list1 = new ArrayList();
		list1.add(2);
		list1.add(3);
		list1.add(4);
		int sum = 0;
		for (int i=0; i < list1.size(); i++) {
			Integer value = (Integer) list1.get(i);
			sum = sum + value.intValue();
		}
		System.out.println("Sum = " + sum);
		// Output: Sum = 9
		
		
	}

}
