package JavaSessions;

public class Assignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Number 1
		String a = "Hello";
		String b = "Naveen K";
		
		System.out.println(a);
		System.out.println("My name is " + b);
		
		//Number 2.
		int x = 74;
		int y = 36;
		
		System.out.println(x+y);
		
		//Number 3.
		int r = 50;
		int s = 3;
		
		System.out.println(r/s);
		
		//Number 4.
		System.out.println(-5+8*6);
		System.out.println((55+9) % 9);
		System.out.println(20+ -3*5 /8);
		System.out.println(5+15/3*2-8 % 3);
		
		//Number 5.
		System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
		
		//Number 6.
		String c = "Hello Selenium";
		char d ='t';
		
		System.out.println(c+d);
		
		// Number 7.
		
		int p1 = 100;
		int q1 = 200;
		int r1 = 3400;
		
		System.out.println("Your total amount : " +(p1+q1+r1));
		
		// Number 8.
		
		byte b3 = 065;
		
		System.out.println(b3);
		
		System.out.println("-----------------------------");
		
		//printing ascii values a-z and A-Z
		
		// char CapitalChar = 'A'
		// char SmallChar = 'a'
		char ch = 'a';
		
		for( int i = 'a'; i <= 'z'; i++)
		{
			System.out.println(ch + " : "  +i);
			ch++;
		}
		
		System.out.println("----------------------------");
		
		for(int i=97; i<=122; i++) {
			
			System.out.println("The ASCII value of " + (char)i + " = "  +i );
		}
		
		
		

	}

}
