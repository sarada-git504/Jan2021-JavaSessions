package OOP_Encapsulation;

public class AmazonLoginTest {

	public static void main(String[] args) {
		
		Login lg = new Login();
		
		lg.setUsername("sarada@gmail.com");
		lg.setPwd("sarada123");
		
		lg.doLogin(lg.getUsername(), lg.getPwd());
		
		//to know what's your user name.
		System.out.println(lg.getUsername());
		
		//Password changed:
		
		lg.setPwd("admin456");
		lg.doLogin(lg.getUsername(), lg.getPwd());
		
		System.out.println("..................................................");
		
		
		//different user wants to login as seller or customer:
		// create a different object
		
		Login lp_seller = new Login();
		
		lp_seller.setUsername("seller@gmail.com");
		lp_seller.setPwd("selller123");
		
		lp_seller.doLogin(lp_seller.getUsername(),lp_seller.getPwd());
		
		System.out.println("===========================================================");
		
		HomePage hp = new HomePage();
		hp.enterUserName("admin@gmail.com");
		hp.enterPassword("admin@123");
		hp.clickLoginButton();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
