package gracefulsoul.designpattern.creational.abstractfactory;

import gracefulsoul.designpattern.creational.abstractfactory.color.Color;
import gracefulsoul.designpattern.creational.abstractfactory.color.ColorType;
import gracefulsoul.designpattern.creational.abstractfactory.shape.Circle;
import gracefulsoul.designpattern.creational.abstractfactory.shape.Rectangle;
import gracefulsoul.designpattern.creational.abstractfactory.shape.Shape;
import gracefulsoul.designpattern.creational.abstractfactory.shape.ShapeType;
import gracefulsoul.designpattern.creational.abstractfactory.shape.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(ShapeType shapeType) {
		switch (shapeType) {
			case CIRCLE:
				return new Circle();
			case RECTANGLE:
				return new Rectangle();
			case SQUARE:
				return new Square();
			default:
				return null;
		}
	}

	@Override
	public Color getColor(ColorType colorType) {
		return null;
	}

}
