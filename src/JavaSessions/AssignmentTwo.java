package JavaSessions;

public class AssignmentTwo {

	public static void main(String[] args) {
		
		//  Conditional Operators
		//1. Take three numbers from the user and print the greatest number. 
		int i = 25;
		int j = 78;
		int k = 87;
		
		if (i>j && i>k) {
			System.out.println("i is the greatest number: " + i);
		}
		else if (j>i && j>k) {
			System.out.println("j is the greater number: " + j);
		}
		else {
			System.out.println("k is the greater number: " + k );
		}
		System.out.println("---------------------------------");
		
		// Take four numbers from the user and print the greatest number
		int a = 25;
		int b = 78;
		int c = 87;
		int d = 91;
		
		if(a>b && a>c && a>c) {
			System.out.println("a is the greatest number: " + a);
		}
		else if (b>a && b>c && b>d) {
			System.out.println("b is the greatest number: " + b);
		}
		else if (c>a && c>b && c>d) {
			System.out.println("c is the greatest number: " + c);
		}
		else {
			System.out.println("d is the greatest number: " + d);
		}
		
		System.out.println("-----------------------------");
		
		// Write a Java program to test a number is positive or negative.
		   int x1 = 35;
		// int x2 = -11;--- Not sure how to use this input.
		 		 
		 if (x1 > 0) {
			 System.out.println(x1 + ": " + "Is a positive number");
			 }
		 else if (x1 < 0) {
			 System.out.println(x1 + " : " + "Is a negative number");
		 }
		 else {
			 System.out.println("Number is 0");
		 }
		 
		 System.out.println("------------------------------");
		 
		 /* Write a Java program to test a person is eligible for vote age is greater than equal to 18 and alive: eligible 
		 age is less than to 18 and alive: not eligible
		 if not alive: print person does not exist. */
		 
		 int y1 = 0;
		 String s1 = "alive";
		 
		 if(y1>=18) {
			 System.out.println(y1 + " This person is eligible and  " + s1 );
		 }
		 else  if (y1<18 && y1>0){
			 System.out.println("This person is not eligible and  " + s1);
		 }
		 
		   else {
			 System.out.println("This person doesn't exsist");
		 }
		 
		 System.out.println("------------------------------------");
		 
		 //Loops Assignment:
		 //WAP to print following output:
		 
		 for(int t = 1; t<=5; t++) {
		 
		     System.out.println("I am Batman");
		 	}
		 
		 System.out.println("-------------------------------------");
		 
		 //6.WAP to print following output:
		 
		 for (int t=1; t<=9; t++) {
	          System.out.println("I'm Batman " +t);
	}
		 
		 //WAP to print 10 to 1 using for,while and do-while loop
		 // for loop:
		 
		 for(int t1=10 ; t1>0; t1--) {
			 System.out.println("Print the number in reverse order for for-loop: " + t1);
		 }
		 
		 System.out.println("--------------------------------");
		 
		 // while loop:
		 
		 int t2=10;
		 while(t2>0) {
			 
			 System.out.println("Print the number in reverse order for while-loop: " + t2);
			 t2--;
		 }
		 
		  System.out.println("----------------------------------");
		 //do-while loop
		  
		  int t3=10;
		  do {
			  System.out.println("Print the number reverse order for do-while loop: " + t3);
			  t3--;
			
		} while (t3>0);
		  
		  System.out.println("--------------------------------------------");
		  
		  //Write a program in Java to print "Hello World" ten times using while loop
		  
		  String f="Hello World";
		  for(int f1=1; f1<=10; f1++) {
		          System.out.println(f);      
		 
		  }
		  
		  System.out.println("----------------------------------------------");
		  
		  //Write a program in Java to print 1 to 10 using while loop but quit if multiple of 7 is encountered:
		  
            int p1 = 1;
            while(p1<=10) {
            	System.out.println(p1);
            	if(p1 % 7 == 0) {
            		System.out.println("Multiple of seven has encountered......");
            		break;
            	}
            	p1++;
                	
            }
		     
             System.out.println("------------------------------------------------");
            
            // Print even number (0 2 4 6 8 10) using for/while/dowhile loop:
            // for loop:
            
            for(int c1=0; c1<=10; c1++) {
            	//System.out.println(c1);
            	if(c1 % 2 == 0) {
            		System.out.println(c1 + " is even number ");
            	}
            }
            System.out.println(".............................................");
          
            // while-loop:
            int c2 = 0;
            while(c2<=10) {
            	if(c2 % 2 == 0) {
            		System.out.println(c2 + " is even number ");
            	}
            	
            	c2++;
            }
                            
            System.out.println("-----------------------------------------");
            
            //do-while loop
            int c3 = 0;
            do {
				if(c3 % 2 ==0) {
					System.out.println(c3 + " is a even number");	
				}
				c3++;
				
			} while (c3<=10);
            
            System.out.println("................................");
            
            //Print odd number (1 3 5 7 9) using for/while/dowhile loop.
            //for-loop:
            
            for(b=1; b<=10; b++) {
                if(b % 2 != 0) {
                	System.out.println(b + " is a odd number ");
                }
            }
            
            System.out.println("...................................");
            int b1=1;
            while(b1<=10) {
            	if(b1 % 2 != 0) {
            		System.out.println(b1 + " is a odd number");
            	}
            	
            	b1++;
            }
            
            System.out.println("..................................");
            
            int b2=1;
            do {
				if(b2 % 2 != 0) {
					System.out.println(b2 + " is a odd number");
				}
            b2++;
            }  while (b2<=10);
            
            
            System.out.println("--------------Arrays------------------------------");
            
//            for(int s=0; s<4; s++) {
//            	for(j=0; j<10; j++) {
//            		System.out.println(i+ "" +j);
//            	}
//            	
//            	System.out.println();
//            }
//		 
	}
		
}
