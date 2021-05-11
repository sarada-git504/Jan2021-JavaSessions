package BuilderPatternConcept;

public class UberTest {

	public static void main(String[] args) {
		
		UberApp ua = new UberApp();
		
		ua.doLogin("sarada", "sarada123")
		   .goRide("Matthew", "University")
		      .getVehicle("Audi", 4)
		         .logOut()
		            .doPayment("1212 221 223", "4468","4462 466 244");
		
		System.out.println("..............................................");  
		
		UberApp ua1 = new UberApp();
		
		ua1.doLogin("Lynda","Lynda123")
		 .getfood("901 oaks st")
		    .logOut()
		      .doPayment("1212 221 223", "4468","4462 466 244");
		     
		

	}

}
