package JavaSessions;

public class LoginPage {

	//Method Overloading (compile time Poly+morphism) :within the same class,when we have different methods with same name
	//with different parameters
	//the sequence of parameter is different 
	//advantage: user friendly- when we have to access same functionality with different methods
	
	public void login() {//0
		
	}
	
 public void login(int a) {//1
		
	}
 public int login(int c, int d) {//2
	return 100;
   }
  public boolean login(int c,String d) {//3
	return true;
}
public void login(String c,int d) {//4
	
}

// login method overloading:

public void doLogin() {
	System.out.println("default login");
}

public String doLogin(String un, String pwd) {
	System.out.println("login with: " + un + " : " + pwd);
    return "login is sucessful";
}

public boolean doLogin(String un, String pwd, String role) {
	System.out.println("login with: " + un + " : " + pwd+ ":" +role);
    return true; 
}

public void doLogin(long phone,String pwd) {
	System.out.println("login with: " + phone + " : " + pwd);
}

public void doLogin(long phone,int otp) {
	System.out.println("login with: " + phone + " : " + otp);
}

//Examples: search,

public void search() {
	
}

public void search(String productName) {
	
}

public void search(String productName, int price) {
	
}

public void search(String productName, int price, String color) {
	
}

// Payment:

public void doPayment(String cc, int pwd ) {
	
}

public void doPayment(String cc,int otp, int pwd ) {
	
}

public void doPayment(String UPI) {
	
}

//Uber:

public void bookingCar(String from, String to ) {
	
}

public void bookingCar(String from, String to, String carType ) {
	
}

public void bookingCar(String from, String to, String carType, int personCount ) {
	
}	

public static void main(String[] args) {
		System.out.println("start");
		LoginPage lp = new LoginPage();
		
		lp.doLogin();
		lp.doLogin(2404759, 4664);
		if(lp.doLogin("admin","admin123","admin")) {
			System.out.println("I'm logged in......");
		}
		
		String mesg = lp.doLogin("sarada","sara123");
		System.out.println(mesg);
		
		
		
		
		

	}

}
