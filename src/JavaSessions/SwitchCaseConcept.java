package JavaSessions;

//import java.lang.invoke.SwitchPoint;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		
		String name = "Dixit";// change to Robert
		// once the condition is pass it break from the condition.break is only for switch cases only.
		switch (name) {
		case "Kunal":
			System.out.println(name + " 100 marks");
			break;
		case "Dixit":
			System.out.println(name + " 100 marks");
			break;
		case "Vindhya":
			System.out.println(name + "100 marks");
			break;
		case "Srikar ":
			System.out.println(name + "100 marks");
			break;
		default:
			System.out.println(name + " Student not found");
			break;
		}
		
//
		String browser = "CHROME";//nothing will match if case is different it's case senestive.
		
		switch (browser.toLowerCase()) {
		
		/* since lowercase() is used even if you pass string value in upper case it will convert to lower. But in switch code we need to maintain browser name 
		 * (values that are passed in lower.
		 */
		
		case "chrome":
		
			System.out.println("launch chrome");
			break;
		
		case "ff":
		System.out.println("launch FF");
		break;
		case "opera":
		System.out.println("launch IE");
		break;
		case "Safari":
		System.out.println("launch Safari");
		break;
		default:
			System.out.println("please enter correct browser name");
			break;
		}
		
		//
		String country = "Russia"; 
		//String capital = ""; // value is not mentioned because if Russia is given then in print statement for capital space is given.Country is not found....
		                      //Country is : Russia capital is : . 
        String capital = null; // we can give this also.
		
        switch (country) {
		case "India":
			capital = "New Delhi";
			break;
		
		case "UK":
			capital = "London";
			break;
		
		case "US":
			capital = "DC";
			break;
		
		case "Germany":
			capital = "Munich";
			break;
		default:
			System.out.println("Country is not found....");
			break;
		}
		
		System.out.println("Country is : " + country  + " capital is :" + capital);
		
		
///
// if student get marks which are not in the program then....
// for example marks = 95 - check below programe for the solution
	     int marks = 100;
	     String grade = null;
	     switch (marks) {
	     case 100:
	    	 grade = "GRADE A";
	    	 break;
	     case 80:
	    	 grade = "GRADE B";
	    	 break;
	     case 50:
	    	 grade = "GRADE C";
	    	 break;
	     case 30:
	    	 grade = "Fail";
	    	 break;
	    	 
	    default:
	    	break;
	     }
          
	     System.out.println("marks: " + marks + " grade is:  " + grade);
	     
////
	// WAP to find the higest number (where three numbers are there and all are different)     
	     // values changes
	     //&& - this is called short circuit operator . Both conditions should satisfy 
	     //|| - or operator - one condition should be true.
	     int x = 500; 
	     int y = 400;
	     int z = 300;
	     
	     if (x>y && x>z) {//x>y-false && x>z-false->false - both the condition should be true to enter the if condition.
	    	 System.out.println("x is the greatest number");
	    	}
	     else if(y>z) {//false
	    	 System.out.println("Y is the greater number");
	    	}
	     else {
	    	 System.out.println("Z is the greater number");
	     }
	     
	     
		
	     
	}
 }


            
             
             
             
             













