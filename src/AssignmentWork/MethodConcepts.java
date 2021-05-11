package AssignmentWork;

public class MethodConcepts {
	
	
	
	public int add(int a, int b) {
		System.out.println("add method");
		
		   int z =  a+b;
		   return z;
		   
		   }
	
	//-----------------------------------------------
	
	public int product(int m, int n) {
		System.out.println("Product method");
		
		int p = m * n;
		return p;
	}	
	
	//------------------------------------------------
		
		public double circle(double d) {
			System.out.println("Area of a Circle: ");
			
			double PI = Math.PI;
			
			double area = PI*d*d;
		
		    return area;
		    
		}
		
		//----------------------------------------------
		    
		    public int max(int a, int b, int c) {
				System.out.println("Maximum number is: ");
				
				if(a>b && a>c) {
					System.out.println("Max number is : " + a);
					return a;
				}
					
				else if(b>a && b>c) {
					System.out.println("Max number is : " + b);
					return b;
					
				}
				else {
					
					System.out.println("Max number is : " +c);
					return c;
				}
				 
		}
	
          
		    public int min (int a, int b, int c) {
				System.out.println("Minimum number is: ");
				
				if(a<b && a<c) {
					System.out.println("Min number is : " + a);
					return a;
				}
					
				else if(b<a && b<c) {
					System.out.println("Min number is : " + b);
					return b;
					
				}
				else {
					
					System.out.println("Min number is : " +c);
					return c;
				}
				 
		}
	
		    
		    // Define a program to find out whether a given number is even or odd:
		          
		    public int oddeven(int m) {
		    	if(m % 2 == 0) {
		    		System.out.println("Given nuber is even : ");
		    		
		    	}
		    	
		    	else {
		    		System.out.println("Given number is odd : ");
		    	}
				return m;
		    }
		    
		    //A person is elligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is elligible to vote
		    
		    public int goVote(int age) {
		    	System.out.println("Eligibilte to vote :" + age);
				if(age >= 18) {
					System.out.println("Candidate is eligible to vote");
				}
		    					   	
				else {
					
					System.out.println("Candidate is not eligible to vote");
				}
				
				return age;
		    }
		    
		    
		    //Write a program which will ask the user to enter his/her marks (out of 100). 
		    //Define a method that will display grades according to the marks entered as below:
		    
		    
		    public String getGrade(int marks) {
		    	String grade = null;
		    	
		    	
		    	if(marks > 90 && marks<100) {
		    		grade = "AA";
		    		//System.out.println("The student grade : " + grade);
		    		
		    	}
		    	
		    	else if(marks>80 && marks<=90) {
		    		grade = "AB";
		    		//System.out.println("The student grade : " + grade);
		    	}
		    	
		    	else if(marks>70 && marks<=80) {
		    		grade = "BB";
		    		//System.out.println("The student grade : " + grade);
		    	}
		    	
		    	else if(marks>60 && marks<=70) {
		    		grade = "BC";
		    		//System.out.println("The student grade : " + grade);
		    	}
		    	
		    	else if(marks>50 && marks<=60) {
		    		grade = "CD";
		    		//System.out.println("The student grade : " + grade);
		    	}
		    	
		    	else if(marks>40 && marks<=50) {
		    		grade = "DD";
		    		//System.out.println("The student grade : " + grade);
		    	}
		    	
		    	else if( marks<40) {
		    		System.out.println("The student failed ");
		    	}
		    	
		    	return grade;
		    	
		      }
		    
		    //need help to write above prog into swithcase.
		    
		    public boolean getMyGrades(String grade) {
		    	boolean flag = false;
		    	//System.out.println("Value..."+ str(marks));    		    		    	
		    	//String grade = null;
		    	 
				switch (grade) {
				case "AA":
					System.out.println("Student marks between 91-100: " + grade);
					flag = true;
					break;      	
     			case "AB":
					System.out.println("Student marks between 81-90: " + grade);
					flag = true;
					break; 
				case "BB":
                  System.out.println("Student marks between 71-80: " + grade);
					flag = true;
					break; 
     			case "BC":
	                  System.out.println("Student marks between 61-70: " + grade);
						flag = true;
						break; 
					
     			case "CD":
                    System.out.println("Student marks between 51-60: " + grade);
  					flag = true;
  					break; 
				case "DD":
                    System.out.println("Student marks between 41-50: " + grade);
  					flag = true;
  					break; 
				case "Fail":
                    System.out.println("Student marks less then equal to 40: " + grade);
  					flag = true;
  					break; 
  					
					default:
						//System.out.println("failed");
						
					break;
				}
		    	return flag;
		    }
		    
		    
//		    Write a program to print the factorial of a number by defining a method named 'Factorial'.
//		    The Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
//		    4! = 1*2*3*4 = 24
//		    3! = 3*2*1 = 6
//		    2! = 2*1 = 2
//		    Also,
//		    1! = 1
//		   0! = 0  
		    
		    	    
		    
		 private String str(int marks) {
				// TODO Auto-generated method stub
				return null;
			}

		public static void main(String[] args) {
		
		MethodConcepts mc = new MethodConcepts();
		
		int sum = mc.add(40, 60);
		System.out.println(sum);
		
		System.out.println("..............................");
		
		int prod = mc.product(10, 15);
		System.out.println(prod);
		
		System.out.println("==========================================");
		
		double s = mc.circle(4);
		System.out.println(s);
		
		System.out.println("============================================");
		
       int value = mc.max(125, 110, 80);
       System.out.println(value);
		
		
		System.out.println("=========================================");
		
		
		int value1 = mc.min(125, 110, 80);
	       System.out.println(value1);
	       
	       System.out.println("=======================================");
		
	      int d =  mc.oddeven(42);
	      System.out.println(d);
      
	      System.out.println("=======================================");
	      
	     int v =  mc.goVote(20);
	     System.out.println(v);
	     
	     
	     System.out.println("==========================================");
	     
	     
	     String a = mc.getGrade(30);
	     System.out.println(a);
	     
	     System.out.println("============================================");
	     
         Boolean s1 = mc.getMyGrades("CD");
	     System.out.println(s1);
	     
	     
	     
		
	}

}
