package gracefulsoul.designpattern.behavioral.command.stock;

import gracefulsoul.designpattern.behavioral.command.order.Order;

public class BuyStock implements Order {

	private Stock abcStock;

	public BuyStock(Stock abcStock) {
		this.abcStock = abcStock;
	}

	public void execute() {
		abcStock.buy();
	}

}