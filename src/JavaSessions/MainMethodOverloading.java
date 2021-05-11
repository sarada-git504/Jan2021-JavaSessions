package JavaSessions;

public class MainMethodOverloading {

	//Main method overloading:
public static void main(String[] args) {
	System.out.println("This is my main method......");	
    
	main(10);
	main(10,20);//decided by JVM compiler. It's not decided at runtime.

}
	
public static void main(int a) {
	System.out.println("this is main " + a);	
}
	
public static void main(int a, int b) {
	System.out.println("this is main " + a + b);
}
	
	
	
	
	
	
	
	
	
	
	

}
