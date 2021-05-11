package JavaSessions;

public class MethodsConcept {
	
	//cannot create a function inside a function
	// any where inside class you can create a function.
	
	// 1. No input and no return-the movement you run the method it will go into main method
	// Void: can't return anything
	
	
	public void test() {
		System.out.println("test method........");
		
	}
	
	// 2. no input but some return:
	//name: getnumber
	//return type: int
	
	public int getNumber() {
		System.out.println("get number");
		int a = 100;
		int b = 200;
		int c = a+b+500;
		return c;
		
	}
	
	// name = getTrainerName
	// return type: String
	
	public String getTrainerName() {
		System.out.println("get trainer name");
		String name = "Naveen";
		return name;
		
	}
	
	// 3. some input and some return:
	
	public int add(int a, int b) { // int a and b are called input parameters
		System.out.println("add method");
		int z = a+b;
		return z;
		
	}
		

	public static void main(String[] args) {

		// to call all the class methods(non static methods), we have to create Object of the class
		
		MethodsConcept obj = new MethodsConcept();
		obj.test();
		int sum = obj.getNumber();
		System.out.println(sum+100);
		//System.out.println(obj.getNumber());//u can call it in this way also not advisable
		
		String s1 = obj.getTrainerName();
		System.out.println(s1);
		
		int m1 = obj.add(40, 60);
		System.out.println(m1);
		
		//calling method again:using same m1 and the latest value of m1 will be 50.
		  m1 = obj.add(30,20);
		  System.out.println(m1);
		  		  
		//int m2 = obj.add(30,40);
		//System.out.println(m2);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
