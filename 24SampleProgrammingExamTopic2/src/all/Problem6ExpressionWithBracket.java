package all;

import java.util.*;

public class Problem6ExpressionWithBracket {
	public static void main(String[] args) {
		try {
			String expression = readExpression();
			// first parse the expression to tokens
			String[] tokens = expressionToTokens(expression);
			// second, transform it into reverse Polish notation
			String[] reversePolishNotation = shuntingYardAlgorithm(tokens);
			// finally, calculate it
			double result = calculateReversePolishNotation(reversePolishNotation);
			System.out.printf(expression + " = %.2f", result);
		} catch (ArithmeticException ex) {
			System.out.println("Division by zero.");
		} catch (NumberFormatException ex) {
			System.out.println("Invalid expression!");
		}
	}

	private static double calculateReversePolishNotation(
			String[] reversePolishNotation) {
		/*
		 * While there are input tokens left Read the next token from input. If
		 * the token is a value Push it onto the stack. Otherwise, the token is
		 * a operator. So, pop the top 2 values from the stack. Push the
		 * returned result back onto the stack.
		 * 
		 * The one value in the stack is the result.
		 */

		Stack<Double> output = new Stack<Double>();
		Queue<String> inputTokens = new LinkedList<String>();
		inputTokens.addAll(Arrays.asList(reversePolishNotation));

		while (inputTokens.size() > 0) {
			String token = inputTokens.poll();
			if (isTokenNumber(token)) {
				output.push(Double.parseDouble(token));
			} else {
				double result = calculateOperation(token, output.pop(),
						output.pop());
				output.push(result);
			}
		}
		return output.pop();

	}

	private static double calculateOperation(String token, Double firstPop,
			Double secondPop) {
		double result;
		switch (token) {
		case "+":
			result = firstPop + secondPop;
			break;
		case "-":
			result = secondPop - firstPop;
			break;
		case "*":
			result = firstPop * secondPop;
			break;
		case "/":
			if (firstPop == 0) {
				throw new ArithmeticException();
			}
			result = secondPop / firstPop;
			break;
		default:
			throw new NumberFormatException();
		}
		return result;
	}

	private static String[] expressionToTokens(String expression) {
		// its easier to build the tokens on our own rather than use Splits
		List<String> tokens = new ArrayList<String>();
		String operatorsAndParenthesis = "+-*/()";

		// use string builder for faster processing of the tokens
		StringBuilder currentToken = new StringBuilder();

		for (int i = 0; i < expression.length(); i++) {
			String c = expression.charAt(i) + "";
			if (operatorsAndParenthesis.contains(c)) {
				if (currentToken.length() > 0) {
					tokens.add(currentToken.toString());
				}
				tokens.add(c);
				currentToken.setLength(0);
			} else {
				currentToken.append(c);
			}
		}

		if (currentToken.length() > 0) {
			tokens.add(currentToken.toString());
		}

		return tokens.toArray(new String[tokens.size()]);
	}

	private static String readExpression() {
		System.out.println("Enter expression:");
		Scanner input = new Scanner(System.in);
		String expression = input.nextLine();
		input.close();
		return expression;
	}

	private static String[] shuntingYardAlgorithm(String[] tokens) {
		/*
		 * Modified pseudo-code from wikipedia
		 * 
		 * While there are tokens to be read: Read a token. If the token is a
		 * number, then add it to the output queue. If the token is an operator,
		 * o1, then: while there is an operator token, o2, at the top of the
		 * stack, and o1's precedence is less than or equal to that of o2, pop
		 * o2 off the stack, onto the output queue; push o1 onto the stack. If
		 * the token is a left parenthesis, then push it onto the stack. If the
		 * token is a right parenthesis: Until the token at the top of the stack
		 * is a left parenthesis, pop operators off the stack onto the output
		 * queue. Pop the left parenthesis from the stack, but not onto the
		 * output queue. When there are no more tokens to read: While there are
		 * still operator tokens in the stack: Pop the operator onto the output
		 * queue. Exit.
		 */
		Queue<String> output = new LinkedList<String>();
		Stack<String> operatorStack = new Stack<String>();
		Queue<String> queueTokens = new LinkedList<String>();
		queueTokens.addAll(Arrays.asList(tokens));

		while (queueTokens.size() > 0) {
			String token = queueTokens.poll();
			if (isTokenNumber(token)) {
				output.add(token);
			} else if (isTokenOperator(token)) {
				while (operatorStack.size() > 0
						&& isTokenOperator(operatorStack.peek())
						&& getOperatorPrecedence(token) <= getOperatorPrecedence(operatorStack
								.peek())) {
					output.add(operatorStack.pop());
				}
				operatorStack.push(token);
			} else if (token.equals("(")) {
				operatorStack.push(token);
			} else if (token.equals(")")) {
				String poppedOperator = operatorStack.pop();
				while (!poppedOperator.equals("(")) {
					output.add(poppedOperator);
					poppedOperator = operatorStack.pop();
				}
			}
		}

		while (operatorStack.size() > 0) {
			output.add(operatorStack.pop());
		}

		return output.toArray(new String[output.size()]);
	}

	private static int getOperatorPrecedence(String token) {
		if (token.equals("+") || token.equals("-")) {
			return 1;
		} else if (token.equals("*") || token.equals("/")) {
			return 2;
		} else {
			throw new NumberFormatException();
		}
	}

	private static boolean isTokenOperator(String token) {
		String operators = "+-*/";
		for (int i = 0; i < token.length(); i++) {
			String c = token.charAt(i) + "";
			if (operators.contains(c)) {
				return true;
			}
		}
		return false;
	}

	private static boolean isTokenNumber(String token) {
		try {
			Double.parseDouble(token);
			return true;
		} catch (Exception e) {
			return false;
		}

	}
}
