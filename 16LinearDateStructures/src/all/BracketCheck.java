package all;

import java.util.Stack;

public class BracketCheck {

	public static void main(String[] args) {
		String expression = "1 + (3 + 2 - (2+3) * 4 - ((3+1)*(4-2)))";
		Stack<Integer> stack = new Stack<Integer>();
		boolean correctBrackets=true;
		for (int index = 0; index < expression.length(); index++) {
			char ch = expression.charAt(index);
			if (ch == '(') {
				stack.push(index);
				System.out.println(index);
			} else if (ch == ')') {
				if(stack.isEmpty()){
					correctBrackets=false;
					break;
				}
				stack.pop();
			}
		}
		if(!stack.isEmpty())
			correctBrackets=false;
			System.out.println("Are the brackets correct? " + correctBrackets);
		}
}