package gracefulsoul.designpattern.structural.bridge.shape;

import gracefulsoul.designpattern.structural.bridge.draw.DrawAPI;

public abstract class Shape {

	protected DrawAPI drawAPI;

	protected Shape(DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
	}

	public abstract void draw();

}
