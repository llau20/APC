package a1;

public abstract class PopularGrocery extends GroceryItem{
	
	protected int popularityLevel;
	protected int quantity;
	
	public PopularGrocery(int popularityLevel) {
		this.isPopular = true;
		this.popularityLevel = popularityLevel;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public boolean showWarning() {
		return quantity > houseHoldLimit;
	}
}
