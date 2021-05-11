package BuilderPatternConcept;

public class ShoppingTest {

	public static void main(String[] args) {

    EcommApp ec = new EcommApp();
		//return current class object
	ec.doLogin("sarada","sarada123")
	    .search("Macbook")
	      .addToCart("Macbook")
	        .checkOut("Macbook")
	          .doPayment("1212 212 212 1212", "2121")
	             .getOrderDetails("Macbook")
	                .logOut();
	
	
		System.out.println("...............................");
		
		EcommApp ec1 = new EcommApp();
		
		ec1.doLogin("Dixit", "Dixit123")
		    .getOrderDetails("Nike shoes")
		       .logOut();
		
		System.out.println("...................................");
		
		//Customer login and not doing shopping:
		
		EcommApp ec2 = new EcommApp();
		
		ec2.doLogin("Lynda", "Lynda123")
		 .search("Watches")
		   .logOut();
		
		
		
		
		
		

	}

}
