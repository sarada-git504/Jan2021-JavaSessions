package OOP_Abstract;

public class LoginPage extends Page{
	
	//created a constructor
	
	public LoginPage()	{
		System.out.println("LP -- Constructor......");
	}
	
	
	@Override
	public void header() {
		System.out.println("LP - header");
		
	}

	@Override
	public void title() {
		System.out.println("LP - title");
		
	}
	
	@Override
	public void pageLoading() {
		System.out.println("page loading... 10's");
	}
	

	public void doLogin(String un, String pwd) {
		System.out.println("loginwith : " + un + ":" +pwd);
	}

}
