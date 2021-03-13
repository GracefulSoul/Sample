package gracefulsoul.designpattern.creational.builder.item;

import gracefulsoul.designpattern.creational.builder.packing.Packing;

public interface Item {

	public String name();

	public Packing packing();

	public float price();

}