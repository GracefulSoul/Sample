package gracefulsoul.designpattern.creational.builder.item.burger;

import gracefulsoul.designpattern.creational.builder.item.Item;
import gracefulsoul.designpattern.creational.builder.packing.Packing;
import gracefulsoul.designpattern.creational.builder.packing.Wrapper;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}