package SeleniumArch;

//SearContext should be the parent of WebDriver
public interface WebDriver extends SearchContext {

	@Override
	public void findElement();
	
	public void get(String url);
	
	public void click(String element);
	
	public void sendKeys(String element, String value);
	
	public String title();
	
	public void quit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
