package gracefulsoul.designpattern.creational.abstractfactory;

import gracefulsoul.designpattern.creational.abstractfactory.color.Color;
import gracefulsoul.designpattern.creational.abstractfactory.color.ColorType;
import gracefulsoul.designpattern.creational.abstractfactory.shape.Shape;
import gracefulsoul.designpattern.creational.abstractfactory.shape.ShapeType;

public abstract class AbstractFactory {

	abstract Color getColor(ColorType colorType);

	abstract Shape getShape(ShapeType shapeType);

}
