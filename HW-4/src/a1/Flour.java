package a1;

public class Flour extends PopularGrocery {
	
	public Flour(int quantity, int popularityLevel, int discountThreshold) {
		super(popularityLevel);
		this.discountThreshold = discountThreshold;
		setQuantity(quantity);
		this.houseHoldLimit = 15;
	}

	@Override
	public int getBulkDiscount() {
		// TODO Auto-generated method stub
		return quantity >= discountThreshold ? 5 : 0;
	}

}
