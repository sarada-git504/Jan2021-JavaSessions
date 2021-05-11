package BuilderPatternConcept;

public class UberApp {
	
	public UberApp doLogin(String username, String pwd) {
		System.out.println("login with: "+ username + " " +pwd);
		return this;
	}
	
	public UberApp goRide(String pickup, String dest) {
		System.out.println("Select pickup and destination : "+ pickup + " " +dest);
		return this;
	}
	
	public UberApp getVehicle(String car, int seats) {
		System.out.println("Select vehicle with number of seats : "+ car + " " + seats);
		return this;
	}
	
	public UberApp getfood(String address) {
		System.out.println("Enter the delivery address : " + address);
		return this;
	}
	
	public UberApp logOut() {
		System.out.println("logout of the app......");
		return this;
	}
		
	public UberApp doPayment(String cc, String googlepay, String giftcard) {
		System.out.println("pay with : " + cc + " " + googlepay + " " + giftcard);
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
