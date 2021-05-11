package SeleniumArch;

public class ChromeDriver implements WebDriver{
	
	public ChromeDriver() {
		System.out.println("launch chrome browser............");
	}

	@Override
	public void findElement() {
		System.out.println("findElement");
		
	}

	@Override
	public void get(String url) {
		System.out.println("launch url: " + url);
		
	}

	@Override
	public void click(String element) {
		System.out.println("Click on the element: " + element);
		
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("Enter the value in element : " + element + "Value = " + value);
	}

	@Override // change the method to String in WebDriver interface also
	public String title() {
		System.out.println("title of the page...........");
		return "some title";
		
	}

	@Override
	public void quit() {
		System.out.println("quite the browser");
		
	}

}
