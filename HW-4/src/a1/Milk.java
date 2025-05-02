package a1;

public class Milk extends PopularGrocery{
	
	public Milk(int quantity, int discountThreshold, int popularityLevel) {
		super(popularityLevel);
		this.discountThreshold = discountThreshold;
		this.quantity = quantity;
		this.houseHoldLimit = 20;
	}

	@Override
	public int getBulkDiscount() {
		// TODO Auto-generated method stub
		return quantity >= discountThreshold ? 12 : 0;
	}
}
