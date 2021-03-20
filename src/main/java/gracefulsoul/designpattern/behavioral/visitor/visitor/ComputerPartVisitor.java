package gracefulsoul.designpattern.behavioral.visitor.visitor;

import gracefulsoul.designpattern.behavioral.visitor.part.Computer;
import gracefulsoul.designpattern.behavioral.visitor.part.Keyboard;
import gracefulsoul.designpattern.behavioral.visitor.part.Monitor;
import gracefulsoul.designpattern.behavioral.visitor.part.Mouse;

public interface ComputerPartVisitor {

	public void visit(Computer computer);

	public void visit(Mouse mouse);

	public void visit(Keyboard keyboard);

	public void visit(Monitor monitor);

}
