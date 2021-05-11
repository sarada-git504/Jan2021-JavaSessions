package AccessModifier2;

//Since car is in diff package you need to import Car:
import AccessModifiers.Car;

public class Audi extends Car{

	public static void main(String[] args) {

		//4.Different Package and subclass:
		//Default Variable - NO
		//Private variable - NO
		
		
       Car c = new Car();
       c.price = 100;
       
       Audi a = new Audi();
       a.color = "Red";
       a.price = 200;
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
