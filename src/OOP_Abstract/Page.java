package OOP_Abstract;

public abstract class Page {
	
		
	//can not create the object of abstract class
	// but you can create a constructor of abstract class
	//it will be called when you create the object of child class
	
	//abstract class can have both abstract and non abstract methods
	//only abstract methods -->yes --> 100% abstraction
	//only non abstract methods --> yes __> 0% abstraction
	//both abstract and non abstract methods --> yes --> partial abstraction
	
	
	public Page() {
		System.out.println("Page --- constructor...");
		
	}
	
	public abstract void header();
	
	
	
	public abstract void title();
	
	//non-abstract method or normal method
	public void pageLoading() {
		System.out.println("page loading..... 30's");
	}
	
	
	
	//you can have static method:
	
	public static void url() {
		System.out.println("App page -- url");
	}
	
	// you can make the logo() static or final
	public static void logo() {
		System.out.println("Page -- logo");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
