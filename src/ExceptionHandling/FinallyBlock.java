package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		
		System.out.println("Hi");
		
		System.out.println("Hi");
		
		
		try {
			int i = 9/0;
		}
		
		catch(ArithmeticException e) {
			System.out.println("ARE is coming...");
		}
		
		
		finally {
			System.out.println("I'm inside finally block............");
			System.out.println("Close the DB connection");
		}
		
		
		int n1 = getMarks("Tom");// change name to naveen from tom
		System.out.println(n1);	
			
		
		}

	
	
	//interview question:
	public static int getMarks(String name) {
		
		if(name.equals("Tom")) {
			
			try {
				 int i = 9/3;
				//int i = 9/0;
				 return 70;
			}
			
				
		catch(Exception e) { //if int i = 9/3 this doesn't go to catch block
			
			return 80;
			
		}
		
			finally {
				//return -1;
				return 80;
			}
		
		}
		
		return 10;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
