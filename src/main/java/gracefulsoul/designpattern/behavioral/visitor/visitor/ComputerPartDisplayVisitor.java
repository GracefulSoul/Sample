package gracefulsoul.designpattern.behavioral.visitor.visitor;

import gracefulsoul.designpattern.behavioral.visitor.part.Computer;
import gracefulsoul.designpattern.behavioral.visitor.part.Keyboard;
import gracefulsoul.designpattern.behavioral.visitor.part.Monitor;
import gracefulsoul.designpattern.behavioral.visitor.part.Mouse;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	@Override
	public void visit(Computer computer) {
		System.out.println("Displaying Computer.");
	}

	@Override
	public void visit(Mouse mouse) {
		System.out.println("Displaying Mouse.");
	}

	@Override
	public void visit(Keyboard keyboard) {
		System.out.println("Displaying Keyboard.");
	}

	@Override
	public void visit(Monitor monitor) {
		System.out.println("Displaying Monitor.");
	}

}