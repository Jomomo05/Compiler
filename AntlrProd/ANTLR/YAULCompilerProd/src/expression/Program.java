package expression;

import java.util.List;
import java.util.ArrayList;

public class Program {
	public List<Expression> expressions;
	
	public Program() {
		this.expressions = new ArrayList<>();
	}
	
	public void addExpression(Expression e) {
		expressions.add(e);
	}
	
	public List<Expression> addExpressions() {
		return expressions;
	}
	
	public void removeExpression(Expression e) {
		expressions.remove(e);
	}
}
