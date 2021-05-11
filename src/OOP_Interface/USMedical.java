package OOP_Interface;


public interface USMedical extends WHO {

	  int min_fee = 10;// this is Static and final
	
	
	
	//no method body
	//only method declartion
	//only method prototype
	// you can't create object of interface.
	// you can't create constructor of interface
	  
	
	public void orthoService();
	
	public void neuroService();
	
	public void emergencyService();
	
	public void radioService();
	
	// you can also have a method with parameters and decide what the method returns but no body
	
	//public int test(int a);
	
	// after jdk 1.8
	// 1. can have a static method in interface with body:
	
	public static void billing() {
		System.out.println("US---- billing");
	}
	
	//2. You can have a default method:
	// since this method is overridden in FT you can't call this method in test class with USMedical.taxcollection because it's non static default method
	
	     default void taxCollection() {
	    	 System.out.println("US-----------taxcollection");
	     }
	
	
	
	
	
	
	
	
	
	
	
}
