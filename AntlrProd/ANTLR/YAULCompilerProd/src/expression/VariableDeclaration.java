package expression;

public class VariableDeclaration<T> extends Expression {
	public T id;
	public T type;
	public T value;

	public VariableDeclaration(T id, T type, T value) {
		this.id = id;
		this.type = type;
		this.value = value;
	}
	
}
