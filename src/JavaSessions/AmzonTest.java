package JavaSessions;

public class AmzonTest {

	public static void main(String[] args) {
		
		
		//Seller User:
		
		AmazonLogin az = new AmazonLogin("seller", "seller123", "sellerRole");
		System.out.println(az.username);
		System.out.println(az.password);
		System.out.println(az.role);
		
		
		az.doLogin(az.username, az.password, az.role);
		az.forgotPwd(az.username);
		
		//Customer:for customer we have to create seperate Object
		
		AmazonLogin az1 = new AmazonLogin("sarada","sarada123");
		az1.doLogin(az1.username, az1.password);
		
		az1.forgotPwd(az1.username);
		
		
		
		
		
		

	}

}
