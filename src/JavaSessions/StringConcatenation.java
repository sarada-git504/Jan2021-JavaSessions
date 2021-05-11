package JavaSessions;

public class StringConcatenation {

	public static void main(String[] args){
		// TODO Auto-generated method stub

	

	  String s = "hello world";
	  String s1 = "100";
	  String s2 = "hi this my java code";
	  
	  String f1 = "12.33"; //String can be concatenated with any type of datatype
	  
	  int a = 100;
	  int b = 200;
	  String x = "Hello";
	  String y = "Selenium";
	  
	  System.out.println(a+b);
	  System.out.println(x+y);
	  System.out.println(x+a ); 
	  System.out.println(a+b+x+y);
	  System.out.println(x+y+a+b); // execution will happen left to right and HelloSelenium100200
	  System.out.println(x+y+(a+b));//HelloSelenium300
	  System.out.println("the value of a is : " + a);
	  System.out.println("the value of a is : " + b);
	  System.out.println("the value of a is : " + (a+b));
	  
	  double d1 =12.33;
	  double d2 = 34.44;
	  
	  System.out.println(a+b+x+y+d1+d2); //300HelloSelenium12.3334.44
	  System.out.println(x+y+a+b+d1+d2); //HelloSelenium10020012.3334.44
	  
	  System.out.println(x+d1+d2+y+a+b); //Hello12.3334.44Selenium100200
	  System.out.println(x+(d1+d2)+y+(a+b)); //Hello46.769999999999996Selenium300
	  
	  char c1 = 'a'; // Ascii value-97
	  char c2 = 'b'; // Ascii value-98
	  char space = ' '; // for space
	  // a-z: 97 to 122
	  //A-Z: 65 to 90
	  //0-9: 48 to 57
	  System.out.println(x+c1);//Helloa - string with char
	  System.out.println(c1+c2); // any arthematic operations on characters will be done on Ascii value of that character-195
	  
	  char c3 = '4'; //Ascii 52
	  char c4 = '5'; //Ascii 53
	  System.out.println(c3+c4);//105
	  
	  System.out.println(1000);
	  
	  char gender = 'm';
	  System.out.println("gender is : " + gender);
	  System.out.println(c1+" "+c2); //ab
	  
	  //hi this is "Sarada" here
	  
	  System.out.println("hi this is \"Sarada\" here"); // hi this is "Sarada" here
	  
	  int m = 9;
	  int n = 3;
	  System.out.println(m/n);//3
	  System.out.println(9/2);//4
	  System.out.println(9/2.0);//4.5
	  System.out.println(9.0/2);//4.5
	  
	  
	  //System.out.println(9/0);//Exception in thread "main" java.lang.ArithmeticException: / by zero	at JavaSessions.StringConcatenation.main(StringConcatenation.java:71)
	  System.out.println(0/9);//0
	  
	  System.out.println(8 % 2);//0
	  System.out.println(9 % 2);//1
	  System.out.println("Bye...");// this will not print because of above print exception error.
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}
}
