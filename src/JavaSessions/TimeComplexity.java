package JavaSessions;

public class TimeComplexity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		System.out.println(i);
		
		//O(1) constant -- BIG O -- Time Complexity
		int j= 20; //O(1)
		System.out.println(i+j);//O(1)
		
		int num = 10;//100000000
		for(int p=1; p<=num; p++) {
			System.out.println(p);
		}
		
		//1+n(p<=num)+n(p++)+n(p)=> 1+3n ==> 3n ==> n ==> O(n)
		//linear equation
		
		System.out.println("-------two loops------------");
		for(int h=0; h<=9; h++) {
			for(int g=0; g<=9; g++) {
				System.out.println(h+""+g+" ");
			}
			System.out.println();
		}
		
		// (1+n+n)(1+n+n+n) +n ==> (1+2n)(1+3n)+n
		// ==>1+3n+2n+6n^2 + n ==> 6n^2+6n+1 ==>(remove constant 1-since h=0 and g=0 doesn't matter) 
		// ==> 6(n^2+n)==>n^2+n ==> n(n+1)==>(remove constant again) n^2 ==> O(n^2)is the time complexity for two for loops 
		// Quadratic equation 

		System.out.println("-------Three for loop----------- ");
		
		for(int h=0; h<=9; h++) {
			for(int g=0; g<=9; g++) {
				for(int u=0; u<=9; u++) {
					System.out.println(h+""+g+""+u+" ");
				}
			}
			System.out.println();
		}
		
		//(1+n)(1+n)(1+n)==> 1+n+n^3 ==> n^3 => O(n^3)
		//O(log n) ==> Binary Search
		
		for(int s=1; s==1;) {
			System.out.println(s);
			break;
			
		}
	}

}
