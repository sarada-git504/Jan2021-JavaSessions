package WebDriverArch;

public class Browser {
	
	
	// We are not maintaning any variable
	// Only methods are declared.
	
	public void launchBrowser() {
		System.out.println("launch the browser");
		checkBrowserVersion();
		System.out.println("Browser launched");
	}
	
	private void checkBrowserVersion() {
		System.out.println("checkBrowserVersion");
		checkRAMSpace();
	}
	
	private void checkRAMSpace() {
		System.out.println("checkRAMSpace ");
		OSCompatible();
	}
	
	private void OSCompatible(){
		System.out.println("OSCompatible ");
		needUpgrade();
	}
		
	
	private void needUpgrade() {
		System.out.println("needUpgrade");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
