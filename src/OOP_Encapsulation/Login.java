package OOP_Encapsulation;

public class Login {

	private String username;
	private String pwd;
	
	
	
	
	// getting setters and getters:
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	public void doLogin(String un, String pwd) {
		System.out.println("Login with : " + un + " " +pwd);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
