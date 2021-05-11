package ExceptionHandling;

public class ThrowsKeyword {
	//here the exception is getting thrower from one method to other.
	public void m1()  {
		m2();
	}
	
	// if m2() wants to handle exception
	public void m2()  {
	//public void m2() throws ArithmeticException {
		try {
			
		m3();
		
		}
		
		catch (ArithmeticException e){
			System.out.println("ARE is coming............");
		}
	}
	
	// exception is coming or given by m3.
	public void m3 () throws ArithmeticException{
		int i = 9/0;
	}
	
	
	
	// m1 is called by main and main also throws
	//Since JVM calls the main() it's JVM responsibilty to handle the exception
	public static void main(String[] args) {
		
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();
		
		
		
		
		
		
		
		
		
		
		
	}

}
