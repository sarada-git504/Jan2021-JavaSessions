package JavaSessions;

public class Employee {
	
	//class variables:they behave like a template for class
	// Java create a photo copy of these variables and give it to each and every object
	
	String name;
	int age;
	String dob;
	double salary;
	boolean isPermanent;
	
	public static void main(String[] args) {
		
		//Class is category or blue print or template of all objects
		
       //create the object of a class:
		// you can create n number of objects.
		// e1 - Object reference name
		// new Employee - Object- which is new and classname
		// Employee - class name
		// Object will be created in Heap and Object reference is created in Stack
		
		Employee e1 = new Employee();
		e1.name = "Anu";
		e1.age = 25;
		e1.dob = "01-01-1995";
		e1.salary = 23.55;
		e1.isPermanent = true;
		
		Employee e2 = new Employee();
		e2.name = "Sarada";
		e2.age = 26;
		e2.dob = "01-01-1994";
		e2.salary = 50.55;
		e2.isPermanent = false;
		
		Employee e3 = new Employee();
		e1.name = "Sunita";
		e1.age = 28;
		
		Employee e4 = new Employee();
		
		System.out.println(e1.name + " " + e1.age + " " + e1.dob + " " + e1.salary + " " + e1.isPermanent);
		System.out.println(e2.name + " " + e2.age + " " + e2.dob + " " + e2.salary + " " + e2.isPermanent);
		System.out.println(e3.name + " " + e3.age + " " + e3.dob + " " + e3.salary + " " + e3.isPermanent);
		System.out.println(e4.name + " " + e4.age + " " + e4.dob + " " + e4.salary + " " + e4.isPermanent);
		// we will get default values where data is not given
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
