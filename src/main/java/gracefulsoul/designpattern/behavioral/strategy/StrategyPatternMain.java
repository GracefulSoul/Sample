package gracefulsoul.designpattern.behavioral.strategy;

import gracefulsoul.designpattern.behavioral.strategy.operation.Add;
import gracefulsoul.designpattern.behavioral.strategy.operation.Multiply;
import gracefulsoul.designpattern.behavioral.strategy.operation.Substract;

public class StrategyPatternMain {

	public static void main(String[] args) {
		Context context = new Context(new Add());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

		context = new Context(new Substract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context = new Context(new Multiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}

}
