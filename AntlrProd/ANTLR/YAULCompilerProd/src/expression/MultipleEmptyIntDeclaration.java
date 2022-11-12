package expression;

import java.util.List;

public class MultipleEmptyIntDeclaration extends Expression {
List<VariableDeclaration<?>> variablelist;
	
	public MultipleEmptyIntDeclaration(List<VariableDeclaration<?>> list) {
		this.variablelist = list;
	}
}
