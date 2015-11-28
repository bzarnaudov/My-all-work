package all;

import java.math.BigDecimal;

public class Problem5ParsedExpression {
	private BigDecimal[] numbers;
	private Character[] operators;
	
	public Problem5ParsedExpression(BigDecimal[] numbers, Character[] operators) {
		super();
		this.numbers = numbers;
		this.operators = operators;
	}
	
	public BigDecimal[] getNumbers() {
		return numbers;
	}
	
	public void setNumbers(BigDecimal[] numbers) {
		this.numbers = numbers;
	}
	
	public Character[] getOperators() {
		return operators;
	}
	
	public void setOperators(Character[] operators) {
		this.operators = operators;
	}
}
