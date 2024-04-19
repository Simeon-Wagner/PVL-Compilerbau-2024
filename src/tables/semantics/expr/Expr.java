package tables.semantics.expr;

public abstract class Expr {

	public abstract boolean includes(char c);
	
	public boolean isEpsilon() {
		return false;
	}
	
	public String toShortString() {
		return this.toString();
	}

}
