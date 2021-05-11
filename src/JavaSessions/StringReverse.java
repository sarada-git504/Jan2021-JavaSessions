package JavaSessions;

public class StringReverse {

	public static void main(String[] args) {
		
		String s = null; //muineleS, reverse of 'm' will be m.l
		//reverseString(s);
		System.out.println(reverseString(s));
		
		//100
		//m
		//testing
		//null
		//test123
  }
       
	//removed the code from here and placed in method	
	//create a function or method for the above prog. which we can reuse
	
	
	public static String reverseString(String s) {
		
		if(s==null) { //when s=null
			return "string is null";
		}
		int len = s.length();//length of string is 8
		
		if(len==1) { //this works when s="m";
			return s;
		}
		String rev = "";//reverse string will be hold here
	
		for(int i=len-1; i>=0; i--) {
			
			
			rev = rev + s.charAt(i);//pick char and reverse
			
		}
		
		  return rev;
		
		
		
		
	  }
	}
	
	
	
	
	
	
	

