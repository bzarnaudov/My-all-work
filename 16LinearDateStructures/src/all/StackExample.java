package all;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("1. Ivan");
		stack.push("2. Nikolay");
		stack.push("3. Maria");
		stack.push("4. George");
		System.out.println("Top = " + stack.peek());
		while (stack.size() > 0) {
			String personName = stack.pop();
			System.out.println(personName);
		}
	}

}
