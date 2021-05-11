package SeleniumArch;

public class AmazonTest {

	public static void main(String[] args) {
		
		
		WebDriver driver = null;
		String browser = "firefox";//change this to ff and safari and try IE also it should take to default
		
		//ChromeDriver driver = new ChromeDriver();
		
		 // the other way to do is with switch statement for all browsers:
		//cross browser testing
        
        switch (browser) {
		case "Chrome":
		//Top casting://declare a webdriver which is null
		    driver = new ChromeDriver();
			break;
		case "firefox":
			//Top casting:
				driver = new FirefoxDriver();
				break;
		case "Safari":
			//Top casting:
				driver = new SafariDriver();
				break;
		default:
			System.out.println("browser not found..........");
			break;
		}
        
        // if we select IE which not there it goes to default and break
        // then it goes to line 37 and driver is pointing to null since IE is not there
        // then it gives exception - null pointer exception
		
		driver.get("http://www.amazon.com"); 
		String title = driver.title();// this is returning a string from chrome class . Storing it in a variable
        System.out.println(title); 
        
        driver.click("sign up link");
        driver.sendKeys("firstname", "Sarada");
        driver.quit();
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
