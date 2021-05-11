package JavaSessions;

public class CarStatic {
	
	String name;
	int price;
	String color;
	static int wheels = 4; // tis will be stored in CMA(common memry allocation)
	
	public static void start() {//stored in CMA //default start
		System.out.println("Car ---- start");
	}
	
	public static void start(String key) {//stored in CMA //Key start
		System.out.println("Car ---- start");
	}
	
	
	
		public void steering() {// stored in object
		System.out.println("Car ---- steering");
	}

				
		
	public static void main(String[] args) {
		
	//how to call a static variables and methods:
	//no need to create a object.
	//1. Can be called directly within the same class
		System.out.println(wheels);
		start();
	//2. should be called by className.
		System.out.println(CarStatic.wheels);
		
		
	// for non static variables/methods:
	// have to create the Object
     CarStatic c1 = new CarStatic();
     c1.name = "BMW";
     c1.price = 70;
     c1.color = "Black";
     c1.wheels = 4;// this will give warning and not recommended way
	 System.out.println(c1.name);	
     
     CarStatic c2 = new CarStatic();
     c2.name = "Audi";
     c2.price = 80;
     c2.color = "White";
     c2.wheels = 4;//this will give warning and not recommended way
		
		c1.steering();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
