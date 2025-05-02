package a1;

public abstract class Article {
	
	protected int discountThreshold;
	protected int houseHoldLimit;
	
	public abstract int getBulkDiscount();
	
	public abstract boolean showWarning();

}
