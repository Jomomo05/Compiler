package expression;

import java.util.List;

public class MultipleEmptyMatrixDeclaration extends Expression {
	List<VariableDeclaration<?>> variablelist;
	
	public MultipleEmptyMatrixDeclaration(List<VariableDeclaration<?>> list) {
		this.variablelist = list;
	}
}
