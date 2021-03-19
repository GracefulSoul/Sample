package gracefulsoul.designpattern.behavioral.command;

import gracefulsoul.designpattern.behavioral.command.broker.Broker;
import gracefulsoul.designpattern.behavioral.command.stock.BuyStock;
import gracefulsoul.designpattern.behavioral.command.stock.SellStock;
import gracefulsoul.designpattern.behavioral.command.stock.Stock;

public class CommandPatternMain {

	public static void main(String[] args) {
		Stock abcStock = new Stock();

		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);

		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);
		broker.placeOrders();
	}

}
