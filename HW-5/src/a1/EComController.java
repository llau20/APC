package a1;

public class EComController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShippingInfo info = new ShippingInfo("Munich", 80331, "Germany");
		Profile profile = new Profile(info);
		Customer customer = new Customer(profile, 123);
		
		System.out.println("Shipping to: " + customer.getProfile().getShippingInfo().getCity());
	}

}
