package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 to 100
		//1. while loop
		int i=1;
		while(i<=10) {
			//I++;-> it will print from 2 to 11. I will print and so Syso statement and then check the condition and come out of loop. That's why 11 is printed.
			System.out.println(i);
			//if i++ is not given it keep printing 1 which is infinte loop.
			//i++;
			++i ; // this also works
			//i=i+1;
			
		}
		
		//program should break when multiple of 5 is encountered.
    
		int n = 1;
		while(n<=50) {
			System.out.println(n);//1
			if(n % 5 == 0) {
				
				System.out.println("Hi......");
				}
			n++;
		}
		
		
		System.out.println("--------------------------");
		// Break with the while loop
		
		int num = 0;
		while(num <= 100) {
			
			System.out.println(num);
			
			if (num == 50) 	{
				System.out.println("half century.........");
			}
			
			if (num == 100) {
				System.out.println("century........");
			}
			
			if (num ==0) {
				System.out.println("Duck out ......");
				break;
			}
			
			num++;
		}
		
		System.out.println("---------------------------");
		
		// 2. for loop
		//1 to 10
		//int k - you can put here also
		for (int k=1; k<=10; k++ ) {
			System.out.println(k);
			// k++ here also we can give
		
		}	
		
		System.out.println("---------------------");
		
		for(double d=1.0; d<=10; d++) {
			System.out.println(d);
			
		}
		
		System.out.println("-------------------------");
		for(char c= 'a'; c<='z'; c++ ) {
			System.out.println(c);
		}
		
		/*for(;;) { // this is for infinite loop
		
			System.out.println("Welcome to home......");
		} */
		
		
	//for with break:
		for (int w=1; w<=20; w++) {
			System.out.println(w);
			
			   if(w==15) {
				   System.out.println("Value is 15 ...");
				   break; 
			   }
		}
		
		System.out.println("--------------------");
		
		// 3. do-while - when ever u have to wait for specific element in selenium do-while will be used.
		int p = 1;
		do {
			System.out.println(p); //1
			p++;
		} 
		while (p<=10);
		
		
	}

}
