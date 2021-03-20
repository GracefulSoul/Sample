package gracefulsoul.designpattern.behavioral.visitor.part;

import gracefulsoul.designpattern.behavioral.visitor.visitor.ComputerPartVisitor;

public class Monitor implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}

}
