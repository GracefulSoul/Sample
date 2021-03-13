package gracefulsoul.designpattern.creational.builder.item.drink;

import gracefulsoul.designpattern.creational.builder.item.Item;
import gracefulsoul.designpattern.creational.builder.packing.Bottle;
import gracefulsoul.designpattern.creational.builder.packing.Packing;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}