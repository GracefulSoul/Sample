package gracefulsoul.designpattern.behavioral.visitor;

import gracefulsoul.designpattern.behavioral.visitor.part.Computer;
import gracefulsoul.designpattern.behavioral.visitor.part.ComputerPart;
import gracefulsoul.designpattern.behavioral.visitor.visitor.ComputerPartDisplayVisitor;

public class VisitorPatternMain {

	public static void main(String[] args) {
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}

}
