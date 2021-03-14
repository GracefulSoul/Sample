package gracefulsoul.designpattern.structural.decorator.decorator;

import yskim.designPattern.decoratorPattern.shape.Shape;

public abstract class ShapeDecorator implements Shape {
    
    protected Shape decoratedShape;
    
    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }
    
    public void draw() {
        decoratedShape.draw();;
    }
    
}
