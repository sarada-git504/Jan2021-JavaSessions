package OOP_Inheritance;

public class TestCar {
	
	
	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start(); // Overridden - preference is given to BMW car 
		b.stop(); // inherited - coming from car
		b.refuel();//inherited 
		b.autoParking();//independent - this is BMW method.
		b.engine();
		BMW.autoPilot();
		System.out.println(b.name);
		
		Audi a = new Audi();
		a.start();
		a.stop();
		a.refuel();
		a.theftsafety();
		a.engine();
		
		System.out.println("===================================");
		
		
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		Car.autoPilot();
		
		
		System.out.println("============================================");
		
		
		//If we give reference from Car class(parent class) 
		// this concept is called Top/Up casting:
		
		
		Car c1 = new BMW();
		c1.start();//since the object is BMW so it will give from BMW.
		c1.stop();
		c1.refuel();
		
		//giving reference from grand parent:
		
		Vehicle v1 = new BMW();
		v1.engine();
				
		System.out.println("====================================");
		
		//down casting:
		
//		BMW b1 = (BMW) new Car();//ClassCastException - runtime it gives exception error.
//		
//		BMW b2 = (BMW) new Vehicle();//ClassCastException - runtime it gives exception error
		
		

	}

}
