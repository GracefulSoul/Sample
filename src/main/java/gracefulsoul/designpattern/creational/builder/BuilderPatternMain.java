package gracefulsoul.designpattern.creational.builder;

import gracefulsoul.designpattern.creational.builder.meal.Meal;
import gracefulsoul.designpattern.creational.builder.meal.MealBuilder;

public class BuilderPatternMain {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());

		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("Non-Veg Meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getCost());
	}

}