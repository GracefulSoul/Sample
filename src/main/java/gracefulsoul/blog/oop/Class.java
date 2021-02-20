package gracefulsoul.blog.oop;

public class Class {
	// It can only be used inside.
	private String variable;
	// It can also be used outside.
	public String getVariable() {
		return this.variable;
	}
	// It can only be used inside the package.
	protected void setVariable(String variable) {
		this.variable = variable;
	}
}
