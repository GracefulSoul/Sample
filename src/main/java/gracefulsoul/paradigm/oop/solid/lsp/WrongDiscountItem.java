package gracefulsoul.paradigm.oop.solid.lsp;

public class WrongDiscountItem extends Item {

	private double discountRate;

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	@Override
	public void setPrice(int price) {
		super.setPrice((int)(super.getPrice() * (1 - this.discountRate)));
	}

}
