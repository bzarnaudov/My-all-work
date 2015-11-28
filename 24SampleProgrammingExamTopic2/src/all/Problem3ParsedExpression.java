package all;

public class Problem3ParsedExpression {
	private Integer[] numbers;
	private Character[] operators;
	
	public Problem3ParsedExpression(Integer[] numbers, Character[] operators) {
		super();
		this.numbers = numbers;
		this.operators = operators;
	}
	
	public Integer[] getNumbers() {
		return numbers;
	}
	
	public void setNumbers(Integer[] numbers) {
		this.numbers = numbers;
	}
	
	public Character[] getOperators() {
		return operators;
	}
	
	public void setOperators(Character[] operators) {
		this.operators = operators;
	}
}
