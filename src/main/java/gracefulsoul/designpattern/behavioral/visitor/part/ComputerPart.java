package gracefulsoul.designpattern.behavioral.visitor.part;

import gracefulsoul.designpattern.behavioral.visitor.visitor.ComputerPartVisitor;

public interface ComputerPart {

	public void accept(ComputerPartVisitor computerPartVisitor);

}
