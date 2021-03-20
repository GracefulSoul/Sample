package gracefulsoul.designpattern.behavioral.visitor.part;

import gracefulsoul.designpattern.behavioral.visitor.visitor.ComputerPartVisitor;

public class Keyboard implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}

}
