package JavaSessions;

public class AmazonLogin {
	
	String username;
	String password;
	String role;
	
	//seller or partner or distrubutor:
	public AmazonLogin(String username, String password, String role) {
		this.username = username;
		this.password = password;
		this.role = role;
	}

	
	//Customer :
	public AmazonLogin(String username, String password) {
		//super();
		this.username = username;
		this.password = password;
	}
	
	public AmazonLogin() {
		
	}
	
public AmazonLogin(String username) {
		this.username = username;
	}
	
	//features : methods:

   public void doLogin(String username, String password) {
	 System.out.println("login with: "+ username + " " + password);
  }
	
   public void doLogin(String username, String password, String role) {
		 System.out.println("login with: "+ username + " " + password + " " + role);
	  }
	
   public void forgotPwd(String username) {
	   System.out.println("forgot password with : " + username);
   }

  public void signup() {
	   
   }

	

}
