package OOP_Inheritance;

public class BMW extends Car {
	String name = "My BMW Car"; // Overriding variable
	
	
	//BMW wants it own start method instead of Car-start method
	//and this is called Overridden or method overriding
	
	//Method Overriding: When you have a method in parent class and the same method in child class
	// and same number of parameters and with same types
	//Method Overriding: Poly(many)+Morphism(forms) => Overloading and Overriding 
	// Overriding is runtime or Dynamic polymorphism => JVM will decide at runtime.
	
	@Override
	public void start() {
		System.out.println("BMW ------ start");
		
	}
	
	@Override
	public void engine() {
		System.out.println("vehicle ---------- engine");
	}
	
		
	public void autoParking() {
		
		System.out.println("BMW ------ auto parking");
	}
	
    // you can't override static method but BMW can have it's own autopilot static method
    
	public static void autoPilot() {
		System.out.println("BMW ------------- autoPilot");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
