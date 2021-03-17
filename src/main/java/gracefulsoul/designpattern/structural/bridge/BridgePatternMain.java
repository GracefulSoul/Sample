package gracefulsoul.designpattern.structural.bridge;

import gracefulsoul.designpattern.structural.bridge.draw.GreenCircle;
import gracefulsoul.designpattern.structural.bridge.draw.RedCircle;
import gracefulsoul.designpattern.structural.bridge.shape.Circle;
import gracefulsoul.designpattern.structural.bridge.shape.Shape;

public class BridgePatternMain {

	public static void main(String[] args) {
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

		redCircle.draw();
		greenCircle.draw();
	}

}
