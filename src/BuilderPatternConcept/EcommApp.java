package BuilderPatternConcept;

public class EcommApp {

	public EcommApp doLogin(String username,String pwd) {
		System.out.println("login with :" +username+ " " +pwd);
		return this;
	}
	
	public EcommApp search(String productName) {
		System.out.println("searching product : "+ productName);
		return this;
	}
	
	public EcommApp search(String productName,String color) {
		   System.out.println("searching product color : " + productName + " " + color);
		   return this;
	   }
	
	
	public EcommApp addToCart(String productName) {
		   System.out.println("Add product to cart : " + productName);
		   return this;
	   }
	
	public EcommApp checkOut(String productName) {
		   System.out.println("Check out the product : " + productName);
		   return this;
	   }
	
	public EcommApp doPayment(String cc, String pwd) {
		   System.out.println("Payment done with : " + cc + " : " +pwd);
		   return this;
	   }
	
	public EcommApp getOrderDetails(String productName) {
		   System.out.println("get order details for : " + productName);
		   return this;
	   }
	
	public EcommApp logOut() {
		   System.out.println("Logout from the app.......");
		   return this;
	   }
	
	
	
	
	
}
