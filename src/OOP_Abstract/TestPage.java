package OOP_Abstract;

public class TestPage {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		lp.doLogin("admin", "admin123");
		
		
		lp.header();
		lp.title();

		//run-time polymorphism
		lp.pageLoading();
		
		
		//Top Casting :
		
		Page pg = new LoginPage();
		
		pg.title();
		pg.title();
						
		//pg.dologin(); --> this login page method and reference type check has failed.
		
		
		//down casting:
		//LoginPage lp1 = new Page();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
