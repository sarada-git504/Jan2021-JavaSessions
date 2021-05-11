package JavaSessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a = 10; // in memory value 10 is assigned to a variable
		int b = 20;
		
		System.out.println(a==b);//a==b means both are compared if equal it will give true if not false.
		System.out.println(10==10);
		
		// if condition always represent boolean value.
		if(a==b) {
			System.out.println("both are equal");
			
		}
		
		else {
			System.out.println("both are not equal");
		}
		
		if(true) {   //since true is already written this will not go to else condition that's the reason yellow lines are seen it mean unnecessarly taking space in memory
			
			System.out.println("Hi");
		}
		
		else {
			System.out.println("Bye...");//yellow lines are seen because it's a dead code since these line code are not used. Condition is satisfied in the if clause
		}	
		
		
		boolean flag = true;// this is not give dead code error because value is stored in variable flag and it could be changed to true or false.
		if(flag) {
			
			System.out.println("This is fine..." + flag);
		 }
		else
		{
			System.out.println("this is not fine..." + flag);
			
			}
		
		double d1 = 12.33;
		double d2 = 12.34;
		
		if(d1==d2) {
			System.out.println("Both are equal");
		}
		
		//Strings comparision
		//do not compare string operators with'=='
		String s1 = "Selenium";
		String s2 = "Selenium";//Since java is case sensitive if you give small s for selenium it will give error 
		
		//it's representing boolean
		if(s1.equals(s2)) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("both are not eaqual");
		}
		
		// there is one more function to ignore case sensetive in the program but space after string is not considered.
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("both are equal");
		}
		
		//WAP to check the marks
		// this is not the right way of writting code
	/*	String name = "Kunal";
		
		if(name.equals("Kunal")) {
			System.out.println("100 marks");
		}
		
		if(name.equals("Dixit")) {
			System.out.println("90 marks");
		}
		if(name.equals("Appaji")) {
			System.out.println("80 marks");
		}
		else {
			System.out.println("no student found");
		}*/
	
	 // Using if-else condition
	// This is also not the right way to code. If u want srikar marks then it should start looking from Kunal to Srikar.So we have to use Switch case statements.
		String name = "Kunal";
		
		if(name.equals("Kunal")) {
			System.out.println(name + " 100 marks");
		}
		else if (name.equals("Dixit")){
			System.out.println(name + " 90 marks");
			
		}
	
		else if (name.equals("Vindhya")){
			System.out.println(name + " 80 marks");
	}
		else if (name.equals("Srikar")){
			System.out.println(name + " 70 marks");
	}
		else {
			
		System.out.println("this student is not found....");
	}
		
		
	}
	
}
