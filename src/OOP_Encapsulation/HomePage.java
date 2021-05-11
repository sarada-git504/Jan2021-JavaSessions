package OOP_Encapsulation;

public class HomePage {
	
	//locators:
	
	private String email = "#username";
	private String pwd = "//input[@id='value']";
	private String loginButton = "#loginbutton";
	
	
	//Page Actions (public):
	
	public void enterUserName(String userName) {
		
		System.out.println((email + "--> enter the user name : " + userName));
		
	}
	
   public void enterPassword(String password) {
		
		System.out.println((pwd + "--> enter the password : " + password));
		
	}

   public void clickLoginButton() {
		
		System.out.println((loginButton + "--> click on login button"));
		
	}

}

//look for above problem result in Amazonlogintest class