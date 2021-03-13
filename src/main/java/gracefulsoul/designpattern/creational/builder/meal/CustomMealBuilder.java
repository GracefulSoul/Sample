package gracefulsoul.designpattern.creational.builder.meal;

import gracefulsoul.designpattern.creational.builder.item.burger.Burger;
import gracefulsoul.designpattern.creational.builder.item.drink.ColdDrink;

public class CustomMealBuilder {

	private Meal meal = new Meal();

	public void addBurger(Burger burger) {
		this.meal.addItem(burger);
	}

	public void addColdDring(ColdDrink coldDring) {
		this.meal.addItem(coldDring);
	}

	public Meal build() {
		return meal;
	}

}