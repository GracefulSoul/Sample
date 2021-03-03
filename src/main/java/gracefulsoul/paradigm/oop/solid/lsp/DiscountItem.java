package gracefulsoul.paradigm.oop.solid.lsp;

public class DiscountItem extends Item {

	private double discountRate;

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
		this.applyDiscountedPrice();
	}

	private void applyDiscountedPrice() {
		super.setPrice((int)(super.getPrice() * (1 - this.discountRate)));
	}

}
