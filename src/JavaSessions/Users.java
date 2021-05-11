package JavaSessions;

public class Users {
	
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		
		// interview question:
		
		
		Users u1 = new Users ();
		u1.name = "Bharat";
		u1.age = 30;
		u1.city = "Bangalore";
		
		Users u2 = new Users ();
		u2.name = "Sunita";
		u2.age = 32;
		u2.city = "Madras";
		
		Users u3 = new Users();
		u3.name = "Raj";
		u3.age = 31;
		u3.city = "Calcutta";
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city ) ;
		System.out.println(u2.name + " " + u2.age + " " + u2.city ) ;
		System.out.println(u3.name + " " + u3.age + " " + u3.city ) ;
		
		System.out.println(("............................................."));
		
		u1 = u2; //it means u1 will point to u2.u1 has no reference for now. a Single object can have multiple references
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city ) ;
		System.out.println(u2.name + " " + u2.age + " " + u2.city ) ;
		System.out.println(u3.name + " " + u3.age + " " + u3.city ) ;
		
		System.out.println("...................................................");
		
		u2 = u3;// u1 will still show to u2. but u2 and u3 will show u3.
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city ) ;
		System.out.println(u2.name + " " + u2.age + " " + u2.city ) ;
		System.out.println(u3.name + " " + u3.age + " " + u3.city ) ;
		
		System.out.println("..................................................");
		
		u3 = u1;// current location of u1 is u2 so u3 will also point to u2.
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city ) ;
		System.out.println(u2.name + " " + u2.age + " " + u2.city ) ;
		System.out.println(u3.name + " " + u3.age + " " + u3.city ) ;
		
		System.out.println("................................................");
		
		
		
		
		

	}

}
