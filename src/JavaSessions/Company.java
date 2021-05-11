package JavaSessions;

public class Company {
	
	//class variables:
	String name;
	int empCount;
	String city;
	String address;
	String ceoName;
	static String category = "IT";
	
	//Constructor of the class
	//name should be same as class name:
	//can not return anything:t means no return type
	//it's not a function
	//Constructor helps to create the objects with diff types of class variables.
	//Constructor will be called when you create the object of the class...
	
	public Company() {
		System.out.println("default constructor..............");
	}
	
	public Company(String name, int empCount) {
		this.name = name;
		this.empCount = empCount;
	}
	
	public Company(String name, int empCount, String city) {
		this.name = name;
		this.empCount = empCount;
		this.city = city;
	}
    // this is overloaded with all class variables
	public Company(String name, int empCount, String city, String address, String ceoName) {
		//super();
		this.name = name;
		this.empCount = empCount;
		this.city = city;
		this.address = address;
		this.ceoName = ceoName;
	}

	
	
	
	
	
	
	
	
	
	
	
	//Constructor of the class
	//name should be same as the class name:
	//can not return anything, it means no return type:
	//it's not a function:
	//Constructor... will help to create the objects with diff types of class variables
	//Const... will be called when you create Object of the class
	// Const... will not have business logics
	
	
//	public Company() {
//		System.out.println("default const.....");
//	}
//	
//	public Company(int a) {
//		System.out.println("one param const..... " + a);
//	}
//	
//	public Company(int a, int b) {
//		System.out.println("two param  const..... " +a+ b);
//	}

}
