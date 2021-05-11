package OOP_Inheritance;


// a class declare with final keyword can't become parent
// final keyword is used to prevent inheritance.

//public final class Car extends Vehicle{

    public  class Car extends Vehicle{
    	
    	String name = "My Car"; // inheret this variable from parent class => to bmw
	
	// if a method is declared final it can't be inhereted or Overridden.
	//public final void start() {
		
		public void start() {
		System.out.println("Car ------ start");
		
	}
	
	
	public void stop() {
		System.out.println("Car ------ stop");
		
	}
	
	
	public  void refuel() {
		System.out.println("Car ------ refuel");
		
	}
	
		
	public static void autoPilot() {
		System.out.println("Car ------------- autoPilot");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
