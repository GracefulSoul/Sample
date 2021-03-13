package gracefulsoul.designpattern.creational.abstractfactory;

import gracefulsoul.designpattern.creational.abstractfactory.color.Blue;
import gracefulsoul.designpattern.creational.abstractfactory.color.Color;
import gracefulsoul.designpattern.creational.abstractfactory.color.ColorType;
import gracefulsoul.designpattern.creational.abstractfactory.color.Green;
import gracefulsoul.designpattern.creational.abstractfactory.color.Red;
import gracefulsoul.designpattern.creational.abstractfactory.shape.Shape;
import gracefulsoul.designpattern.creational.abstractfactory.shape.ShapeType;

public class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(ShapeType shapeType) {
		return null;
	}

	@Override
	public Color getColor(ColorType colorType) {
		switch (colorType) {
			case RED:
				return new Red();
			case GREEN:
				return new Green();
			case BLUE:
				return new Blue();
			default:
				return null;
		}
	}

}
