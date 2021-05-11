package JavaSessions;

public class MethodConceptTwo {

	//WAF where you have to pass the student name(string) and return marks(integer):
	
	public int getStudentMarks(String studentName) {
		System.out.println("getting students marks: " + studentName);
		if (studentName.equals("Tom")){
			return 90;// if this condition is not satisfied then return 0 or -1.
		}
		else if(studentName.equals("Anu")){
			return 80;
		}
		else if(studentName.equals("Raj")) {
			return 70;
		}
		else {
			System.out.println(studentName + " is not in the list........");
		return -1;
		}
	}
	// different way of writing above function:
	
	public int getMyStudentMarks(String studentName) {
		System.out.println("getting students marks: " + studentName);
		int marks = -1;
		
		if (studentName.equals("Tom")){
			marks = 90;// if this condition is not satisfied then return 0 or -1.
		}
		else if(studentName.equals("Anu")){
			marks = 80;
		}
		else if(studentName.equals("Raj")) {
			marks = 70;
		}
		else {
			System.out.println(studentName + " is not in the list........");
		}
		
		return marks;
	}
	
	// Writing above program in switch case concept:
	
	public int getStudentsScore(String studentName) {
		System.out.println("getting student score :" + studentName);
		int score = -1;
		
		switch (studentName) {
		case "Tom":
			score = 90;
			break;
		case "Anu":
			score = 85;
			break;
		case "Raj":
			score = 94;
			break;
		default:
			System.out.println(studentName + " is not present... ");
			break;
		}
		return score;
	}
    
	//WAF where we have to pass the browse name(string) and return boolean:
	
	public boolean launchBrowser(String browserName) {
		System.out.println("lunching browser: " + browserName);
		boolean flag = false;
		switch (browserName) {
		case "chrome":
			System.out.println("chrome is launched");
			flag = true;
			break;
		case "firefox":
			System.out.println("firefox is launched");
			flag = true;
			break;
		case "safari":
			System.out.println("safari is launched");
			flag = true;
			break;
 
		default:
			System.out.println("Please pass the correct browser name: " + browserName);
			break;
		}
		return flag;
	}
	
	//WAF where it will take emp name (string) and return emp information:
	//info: name,age,city,phone number,compnme:
	
	public Object[]  getEmpInfo(String empName) {
		System.out.println("Emp Name is: " + empName);
		Object empInfo[] = new Object[5];
		
		
		if(empName.equals("Raj")) {
			empInfo[0] = "Raj";
			empInfo[1] = 23;
			empInfo[2] = "Charlotte";	
			empInfo[3] = 232222342;
			empInfo[4] = "IBM";
		}
		
		else if(empName.equals("James")) {
			empInfo[0] = "James";
			empInfo[1] = 25;
			empInfo[2] = "New York";	
			empInfo[3] = 232222678;
			empInfo[4] = "Apple";
		}
		
		else {
			System.out.println("emp not found.....");
		}
		return empInfo;
		
	}
	
	
	
	public static void main(String[] args) {
		
	//calling the above function	
	//1.Function getStudentMarks
		
		MethodConceptTwo obj = new MethodConceptTwo();
		int m1 = obj.getStudentMarks("Jack");
		System.out.println(m1);
		
		System.out.println("...................................");
		
		int m2 = obj.getMyStudentMarks("James");
		System.out.println(m2);
		
		System.out.println(".................................");
		
		int m3 = obj.getStudentsScore("Anu");
		   System.out.println(m3);
		 //  if(m3) {
		//	   System.out.println(m3+10);
		//   }
		  // else {
		//	   System.out.println("No extra credits available....");
		   //}
		   
		 System.out.println(".................................");  
		 
		   boolean b =  obj.launchBrowser("IE");
		     System.out.println(b);
		     if(b) {
		    	 System.out.println("enter the url...");
		     }
		     else {
		    	 System.out.println("no browser found.........");
		     }
		
		System.out.println("------------------------------------");
		
		//this give only raj info:
		Object genInfo[] = obj.getEmpInfo("Raj");
		System.out.println(genInfo.length); 
		
		System.out.println("..........................................");
		
		// I need coplete info of employee so using for each loop:
		for(Object e : genInfo) {
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
