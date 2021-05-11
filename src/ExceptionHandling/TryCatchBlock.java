package ExceptionHandling;

public class TryCatchBlock {
	
	String name =  "Tom";
		
	public static void main(String[] args) {
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		//Try block:
		//TryCatchBlock obj = null;
		TryCatchBlock obj = new TryCatchBlock();
		try {
		// you get nullpointer exception and this can't be handled with Arthmetic exp.code will be stopped here.
		//changed the exception name as Exception and nullpointer exception is handled and it goes straight to Catch block.
		System.out.println(obj.name);
		int i = 9/0;
		System.out.println("Bye...");//these syso statement will not be executed . Once the exception is handled it will go directly to 
		System.out.println("Bye...");// catch block.
		System.out.println("Bye...");
		
		}
		//Catch block:
		//if you don't know the name of the exception then just write Exception which is super class of exceptions.
		//Catch(Exception e){
	    //   }
		
		catch(ArithmeticException e) {
			System.out.println("one arthematic exception.......");
			e.printStackTrace();
		}
		
		catch(NullPointerException e) {
			System.out.println("NPE is coming.......");
			e.printStackTrace();
		}
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
